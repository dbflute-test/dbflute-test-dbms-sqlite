package org.docksidestage.sqlite.dbflute.readonly.cbean.nss;

import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.RoySummaryProductCQ;

/**
 * The nest select set-upper of SUMMARY_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class RoySummaryProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RoySummaryProductCQ _query;
    public RoySummaryProductNss(RoySummaryProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     */
    public void withProductStatus() {
        _query.xdoNss(() -> _query.queryProductStatus());
    }
}
