package org.docksidestage.sqlite.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.dbflute.util.Srl;
import org.docksidestage.sqlite.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlite.dbflute.exentity.Member;
import org.docksidestage.sqlite.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxCompatibleEntityUpdateTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                          After Care
    //                                                                          ==========
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        clearSqlLogHandler();
    }

    protected void clearSqlLogHandler() {
        CallbackContext.clearSqlLogHandlerOnThread();
        CallbackContext.clearSqlResultHandlerOnThread();
        assertFalse(CallbackContext.isExistCallbackContextOnThread());
        assertFalse(CallbackContext.isExistBehaviorCommandHookOnThread());
        assertFalse(CallbackContext.isExistSqlLogHandlerOnThread());
        assertFalse(CallbackContext.isExistSqlResultHandlerOnThread());
    }

    // ===================================================================================
    //                                                                        Basic Insert
    //                                                                        ============
    public void test_Insert_NotNullOnly() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName1");
        member.setMemberAccount("testAccount1");
        member.setMemberStatusCode_FormalizedMember();
        member.setBirthdate(null);
        final List<String> displaySqlList = new ArrayList<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                displaySqlList.add(info.getDisplaySql());
            }
        });

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        String sql = displaySqlList.get(0);
        assertFalse(Srl.containsIgnoreCase(sql, "birthdate"));
    }
}
