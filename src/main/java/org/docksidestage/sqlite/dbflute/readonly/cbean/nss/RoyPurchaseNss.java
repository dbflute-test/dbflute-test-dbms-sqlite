package org.docksidestage.sqlite.dbflute.readonly.cbean.nss;

import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.RoyPurchaseCQ;

/**
 * The nest select set-upper of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public class RoyPurchaseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RoyPurchaseCQ _query;
    public RoyPurchaseNss(RoyPurchaseCQ query) { _query = query; }
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
     * PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public RoyProductNss withProduct() {
        _query.xdoNss(() -> _query.queryProduct());
        return new RoyProductNss(_query.queryProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public RoySummaryProductNss withSummaryProduct() {
        _query.xdoNss(() -> _query.querySummaryProduct());
        return new RoySummaryProductNss(_query.querySummaryProduct());
    }
}
