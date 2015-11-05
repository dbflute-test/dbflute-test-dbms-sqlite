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
 * The base condition-query of MEMBER_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsMemberStatusCQ extends RoyAbstractBsMemberStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyMemberStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyBsMemberStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from MEMBER_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RoyMemberStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RoyMemberStatusCIQ xcreateCIQ() {
        RoyMemberStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RoyMemberStatusCIQ xnewCIQ() {
        return new RoyMemberStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join MEMBER_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RoyMemberStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RoyMemberStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberStatusCode;
    public ConditionValue xdfgetMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue xgetCValueMemberStatusCode() { return xdfgetMemberStatusCode(); }

    public Map<String, RoyMemberCQ> xdfgetMemberStatusCode_ExistsReferrer_MemberList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_MemberList"); }
    public String keepMemberStatusCode_ExistsReferrer_MemberList(RoyMemberCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_MemberList", sq); }

    public Map<String, RoyMemberLoginCQ> xdfgetMemberStatusCode_ExistsReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_ExistsReferrer_MemberLoginList(RoyMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_MemberLoginList", sq); }

    public Map<String, RoyMemberCQ> xdfgetMemberStatusCode_NotExistsReferrer_MemberList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberList"); }
    public String keepMemberStatusCode_NotExistsReferrer_MemberList(RoyMemberCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_MemberList", sq); }

    public Map<String, RoyMemberLoginCQ> xdfgetMemberStatusCode_NotExistsReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_NotExistsReferrer_MemberLoginList(RoyMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_MemberLoginList", sq); }

    public Map<String, RoyMemberCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_MemberList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(RoyMemberCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberList", sq); }

    public Map<String, RoyMemberLoginCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(RoyMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList", sq); }

    public Map<String, RoyMemberCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberList(RoyMemberCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberList", pm); }

    public Map<String, RoyMemberLoginCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(RoyMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberLoginList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberLoginList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public RoyBsMemberStatusCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public RoyBsMemberStatusCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _memberStatusName;
    public ConditionValue xdfgetMemberStatusName()
    { if (_memberStatusName == null) { _memberStatusName = nCV(); }
      return _memberStatusName; }
    protected ConditionValue xgetCValueMemberStatusName() { return xdfgetMemberStatusName(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_STATUS_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberStatusCQ addOrderBy_MemberStatusName_Asc() { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_STATUS_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberStatusCQ addOrderBy_MemberStatusName_Desc() { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /** 
     * Add order-by as ascend. <br>
     * DESCRIPTION: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberStatusCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESCRIPTION: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberStatusCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

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
    public RoyBsMemberStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public RoyBsMemberStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public RoyBsMemberStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, RoyMemberStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RoyMemberStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RoyMemberStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RoyMemberStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RoyMemberStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RoyMemberStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RoyMemberStatusCQ> _myselfExistsMap;
    public Map<String, RoyMemberStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RoyMemberStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RoyMemberStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RoyMemberStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RoyMemberStatusCB.class.getName(); }
    protected String xCQ() { return RoyMemberStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
