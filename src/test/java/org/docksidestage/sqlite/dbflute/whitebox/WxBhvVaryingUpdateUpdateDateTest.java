package org.docksidestage.sqlite.dbflute.whitebox;

import java.time.LocalDateTime;

import org.docksidestage.sqlite.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlite.dbflute.exentity.Member;
import org.docksidestage.sqlite.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.2.9 (2025/05/21 Wednesday at ichihara in jflute studying)
 */
public class WxBhvVaryingUpdateUpdateDateTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                Disable CommonColumn
    //                                                                ====================
    public void test_disableCommonColumnAutoSetup_basic() {
        // ## Arrange ##
        Member beforeMember = memberBhv.selectByPK(1).get();

        Member member = new Member();
        member.setMemberId(1);
        member.setMemberName("varying");

        // ## Act ##
        memberBhv.varyingUpdateNonstrict(member, op -> op.disableCommonColumnAutoSetup());

        // ## Assert ##
        Member afterMember = memberBhv.selectByPK(1).get();

        assertEquals(beforeMember.getMemberRegisterDatetime(), afterMember.getMemberRegisterDatetime());
        assertEquals(beforeMember.getMemberRegisterUser(), afterMember.getMemberRegisterUser());

        // auto-updated as optimistic lock
        assertFalse(beforeMember.getMemberUpdateDatetime().equals(afterMember.getMemberUpdateDatetime()));

        assertEquals(beforeMember.getMemberUpdateUser(), afterMember.getMemberUpdateUser());

        // also optimistic lock
        assertFalse(beforeMember.getVersionNo().equals(afterMember.getVersionNo()));
        assertEquals(-1, beforeMember.getVersionNo() - afterMember.getVersionNo());
    }

    // ===================================================================================
    //                                                              Disable OptimisticLock
    //                                                              ======================
    public void test_disableOptimisticLockAutoUpdate_basic() {
        // ## Arrange ##
        Member beforeMember = memberBhv.selectByPK(1).get();

        Member member = new Member();
        member.setMemberId(1);
        member.setMemberName("varying");

        // ## Act ##
        memberBhv.varyingUpdateNonstrict(member, op -> op.disableOptimisticLockAutoUpdate());

        // ## Assert ##
        Member afterMember = memberBhv.selectByPK(1).get();
        assertEquals(beforeMember.getVersionNo(), afterMember.getVersionNo()); // also optimistic lock

        assertEquals(beforeMember.getMemberRegisterDatetime(), afterMember.getMemberRegisterDatetime());
        assertEquals(beforeMember.getMemberRegisterUser(), afterMember.getMemberRegisterUser());

        LocalDateTime beforeDateTime = beforeMember.getMemberUpdateDatetime();
        LocalDateTime afterDateTime = afterMember.getMemberUpdateDatetime();
        log("before={}, after={}", beforeDateTime, afterDateTime);
        assertEquals(beforeDateTime, afterDateTime);

        assertFalse(beforeMember.getMemberUpdateUser().equals(afterMember.getMemberUpdateUser()));
    }

    public void test_disableOptimisticLockAutoUpdate_with_disableCommonColumn() {
        // ## Arrange ##
        Member beforeMember = memberBhv.selectByPK(1).get();

        Member member = new Member();
        member.setMemberId(1);
        member.setMemberName("varying");

        // ## Act ##
        memberBhv.varyingUpdateNonstrict(member, op -> {
            op.disableCommonColumnAutoSetup();
            op.disableOptimisticLockAutoUpdate();
        });

        // ## Assert ##
        Member afterMember = memberBhv.selectByPK(1).get();

        assertEquals(beforeMember.getVersionNo(), afterMember.getVersionNo()); // also optimistic lock

        assertEquals(beforeMember.getMemberRegisterDatetime(), afterMember.getMemberRegisterDatetime());
        assertEquals(beforeMember.getMemberRegisterUser(), afterMember.getMemberRegisterUser());
        assertEquals(beforeMember.getMemberUpdateDatetime(), afterMember.getMemberUpdateDatetime());
        assertEquals(beforeMember.getMemberUpdateUser(), afterMember.getMemberUpdateUser());
    }
}
