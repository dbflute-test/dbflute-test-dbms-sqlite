package org.docksidestage.sqlite.dbflute.readonly.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.*;

/**
 * The referrer loader of WITHDRAWAL_REASON as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class RoyLoaderOfWithdrawalReason {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RoyWithdrawalReason> _selectedList;
    protected BehaviorSelector _selector;
    protected RoyWithdrawalReasonBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public RoyLoaderOfWithdrawalReason ready(List<RoyWithdrawalReason> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoyWithdrawalReasonBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoyWithdrawalReasonBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<RoyMemberWithdrawal> _referrerMemberWithdrawal;

    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br>
     * MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * <pre>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">withdrawalReasonList</span>, <span style="color: #553000">reasonLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reasonLoader</span>.<span style="color: #CC4747">loadMemberWithdrawal</span>(<span style="color: #553000">withdrawalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">withdrawalCB</span>.setupSelect...
     *         <span style="color: #553000">withdrawalCB</span>.query().set...
     *         <span style="color: #553000">withdrawalCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">withdrawalLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    withdrawalLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (RoyWithdrawalReason withdrawalReason : <span style="color: #553000">withdrawalReasonList</span>) {
     *     ... = withdrawalReason.<span style="color: #CC4747">getMemberWithdrawalList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<RoyLoaderOfMemberWithdrawal> loadMemberWithdrawal(ReferrerConditionSetupper<RoyMemberWithdrawalCB> refCBLambda) {
        myBhv().loadMemberWithdrawal(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberWithdrawal = refLs);
        return hd -> hd.handle(new RoyLoaderOfMemberWithdrawal().ready(_referrerMemberWithdrawal, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RoyWithdrawalReason> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
