package org.docksidestage.sqlite.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.sqlite.dbflute.allcommon.MaCDef;
import org.docksidestage.sqlite.dbflute.exentity.customize.*;

/**
 * The entity of OptionMember.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsOptionMember extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: {null(2147483647), refers to MEMBER.MEMBER_ID} */
    protected String _memberId;

    /** MEMBER_NAME: {null(2147483647), refers to MEMBER.MEMBER_NAME} */
    protected String _memberName;

    /** BIRTHDATE: {null(2147483647), refers to MEMBER.BIRTHDATE} */
    protected String _birthdate;

    /** FORMALIZED_DATETIME: {null(2147483647), refers to MEMBER.FORMALIZED_DATETIME} */
    protected java.time.LocalDateTime _formalizedDatetime;

    /** MEMBER_STATUS_CODE: {null(2147483647), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** MEMBER_STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    protected String _memberStatusName;

    /** STATUS_DISPLAY_ORDER: {null(2147483647), refers to MEMBER_STATUS} */
    protected String _statusDisplayOrder;

    /** DUMMY_FLG: {null(2147483647), classification=Flg} */
    protected String _dummyFlg;

    /** DUMMY_NOFLG: {null(2147483647)} */
    protected String _dummyNoflg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.sqlite.dbflute.bsentity.customize.dbmeta.OptionMemberDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "OptionMember";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br>
     * MEMBER_STATUS_CODE: {null(2147483647), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public MaCDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return MaCDef.MemberStatus.of(getMemberStatusCode()).orElse(null);
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br>
     * MEMBER_STATUS_CODE: {null(2147483647), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(MaCDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of dummyFlg as the classification of Flg. <br>
     * DUMMY_FLG: {null(2147483647), classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public MaCDef.Flg getDummyFlgAsFlg() {
        return MaCDef.Flg.of(getDummyFlg()).orElse(null);
    }

    /**
     * Set the value of dummyFlg as the classification of Flg. <br>
     * DUMMY_FLG: {null(2147483647), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDummyFlgAsFlg(MaCDef.Flg cdef) {
        setDummyFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as ProvisionalMember (PRV). <br>
     * Provisional Member
     */
    public void setMemberStatusCode_ProvisionalMember() {
        setMemberStatusCodeAsMemberStatus(MaCDef.MemberStatus.ProvisionalMember);
    }

    /**
     * Set the value of memberStatusCode as FormalizedMember (FML). <br>
     * Formalized Member
     */
    public void setMemberStatusCode_FormalizedMember() {
        setMemberStatusCodeAsMemberStatus(MaCDef.MemberStatus.FormalizedMember);
    }

    /**
     * Set the value of memberStatusCode as WithdrawalMember (WDL). <br>
     * Withdrawal Member
     */
    public void setMemberStatusCode_WithdrawalMember() {
        setMemberStatusCodeAsMemberStatus(MaCDef.MemberStatus.WithdrawalMember);
    }

    /**
     * Set the value of dummyFlg as True (1). <br>
     * Yes: means valid
     */
    public void setDummyFlg_True() {
        setDummyFlgAsFlg(MaCDef.Flg.True);
    }

    /**
     * Set the value of dummyFlg as False (0). <br>
     * No: means invalid
     */
    public void setDummyFlg_False() {
        setDummyFlgAsFlg(MaCDef.Flg.False);
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
        MaCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(MaCDef.MemberStatus.ProvisionalMember) : false;
    }

    /**
     * Is the value of memberStatusCode FormalizedMember? <br>
     * Formalized Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalizedMember() {
        MaCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(MaCDef.MemberStatus.FormalizedMember) : false;
    }

    /**
     * Is the value of memberStatusCode WithdrawalMember? <br>
     * Withdrawal Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawalMember() {
        MaCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(MaCDef.MemberStatus.WithdrawalMember) : false;
    }

    /**
     * Is the value of dummyFlg True? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDummyFlgTrue() {
        MaCDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.equals(MaCDef.Flg.True) : false;
    }

    /**
     * Is the value of dummyFlg False? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDummyFlgFalse() {
        MaCDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.equals(MaCDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'dummyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDummyFlgName() {
        MaCDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'dummyFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getDummyFlgAlias() {
        MaCDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsOptionMember) {
            BsOptionMember other = (BsOptionMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_birthdate, other._birthdate)) { return false; }
            if (!xSV(_formalizedDatetime, other._formalizedDatetime)) { return false; }
            if (!xSV(_memberStatusCode, other._memberStatusCode)) { return false; }
            if (!xSV(_memberStatusName, other._memberStatusName)) { return false; }
            if (!xSV(_statusDisplayOrder, other._statusDisplayOrder)) { return false; }
            if (!xSV(_dummyFlg, other._dummyFlg)) { return false; }
            if (!xSV(_dummyNoflg, other._dummyNoflg)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        hs = xCH(hs, _memberName);
        hs = xCH(hs, _birthdate);
        hs = xCH(hs, _formalizedDatetime);
        hs = xCH(hs, _memberStatusCode);
        hs = xCH(hs, _memberStatusName);
        hs = xCH(hs, _statusDisplayOrder);
        hs = xCH(hs, _dummyFlg);
        hs = xCH(hs, _dummyNoflg);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_birthdate));
        sb.append(dm).append(xfND(_formalizedDatetime));
        sb.append(dm).append(xfND(_memberStatusCode));
        sb.append(dm).append(xfND(_memberStatusName));
        sb.append(dm).append(xfND(_statusDisplayOrder));
        sb.append(dm).append(xfND(_dummyFlg));
        sb.append(dm).append(xfND(_dummyNoflg));
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
    public OptionMember clone() {
        return (OptionMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {null(2147483647), refers to MEMBER.MEMBER_ID} <br>
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {null(2147483647), refers to MEMBER.MEMBER_ID} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(String memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {null(2147483647), refers to MEMBER.MEMBER_NAME} <br>
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {null(2147483647), refers to MEMBER.MEMBER_NAME} <br>
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] BIRTHDATE: {null(2147483647), refers to MEMBER.BIRTHDATE} <br>
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBirthdate() {
        checkSpecifiedProperty("birthdate");
        return _birthdate;
    }

    /**
     * [set] BIRTHDATE: {null(2147483647), refers to MEMBER.BIRTHDATE} <br>
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(String birthdate) {
        registerModifiedProperty("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] FORMALIZED_DATETIME: {null(2147483647), refers to MEMBER.FORMALIZED_DATETIME} <br>
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getFormalizedDatetime() {
        checkSpecifiedProperty("formalizedDatetime");
        return _formalizedDatetime;
    }

    /**
     * [set] FORMALIZED_DATETIME: {null(2147483647), refers to MEMBER.FORMALIZED_DATETIME} <br>
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.time.LocalDateTime formalizedDatetime) {
        registerModifiedProperty("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] MEMBER_STATUS_CODE: {null(2147483647), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] MEMBER_STATUS_CODE: {null(2147483647), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusName() {
        checkSpecifiedProperty("memberStatusName");
        return _memberStatusName;
    }

    /**
     * [set] MEMBER_STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        registerModifiedProperty("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] STATUS_DISPLAY_ORDER: {null(2147483647), refers to MEMBER_STATUS} <br>
     * @return The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatusDisplayOrder() {
        checkSpecifiedProperty("statusDisplayOrder");
        return _statusDisplayOrder;
    }

    /**
     * [set] STATUS_DISPLAY_ORDER: {null(2147483647), refers to MEMBER_STATUS} <br>
     * @param statusDisplayOrder The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatusDisplayOrder(String statusDisplayOrder) {
        registerModifiedProperty("statusDisplayOrder");
        _statusDisplayOrder = statusDisplayOrder;
    }

    /**
     * [get] DUMMY_FLG: {null(2147483647), classification=Flg} <br>
     * @return The value of the column 'DUMMY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDummyFlg() {
        checkSpecifiedProperty("dummyFlg");
        return _dummyFlg;
    }

    /**
     * [set] DUMMY_FLG: {null(2147483647), classification=Flg} <br>
     * @param dummyFlg The value of the column 'DUMMY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setDummyFlg(String dummyFlg) {
        checkClassificationCode("DUMMY_FLG", MaCDef.DefMeta.Flg, dummyFlg);
        registerModifiedProperty("dummyFlg");
        _dummyFlg = dummyFlg;
    }

    /**
     * [get] DUMMY_NOFLG: {null(2147483647)} <br>
     * @return The value of the column 'DUMMY_NOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDummyNoflg() {
        checkSpecifiedProperty("dummyNoflg");
        return _dummyNoflg;
    }

    /**
     * [set] DUMMY_NOFLG: {null(2147483647)} <br>
     * @param dummyNoflg The value of the column 'DUMMY_NOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDummyNoflg(String dummyNoflg) {
        registerModifiedProperty("dummyNoflg");
        _dummyNoflg = dummyNoflg;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param dummyFlg The value of the column 'DUMMY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void mynativeMappingDummyFlg(String dummyFlg) {
        setDummyFlg(dummyFlg);
    }
}
