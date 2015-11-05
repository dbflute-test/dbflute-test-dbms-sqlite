package org.docksidestage.sqlite.dbflute.readonly.cbean.nss;

import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.RoyMemberServiceCQ;

/**
 * The nest select set-upper of MEMBER_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
public class RoyMemberServiceNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RoyMemberServiceCQ _query;
    public RoyMemberServiceNss(RoyMemberServiceCQ query) { _query = query; }
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
     * SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     */
    public void withServiceRank() {
        _query.xdoNss(() -> _query.queryServiceRank());
    }
}
