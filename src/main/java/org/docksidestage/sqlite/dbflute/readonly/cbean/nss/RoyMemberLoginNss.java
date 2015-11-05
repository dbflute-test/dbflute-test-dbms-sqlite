package org.docksidestage.sqlite.dbflute.readonly.cbean.nss;

import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.RoyMemberLoginCQ;

/**
 * The nest select set-upper of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class RoyMemberLoginNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RoyMemberLoginCQ _query;
    public RoyMemberLoginNss(RoyMemberLoginCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.xdoNss(() -> _query.queryMemberStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public RoyMemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new RoyMemberNss(_query.queryMember());
    }
}
