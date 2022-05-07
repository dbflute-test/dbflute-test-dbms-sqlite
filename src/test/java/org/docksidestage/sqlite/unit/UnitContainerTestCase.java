package org.docksidestage.sqlite.unit;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.writable.DeleteOption;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.utflute.lastadi.ContainerTestCase;
import org.docksidestage.sqlite.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.sqlite.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.sqlite.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.sqlite.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.sqlite.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.sqlite.dbflute.exbhv.PurchaseBhv;

/**
 * The test case with container.
 * @author jflute
 * @since 0.9.2 (2009/02/18 Wednesday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    @Override
    protected boolean isUseTestCaseLooseBinding() {
        return true;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private BehaviorSelector _behaviorSelector;

    protected void deleteAll(Class<? extends BehaviorWritable> clazz) {
        BehaviorWritable bhv = _behaviorSelector.select(clazz);
        ConditionBean cb = bhv.newConditionBean();
        bhv.rangeRemove(cb, new DeleteOption<ConditionBean>().allowNonQueryDelete());
    }

    protected void deleteMemberReferrer() {
        deleteAll(MemberAddressBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberServiceBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        deleteAll(PurchaseBhv.class);
    }
}
