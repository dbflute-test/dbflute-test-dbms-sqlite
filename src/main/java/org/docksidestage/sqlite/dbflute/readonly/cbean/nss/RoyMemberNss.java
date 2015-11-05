package org.docksidestage.sqlite.dbflute.readonly.cbean.nss;

import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.RoyMemberCQ;

/**
 * The nest select set-upper of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class RoyMemberNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RoyMemberCQ _query;
    public RoyMemberNss(RoyMemberCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.xdoNss(() -> _query.queryMemberStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public RoyMemberAddressNss withMemberAddressAsValid(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryMemberAddressAsValid(targetDate));
        return new RoyMemberAddressNss(_query.queryMemberAddressAsValid(targetDate));
    }
    /**
     * With nested relation columns to select clause. <br>
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public RoyMemberSecurityNss withMemberSecurityAsOne() {
        _query.xdoNss(() -> _query.queryMemberSecurityAsOne());
        return new RoyMemberSecurityNss(_query.queryMemberSecurityAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public RoyMemberWithdrawalNss withMemberWithdrawalAsOne() {
        _query.xdoNss(() -> _query.queryMemberWithdrawalAsOne());
        return new RoyMemberWithdrawalNss(_query.queryMemberWithdrawalAsOne());
    }
}
