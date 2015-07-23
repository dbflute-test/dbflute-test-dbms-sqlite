package org.docksidestage.sqlite.dbflute.whitebox.dfprop;

import java.time.LocalDateTime;

import org.docksidestage.sqlite.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlite.dbflute.exentity.Member;
import org.docksidestage.sqlite.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.0-sp5 (2015/06/11 Thursday)
 */
public class WxOptimisticLockUpdateDateTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_update() {
        // ## Arrange ##
        Member before = memberBhv.selectByPK(1).get();
        Member member = new Member();
        member.setMemberId(before.getMemberId());
        member.setMemberStatusCode_ProvisionalMember();
        member.setMemberUpdateDatetime(before.getMemberUpdateDatetime());
        member.setVersionNo(before.getVersionNo());

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        LocalDateTime updateDatetime = member.getMemberUpdateDatetime();
        log(updateDatetime);
    }
}
