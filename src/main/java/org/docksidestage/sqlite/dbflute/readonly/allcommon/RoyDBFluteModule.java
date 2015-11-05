package org.docksidestage.sqlite.dbflute.readonly.allcommon;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;

/**
 * @author DBFlute(AutoGenerator)
 */
public class RoyDBFluteModule extends AbstractModule {

    protected final DataSource dataSource;

    public RoyDBFluteModule(DataSource dataSource) {
        if (dataSource == null) {
            String msg = "The argument 'dataSource' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        this.dataSource = dataSource;
    }

    @Override
    protected void configure() {
        createDBFluteInitializer(); // initialized by only a creation

        // The components of DBFlute Runtime.
        RoyImplementedBehaviorSelector behaviorSelector = createImplementedBehaviorSelector();
        BehaviorCommandInvoker behaviorCommandInvoker = createBehaviorCommandInvoker();
        RoyImplementedInvokerAssistant invokerAssistant = createImplementedInvokerAssistant();
        behaviorCommandInvoker.setInvokerAssistant(invokerAssistant);
        RoyImplementedCommonColumnAutoSetupper commonColumnAutoSetupper = createImplementedCommonColumnAutoSetupper();

        bind(BehaviorSelector.class).toInstance(behaviorSelector);
        bind(BehaviorCommandInvoker.class).toInstance(behaviorCommandInvoker);
        bind(InvokerAssistant.class).toInstance(invokerAssistant);
        bind(CommonColumnAutoSetupper.class).toInstance(commonColumnAutoSetupper);

        // The components of Behavior.
        setupBehavior(behaviorCommandInvoker, behaviorSelector, commonColumnAutoSetupper);
    }

    protected RoyDBFluteInitializer createDBFluteInitializer() {
        return new org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyDBFluteInitializer();
    }

    protected RoyImplementedBehaviorSelector createImplementedBehaviorSelector() {
        return new RoyImplementedBehaviorSelector();
    }

    protected BehaviorCommandInvoker createBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    protected RoyImplementedInvokerAssistant createImplementedInvokerAssistant() {
        RoyImplementedInvokerAssistant invokerAssistant = new org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyImplementedInvokerAssistant();
        invokerAssistant.setDataSource(dataSource);
        return invokerAssistant;
    }

    protected RoyImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return new org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyImplementedCommonColumnAutoSetupper();
    }

    protected void setupBehavior(BehaviorCommandInvoker ker, BehaviorSelector tor, CommonColumnAutoSetupper per) {
        {
            RoyMemberBhv bhv = new RoyMemberBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyMemberBhv.class).toInstance(bhv);
        }
        {
            RoyMemberAddressBhv bhv = new RoyMemberAddressBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyMemberAddressBhv.class).toInstance(bhv);
        }
        {
            RoyMemberLoginBhv bhv = new RoyMemberLoginBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyMemberLoginBhv.class).toInstance(bhv);
        }
        {
            RoyMemberSecurityBhv bhv = new RoyMemberSecurityBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyMemberSecurityBhv.class).toInstance(bhv);
        }
        {
            RoyMemberServiceBhv bhv = new RoyMemberServiceBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyMemberServiceBhv.class).toInstance(bhv);
        }
        {
            RoyMemberStatusBhv bhv = new RoyMemberStatusBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyMemberStatusBhv.class).toInstance(bhv);
        }
        {
            RoyMemberWithdrawalBhv bhv = new RoyMemberWithdrawalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyMemberWithdrawalBhv.class).toInstance(bhv);
        }
        {
            RoyProductBhv bhv = new RoyProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyProductBhv.class).toInstance(bhv);
        }
        {
            RoyProductCategoryBhv bhv = new RoyProductCategoryBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyProductCategoryBhv.class).toInstance(bhv);
        }
        {
            RoyProductStatusBhv bhv = new RoyProductStatusBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyProductStatusBhv.class).toInstance(bhv);
        }
        {
            RoyPurchaseBhv bhv = new RoyPurchaseBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyPurchaseBhv.class).toInstance(bhv);
        }
        {
            RoyPurchasePaymentBhv bhv = new RoyPurchasePaymentBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyPurchasePaymentBhv.class).toInstance(bhv);
        }
        {
            RoyRegionBhv bhv = new RoyRegionBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyRegionBhv.class).toInstance(bhv);
        }
        {
            RoyServiceRankBhv bhv = new RoyServiceRankBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyServiceRankBhv.class).toInstance(bhv);
        }
        {
            RoySummaryProductBhv bhv = new RoySummaryProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoySummaryProductBhv.class).toInstance(bhv);
        }
        {
            RoyVendorCheckBhv bhv = new RoyVendorCheckBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyVendorCheckBhv.class).toInstance(bhv);
        }
        {
            RoyWithdrawalReasonBhv bhv = new RoyWithdrawalReasonBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(RoyWithdrawalReasonBhv.class).toInstance(bhv);
        }
    }
}
