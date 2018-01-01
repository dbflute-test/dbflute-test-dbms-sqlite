package org.docksidestage.sqlite.dbflute.readonly.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.*;

/**
 * The abstract condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class RoyAbstractBsMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyAbstractBsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return RoyDBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberIdList The collection of memberId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @param memberIdList The collection of memberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br>
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberAddress</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     addressCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    public void existsMemberAddress(SubQuery<RoyMemberAddressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyMemberAddressCB cb = new RoyMemberAddressCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberAddressList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberAddressList(RoyMemberAddressCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from MEMBER_LOGIN where ...)} <br>
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberLogin</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberLoginList for 'exists'. (NotNull)
     */
    public void existsMemberLogin(SubQuery<RoyMemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyMemberLoginCB cb = new RoyMemberLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberLoginList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberLoginList(RoyMemberLoginCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from MEMBER_SERVICE where ...)} <br>
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberService</span>(serviceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     serviceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberServiceList for 'exists'. (NotNull)
     */
    public void existsMemberService(SubQuery<RoyMemberServiceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyMemberServiceCB cb = new RoyMemberServiceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberServiceList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberServiceList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberServiceList(RoyMemberServiceCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from PURCHASE where ...)} <br>
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPurchase</span>(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PurchaseList for 'exists'. (NotNull)
     */
    public void existsPurchase(SubQuery<RoyPurchaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyPurchaseCB cb = new RoyPurchaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_PurchaseList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList");
    }
    public abstract String keepMemberId_ExistsReferrer_PurchaseList(RoyPurchaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br>
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberAddress</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     addressCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    public void notExistsMemberAddress(SubQuery<RoyMemberAddressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyMemberAddressCB cb = new RoyMemberAddressCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberAddressList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberAddressList(RoyMemberAddressCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from MEMBER_LOGIN where ...)} <br>
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberLogin</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberLoginList for 'not exists'. (NotNull)
     */
    public void notExistsMemberLogin(SubQuery<RoyMemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyMemberLoginCB cb = new RoyMemberLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberLoginList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberLoginList(RoyMemberLoginCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from MEMBER_SERVICE where ...)} <br>
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberService</span>(serviceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     serviceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberServiceList for 'not exists'. (NotNull)
     */
    public void notExistsMemberService(SubQuery<RoyMemberServiceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyMemberServiceCB cb = new RoyMemberServiceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberServiceList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberServiceList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberServiceList(RoyMemberServiceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from PURCHASE where ...)} <br>
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPurchase</span>(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_PurchaseList for 'not exists'. (NotNull)
     */
    public void notExistsPurchase(SubQuery<RoyPurchaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyPurchaseCB cb = new RoyPurchaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_PurchaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList");
    }
    public abstract String keepMemberId_NotExistsReferrer_PurchaseList(RoyPurchaseCQ sq);

    public void xsderiveMemberAddressList(String fn, SubQuery<RoyMemberAddressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyMemberAddressCB cb = new RoyMemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberAddressList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(RoyMemberAddressCQ sq);

    public void xsderiveMemberLoginList(String fn, SubQuery<RoyMemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyMemberLoginCB cb = new RoyMemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberLoginList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(RoyMemberLoginCQ sq);

    public void xsderiveMemberServiceList(String fn, SubQuery<RoyMemberServiceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyMemberServiceCB cb = new RoyMemberServiceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberServiceList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberServiceList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberServiceList(RoyMemberServiceCQ sq);

    public void xsderivePurchaseList(String fn, SubQuery<RoyPurchaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyPurchaseCB cb = new RoyPurchaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_PurchaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_PurchaseList(RoyPurchaseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from MEMBER_ADDRESS where ...)} <br>
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberAddress()</span>.<span style="color: #CC4747">max</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     addressCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     addressCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<RoyMemberAddressCB> derivedMemberAddress() {
        return xcreateQDRFunctionMemberAddressList();
    }
    protected HpQDRFunction<RoyMemberAddressCB> xcreateQDRFunctionMemberAddressList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberAddressList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberAddressList(String fn, SubQuery<RoyMemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyMemberAddressCB cb = new RoyMemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberAddressList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberAddressList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberAddressList(RoyMemberAddressCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from MEMBER_LOGIN where ...)} <br>
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberLogin()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     loginCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<RoyMemberLoginCB> derivedMemberLogin() {
        return xcreateQDRFunctionMemberLoginList();
    }
    protected HpQDRFunction<RoyMemberLoginCB> xcreateQDRFunctionMemberLoginList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberLoginList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberLoginList(String fn, SubQuery<RoyMemberLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyMemberLoginCB cb = new RoyMemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberLoginList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberLoginList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginList(RoyMemberLoginCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from MEMBER_SERVICE where ...)} <br>
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberService()</span>.<span style="color: #CC4747">max</span>(serviceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     serviceCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     serviceCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<RoyMemberServiceCB> derivedMemberService() {
        return xcreateQDRFunctionMemberServiceList();
    }
    protected HpQDRFunction<RoyMemberServiceCB> xcreateQDRFunctionMemberServiceList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberServiceList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberServiceList(String fn, SubQuery<RoyMemberServiceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyMemberServiceCB cb = new RoyMemberServiceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberServiceList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberServiceListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberServiceList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberServiceList(RoyMemberServiceCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberServiceListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from PURCHASE where ...)} <br>
     * PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPurchase()</span>.<span style="color: #CC4747">max</span>(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     purchaseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<RoyPurchaseCB> derivedPurchase() {
        return xcreateQDRFunctionPurchaseList();
    }
    protected HpQDRFunction<RoyPurchaseCB> xcreateQDRFunctionPurchaseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePurchaseList(fn, sq, rd, vl, op));
    }
    public void xqderivePurchaseList(String fn, SubQuery<RoyPurchaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyPurchaseCB cb = new RoyPurchaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_PurchaseList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_PurchaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "purchaseList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_PurchaseList(RoyPurchaseCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberName The value of memberName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberName_Equal(String memberName) {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected void doSetMemberName_Equal(String memberName) {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberName The value of memberName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberName_NotEqual(String memberName) {
        doSetMemberName_NotEqual(fRES(memberName));
    }

    protected void doSetMemberName_NotEqual(String memberName) {
        regMemberName(CK_NES, memberName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberNameList The collection of memberName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberName_InScope(Collection<String> memberNameList) {
        doSetMemberName_InScope(memberNameList);
    }

    protected void doSetMemberName_InScope(Collection<String> memberNameList) {
        regINS(CK_INS, cTL(memberNameList), xgetCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberNameList The collection of memberName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberName_NotInScope(Collection<String> memberNameList) {
        doSetMemberName_NotInScope(memberNameList);
    }

    protected void doSetMemberName_NotInScope(Collection<String> memberNameList) {
        regINS(CK_NINS, cTL(memberNameList), xgetCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberName The value of memberName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberName_LikeSearch(memberName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberName), xgetCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberName The value of memberName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberName_NotLikeSearch(memberName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @param memberName The value of memberName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberName), xgetCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    protected void regMemberName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberName(), "MEMBER_NAME"); }
    protected abstract ConditionValue xgetCValueMemberName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccount The value of memberAccount as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAccount_Equal(String memberAccount) {
        doSetMemberAccount_Equal(fRES(memberAccount));
    }

    /**
     * Equal(=). As the empty-string. And OnlyOnceRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     */
    public void setMemberAccount_Equal_EmptyString() {
        doSetMemberAccount_Equal("");
    }

    protected void doSetMemberAccount_Equal(String memberAccount) {
        regMemberAccount(CK_EQ, memberAccount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccount The value of memberAccount as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAccount_NotEqual(String memberAccount) {
        doSetMemberAccount_NotEqual(fRES(memberAccount));
    }

    /**
     * NotEqual(&lt;&gt;). As the empty-string. And OnlyOnceRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     */
    public void setMemberAccount_NotEqual_EmptyString() {
        doSetMemberAccount_NotEqual("");
    }

    protected void doSetMemberAccount_NotEqual(String memberAccount) {
        regMemberAccount(CK_NES, memberAccount);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccountList The collection of memberAccount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAccount_InScope(Collection<String> memberAccountList) {
        doSetMemberAccount_InScope(memberAccountList);
    }

    protected void doSetMemberAccount_InScope(Collection<String> memberAccountList) {
        regINS(CK_INS, cTL(memberAccountList), xgetCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccountList The collection of memberAccount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAccount_NotInScope(Collection<String> memberAccountList) {
        doSetMemberAccount_NotInScope(memberAccountList);
    }

    protected void doSetMemberAccount_NotInScope(Collection<String> memberAccountList) {
        regINS(CK_NINS, cTL(memberAccountList), xgetCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberAccount_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberAccount The value of memberAccount as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberAccount_LikeSearch(String memberAccount, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberAccount_LikeSearch(memberAccount, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberAccount_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberAccount The value of memberAccount as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberAccount_LikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberAccount), xgetCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccount The value of memberAccount as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberAccount_NotLikeSearch(String memberAccount, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberAccount_NotLikeSearch(memberAccount, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @param memberAccount The value of memberAccount as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberAccount_NotLikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberAccount), xgetCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    protected void regMemberAccount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberAccount(), "MEMBER_ACCOUNT"); }
    protected abstract ConditionValue xgetCValueMemberAccount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberStatusCode_Equal_AsMemberStatus(RoyCDef.MemberStatus cdef) {
        doSetMemberStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As ProvisionalMember (PRV). And OnlyOnceRegistered. <br>
     * Provisional Member
     */
    public void setMemberStatusCode_Equal_ProvisionalMember() {
        setMemberStatusCode_Equal_AsMemberStatus(RoyCDef.MemberStatus.ProvisionalMember);
    }

    /**
     * Equal(=). As FormalizedMember (FML). And OnlyOnceRegistered. <br>
     * Formalized Member
     */
    public void setMemberStatusCode_Equal_FormalizedMember() {
        setMemberStatusCode_Equal_AsMemberStatus(RoyCDef.MemberStatus.FormalizedMember);
    }

    /**
     * Equal(=). As WithdrawalMember (WDL). And OnlyOnceRegistered. <br>
     * Withdrawal Member
     */
    public void setMemberStatusCode_Equal_WithdrawalMember() {
        setMemberStatusCode_Equal_AsMemberStatus(RoyCDef.MemberStatus.WithdrawalMember);
    }

    protected void doSetMemberStatusCode_Equal(String memberStatusCode) {
        regMemberStatusCode(CK_EQ, memberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberStatusCode_NotEqual_AsMemberStatus(RoyCDef.MemberStatus cdef) {
        doSetMemberStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As ProvisionalMember (PRV). And OnlyOnceRegistered. <br>
     * Provisional Member
     */
    public void setMemberStatusCode_NotEqual_ProvisionalMember() {
        setMemberStatusCode_NotEqual_AsMemberStatus(RoyCDef.MemberStatus.ProvisionalMember);
    }

    /**
     * NotEqual(&lt;&gt;). As FormalizedMember (FML). And OnlyOnceRegistered. <br>
     * Formalized Member
     */
    public void setMemberStatusCode_NotEqual_FormalizedMember() {
        setMemberStatusCode_NotEqual_AsMemberStatus(RoyCDef.MemberStatus.FormalizedMember);
    }

    /**
     * NotEqual(&lt;&gt;). As WithdrawalMember (WDL). And OnlyOnceRegistered. <br>
     * Withdrawal Member
     */
    public void setMemberStatusCode_NotEqual_WithdrawalMember() {
        setMemberStatusCode_NotEqual_AsMemberStatus(RoyCDef.MemberStatus.WithdrawalMember);
    }

    protected void doSetMemberStatusCode_NotEqual(String memberStatusCode) {
        regMemberStatusCode(CK_NES, memberStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberStatusCode_InScope_AsMemberStatus(Collection<RoyCDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_InScope(cTStrL(cdefList));
    }

    protected void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberStatusCode_NotInScope_AsMemberStatus(Collection<RoyCDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    protected void regMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueMemberStatusCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_Equal(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_EQ,  formalizedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_GreaterThan(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_GT,  formalizedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_LessThan(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_LT,  formalizedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_GreaterEqual(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_GE,  formalizedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_LessEqual(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_LE, formalizedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * <pre>e.g. setFormalizedDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setFormalizedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setFormalizedDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * <pre>e.g. setFormalizedDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFormalizedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "FORMALIZED_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueFormalizedDatetime(), nm, op);
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetimeList The collection of formalizedDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_InScope(Collection<java.time.LocalDateTime> formalizedDatetimeList) {
        doSetFormalizedDatetime_InScope(formalizedDatetimeList);
    }

    protected void doSetFormalizedDatetime_InScope(Collection<java.time.LocalDateTime> formalizedDatetimeList) {
        regINS(CK_INS, cTL(formalizedDatetimeList), xgetCValueFormalizedDatetime(), "FORMALIZED_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @param formalizedDatetimeList The collection of formalizedDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_NotInScope(Collection<java.time.LocalDateTime> formalizedDatetimeList) {
        doSetFormalizedDatetime_NotInScope(formalizedDatetimeList);
    }

    protected void doSetFormalizedDatetime_NotInScope(Collection<java.time.LocalDateTime> formalizedDatetimeList) {
        regINS(CK_NINS, cTL(formalizedDatetimeList), xgetCValueFormalizedDatetime(), "FORMALIZED_DATETIME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     */
    public void setFormalizedDatetime_IsNull() { regFormalizedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     */
    public void setFormalizedDatetime_IsNotNull() { regFormalizedDatetime(CK_ISNN, DOBJ); }

    protected void regFormalizedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFormalizedDatetime(), "FORMALIZED_DATETIME"); }
    protected abstract ConditionValue xgetCValueFormalizedDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_Equal(java.time.LocalDate birthdate) {
        regBirthdate(CK_EQ,  birthdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_GreaterThan(java.time.LocalDate birthdate) {
        regBirthdate(CK_GT,  birthdate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_LessThan(java.time.LocalDate birthdate) {
        regBirthdate(CK_LT,  birthdate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_GreaterEqual(java.time.LocalDate birthdate) {
        regBirthdate(CK_GE,  birthdate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdate The value of birthdate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_LessEqual(java.time.LocalDate birthdate) {
        regBirthdate(CK_LE, birthdate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * <pre>e.g. setBirthdate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBirthdate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBirthdate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * <pre>e.g. setBirthdate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBirthdate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "BIRTHDATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBirthdate(), nm, op);
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdateList The collection of birthdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBirthdate_InScope(Collection<java.time.LocalDate> birthdateList) {
        doSetBirthdate_InScope(birthdateList);
    }

    protected void doSetBirthdate_InScope(Collection<java.time.LocalDate> birthdateList) {
        regINS(CK_INS, cTL(birthdateList), xgetCValueBirthdate(), "BIRTHDATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @param birthdateList The collection of birthdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBirthdate_NotInScope(Collection<java.time.LocalDate> birthdateList) {
        doSetBirthdate_NotInScope(birthdateList);
    }

    protected void doSetBirthdate_NotInScope(Collection<java.time.LocalDate> birthdateList) {
        regINS(CK_NINS, cTL(birthdateList), xgetCValueBirthdate(), "BIRTHDATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     */
    public void setBirthdate_IsNull() { regBirthdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BIRTHDATE: {DATE(2000000000, 10)}
     */
    public void setBirthdate_IsNotNull() { regBirthdate(CK_ISNN, DOBJ); }

    protected void regBirthdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBirthdate(), "BIRTHDATE"); }
    protected abstract ConditionValue xgetCValueBirthdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_Equal(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_EQ,  memberRegisterDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_GreaterThan(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_GT,  memberRegisterDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_LessThan(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_LT,  memberRegisterDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_GreaterEqual(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_GE,  memberRegisterDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_LessEqual(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_LE, memberRegisterDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setMemberRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setMemberRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setMemberRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setMemberRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setMemberRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "MEMBER_REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueMemberRegisterDatetime(), nm, op);
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetimeList The collection of memberRegisterDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_InScope(Collection<java.time.LocalDateTime> memberRegisterDatetimeList) {
        doSetMemberRegisterDatetime_InScope(memberRegisterDatetimeList);
    }

    protected void doSetMemberRegisterDatetime_InScope(Collection<java.time.LocalDateTime> memberRegisterDatetimeList) {
        regINS(CK_INS, cTL(memberRegisterDatetimeList), xgetCValueMemberRegisterDatetime(), "MEMBER_REGISTER_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberRegisterDatetimeList The collection of memberRegisterDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_NotInScope(Collection<java.time.LocalDateTime> memberRegisterDatetimeList) {
        doSetMemberRegisterDatetime_NotInScope(memberRegisterDatetimeList);
    }

    protected void doSetMemberRegisterDatetime_NotInScope(Collection<java.time.LocalDateTime> memberRegisterDatetimeList) {
        regINS(CK_NINS, cTL(memberRegisterDatetimeList), xgetCValueMemberRegisterDatetime(), "MEMBER_REGISTER_DATETIME");
    }

    protected void regMemberRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberRegisterDatetime(), "MEMBER_REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueMemberRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUser The value of memberRegisterUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterUser_Equal(String memberRegisterUser) {
        doSetMemberRegisterUser_Equal(fRES(memberRegisterUser));
    }

    protected void doSetMemberRegisterUser_Equal(String memberRegisterUser) {
        regMemberRegisterUser(CK_EQ, memberRegisterUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUser The value of memberRegisterUser as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterUser_NotEqual(String memberRegisterUser) {
        doSetMemberRegisterUser_NotEqual(fRES(memberRegisterUser));
    }

    protected void doSetMemberRegisterUser_NotEqual(String memberRegisterUser) {
        regMemberRegisterUser(CK_NES, memberRegisterUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUserList The collection of memberRegisterUser as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterUser_InScope(Collection<String> memberRegisterUserList) {
        doSetMemberRegisterUser_InScope(memberRegisterUserList);
    }

    protected void doSetMemberRegisterUser_InScope(Collection<String> memberRegisterUserList) {
        regINS(CK_INS, cTL(memberRegisterUserList), xgetCValueMemberRegisterUser(), "MEMBER_REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUserList The collection of memberRegisterUser as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterUser_NotInScope(Collection<String> memberRegisterUserList) {
        doSetMemberRegisterUser_NotInScope(memberRegisterUserList);
    }

    protected void doSetMemberRegisterUser_NotInScope(Collection<String> memberRegisterUserList) {
        regINS(CK_NINS, cTL(memberRegisterUserList), xgetCValueMemberRegisterUser(), "MEMBER_REGISTER_USER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberRegisterUser The value of memberRegisterUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberRegisterUser_LikeSearch(String memberRegisterUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberRegisterUser_LikeSearch(memberRegisterUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberRegisterUser The value of memberRegisterUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberRegisterUser_LikeSearch(String memberRegisterUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberRegisterUser), xgetCValueMemberRegisterUser(), "MEMBER_REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUser The value of memberRegisterUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberRegisterUser_NotLikeSearch(String memberRegisterUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberRegisterUser_NotLikeSearch(memberRegisterUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterUser The value of memberRegisterUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberRegisterUser_NotLikeSearch(String memberRegisterUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberRegisterUser), xgetCValueMemberRegisterUser(), "MEMBER_REGISTER_USER", likeSearchOption);
    }

    protected void regMemberRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberRegisterUser(), "MEMBER_REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueMemberRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcess The value of memberRegisterProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterProcess_Equal(String memberRegisterProcess) {
        doSetMemberRegisterProcess_Equal(fRES(memberRegisterProcess));
    }

    protected void doSetMemberRegisterProcess_Equal(String memberRegisterProcess) {
        regMemberRegisterProcess(CK_EQ, memberRegisterProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcess The value of memberRegisterProcess as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterProcess_NotEqual(String memberRegisterProcess) {
        doSetMemberRegisterProcess_NotEqual(fRES(memberRegisterProcess));
    }

    protected void doSetMemberRegisterProcess_NotEqual(String memberRegisterProcess) {
        regMemberRegisterProcess(CK_NES, memberRegisterProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcessList The collection of memberRegisterProcess as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterProcess_InScope(Collection<String> memberRegisterProcessList) {
        doSetMemberRegisterProcess_InScope(memberRegisterProcessList);
    }

    protected void doSetMemberRegisterProcess_InScope(Collection<String> memberRegisterProcessList) {
        regINS(CK_INS, cTL(memberRegisterProcessList), xgetCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcessList The collection of memberRegisterProcess as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberRegisterProcess_NotInScope(Collection<String> memberRegisterProcessList) {
        doSetMemberRegisterProcess_NotInScope(memberRegisterProcessList);
    }

    protected void doSetMemberRegisterProcess_NotInScope(Collection<String> memberRegisterProcessList) {
        regINS(CK_NINS, cTL(memberRegisterProcessList), xgetCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberRegisterProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberRegisterProcess The value of memberRegisterProcess as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberRegisterProcess_LikeSearch(String memberRegisterProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberRegisterProcess_LikeSearch(memberRegisterProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberRegisterProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberRegisterProcess The value of memberRegisterProcess as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberRegisterProcess_LikeSearch(String memberRegisterProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberRegisterProcess), xgetCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcess The value of memberRegisterProcess as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberRegisterProcess_NotLikeSearch(String memberRegisterProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberRegisterProcess_NotLikeSearch(memberRegisterProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberRegisterProcess The value of memberRegisterProcess as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberRegisterProcess_NotLikeSearch(String memberRegisterProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberRegisterProcess), xgetCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS", likeSearchOption);
    }

    protected void regMemberRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberRegisterProcess(), "MEMBER_REGISTER_PROCESS"); }
    protected abstract ConditionValue xgetCValueMemberRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberUpdateDatetime_Equal(java.time.LocalDateTime memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_EQ,  memberUpdateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberUpdateDatetime_GreaterThan(java.time.LocalDateTime memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_GT,  memberUpdateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberUpdateDatetime_LessThan(java.time.LocalDateTime memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_LT,  memberUpdateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberUpdateDatetime_GreaterEqual(java.time.LocalDateTime memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_GE,  memberUpdateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetime The value of memberUpdateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberUpdateDatetime_LessEqual(java.time.LocalDateTime memberUpdateDatetime) {
        regMemberUpdateDatetime(CK_LE, memberUpdateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setMemberUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setMemberUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setMemberUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setMemberUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setMemberUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "MEMBER_UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueMemberUpdateDatetime(), nm, op);
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetimeList The collection of memberUpdateDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateDatetime_InScope(Collection<java.time.LocalDateTime> memberUpdateDatetimeList) {
        doSetMemberUpdateDatetime_InScope(memberUpdateDatetimeList);
    }

    protected void doSetMemberUpdateDatetime_InScope(Collection<java.time.LocalDateTime> memberUpdateDatetimeList) {
        regINS(CK_INS, cTL(memberUpdateDatetimeList), xgetCValueMemberUpdateDatetime(), "MEMBER_UPDATE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param memberUpdateDatetimeList The collection of memberUpdateDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateDatetime_NotInScope(Collection<java.time.LocalDateTime> memberUpdateDatetimeList) {
        doSetMemberUpdateDatetime_NotInScope(memberUpdateDatetimeList);
    }

    protected void doSetMemberUpdateDatetime_NotInScope(Collection<java.time.LocalDateTime> memberUpdateDatetimeList) {
        regINS(CK_NINS, cTL(memberUpdateDatetimeList), xgetCValueMemberUpdateDatetime(), "MEMBER_UPDATE_DATETIME");
    }

    protected void regMemberUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberUpdateDatetime(), "MEMBER_UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueMemberUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUser The value of memberUpdateUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateUser_Equal(String memberUpdateUser) {
        doSetMemberUpdateUser_Equal(fRES(memberUpdateUser));
    }

    protected void doSetMemberUpdateUser_Equal(String memberUpdateUser) {
        regMemberUpdateUser(CK_EQ, memberUpdateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUser The value of memberUpdateUser as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateUser_NotEqual(String memberUpdateUser) {
        doSetMemberUpdateUser_NotEqual(fRES(memberUpdateUser));
    }

    protected void doSetMemberUpdateUser_NotEqual(String memberUpdateUser) {
        regMemberUpdateUser(CK_NES, memberUpdateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUserList The collection of memberUpdateUser as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateUser_InScope(Collection<String> memberUpdateUserList) {
        doSetMemberUpdateUser_InScope(memberUpdateUserList);
    }

    protected void doSetMemberUpdateUser_InScope(Collection<String> memberUpdateUserList) {
        regINS(CK_INS, cTL(memberUpdateUserList), xgetCValueMemberUpdateUser(), "MEMBER_UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUserList The collection of memberUpdateUser as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateUser_NotInScope(Collection<String> memberUpdateUserList) {
        doSetMemberUpdateUser_NotInScope(memberUpdateUserList);
    }

    protected void doSetMemberUpdateUser_NotInScope(Collection<String> memberUpdateUserList) {
        regINS(CK_NINS, cTL(memberUpdateUserList), xgetCValueMemberUpdateUser(), "MEMBER_UPDATE_USER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberUpdateUser The value of memberUpdateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberUpdateUser_LikeSearch(String memberUpdateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberUpdateUser_LikeSearch(memberUpdateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberUpdateUser The value of memberUpdateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberUpdateUser_LikeSearch(String memberUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberUpdateUser), xgetCValueMemberUpdateUser(), "MEMBER_UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUser The value of memberUpdateUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberUpdateUser_NotLikeSearch(String memberUpdateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberUpdateUser_NotLikeSearch(memberUpdateUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateUser The value of memberUpdateUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberUpdateUser_NotLikeSearch(String memberUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberUpdateUser), xgetCValueMemberUpdateUser(), "MEMBER_UPDATE_USER", likeSearchOption);
    }

    protected void regMemberUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberUpdateUser(), "MEMBER_UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueMemberUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcess The value of memberUpdateProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateProcess_Equal(String memberUpdateProcess) {
        doSetMemberUpdateProcess_Equal(fRES(memberUpdateProcess));
    }

    protected void doSetMemberUpdateProcess_Equal(String memberUpdateProcess) {
        regMemberUpdateProcess(CK_EQ, memberUpdateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcess The value of memberUpdateProcess as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateProcess_NotEqual(String memberUpdateProcess) {
        doSetMemberUpdateProcess_NotEqual(fRES(memberUpdateProcess));
    }

    protected void doSetMemberUpdateProcess_NotEqual(String memberUpdateProcess) {
        regMemberUpdateProcess(CK_NES, memberUpdateProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcessList The collection of memberUpdateProcess as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateProcess_InScope(Collection<String> memberUpdateProcessList) {
        doSetMemberUpdateProcess_InScope(memberUpdateProcessList);
    }

    protected void doSetMemberUpdateProcess_InScope(Collection<String> memberUpdateProcessList) {
        regINS(CK_INS, cTL(memberUpdateProcessList), xgetCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcessList The collection of memberUpdateProcess as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberUpdateProcess_NotInScope(Collection<String> memberUpdateProcessList) {
        doSetMemberUpdateProcess_NotInScope(memberUpdateProcessList);
    }

    protected void doSetMemberUpdateProcess_NotInScope(Collection<String> memberUpdateProcessList) {
        regINS(CK_NINS, cTL(memberUpdateProcessList), xgetCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberUpdateProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberUpdateProcess The value of memberUpdateProcess as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberUpdateProcess_LikeSearch(String memberUpdateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberUpdateProcess_LikeSearch(memberUpdateProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setMemberUpdateProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberUpdateProcess The value of memberUpdateProcess as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberUpdateProcess_LikeSearch(String memberUpdateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberUpdateProcess), xgetCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcess The value of memberUpdateProcess as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberUpdateProcess_NotLikeSearch(String memberUpdateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberUpdateProcess_NotLikeSearch(memberUpdateProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param memberUpdateProcess The value of memberUpdateProcess as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberUpdateProcess_NotLikeSearch(String memberUpdateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberUpdateProcess), xgetCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS", likeSearchOption);
    }

    protected void regMemberUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberUpdateProcess(), "MEMBER_UPDATE_PROCESS"); }
    protected abstract ConditionValue xgetCValueMemberUpdateProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNoList The collection of versionNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNoList The collection of versionNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RoyMemberCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, RoyMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RoyMemberCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, RoyMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RoyMemberCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, RoyMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RoyMemberCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, RoyMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RoyMemberCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, RoyMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RoyMemberCB&gt;() {
     *     public void query(RoyMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RoyMemberCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, RoyMemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyMemberCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(RoyMemberCQ sq);

    protected RoyMemberCB xcreateScalarConditionCB() {
        RoyMemberCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected RoyMemberCB xcreateScalarConditionPartitionByCB() {
        RoyMemberCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<RoyMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyMemberCB cb = new RoyMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(RoyMemberCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RoyMemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(RoyMemberCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyMemberCB cb = new RoyMemberCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(RoyMemberCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<RoyMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyMemberCB cb = new RoyMemberCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(RoyMemberCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected RoyMemberCB newMyCB() {
        return new RoyMemberCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return RoyMemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
