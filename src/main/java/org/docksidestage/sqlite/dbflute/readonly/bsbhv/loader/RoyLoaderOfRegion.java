package org.docksidestage.sqlite.dbflute.readonly.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.*;

/**
 * The referrer loader of REGION as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class RoyLoaderOfRegion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RoyRegion> _selectedList;
    protected BehaviorSelector _selector;
    protected RoyRegionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public RoyLoaderOfRegion ready(List<RoyRegion> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoyRegionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoyRegionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<RoyMemberAddress> _referrerMemberAddress;

    /**
     * Load referrer of memberAddressList by the set-upper of referrer. <br>
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * <pre>
     * <span style="color: #0000C0">regionBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">regionList</span>, <span style="color: #553000">regionLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">regionLoader</span>.<span style="color: #CC4747">loadMemberAddress</span>(<span style="color: #553000">addressCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">addressCB</span>.setupSelect...
     *         <span style="color: #553000">addressCB</span>.query().set...
     *         <span style="color: #553000">addressCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">addressLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    addressLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (RoyRegion region : <span style="color: #553000">regionList</span>) {
     *     ... = region.<span style="color: #CC4747">getMemberAddressList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRegionId_InScope(pkList);
     * cb.query().addOrderBy_RegionId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<RoyLoaderOfMemberAddress> loadMemberAddress(ReferrerConditionSetupper<RoyMemberAddressCB> refCBLambda) {
        myBhv().loadMemberAddress(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberAddress = refLs);
        return hd -> hd.handle(new RoyLoaderOfMemberAddress().ready(_referrerMemberAddress, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RoyRegion> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
