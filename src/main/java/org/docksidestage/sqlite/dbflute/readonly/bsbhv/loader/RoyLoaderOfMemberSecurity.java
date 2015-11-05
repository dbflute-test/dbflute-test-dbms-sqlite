package org.docksidestage.sqlite.dbflute.readonly.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The referrer loader of MEMBER_SECURITY as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, LOGIN_PASSWORD, REMINDER_QUESTION, REMINDER_ANSWER, REMINDER_USE_COUNT, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
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
 *     MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class RoyLoaderOfMemberSecurity {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RoyMemberSecurity> _selectedList;
    protected BehaviorSelector _selector;
    protected RoyMemberSecurityBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public RoyLoaderOfMemberSecurity ready(List<RoyMemberSecurity> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoyMemberSecurityBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoyMemberSecurityBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected RoyLoaderOfMember _foreignMemberLoader;
    public RoyLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new RoyLoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RoyMemberSecurity> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
