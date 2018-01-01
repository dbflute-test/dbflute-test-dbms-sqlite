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
 * The base condition-query of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsPurchaseCQ extends RoyAbstractBsPurchaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyPurchaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyBsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from PURCHASE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RoyPurchaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RoyPurchaseCIQ xcreateCIQ() {
        RoyPurchaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RoyPurchaseCIQ xnewCIQ() {
        return new RoyPurchaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join PURCHASE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RoyPurchaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RoyPurchaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchaseId;
    public ConditionValue xdfgetPurchaseId()
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected ConditionValue xgetCValuePurchaseId() { return xdfgetPurchaseId(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseId_Asc() { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseId_Desc() { regOBD("PURCHASE_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _purchaseDatetime;
    public ConditionValue xdfgetPurchaseDatetime()
    { if (_purchaseDatetime == null) { _purchaseDatetime = nCV(); }
      return _purchaseDatetime; }
    protected ConditionValue xgetCValuePurchaseDatetime() { return xdfgetPurchaseDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseDatetime_Asc() { regOBA("PURCHASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseDatetime_Desc() { regOBD("PURCHASE_DATETIME"); return this; }

    protected ConditionValue _purchaseCount;
    public ConditionValue xdfgetPurchaseCount()
    { if (_purchaseCount == null) { _purchaseCount = nCV(); }
      return _purchaseCount; }
    protected ConditionValue xgetCValuePurchaseCount() { return xdfgetPurchaseCount(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseCount_Asc() { regOBA("PURCHASE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseCount_Desc() { regOBD("PURCHASE_COUNT"); return this; }

    protected ConditionValue _purchasePrice;
    public ConditionValue xdfgetPurchasePrice()
    { if (_purchasePrice == null) { _purchasePrice = nCV(); }
      return _purchasePrice; }
    protected ConditionValue xgetCValuePurchasePrice() { return xdfgetPurchasePrice(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchasePrice_Asc() { regOBA("PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchasePrice_Desc() { regOBD("PURCHASE_PRICE"); return this; }

    protected ConditionValue _paymentCompleteFlg;
    public ConditionValue xdfgetPaymentCompleteFlg()
    { if (_paymentCompleteFlg == null) { _paymentCompleteFlg = nCV(); }
      return _paymentCompleteFlg; }
    protected ConditionValue xgetCValuePaymentCompleteFlg() { return xdfgetPaymentCompleteFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PaymentCompleteFlg_Asc() { regOBA("PAYMENT_COMPLETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PaymentCompleteFlg_Desc() { regOBD("PAYMENT_COMPLETE_FLG"); return this; }

    protected ConditionValue _purchaseRegisterDatetime;
    public ConditionValue xdfgetPurchaseRegisterDatetime()
    { if (_purchaseRegisterDatetime == null) { _purchaseRegisterDatetime = nCV(); }
      return _purchaseRegisterDatetime; }
    protected ConditionValue xgetCValuePurchaseRegisterDatetime() { return xdfgetPurchaseRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseRegisterDatetime_Asc() { regOBA("PURCHASE_REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseRegisterDatetime_Desc() { regOBD("PURCHASE_REGISTER_DATETIME"); return this; }

    protected ConditionValue _purchaseRegisterUser;
    public ConditionValue xdfgetPurchaseRegisterUser()
    { if (_purchaseRegisterUser == null) { _purchaseRegisterUser = nCV(); }
      return _purchaseRegisterUser; }
    protected ConditionValue xgetCValuePurchaseRegisterUser() { return xdfgetPurchaseRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseRegisterUser_Asc() { regOBA("PURCHASE_REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseRegisterUser_Desc() { regOBD("PURCHASE_REGISTER_USER"); return this; }

    protected ConditionValue _purchaseRegisterProcess;
    public ConditionValue xdfgetPurchaseRegisterProcess()
    { if (_purchaseRegisterProcess == null) { _purchaseRegisterProcess = nCV(); }
      return _purchaseRegisterProcess; }
    protected ConditionValue xgetCValuePurchaseRegisterProcess() { return xdfgetPurchaseRegisterProcess(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseRegisterProcess_Asc() { regOBA("PURCHASE_REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseRegisterProcess_Desc() { regOBD("PURCHASE_REGISTER_PROCESS"); return this; }

    protected ConditionValue _purchaseUpdateDatetime;
    public ConditionValue xdfgetPurchaseUpdateDatetime()
    { if (_purchaseUpdateDatetime == null) { _purchaseUpdateDatetime = nCV(); }
      return _purchaseUpdateDatetime; }
    protected ConditionValue xgetCValuePurchaseUpdateDatetime() { return xdfgetPurchaseUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseUpdateDatetime_Asc() { regOBA("PURCHASE_UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseUpdateDatetime_Desc() { regOBD("PURCHASE_UPDATE_DATETIME"); return this; }

    protected ConditionValue _purchaseUpdateUser;
    public ConditionValue xdfgetPurchaseUpdateUser()
    { if (_purchaseUpdateUser == null) { _purchaseUpdateUser = nCV(); }
      return _purchaseUpdateUser; }
    protected ConditionValue xgetCValuePurchaseUpdateUser() { return xdfgetPurchaseUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseUpdateUser_Asc() { regOBA("PURCHASE_UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseUpdateUser_Desc() { regOBD("PURCHASE_UPDATE_USER"); return this; }

    protected ConditionValue _purchaseUpdateProcess;
    public ConditionValue xdfgetPurchaseUpdateProcess()
    { if (_purchaseUpdateProcess == null) { _purchaseUpdateProcess = nCV(); }
      return _purchaseUpdateProcess; }
    protected ConditionValue xgetCValuePurchaseUpdateProcess() { return xdfgetPurchaseUpdateProcess(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseUpdateProcess_Asc() { regOBA("PURCHASE_UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_PurchaseUpdateProcess_Desc() { regOBD("PURCHASE_UPDATE_PROCESS"); return this; }

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
    public RoyBsPurchaseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsPurchaseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public RoyBsPurchaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public RoyBsPurchaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        RoyPurchaseCQ bq = (RoyPurchaseCQ)bqs;
        RoyPurchaseCQ uq = (RoyPurchaseCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
        if (bq.hasConditionQuerySummaryProduct()) {
            uq.querySummaryProduct().reflectRelationOnUnionQuery(bq.querySummaryProduct(), uq.querySummaryProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoyMemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public RoyMemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected RoyMemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("PURCHASE", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoyMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br>
     * PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoyProductCQ queryProduct() {
        return xdfgetConditionQueryProduct();
    }
    public RoyProductCQ xdfgetConditionQueryProduct() {
        String prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected RoyProductCQ xcreateQueryProduct() {
        String nrp = xresolveNRP("PURCHASE", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoyProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    /**
     * Get the condition-query for relation table. <br>
     * SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoySummaryProductCQ querySummaryProduct() {
        return xdfgetConditionQuerySummaryProduct();
    }
    public RoySummaryProductCQ xdfgetConditionQuerySummaryProduct() {
        String prop = "summaryProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySummaryProduct()); xsetupOuterJoinSummaryProduct(); }
        return xgetQueRlMap(prop);
    }
    protected RoySummaryProductCQ xcreateQuerySummaryProduct() {
        String nrp = xresolveNRP("PURCHASE", "summaryProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoySummaryProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "summaryProduct", nrp);
    }
    protected void xsetupOuterJoinSummaryProduct() { xregOutJo("summaryProduct"); }
    public boolean hasConditionQuerySummaryProduct() { return xhasQueRlMap("summaryProduct"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, RoyPurchaseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RoyPurchaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RoyPurchaseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RoyPurchaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RoyPurchaseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RoyPurchaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RoyPurchaseCQ> _myselfExistsMap;
    public Map<String, RoyPurchaseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RoyPurchaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RoyPurchaseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RoyPurchaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RoyPurchaseCB.class.getName(); }
    protected String xCQ() { return RoyPurchaseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
