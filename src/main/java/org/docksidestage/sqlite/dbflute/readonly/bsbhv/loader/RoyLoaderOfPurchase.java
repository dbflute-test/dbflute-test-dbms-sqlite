package org.docksidestage.sqlite.dbflute.readonly.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The referrer loader of PURCHASE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PURCHASE_ID
 *
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, PURCHASE_REGISTER_DATETIME, PURCHASE_REGISTER_USER, PURCHASE_REGISTER_PROCESS, PURCHASE_UPDATE_DATETIME, PURCHASE_UPDATE_USER, PURCHASE_UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, PRODUCT, SUMMARY_PRODUCT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, product, summaryProduct
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class RoyLoaderOfPurchase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RoyPurchase> _selectedList;
    protected BehaviorSelector _selector;
    protected RoyPurchaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public RoyLoaderOfPurchase ready(List<RoyPurchase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoyPurchaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoyPurchaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected RoyLoaderOfMember _foreignMemberLoader;
    public RoyLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new RoyLoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected RoyLoaderOfProduct _foreignProductLoader;
    public RoyLoaderOfProduct pulloutProduct() {
        if (_foreignProductLoader == null)
        { _foreignProductLoader = new RoyLoaderOfProduct().ready(myBhv().pulloutProduct(_selectedList), _selector); }
        return _foreignProductLoader;
    }

    protected RoyLoaderOfSummaryProduct _foreignSummaryProductLoader;
    public RoyLoaderOfSummaryProduct pulloutSummaryProduct() {
        if (_foreignSummaryProductLoader == null)
        { _foreignSummaryProductLoader = new RoyLoaderOfSummaryProduct().ready(myBhv().pulloutSummaryProduct(_selectedList), _selector); }
        return _foreignSummaryProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RoyPurchase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
