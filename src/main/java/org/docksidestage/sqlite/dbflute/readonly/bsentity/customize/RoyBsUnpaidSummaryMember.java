package org.docksidestage.sqlite.dbflute.readonly.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.sqlite.dbflute.readonly.exentity.customize.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The entity of UnpaidSummaryMember.
 * @author DBFlute(AutoGenerator)
 */
public abstract class RoyBsUnpaidSummaryMember extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** UNPAID_MAN_ID: {PK, null(2147483647), refers to MEMBER} */
    protected Integer _unpaidManId;

    /** UNPAID_MAN_NAME: {null(2147483647), refers to MEMBER} */
    protected String _unpaidManName;

    /** UNPAID_PRICE_SUMMARY: {null(2147483647)} */
    protected String _unpaidPriceSummary;

    /** STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS} */
    protected String _statusName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.sqlite.dbflute.readonly.bsentity.customize.dbmeta.RoyUnpaidSummaryMemberDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "UnpaidSummaryMember";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_unpaidManId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected RoyMember __innerDomain;

    protected RoyMember innerDomain() {
        if (__innerDomain == null) {
            __innerDomain = new RoyMember();
        }
        return __innerDomain;
    }

    /**
     * Prepare the inner instance of domain entity (basically for LoadReferrer).
     * <pre>
     * List&lt;UnpaidSummaryMember&gt; memberList = memberBhv.outsideSql()...;
     * List&lt;Member&gt; domainList = new ArrayList&lt;Member&gt;();
     * for (UnpaidSummaryMember member : memberList) {
     *     domainList.add(member.<span style="color: #CC4747">prepareDomain()</span>);
     * }
     * memberBhv.<span style="color: #CC4747">loadPurchaseList</span>(domainList, new ConditionBeanSetupper...);
     * for (UnpaidSummaryMember member : memberList) {
     *     Purchase purchase = member.<span style="color: #CC4747">getPurchaseList()</span>; <span style="color: #3F7E5E">// you can get it</span>
     *     ...
     * }
     * </pre>
     * @return The domain entity for this customize entity. (NotNull)
     */
    public RoyMember prepareDomain() {
        innerDomain().setMemberId(getUnpaidManId());
        return innerDomain();
    }

    /**
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<RoyMemberAddress> getMemberAddressList() {
        return innerDomain().getMemberAddressList();
    }

    /**
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<RoyMemberLogin> getMemberLoginList() {
        return innerDomain().getMemberLoginList();
    }

    /**
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'.
     * @return The entity list of referrer property 'memberServiceList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<RoyMemberService> getMemberServiceList() {
        return innerDomain().getMemberServiceList();
    }

    /**
     * PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<RoyPurchase> getPurchaseList() {
        return innerDomain().getPurchaseList();
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof RoyBsUnpaidSummaryMember) {
            RoyBsUnpaidSummaryMember other = (RoyBsUnpaidSummaryMember)obj;
            if (!xSV(_unpaidManId, other._unpaidManId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _unpaidManId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_unpaidManId));
        sb.append(dm).append(xfND(_unpaidManName));
        sb.append(dm).append(xfND(_unpaidPriceSummary));
        sb.append(dm).append(xfND(_statusName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public RoyUnpaidSummaryMember clone() {
        return (RoyUnpaidSummaryMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UNPAID_MAN_ID: {PK, null(2147483647), refers to MEMBER} <br>
     * @return The value of the column 'UNPAID_MAN_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUnpaidManId() {
        checkSpecifiedProperty("unpaidManId");
        return _unpaidManId;
    }

    /**
     * [set] UNPAID_MAN_ID: {PK, null(2147483647), refers to MEMBER} <br>
     * @param unpaidManId The value of the column 'UNPAID_MAN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidManId(Integer unpaidManId) {
        registerModifiedProperty("unpaidManId");
        _unpaidManId = unpaidManId;
    }

    /**
     * [get] UNPAID_MAN_NAME: {null(2147483647), refers to MEMBER} <br>
     * @return The value of the column 'UNPAID_MAN_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnpaidManName() {
        checkSpecifiedProperty("unpaidManName");
        return _unpaidManName;
    }

    /**
     * [set] UNPAID_MAN_NAME: {null(2147483647), refers to MEMBER} <br>
     * @param unpaidManName The value of the column 'UNPAID_MAN_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidManName(String unpaidManName) {
        registerModifiedProperty("unpaidManName");
        _unpaidManName = unpaidManName;
    }

    /**
     * [get] UNPAID_PRICE_SUMMARY: {null(2147483647)} <br>
     * @return The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnpaidPriceSummary() {
        checkSpecifiedProperty("unpaidPriceSummary");
        return _unpaidPriceSummary;
    }

    /**
     * [set] UNPAID_PRICE_SUMMARY: {null(2147483647)} <br>
     * @param unpaidPriceSummary The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidPriceSummary(String unpaidPriceSummary) {
        registerModifiedProperty("unpaidPriceSummary");
        _unpaidPriceSummary = unpaidPriceSummary;
    }

    /**
     * [get] STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS} <br>
     * @return The value of the column 'STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatusName() {
        checkSpecifiedProperty("statusName");
        return _statusName;
    }

    /**
     * [set] STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS} <br>
     * @param statusName The value of the column 'STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatusName(String statusName) {
        registerModifiedProperty("statusName");
        _statusName = statusName;
    }
}
