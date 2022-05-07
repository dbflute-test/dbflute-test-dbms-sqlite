package org.docksidestage.sqlite.dbflute.readonly.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyDBMetaInstanceHandler;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyCDef;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The entity of MEMBER_STATUS as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     MEMBER, MEMBER_LOGIN
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberList, memberLoginList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String memberStatusCode = entity.getMemberStatusCode();
 * String memberStatusName = entity.getMemberStatusName();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class RoyBsMemberStatus extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10), classification=MemberStatus} */
    protected String _memberStatusCode;

    /** MEMBER_STATUS_NAME: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberStatusName;

    /** DESCRIPTION: {NotNull, TEXT(2000000000, 10)} */
    protected String _description;

    /** DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _displayOrder;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return RoyDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "MEMBER_STATUS";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberStatusCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10), classification=MemberStatus} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public RoyCDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return RoyCDef.MemberStatus.of(getMemberStatusCode()).orElse(null);
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10), classification=MemberStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(RoyCDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as ProvisionalMember (PRV). <br>
     * Provisional Member
     */
    public void setMemberStatusCode_ProvisionalMember() {
        setMemberStatusCodeAsMemberStatus(RoyCDef.MemberStatus.ProvisionalMember);
    }

    /**
     * Set the value of memberStatusCode as FormalizedMember (FML). <br>
     * Formalized Member
     */
    public void setMemberStatusCode_FormalizedMember() {
        setMemberStatusCodeAsMemberStatus(RoyCDef.MemberStatus.FormalizedMember);
    }

    /**
     * Set the value of memberStatusCode as WithdrawalMember (WDL). <br>
     * Withdrawal Member
     */
    public void setMemberStatusCode_WithdrawalMember() {
        setMemberStatusCodeAsMemberStatus(RoyCDef.MemberStatus.WithdrawalMember);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode ProvisionalMember? <br>
     * Provisional Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisionalMember() {
        RoyCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(RoyCDef.MemberStatus.ProvisionalMember) : false;
    }

    /**
     * Is the value of memberStatusCode FormalizedMember? <br>
     * Formalized Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalizedMember() {
        RoyCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(RoyCDef.MemberStatus.FormalizedMember) : false;
    }

    /**
     * Is the value of memberStatusCode WithdrawalMember? <br>
     * Withdrawal Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawalMember() {
        RoyCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(RoyCDef.MemberStatus.WithdrawalMember) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MEMBER by MEMBER_STATUS_CODE, named 'memberList'. */
    protected List<RoyMember> _memberList;

    /**
     * [get] MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @return The entity list of referrer property 'memberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RoyMember> getMemberList() {
        if (_memberList == null) { _memberList = newReferrerList(); }
        return _memberList;
    }

    /**
     * [set] MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @param memberList The entity list of referrer property 'memberList'. (NullAllowed)
     */
    public void setMemberList(List<RoyMember> memberList) {
        _memberList = memberList;
    }

    /** MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'. */
    protected List<RoyMemberLogin> _memberLoginList;

    /**
     * [get] MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RoyMemberLogin> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = newReferrerList(); }
        return _memberLoginList;
    }

    /**
     * [set] MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    public void setMemberLoginList(List<RoyMemberLogin> memberLoginList) {
        _memberLoginList = memberLoginList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof RoyBsMemberStatus) {
            RoyBsMemberStatus other = (RoyBsMemberStatus)obj;
            if (!xSV(_memberStatusCode, other._memberStatusCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberStatusCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberList != null) { for (RoyMember et : _memberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberList")); } } }
        if (_memberLoginList != null) { for (RoyMemberLogin et : _memberLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberLoginList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberStatusCode));
        sb.append(dm).append(xfND(_memberStatusName));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_displayOrder));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberList != null && !_memberList.isEmpty())
        { sb.append(dm).append("memberList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty())
        { sb.append(dm).append("memberLoginList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public RoyMemberStatus clone() {
        return (RoyMemberStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10), classification=MemberStatus} <br>
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] MEMBER_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10), classification=MemberStatus} <br>
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusName() {
        checkSpecifiedProperty("memberStatusName");
        return _memberStatusName;
    }

    /**
     * [set] MEMBER_STATUS_NAME: {NotNull, TEXT(2000000000, 10)} <br>
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        registerModifiedProperty("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] DESCRIPTION: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] DESCRIPTION: {NotNull, TEXT(2000000000, 10)} <br>
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)} <br>
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)} <br>
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }
}
