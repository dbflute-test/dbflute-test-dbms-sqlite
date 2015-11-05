package org.docksidestage.sqlite.dbflute.readonly.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.ciq.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.*;

/**
 * The base condition-query of PRODUCT_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsProductStatusCQ extends RoyAbstractBsProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyProductStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyBsProductStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from PRODUCT_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RoyProductStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RoyProductStatusCIQ xcreateCIQ() {
        RoyProductStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RoyProductStatusCIQ xnewCIQ() {
        return new RoyProductStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join PRODUCT_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RoyProductStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RoyProductStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productStatusCode;
    public ConditionValue xdfgetProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue xgetCValueProductStatusCode() { return xdfgetProductStatusCode(); }

    public Map<String, RoyProductCQ> xdfgetProductStatusCode_ExistsReferrer_ProductList() { return xgetSQueMap("productStatusCode_ExistsReferrer_ProductList"); }
    public String keepProductStatusCode_ExistsReferrer_ProductList(RoyProductCQ sq) { return xkeepSQue("productStatusCode_ExistsReferrer_ProductList", sq); }

    public Map<String, RoySummaryProductCQ> xdfgetProductStatusCode_ExistsReferrer_SummaryProductList() { return xgetSQueMap("productStatusCode_ExistsReferrer_SummaryProductList"); }
    public String keepProductStatusCode_ExistsReferrer_SummaryProductList(RoySummaryProductCQ sq) { return xkeepSQue("productStatusCode_ExistsReferrer_SummaryProductList", sq); }

    public Map<String, RoyProductCQ> xdfgetProductStatusCode_NotExistsReferrer_ProductList() { return xgetSQueMap("productStatusCode_NotExistsReferrer_ProductList"); }
    public String keepProductStatusCode_NotExistsReferrer_ProductList(RoyProductCQ sq) { return xkeepSQue("productStatusCode_NotExistsReferrer_ProductList", sq); }

    public Map<String, RoySummaryProductCQ> xdfgetProductStatusCode_NotExistsReferrer_SummaryProductList() { return xgetSQueMap("productStatusCode_NotExistsReferrer_SummaryProductList"); }
    public String keepProductStatusCode_NotExistsReferrer_SummaryProductList(RoySummaryProductCQ sq) { return xkeepSQue("productStatusCode_NotExistsReferrer_SummaryProductList", sq); }

    public Map<String, RoyProductCQ> xdfgetProductStatusCode_SpecifyDerivedReferrer_ProductList() { return xgetSQueMap("productStatusCode_SpecifyDerivedReferrer_ProductList"); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_ProductList(RoyProductCQ sq) { return xkeepSQue("productStatusCode_SpecifyDerivedReferrer_ProductList", sq); }

    public Map<String, RoySummaryProductCQ> xdfgetProductStatusCode_SpecifyDerivedReferrer_SummaryProductList() { return xgetSQueMap("productStatusCode_SpecifyDerivedReferrer_SummaryProductList"); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_SummaryProductList(RoySummaryProductCQ sq) { return xkeepSQue("productStatusCode_SpecifyDerivedReferrer_SummaryProductList", sq); }

    public Map<String, RoyProductCQ> xdfgetProductStatusCode_QueryDerivedReferrer_ProductList() { return xgetSQueMap("productStatusCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductList(RoyProductCQ sq) { return xkeepSQue("productStatusCode_QueryDerivedReferrer_ProductList", sq); }
    public Map<String, Object> xdfgetProductStatusCode_QueryDerivedReferrer_ProductListParameter() { return xgetSQuePmMap("productStatusCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(Object pm) { return xkeepSQuePm("productStatusCode_QueryDerivedReferrer_ProductList", pm); }

    public Map<String, RoySummaryProductCQ> xdfgetProductStatusCode_QueryDerivedReferrer_SummaryProductList() { return xgetSQueMap("productStatusCode_QueryDerivedReferrer_SummaryProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_SummaryProductList(RoySummaryProductCQ sq) { return xkeepSQue("productStatusCode_QueryDerivedReferrer_SummaryProductList", sq); }
    public Map<String, Object> xdfgetProductStatusCode_QueryDerivedReferrer_SummaryProductListParameter() { return xgetSQuePmMap("productStatusCode_QueryDerivedReferrer_SummaryProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_SummaryProductListParameter(Object pm) { return xkeepSQuePm("productStatusCode_QueryDerivedReferrer_SummaryProductList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductStatusCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductStatusCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _productStatusName;
    public ConditionValue xdfgetProductStatusName()
    { if (_productStatusName == null) { _productStatusName = nCV(); }
      return _productStatusName; }
    protected ConditionValue xgetCValueProductStatusName() { return xdfgetProductStatusName(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_STATUS_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductStatusCQ addOrderBy_ProductStatusName_Asc() { regOBA("PRODUCT_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_STATUS_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductStatusCQ addOrderBy_ProductStatusName_Desc() { regOBD("PRODUCT_STATUS_NAME"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue xdfgetDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue xgetCValueDisplayOrder() { return xdfgetDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br>
     * DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public RoyBsProductStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public RoyBsProductStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, RoyProductStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RoyProductStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RoyProductStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RoyProductStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RoyProductStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RoyProductStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RoyProductStatusCQ> _myselfExistsMap;
    public Map<String, RoyProductStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RoyProductStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RoyProductStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RoyProductStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RoyProductStatusCB.class.getName(); }
    protected String xCQ() { return RoyProductStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
