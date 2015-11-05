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
 * The base condition-query of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsProductCQ extends RoyAbstractBsProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyBsProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from PRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RoyProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RoyProductCIQ xcreateCIQ() {
        RoyProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RoyProductCIQ xnewCIQ() {
        return new RoyProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join PRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RoyProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RoyProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, RoyPurchaseCQ> xdfgetProductId_ExistsReferrer_PurchaseList() { return xgetSQueMap("productId_ExistsReferrer_PurchaseList"); }
    public String keepProductId_ExistsReferrer_PurchaseList(RoyPurchaseCQ sq) { return xkeepSQue("productId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, RoyPurchaseCQ> xdfgetProductId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("productId_NotExistsReferrer_PurchaseList"); }
    public String keepProductId_NotExistsReferrer_PurchaseList(RoyPurchaseCQ sq) { return xkeepSQue("productId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, RoyPurchaseCQ> xdfgetProductId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepProductId_SpecifyDerivedReferrer_PurchaseList(RoyPurchaseCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, RoyPurchaseCQ> xdfgetProductId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("productId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductId_QueryDerivedReferrer_PurchaseList(RoyPurchaseCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_PurchaseList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productName;
    public ConditionValue xdfgetProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue xgetCValueProductName() { return xdfgetProductName(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _productHandleCode;
    public ConditionValue xdfgetProductHandleCode()
    { if (_productHandleCode == null) { _productHandleCode = nCV(); }
      return _productHandleCode; }
    protected ConditionValue xgetCValueProductHandleCode() { return xdfgetProductHandleCode(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_HANDLE_CODE: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductHandleCode_Asc() { regOBA("PRODUCT_HANDLE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_HANDLE_CODE: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductHandleCode_Desc() { regOBD("PRODUCT_HANDLE_CODE"); return this; }

    protected ConditionValue _productCategoryCode;
    public ConditionValue xdfgetProductCategoryCode()
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected ConditionValue xgetCValueProductCategoryCode() { return xdfgetProductCategoryCode(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_CATEGORY_CODE: {NotNull, CHAR(3)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductCategoryCode_Asc() { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CATEGORY_CODE: {NotNull, CHAR(3)(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductCategoryCode_Desc() { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected ConditionValue _productStatusCode;
    public ConditionValue xdfgetProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue xgetCValueProductStatusCode() { return xdfgetProductStatusCode(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to PRODUCT_STATUS}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to PRODUCT_STATUS}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _regularPrice;
    public ConditionValue xdfgetRegularPrice()
    { if (_regularPrice == null) { _regularPrice = nCV(); }
      return _regularPrice; }
    protected ConditionValue xgetCValueRegularPrice() { return xdfgetRegularPrice(); }

    /** 
     * Add order-by as ascend. <br>
     * REGULAR_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_RegularPrice_Asc() { regOBA("REGULAR_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGULAR_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_RegularPrice_Desc() { regOBD("REGULAR_PRICE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue xdfgetRegisterProcess()
    { if (_registerProcess == null) { _registerProcess = nCV(); }
      return _registerProcess; }
    protected ConditionValue xgetCValueRegisterProcess() { return xdfgetRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue xdfgetUpdateProcess()
    { if (_updateProcess == null) { _updateProcess = nCV(); }
      return _updateProcess; }
    protected ConditionValue xgetCValueUpdateProcess() { return xdfgetUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_UpdateProcess_Asc() { regOBA("UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_UpdateProcess_Desc() { regOBD("UPDATE_PROCESS"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public RoyBsProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public RoyBsProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        RoyProductCQ bq = (RoyProductCQ)bqs;
        RoyProductCQ uq = (RoyProductCQ)uqs;
        if (bq.hasConditionQueryProductStatus()) {
            uq.queryProductStatus().reflectRelationOnUnionQuery(bq.queryProductStatus(), uq.queryProductStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoyProductStatusCQ queryProductStatus() {
        return xdfgetConditionQueryProductStatus();
    }
    public RoyProductStatusCQ xdfgetConditionQueryProductStatus() {
        String prop = "productStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductStatus()); xsetupOuterJoinProductStatus(); }
        return xgetQueRlMap(prop);
    }
    protected RoyProductStatusCQ xcreateQueryProductStatus() {
        String nrp = xresolveNRP("PRODUCT", "productStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoyProductStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productStatus", nrp);
    }
    protected void xsetupOuterJoinProductStatus() { xregOutJo("productStatus"); }
    public boolean hasConditionQueryProductStatus() { return xhasQueRlMap("productStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, RoyProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RoyProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RoyProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RoyProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RoyProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RoyProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RoyProductCQ> _myselfExistsMap;
    public Map<String, RoyProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RoyProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RoyProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RoyProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RoyProductCB.class.getName(); }
    protected String xCQ() { return RoyProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
