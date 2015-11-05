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
 * The base condition-query of REGION.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsRegionCQ extends RoyAbstractBsRegionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyRegionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyBsRegionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from REGION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RoyRegionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RoyRegionCIQ xcreateCIQ() {
        RoyRegionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RoyRegionCIQ xnewCIQ() {
        return new RoyRegionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join REGION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RoyRegionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RoyRegionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _regionId;
    public ConditionValue xdfgetRegionId()
    { if (_regionId == null) { _regionId = nCV(); }
      return _regionId; }
    protected ConditionValue xgetCValueRegionId() { return xdfgetRegionId(); }

    public Map<String, RoyMemberAddressCQ> xdfgetRegionId_ExistsReferrer_MemberAddressList() { return xgetSQueMap("regionId_ExistsReferrer_MemberAddressList"); }
    public String keepRegionId_ExistsReferrer_MemberAddressList(RoyMemberAddressCQ sq) { return xkeepSQue("regionId_ExistsReferrer_MemberAddressList", sq); }

    public Map<String, RoyMemberAddressCQ> xdfgetRegionId_NotExistsReferrer_MemberAddressList() { return xgetSQueMap("regionId_NotExistsReferrer_MemberAddressList"); }
    public String keepRegionId_NotExistsReferrer_MemberAddressList(RoyMemberAddressCQ sq) { return xkeepSQue("regionId_NotExistsReferrer_MemberAddressList", sq); }

    public Map<String, RoyMemberAddressCQ> xdfgetRegionId_SpecifyDerivedReferrer_MemberAddressList() { return xgetSQueMap("regionId_SpecifyDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(RoyMemberAddressCQ sq) { return xkeepSQue("regionId_SpecifyDerivedReferrer_MemberAddressList", sq); }

    public Map<String, RoyMemberAddressCQ> xdfgetRegionId_QueryDerivedReferrer_MemberAddressList() { return xgetSQueMap("regionId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressList(RoyMemberAddressCQ sq) { return xkeepSQue("regionId_QueryDerivedReferrer_MemberAddressList", sq); }
    public Map<String, Object> xdfgetRegionId_QueryDerivedReferrer_MemberAddressListParameter() { return xgetSQuePmMap("regionId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object pm) { return xkeepSQuePm("regionId_QueryDerivedReferrer_MemberAddressList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * REGION_ID: {PK, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsRegionCQ addOrderBy_RegionId_Asc() { regOBA("REGION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGION_ID: {PK, NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsRegionCQ addOrderBy_RegionId_Desc() { regOBD("REGION_ID"); return this; }

    protected ConditionValue _regionName;
    public ConditionValue xdfgetRegionName()
    { if (_regionName == null) { _regionName = nCV(); }
      return _regionName; }
    protected ConditionValue xgetCValueRegionName() { return xdfgetRegionName(); }

    /** 
     * Add order-by as ascend. <br>
     * REGION_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsRegionCQ addOrderBy_RegionName_Asc() { regOBA("REGION_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGION_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsRegionCQ addOrderBy_RegionName_Desc() { regOBD("REGION_NAME"); return this; }

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
    public RoyBsRegionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public RoyBsRegionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, RoyRegionCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RoyRegionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RoyRegionCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RoyRegionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RoyRegionCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RoyRegionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RoyRegionCQ> _myselfExistsMap;
    public Map<String, RoyRegionCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RoyRegionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RoyRegionCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RoyRegionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RoyRegionCB.class.getName(); }
    protected String xCQ() { return RoyRegionCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
