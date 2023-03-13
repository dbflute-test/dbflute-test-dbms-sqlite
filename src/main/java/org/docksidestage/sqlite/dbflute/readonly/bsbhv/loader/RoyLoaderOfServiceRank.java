package org.docksidestage.sqlite.dbflute.readonly.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.*;

/**
 * The referrer loader of SERVICE_RANK as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class RoyLoaderOfServiceRank {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RoyServiceRank> _selectedList;
    protected BehaviorSelector _selector;
    protected RoyServiceRankBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public RoyLoaderOfServiceRank ready(List<RoyServiceRank> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoyServiceRankBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoyServiceRankBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<RoyMemberService> _referrerMemberService;

    /**
     * Load referrer of memberServiceList by the set-upper of referrer. <br>
     * MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * <pre>
     * <span style="color: #0000C0">serviceRankBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">serviceRankList</span>, <span style="color: #553000">rankLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rankLoader</span>.<span style="color: #CC4747">loadMemberService</span>(<span style="color: #553000">serviceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">serviceCB</span>.setupSelect...
     *         <span style="color: #553000">serviceCB</span>.query().set...
     *         <span style="color: #553000">serviceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">serviceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    serviceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (RoyServiceRank serviceRank : <span style="color: #553000">serviceRankList</span>) {
     *     ... = serviceRank.<span style="color: #CC4747">getMemberServiceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setServiceRankCode_InScope(pkList);
     * cb.query().addOrderBy_ServiceRankCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<RoyLoaderOfMemberService> loadMemberService(ReferrerConditionSetupper<RoyMemberServiceCB> refCBLambda) {
        myBhv().loadMemberService(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberService = refLs);
        return hd -> hd.handle(new RoyLoaderOfMemberService().ready(_referrerMemberService, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RoyServiceRank> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
