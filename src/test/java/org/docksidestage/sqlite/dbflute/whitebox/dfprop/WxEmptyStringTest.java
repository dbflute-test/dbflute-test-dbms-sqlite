package org.docksidestage.sqlite.dbflute.whitebox.dfprop;

import org.docksidestage.sqlite.dbflute.cbean.MemberCB;
import org.docksidestage.sqlite.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlite.dbflute.exentity.Member;
import org.docksidestage.sqlite.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.9 (2010/05/12 Wednesday)
 */
public class WxEmptyStringTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_extended_emptyStringCondition() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("");
        memberBhv.updateNonstrict(member);

        // ## Act ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_Equal_EmptyString();
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("", actual.getMemberName());
    }

    public void test_generated_emptyStringCondition() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberAccount("");
        memberBhv.updateNonstrict(member);

        // ## Act ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberAccount_Equal_EmptyString();
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("", actual.getMemberAccount());
    }
}
