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
 * The abstract condition-query of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class RoyAbstractBsPurchaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyAbstractBsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "PURCHASE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_Equal(Integer purchaseId) {
        doSetPurchaseId_Equal(purchaseId);
    }

    protected void doSetPurchaseId_Equal(Integer purchaseId) {
        regPurchaseId(CK_EQ, purchaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_GreaterThan(Integer purchaseId) {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_LessThan(Integer purchaseId) {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_GreaterEqual(Integer purchaseId) {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_LessEqual(Integer purchaseId) {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchaseId(), "PURCHASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseIdList The collection of purchaseId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_InScope(Collection<Integer> purchaseIdList) {
        doSetPurchaseId_InScope(purchaseIdList);
    }

    protected void doSetPurchaseId_InScope(Collection<Integer> purchaseIdList) {
        regINS(CK_INS, cTL(purchaseIdList), xgetCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseIdList The collection of purchaseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_NotInScope(Collection<Integer> purchaseIdList) {
        doSetPurchaseId_NotInScope(purchaseIdList);
    }

    protected void doSetPurchaseId_NotInScope(Collection<Integer> purchaseIdList) {
        regINS(CK_NINS, cTL(purchaseIdList), xgetCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     */
    public void setPurchaseId_IsNull() { regPurchaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     */
    public void setPurchaseId_IsNotNull() { regPurchaseId(CK_ISNN, DOBJ); }

    protected void regPurchaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseId(), "PURCHASE_ID"); }
    protected abstract ConditionValue xgetCValuePurchaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
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
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Integer productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Integer productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Integer productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Integer productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Integer productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Integer productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setProductId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_InScope(Collection<Integer> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Integer> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_NotInScope(Collection<Integer> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Integer> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_Equal(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_EQ,  purchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_GreaterThan(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_GT,  purchaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_LessThan(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_LT,  purchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_GreaterEqual(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_GE,  purchaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseDatetime_LessEqual(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_LE, purchaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setPurchaseDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPurchaseDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPurchaseDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setPurchaseDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPurchaseDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "PURCHASE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePurchaseDatetime(), nm, op);
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetimeList The collection of purchaseDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseDatetime_InScope(Collection<java.time.LocalDateTime> purchaseDatetimeList) {
        doSetPurchaseDatetime_InScope(purchaseDatetimeList);
    }

    protected void doSetPurchaseDatetime_InScope(Collection<java.time.LocalDateTime> purchaseDatetimeList) {
        regINS(CK_INS, cTL(purchaseDatetimeList), xgetCValuePurchaseDatetime(), "PURCHASE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetimeList The collection of purchaseDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseDatetime_NotInScope(Collection<java.time.LocalDateTime> purchaseDatetimeList) {
        doSetPurchaseDatetime_NotInScope(purchaseDatetimeList);
    }

    protected void doSetPurchaseDatetime_NotInScope(Collection<java.time.LocalDateTime> purchaseDatetimeList) {
        regINS(CK_NINS, cTL(purchaseDatetimeList), xgetCValuePurchaseDatetime(), "PURCHASE_DATETIME");
    }

    protected void regPurchaseDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseDatetime(), "PURCHASE_DATETIME"); }
    protected abstract ConditionValue xgetCValuePurchaseDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCount The value of purchaseCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_Equal(Integer purchaseCount) {
        doSetPurchaseCount_Equal(purchaseCount);
    }

    protected void doSetPurchaseCount_Equal(Integer purchaseCount) {
        regPurchaseCount(CK_EQ, purchaseCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCount The value of purchaseCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_GreaterThan(Integer purchaseCount) {
        regPurchaseCount(CK_GT, purchaseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCount The value of purchaseCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_LessThan(Integer purchaseCount) {
        regPurchaseCount(CK_LT, purchaseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCount The value of purchaseCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_GreaterEqual(Integer purchaseCount) {
        regPurchaseCount(CK_GE, purchaseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCount The value of purchaseCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseCount_LessEqual(Integer purchaseCount) {
        regPurchaseCount(CK_LE, purchaseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of purchaseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseCount. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchaseCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchaseCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of purchaseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchaseCount(), "PURCHASE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCountList The collection of purchaseCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_InScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        regINS(CK_INS, cTL(purchaseCountList), xgetCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCountList The collection of purchaseCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_NotInScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        regINS(CK_NINS, cTL(purchaseCountList), xgetCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    protected void regPurchaseCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseCount(), "PURCHASE_COUNT"); }
    protected abstract ConditionValue xgetCValuePurchaseCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePrice The value of purchasePrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_Equal(Integer purchasePrice) {
        doSetPurchasePrice_Equal(purchasePrice);
    }

    protected void doSetPurchasePrice_Equal(Integer purchasePrice) {
        regPurchasePrice(CK_EQ, purchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePrice The value of purchasePrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_GreaterThan(Integer purchasePrice) {
        regPurchasePrice(CK_GT, purchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePrice The value of purchasePrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_LessThan(Integer purchasePrice) {
        regPurchasePrice(CK_LT, purchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePrice The value of purchasePrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_GreaterEqual(Integer purchasePrice) {
        regPurchasePrice(CK_GE, purchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePrice The value of purchasePrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePrice_LessEqual(Integer purchasePrice) {
        regPurchasePrice(CK_LE, purchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of purchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePrice. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchasePrice_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of purchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchasePrice(), "PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePriceList The collection of purchasePrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_InScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        regINS(CK_INS, cTL(purchasePriceList), xgetCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePriceList The collection of purchasePrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_NotInScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        regINS(CK_NINS, cTL(purchasePriceList), xgetCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    protected void regPurchasePrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchasePrice(), "PURCHASE_PRICE"); }
    protected abstract ConditionValue xgetCValuePurchasePrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    protected void setPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        doSetPaymentCompleteFlg_Equal(paymentCompleteFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentCompleteFlg_Equal_AsFlg(RoyCDef.Flg cdef) {
        doSetPaymentCompleteFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br>
     * Yes: means valid
     */
    public void setPaymentCompleteFlg_Equal_True() {
        setPaymentCompleteFlg_Equal_AsFlg(RoyCDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br>
     * No: means invalid
     */
    public void setPaymentCompleteFlg_Equal_False() {
        setPaymentCompleteFlg_Equal_AsFlg(RoyCDef.Flg.False);
    }

    protected void doSetPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_EQ, paymentCompleteFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_InScope(paymentCompleteFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_InScope_AsFlg(Collection<RoyCDef.Flg> cdefList) {
        doSetPaymentCompleteFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_INS, cTL(paymentCompleteFlgList), xgetCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_NotInScope(paymentCompleteFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_NotInScope_AsFlg(Collection<RoyCDef.Flg> cdefList) {
        doSetPaymentCompleteFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_NINS, cTL(paymentCompleteFlgList), xgetCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    protected void regPaymentCompleteFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG"); }
    protected abstract ConditionValue xgetCValuePaymentCompleteFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseRegisterDatetime_Equal(java.time.LocalDateTime purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_EQ,  purchaseRegisterDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseRegisterDatetime_GreaterThan(java.time.LocalDateTime purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_GT,  purchaseRegisterDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseRegisterDatetime_LessThan(java.time.LocalDateTime purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_LT,  purchaseRegisterDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseRegisterDatetime_GreaterEqual(java.time.LocalDateTime purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_GE,  purchaseRegisterDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseRegisterDatetime_LessEqual(java.time.LocalDateTime purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_LE, purchaseRegisterDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setPurchaseRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseRegisterDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseRegisterDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPurchaseRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPurchaseRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setPurchaseRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseRegisterDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseRegisterDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPurchaseRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "PURCHASE_REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePurchaseRegisterDatetime(), nm, op);
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetimeList The collection of purchaseRegisterDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterDatetime_InScope(Collection<java.time.LocalDateTime> purchaseRegisterDatetimeList) {
        doSetPurchaseRegisterDatetime_InScope(purchaseRegisterDatetimeList);
    }

    protected void doSetPurchaseRegisterDatetime_InScope(Collection<java.time.LocalDateTime> purchaseRegisterDatetimeList) {
        regINS(CK_INS, cTL(purchaseRegisterDatetimeList), xgetCValuePurchaseRegisterDatetime(), "PURCHASE_REGISTER_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetimeList The collection of purchaseRegisterDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterDatetime_NotInScope(Collection<java.time.LocalDateTime> purchaseRegisterDatetimeList) {
        doSetPurchaseRegisterDatetime_NotInScope(purchaseRegisterDatetimeList);
    }

    protected void doSetPurchaseRegisterDatetime_NotInScope(Collection<java.time.LocalDateTime> purchaseRegisterDatetimeList) {
        regINS(CK_NINS, cTL(purchaseRegisterDatetimeList), xgetCValuePurchaseRegisterDatetime(), "PURCHASE_REGISTER_DATETIME");
    }

    protected void regPurchaseRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseRegisterDatetime(), "PURCHASE_REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValuePurchaseRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUser The value of purchaseRegisterUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterUser_Equal(String purchaseRegisterUser) {
        doSetPurchaseRegisterUser_Equal(fRES(purchaseRegisterUser));
    }

    protected void doSetPurchaseRegisterUser_Equal(String purchaseRegisterUser) {
        regPurchaseRegisterUser(CK_EQ, purchaseRegisterUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUser The value of purchaseRegisterUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterUser_NotEqual(String purchaseRegisterUser) {
        doSetPurchaseRegisterUser_NotEqual(fRES(purchaseRegisterUser));
    }

    protected void doSetPurchaseRegisterUser_NotEqual(String purchaseRegisterUser) {
        regPurchaseRegisterUser(CK_NES, purchaseRegisterUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUserList The collection of purchaseRegisterUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterUser_InScope(Collection<String> purchaseRegisterUserList) {
        doSetPurchaseRegisterUser_InScope(purchaseRegisterUserList);
    }

    protected void doSetPurchaseRegisterUser_InScope(Collection<String> purchaseRegisterUserList) {
        regINS(CK_INS, cTL(purchaseRegisterUserList), xgetCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUserList The collection of purchaseRegisterUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterUser_NotInScope(Collection<String> purchaseRegisterUserList) {
        doSetPurchaseRegisterUser_NotInScope(purchaseRegisterUserList);
    }

    protected void doSetPurchaseRegisterUser_NotInScope(Collection<String> purchaseRegisterUserList) {
        regINS(CK_NINS, cTL(purchaseRegisterUserList), xgetCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setPurchaseRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param purchaseRegisterUser The value of purchaseRegisterUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseRegisterUser_LikeSearch(String purchaseRegisterUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseRegisterUser_LikeSearch(purchaseRegisterUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setPurchaseRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseRegisterUser The value of purchaseRegisterUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseRegisterUser_LikeSearch(String purchaseRegisterUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseRegisterUser), xgetCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUser The value of purchaseRegisterUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseRegisterUser_NotLikeSearch(String purchaseRegisterUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseRegisterUser_NotLikeSearch(purchaseRegisterUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUser The value of purchaseRegisterUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseRegisterUser_NotLikeSearch(String purchaseRegisterUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseRegisterUser), xgetCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER", likeSearchOption);
    }

    protected void regPurchaseRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER"); }
    protected abstract ConditionValue xgetCValuePurchaseRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterProcess_Equal(String purchaseRegisterProcess) {
        doSetPurchaseRegisterProcess_Equal(fRES(purchaseRegisterProcess));
    }

    protected void doSetPurchaseRegisterProcess_Equal(String purchaseRegisterProcess) {
        regPurchaseRegisterProcess(CK_EQ, purchaseRegisterProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterProcess_NotEqual(String purchaseRegisterProcess) {
        doSetPurchaseRegisterProcess_NotEqual(fRES(purchaseRegisterProcess));
    }

    protected void doSetPurchaseRegisterProcess_NotEqual(String purchaseRegisterProcess) {
        regPurchaseRegisterProcess(CK_NES, purchaseRegisterProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcessList The collection of purchaseRegisterProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterProcess_InScope(Collection<String> purchaseRegisterProcessList) {
        doSetPurchaseRegisterProcess_InScope(purchaseRegisterProcessList);
    }

    protected void doSetPurchaseRegisterProcess_InScope(Collection<String> purchaseRegisterProcessList) {
        regINS(CK_INS, cTL(purchaseRegisterProcessList), xgetCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcessList The collection of purchaseRegisterProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterProcess_NotInScope(Collection<String> purchaseRegisterProcessList) {
        doSetPurchaseRegisterProcess_NotInScope(purchaseRegisterProcessList);
    }

    protected void doSetPurchaseRegisterProcess_NotInScope(Collection<String> purchaseRegisterProcessList) {
        regINS(CK_NINS, cTL(purchaseRegisterProcessList), xgetCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setPurchaseRegisterProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseRegisterProcess_LikeSearch(String purchaseRegisterProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseRegisterProcess_LikeSearch(purchaseRegisterProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setPurchaseRegisterProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseRegisterProcess_LikeSearch(String purchaseRegisterProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseRegisterProcess), xgetCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseRegisterProcess_NotLikeSearch(String purchaseRegisterProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseRegisterProcess_NotLikeSearch(purchaseRegisterProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseRegisterProcess_NotLikeSearch(String purchaseRegisterProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseRegisterProcess), xgetCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS", likeSearchOption);
    }

    protected void regPurchaseRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS"); }
    protected abstract ConditionValue xgetCValuePurchaseRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseUpdateDatetime_Equal(java.time.LocalDateTime purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_EQ,  purchaseUpdateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseUpdateDatetime_GreaterThan(java.time.LocalDateTime purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_GT,  purchaseUpdateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseUpdateDatetime_LessThan(java.time.LocalDateTime purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_LT,  purchaseUpdateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseUpdateDatetime_GreaterEqual(java.time.LocalDateTime purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_GE,  purchaseUpdateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseUpdateDatetime_LessEqual(java.time.LocalDateTime purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_LE, purchaseUpdateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setPurchaseUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseUpdateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseUpdateDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPurchaseUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPurchaseUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setPurchaseUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseUpdateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseUpdateDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPurchaseUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "PURCHASE_UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePurchaseUpdateDatetime(), nm, op);
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetimeList The collection of purchaseUpdateDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateDatetime_InScope(Collection<java.time.LocalDateTime> purchaseUpdateDatetimeList) {
        doSetPurchaseUpdateDatetime_InScope(purchaseUpdateDatetimeList);
    }

    protected void doSetPurchaseUpdateDatetime_InScope(Collection<java.time.LocalDateTime> purchaseUpdateDatetimeList) {
        regINS(CK_INS, cTL(purchaseUpdateDatetimeList), xgetCValuePurchaseUpdateDatetime(), "PURCHASE_UPDATE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetimeList The collection of purchaseUpdateDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateDatetime_NotInScope(Collection<java.time.LocalDateTime> purchaseUpdateDatetimeList) {
        doSetPurchaseUpdateDatetime_NotInScope(purchaseUpdateDatetimeList);
    }

    protected void doSetPurchaseUpdateDatetime_NotInScope(Collection<java.time.LocalDateTime> purchaseUpdateDatetimeList) {
        regINS(CK_NINS, cTL(purchaseUpdateDatetimeList), xgetCValuePurchaseUpdateDatetime(), "PURCHASE_UPDATE_DATETIME");
    }

    protected void regPurchaseUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseUpdateDatetime(), "PURCHASE_UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValuePurchaseUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUser The value of purchaseUpdateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateUser_Equal(String purchaseUpdateUser) {
        doSetPurchaseUpdateUser_Equal(fRES(purchaseUpdateUser));
    }

    protected void doSetPurchaseUpdateUser_Equal(String purchaseUpdateUser) {
        regPurchaseUpdateUser(CK_EQ, purchaseUpdateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUser The value of purchaseUpdateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateUser_NotEqual(String purchaseUpdateUser) {
        doSetPurchaseUpdateUser_NotEqual(fRES(purchaseUpdateUser));
    }

    protected void doSetPurchaseUpdateUser_NotEqual(String purchaseUpdateUser) {
        regPurchaseUpdateUser(CK_NES, purchaseUpdateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUserList The collection of purchaseUpdateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateUser_InScope(Collection<String> purchaseUpdateUserList) {
        doSetPurchaseUpdateUser_InScope(purchaseUpdateUserList);
    }

    protected void doSetPurchaseUpdateUser_InScope(Collection<String> purchaseUpdateUserList) {
        regINS(CK_INS, cTL(purchaseUpdateUserList), xgetCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUserList The collection of purchaseUpdateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateUser_NotInScope(Collection<String> purchaseUpdateUserList) {
        doSetPurchaseUpdateUser_NotInScope(purchaseUpdateUserList);
    }

    protected void doSetPurchaseUpdateUser_NotInScope(Collection<String> purchaseUpdateUserList) {
        regINS(CK_NINS, cTL(purchaseUpdateUserList), xgetCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setPurchaseUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param purchaseUpdateUser The value of purchaseUpdateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseUpdateUser_LikeSearch(String purchaseUpdateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseUpdateUser_LikeSearch(purchaseUpdateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setPurchaseUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseUpdateUser The value of purchaseUpdateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseUpdateUser_LikeSearch(String purchaseUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseUpdateUser), xgetCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUser The value of purchaseUpdateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseUpdateUser_NotLikeSearch(String purchaseUpdateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseUpdateUser_NotLikeSearch(purchaseUpdateUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUser The value of purchaseUpdateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseUpdateUser_NotLikeSearch(String purchaseUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseUpdateUser), xgetCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER", likeSearchOption);
    }

    protected void regPurchaseUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER"); }
    protected abstract ConditionValue xgetCValuePurchaseUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateProcess_Equal(String purchaseUpdateProcess) {
        doSetPurchaseUpdateProcess_Equal(fRES(purchaseUpdateProcess));
    }

    protected void doSetPurchaseUpdateProcess_Equal(String purchaseUpdateProcess) {
        regPurchaseUpdateProcess(CK_EQ, purchaseUpdateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateProcess_NotEqual(String purchaseUpdateProcess) {
        doSetPurchaseUpdateProcess_NotEqual(fRES(purchaseUpdateProcess));
    }

    protected void doSetPurchaseUpdateProcess_NotEqual(String purchaseUpdateProcess) {
        regPurchaseUpdateProcess(CK_NES, purchaseUpdateProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcessList The collection of purchaseUpdateProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateProcess_InScope(Collection<String> purchaseUpdateProcessList) {
        doSetPurchaseUpdateProcess_InScope(purchaseUpdateProcessList);
    }

    protected void doSetPurchaseUpdateProcess_InScope(Collection<String> purchaseUpdateProcessList) {
        regINS(CK_INS, cTL(purchaseUpdateProcessList), xgetCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcessList The collection of purchaseUpdateProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateProcess_NotInScope(Collection<String> purchaseUpdateProcessList) {
        doSetPurchaseUpdateProcess_NotInScope(purchaseUpdateProcessList);
    }

    protected void doSetPurchaseUpdateProcess_NotInScope(Collection<String> purchaseUpdateProcessList) {
        regINS(CK_NINS, cTL(purchaseUpdateProcessList), xgetCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setPurchaseUpdateProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseUpdateProcess_LikeSearch(String purchaseUpdateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseUpdateProcess_LikeSearch(purchaseUpdateProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * <pre>e.g. setPurchaseUpdateProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseUpdateProcess_LikeSearch(String purchaseUpdateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseUpdateProcess), xgetCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseUpdateProcess_NotLikeSearch(String purchaseUpdateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseUpdateProcess_NotLikeSearch(purchaseUpdateProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseUpdateProcess_NotLikeSearch(String purchaseUpdateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseUpdateProcess), xgetCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS", likeSearchOption);
    }

    protected void regPurchaseUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS"); }
    protected abstract ConditionValue xgetCValuePurchaseUpdateProcess();

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
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
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
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
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
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
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
    public HpSLCFunction<RoyPurchaseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, RoyPurchaseCB.class);
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
    public HpSLCFunction<RoyPurchaseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, RoyPurchaseCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RoyPurchaseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, RoyPurchaseCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RoyPurchaseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, RoyPurchaseCB.class);
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
    public HpSLCFunction<RoyPurchaseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, RoyPurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RoyPurchaseCB&gt;() {
     *     public void query(RoyPurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RoyPurchaseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, RoyPurchaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyPurchaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(RoyPurchaseCQ sq);

    protected RoyPurchaseCB xcreateScalarConditionCB() {
        RoyPurchaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected RoyPurchaseCB xcreateScalarConditionPartitionByCB() {
        RoyPurchaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<RoyPurchaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyPurchaseCB cb = new RoyPurchaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PURCHASE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(RoyPurchaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RoyPurchaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(RoyPurchaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RoyPurchaseCB cb = new RoyPurchaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PURCHASE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(RoyPurchaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<RoyPurchaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RoyPurchaseCB cb = new RoyPurchaseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(RoyPurchaseCQ sq);

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
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
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
    protected RoyPurchaseCB newMyCB() {
        return new RoyPurchaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return RoyPurchaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
