package org.docksidestage.sqlite.dbflute.readonly.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The referrer loader of MEMBER_WITHDRAWAL as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, WITHDRAWAL_REASON
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, withdrawalReason
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class RoyLoaderOfMemberWithdrawal {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RoyMemberWithdrawal> _selectedList;
    protected BehaviorSelector _selector;
    protected RoyMemberWithdrawalBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public RoyLoaderOfMemberWithdrawal ready(List<RoyMemberWithdrawal> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoyMemberWithdrawalBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoyMemberWithdrawalBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected RoyLoaderOfMember _foreignMemberLoader;
    public RoyLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new RoyLoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected RoyLoaderOfWithdrawalReason _foreignWithdrawalReasonLoader;
    public RoyLoaderOfWithdrawalReason pulloutWithdrawalReason() {
        if (_foreignWithdrawalReasonLoader == null)
        { _foreignWithdrawalReasonLoader = new RoyLoaderOfWithdrawalReason().ready(myBhv().pulloutWithdrawalReason(_selectedList), _selector); }
        return _foreignWithdrawalReasonLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RoyMemberWithdrawal> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
