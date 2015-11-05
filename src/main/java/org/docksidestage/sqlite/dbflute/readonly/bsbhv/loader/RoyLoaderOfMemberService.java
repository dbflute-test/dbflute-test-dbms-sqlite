package org.docksidestage.sqlite.dbflute.readonly.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The referrer loader of MEMBER_SERVICE as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_SERVICE_ID
 *
 * [column]
 *     MEMBER_SERVICE_ID, MEMBER_ID, SERVICE_POINT_COUNT, SERVICE_RANK_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_SERVICE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, SERVICE_RANK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, serviceRank
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class RoyLoaderOfMemberService {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RoyMemberService> _selectedList;
    protected BehaviorSelector _selector;
    protected RoyMemberServiceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public RoyLoaderOfMemberService ready(List<RoyMemberService> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoyMemberServiceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoyMemberServiceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected RoyLoaderOfMember _foreignMemberLoader;
    public RoyLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new RoyLoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected RoyLoaderOfServiceRank _foreignServiceRankLoader;
    public RoyLoaderOfServiceRank pulloutServiceRank() {
        if (_foreignServiceRankLoader == null)
        { _foreignServiceRankLoader = new RoyLoaderOfServiceRank().ready(myBhv().pulloutServiceRank(_selectedList), _selector); }
        return _foreignServiceRankLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RoyMemberService> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
