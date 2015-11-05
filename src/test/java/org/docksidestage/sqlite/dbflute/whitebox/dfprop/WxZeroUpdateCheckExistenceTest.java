package org.docksidestage.sqlite.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.docksidestage.sqlite.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlite.dbflute.exbhv.MemberStatusBhv;
import org.docksidestage.sqlite.dbflute.exentity.Member;
import org.docksidestage.sqlite.dbflute.exentity.MemberStatus;
import org.docksidestage.sqlite.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxZeroUpdateCheckExistenceTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;

    // ===================================================================================
    //                                                                               Check
    //                                                                               =====
    public void test_update_check() throws Exception {
        // ## Arrange ##
        MemberStatus status = new MemberStatus();
        status.setMemberStatusCode("NON");
        status.setMemberStatusName("zero update");

        // ## Act ##
        List<String> sqlList = new ArrayList<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlList.add(info.getDisplaySql());
            }
        });
        try {
            memberStatusBhv.update(status);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            log(e.getMessage());
        }

        // ## Assert ##
        assertEquals(3, sqlList.size());
        assertContains(sqlList.get(sqlList.size() - 1), "select count(*)");
    }

    public void test_updateNonstrict_check() throws Exception {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(99999);
        member.setMemberName("zero update");

        // ## Act ##
        List<String> sqlList = new ArrayList<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlList.add(info.getDisplaySql());
            }
        });
        try {
            memberBhv.updateNonstrict(member);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            log(e.getMessage());
        }

        // ## Assert ##
        assertEquals(2, sqlList.size());
        assertContains(sqlList.get(sqlList.size() - 1), "select count(*)");
    }

    public void test_updateNonstrict_check_uniqueBy() throws Exception {
        // ## Arrange ##
        Member member = new Member();
        member.uniqueBy("non");
        member.setMemberName("zero update");

        // ## Act ##
        List<String> sqlList = new ArrayList<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlList.add(info.getDisplaySql());
            }
        });
        try {
            memberBhv.updateNonstrict(member);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            log(e.getMessage());
        }

        // ## Assert ##
        assertEquals(2, sqlList.size());
        assertContains(sqlList.get(sqlList.size() - 1), "select count(*)");
    }

    // ===================================================================================
    //                                                                      Normal Success
    //                                                                      ==============
    public void test_update_normal_success() throws Exception {
        // ## Arrange ##
        MemberStatus status = new MemberStatus();
        status.setMemberStatusCode_FormalizedMember();
        status.setMemberStatusName("zero update");

        // ## Act ##
        memberStatusBhv.update(status);

        // ## Assert ##
        assertEquals("zero update", memberStatusBhv.selectByPK(status.getMemberStatusCode()).get().getMemberStatusName());
    }

    public void test_update_normal_success_withOptimisticLock() throws Exception {
        // ## Arrange ##
        Member member = memberBhv.selectByPK(3).get();
        member.setMemberName("zero update");

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        assertEquals("zero update", memberBhv.selectByPK(member.getMemberId()).get().getMemberName());
    }

    // ===================================================================================
    //                                                                            Continue
    //                                                                            ========
    public void test_updateNonstrict_continueIfExists() throws Exception {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(99999);
        member.setMemberName("zero update");

        // ## Act ##
        memberBhv.mockZeroUpdateExistence();
        try {
            memberBhv.updateNonstrict(member); // no exception
        } finally {
            memberBhv.restoreZeroUpdateExistence();
        }
    }
}
