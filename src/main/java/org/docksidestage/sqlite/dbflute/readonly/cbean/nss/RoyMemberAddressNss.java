package org.docksidestage.sqlite.dbflute.readonly.cbean.nss;

import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.RoyMemberAddressCQ;

/**
 * The nest select set-upper of MEMBER_ADDRESS.
 * @author DBFlute(AutoGenerator)
 */
public class RoyMemberAddressNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RoyMemberAddressCQ _query;
    public RoyMemberAddressNss(RoyMemberAddressCQ query) { _query = query; }
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
     * REGION by my REGION_ID, named 'region'.
     */
    public void withRegion() {
        _query.xdoNss(() -> _query.queryRegion());
    }
}
