package org.docksidestage.sqlite.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.sqlite.dbflute.exbhv.*;
import org.docksidestage.sqlite.dbflute.exentity.*;

/**
 * The referrer loader of PURCHASE_PAYMENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     PURCHASE_PAYMENT_ID
 *
 * [column]
 *     PURCHASE_PAYMENT_ID, PURCHASE_ID, PAYMENT_AMOUNT, PAYMENT_DATETIME, PAYMENT_METHOD_CODE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_PAYMENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPurchasePayment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PurchasePayment> _selectedList;
    protected BehaviorSelector _selector;
    protected PurchasePaymentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPurchasePayment ready(List<PurchasePayment> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PurchasePaymentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PurchasePaymentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PurchasePayment> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
