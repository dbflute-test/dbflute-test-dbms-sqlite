package org.docksidestage.sqlite.dbflute.readonly.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The referrer loader of MEMBER_ADDRESS as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ADDRESS_ID
 *
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ADDRESS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, REGION
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, region
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class RoyLoaderOfMemberAddress {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RoyMemberAddress> _selectedList;
    protected BehaviorSelector _selector;
    protected RoyMemberAddressBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public RoyLoaderOfMemberAddress ready(List<RoyMemberAddress> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoyMemberAddressBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoyMemberAddressBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected RoyLoaderOfMember _foreignMemberLoader;
    public RoyLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new RoyLoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected RoyLoaderOfRegion _foreignRegionLoader;
    public RoyLoaderOfRegion pulloutRegion() {
        if (_foreignRegionLoader == null)
        { _foreignRegionLoader = new RoyLoaderOfRegion().ready(myBhv().pulloutRegion(_selectedList), _selector); }
        return _foreignRegionLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RoyMemberAddress> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
