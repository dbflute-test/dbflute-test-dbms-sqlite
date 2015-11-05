package org.docksidestage.sqlite.dbflute.readonly.cbean.nss;

import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.RoyMemberWithdrawalCQ;

/**
 * The nest select set-upper of MEMBER_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
public class RoyMemberWithdrawalNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RoyMemberWithdrawalCQ _query;
    public RoyMemberWithdrawalNss(RoyMemberWithdrawalCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public RoyMemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new RoyMemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     */
    public void withWithdrawalReason() {
        _query.xdoNss(() -> _query.queryWithdrawalReason());
    }
}
