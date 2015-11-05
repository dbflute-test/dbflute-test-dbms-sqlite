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
 * The base condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class RoyBsMemberCQ extends RoyAbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyMemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyBsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from MEMBER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RoyMemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RoyMemberCIQ xcreateCIQ() {
        RoyMemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RoyMemberCIQ xnewCIQ() {
        return new RoyMemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join MEMBER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RoyMemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RoyMemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    public Map<String, RoyMemberAddressCQ> xdfgetMemberId_ExistsReferrer_MemberAddressList() { return xgetSQueMap("memberId_ExistsReferrer_MemberAddressList"); }
    public String keepMemberId_ExistsReferrer_MemberAddressList(RoyMemberAddressCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberAddressList", sq); }

    public Map<String, RoyMemberLoginCQ> xdfgetMemberId_ExistsReferrer_MemberLoginList() { return xgetSQueMap("memberId_ExistsReferrer_MemberLoginList"); }
    public String keepMemberId_ExistsReferrer_MemberLoginList(RoyMemberLoginCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberLoginList", sq); }

    public Map<String, RoyMemberServiceCQ> xdfgetMemberId_ExistsReferrer_MemberServiceList() { return xgetSQueMap("memberId_ExistsReferrer_MemberServiceList"); }
    public String keepMemberId_ExistsReferrer_MemberServiceList(RoyMemberServiceCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberServiceList", sq); }

    public Map<String, RoyPurchaseCQ> xdfgetMemberId_ExistsReferrer_PurchaseList() { return xgetSQueMap("memberId_ExistsReferrer_PurchaseList"); }
    public String keepMemberId_ExistsReferrer_PurchaseList(RoyPurchaseCQ sq) { return xkeepSQue("memberId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, RoyMemberAddressCQ> xdfgetMemberId_NotExistsReferrer_MemberAddressList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberAddressList"); }
    public String keepMemberId_NotExistsReferrer_MemberAddressList(RoyMemberAddressCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberAddressList", sq); }

    public Map<String, RoyMemberLoginCQ> xdfgetMemberId_NotExistsReferrer_MemberLoginList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberLoginList"); }
    public String keepMemberId_NotExistsReferrer_MemberLoginList(RoyMemberLoginCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberLoginList", sq); }

    public Map<String, RoyMemberServiceCQ> xdfgetMemberId_NotExistsReferrer_MemberServiceList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberServiceList"); }
    public String keepMemberId_NotExistsReferrer_MemberServiceList(RoyMemberServiceCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberServiceList", sq); }

    public Map<String, RoyPurchaseCQ> xdfgetMemberId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("memberId_NotExistsReferrer_PurchaseList"); }
    public String keepMemberId_NotExistsReferrer_PurchaseList(RoyPurchaseCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, RoyMemberAddressCQ> xdfgetMemberId_SpecifyDerivedReferrer_MemberAddressList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(RoyMemberAddressCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberAddressList", sq); }

    public Map<String, RoyMemberLoginCQ> xdfgetMemberId_SpecifyDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(RoyMemberLoginCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberLoginList", sq); }

    public Map<String, RoyMemberServiceCQ> xdfgetMemberId_SpecifyDerivedReferrer_MemberServiceList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberServiceList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberServiceList(RoyMemberServiceCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberServiceList", sq); }

    public Map<String, RoyPurchaseCQ> xdfgetMemberId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepMemberId_SpecifyDerivedReferrer_PurchaseList(RoyPurchaseCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, RoyMemberAddressCQ> xdfgetMemberId_QueryDerivedReferrer_MemberAddressList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressList(RoyMemberAddressCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberAddressList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_MemberAddressListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberAddressList", pm); }

    public Map<String, RoyMemberLoginCQ> xdfgetMemberId_QueryDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginList(RoyMemberLoginCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberLoginList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_MemberLoginListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberLoginList", pm); }

    public Map<String, RoyMemberServiceCQ> xdfgetMemberId_QueryDerivedReferrer_MemberServiceList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberServiceList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberServiceList(RoyMemberServiceCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberServiceList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_MemberServiceListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberServiceList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberServiceListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberServiceList", pm); }

    public Map<String, RoyPurchaseCQ> xdfgetMemberId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("memberId_QueryDerivedReferrer_PurchaseList"); }
    public String keepMemberId_QueryDerivedReferrer_PurchaseList(RoyPurchaseCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_PurchaseList"); }
    public String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_PurchaseList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue xdfgetMemberName()
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected ConditionValue xgetCValueMemberName() { return xdfgetMemberName(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _memberAccount;
    public ConditionValue xdfgetMemberAccount()
    { if (_memberAccount == null) { _memberAccount = nCV(); }
      return _memberAccount; }
    protected ConditionValue xgetCValueMemberAccount() { return xdfgetMemberAccount(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue xdfgetMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue xgetCValueMemberStatusCode() { return xdfgetMemberStatusCode(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _formalizedDatetime;
    public ConditionValue xdfgetFormalizedDatetime()
    { if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
      return _formalizedDatetime; }
    protected ConditionValue xgetCValueFormalizedDatetime() { return xdfgetFormalizedDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_FormalizedDatetime_Asc() { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_FormalizedDatetime_Desc() { regOBD("FORMALIZED_DATETIME"); return this; }

    protected ConditionValue _birthdate;
    public ConditionValue xdfgetBirthdate()
    { if (_birthdate == null) { _birthdate = nCV(); }
      return _birthdate; }
    protected ConditionValue xgetCValueBirthdate() { return xdfgetBirthdate(); }

    /** 
     * Add order-by as ascend. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_Birthdate_Asc() { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_Birthdate_Desc() { regOBD("BIRTHDATE"); return this; }

    protected ConditionValue _memberRegisterDatetime;
    public ConditionValue xdfgetMemberRegisterDatetime()
    { if (_memberRegisterDatetime == null) { _memberRegisterDatetime = nCV(); }
      return _memberRegisterDatetime; }
    protected ConditionValue xgetCValueMemberRegisterDatetime() { return xdfgetMemberRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberRegisterDatetime_Asc() { regOBA("MEMBER_REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberRegisterDatetime_Desc() { regOBD("MEMBER_REGISTER_DATETIME"); return this; }

    protected ConditionValue _memberRegisterUser;
    public ConditionValue xdfgetMemberRegisterUser()
    { if (_memberRegisterUser == null) { _memberRegisterUser = nCV(); }
      return _memberRegisterUser; }
    protected ConditionValue xgetCValueMemberRegisterUser() { return xdfgetMemberRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberRegisterUser_Asc() { regOBA("MEMBER_REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberRegisterUser_Desc() { regOBD("MEMBER_REGISTER_USER"); return this; }

    protected ConditionValue _memberRegisterProcess;
    public ConditionValue xdfgetMemberRegisterProcess()
    { if (_memberRegisterProcess == null) { _memberRegisterProcess = nCV(); }
      return _memberRegisterProcess; }
    protected ConditionValue xgetCValueMemberRegisterProcess() { return xdfgetMemberRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberRegisterProcess_Asc() { regOBA("MEMBER_REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberRegisterProcess_Desc() { regOBD("MEMBER_REGISTER_PROCESS"); return this; }

    protected ConditionValue _memberUpdateDatetime;
    public ConditionValue xdfgetMemberUpdateDatetime()
    { if (_memberUpdateDatetime == null) { _memberUpdateDatetime = nCV(); }
      return _memberUpdateDatetime; }
    protected ConditionValue xgetCValueMemberUpdateDatetime() { return xdfgetMemberUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberUpdateDatetime_Asc() { regOBA("MEMBER_UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberUpdateDatetime_Desc() { regOBD("MEMBER_UPDATE_DATETIME"); return this; }

    protected ConditionValue _memberUpdateUser;
    public ConditionValue xdfgetMemberUpdateUser()
    { if (_memberUpdateUser == null) { _memberUpdateUser = nCV(); }
      return _memberUpdateUser; }
    protected ConditionValue xgetCValueMemberUpdateUser() { return xdfgetMemberUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberUpdateUser_Asc() { regOBA("MEMBER_UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberUpdateUser_Desc() { regOBD("MEMBER_UPDATE_USER"); return this; }

    protected ConditionValue _memberUpdateProcess;
    public ConditionValue xdfgetMemberUpdateProcess()
    { if (_memberUpdateProcess == null) { _memberUpdateProcess = nCV(); }
      return _memberUpdateProcess; }
    protected ConditionValue xgetCValueMemberUpdateProcess() { return xdfgetMemberUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberUpdateProcess_Asc() { regOBA("MEMBER_UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_MemberUpdateProcess_Desc() { regOBD("MEMBER_UPDATE_PROCESS"); return this; }

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
    public RoyBsMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return this. (NotNull)
     */
    public RoyBsMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public RoyBsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public RoyBsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        RoyMemberCQ bq = (RoyMemberCQ)bqs;
        RoyMemberCQ uq = (RoyMemberCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMemberAddressAsValid()) {
            uq.xsetParameterMapMemberAddressAsValid(bq.xdfgetParameterMapMemberAddressAsValid());
            uq.xdfgetConditionQueryMemberAddressAsValid().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberAddressAsValid(), uq.xdfgetConditionQueryMemberAddressAsValid());
        }
        if (bq.hasConditionQueryMemberSecurityAsOne()) {
            uq.queryMemberSecurityAsOne().reflectRelationOnUnionQuery(bq.queryMemberSecurityAsOne(), uq.queryMemberSecurityAsOne());
        }
        if (bq.hasConditionQueryMemberWithdrawalAsOne()) {
            uq.queryMemberWithdrawalAsOne().reflectRelationOnUnionQuery(bq.queryMemberWithdrawalAsOne(), uq.queryMemberWithdrawalAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoyMemberStatusCQ queryMemberStatus() {
        return xdfgetConditionQueryMemberStatus();
    }
    public RoyMemberStatusCQ xdfgetConditionQueryMemberStatus() {
        String prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected RoyMemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = xresolveNRP("MEMBER", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoyMemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected void xsetupOuterJoinMemberStatus() { xregOutJo("memberStatus"); }
    public boolean hasConditionQueryMemberStatus() { return xhasQueRlMap("memberStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public RoyMemberAddressCQ queryMemberAddressAsValid(java.time.LocalDate targetDate) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberAddressAsValid();
        parameterMap.put("targetDate", targetDate);
        xassertFCDP("memberAddressAsValid", parameterMap);
        return xdfgetConditionQueryMemberAddressAsValid();
    }
    public RoyMemberAddressCQ xdfgetConditionQueryMemberAddressAsValid() {
        String prop = "memberAddressAsValid";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberAddressAsValid()); xsetupOuterJoinMemberAddressAsValid(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberAddressAsValid;
    public Map<String, Object> xdfgetParameterMapMemberAddressAsValid()
    { if (_parameterMapMemberAddressAsValid == null) { _parameterMapMemberAddressAsValid = newLinkedHashMapSized(4); }
      return _parameterMapMemberAddressAsValid; }
    public void xsetParameterMapMemberAddressAsValid(Map<String, Object> parameterMap)
    { _parameterMapMemberAddressAsValid = parameterMap; } // for UnionQuery
    protected RoyMemberAddressCQ xcreateQueryMemberAddressAsValid() {
        String nrp = xresolveNRP("MEMBER", "memberAddressAsValid"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoyMemberAddressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberAddressAsValid", nrp);
    }
    protected void xsetupOuterJoinMemberAddressAsValid() { xregOutJo("memberAddressAsValid"); }
    public boolean hasConditionQueryMemberAddressAsValid() { return xhasQueRlMap("memberAddressAsValid"); }

    /**
     * Get the condition-query for relation table. <br>
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoyMemberSecurityCQ queryMemberSecurityAsOne() { return xdfgetConditionQueryMemberSecurityAsOne(); }
    public RoyMemberSecurityCQ xdfgetConditionQueryMemberSecurityAsOne() {
        String prop = "memberSecurityAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberSecurityAsOne()); xsetupOuterJoinMemberSecurityAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected RoyMemberSecurityCQ xcreateQueryMemberSecurityAsOne() {
        String nrp = xresolveNRP("MEMBER", "memberSecurityAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoyMemberSecurityCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberSecurityAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberSecurityAsOne() { xregOutJo("memberSecurityAsOne"); }
    public boolean hasConditionQueryMemberSecurityAsOne() { return xhasQueRlMap("memberSecurityAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoyMemberWithdrawalCQ queryMemberWithdrawalAsOne() { return xdfgetConditionQueryMemberWithdrawalAsOne(); }
    public RoyMemberWithdrawalCQ xdfgetConditionQueryMemberWithdrawalAsOne() {
        String prop = "memberWithdrawalAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberWithdrawalAsOne()); xsetupOuterJoinMemberWithdrawalAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected RoyMemberWithdrawalCQ xcreateQueryMemberWithdrawalAsOne() {
        String nrp = xresolveNRP("MEMBER", "memberWithdrawalAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoyMemberWithdrawalCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberWithdrawalAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberWithdrawalAsOne() { xregOutJo("memberWithdrawalAsOne"); }
    public boolean hasConditionQueryMemberWithdrawalAsOne() { return xhasQueRlMap("memberWithdrawalAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("memberAddressAsValid".equalsIgnoreCase(property)) { return _parameterMapMemberAddressAsValid; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, RoyMemberCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RoyMemberCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RoyMemberCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RoyMemberCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RoyMemberCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RoyMemberCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RoyMemberCQ> _myselfExistsMap;
    public Map<String, RoyMemberCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RoyMemberCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RoyMemberCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RoyMemberCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RoyMemberCB.class.getName(); }
    protected String xCQ() { return RoyMemberCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
