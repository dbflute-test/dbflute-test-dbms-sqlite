package org.docksidestage.sqlite.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.sqlite.dbflute.allcommon.MaDBMetaInstanceHandler;
import org.docksidestage.sqlite.dbflute.allcommon.MaCDef;
import org.docksidestage.sqlite.dbflute.exentity.*;

/**
 * The entity of MEMBER_LOGIN as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberLogin extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_LOGIN_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} */
    protected Integer _memberLoginId;

    /** MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} */
    protected Integer _memberId;

    /** LOGIN_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.time.LocalDateTime _loginDatetime;

    /** MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} */
    protected Integer _mobileLoginFlg;

    /** LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} */
    protected String _loginMemberStatusCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return MaDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "MEMBER_LOGIN";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberLoginId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of mobileLoginFlg as the classification of Flg. <br>
     * MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public MaCDef.Flg getMobileLoginFlgAsFlg() {
        return MaCDef.Flg.of(getMobileLoginFlg()).orElse(null);
    }

    /**
     * Set the value of mobileLoginFlg as the classification of Flg. <br>
     * MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMobileLoginFlgAsFlg(MaCDef.Flg cdef) {
        setMobileLoginFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    /**
     * Get the value of loginMemberStatusCode as the classification of MemberStatus. <br>
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public MaCDef.MemberStatus getLoginMemberStatusCodeAsMemberStatus() {
        return MaCDef.MemberStatus.of(getLoginMemberStatusCode()).orElse(null);
    }

    /**
     * Set the value of loginMemberStatusCode as the classification of MemberStatus. <br>
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLoginMemberStatusCodeAsMemberStatus(MaCDef.MemberStatus cdef) {
        setLoginMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of mobileLoginFlg as True (1). <br>
     * Yes: means valid
     */
    public void setMobileLoginFlg_True() {
        setMobileLoginFlgAsFlg(MaCDef.Flg.True);
    }

    /**
     * Set the value of mobileLoginFlg as False (0). <br>
     * No: means invalid
     */
    public void setMobileLoginFlg_False() {
        setMobileLoginFlgAsFlg(MaCDef.Flg.False);
    }

    /**
     * Set the value of loginMemberStatusCode as ProvisionalMember (PRV). <br>
     * Provisional Member
     */
    public void setLoginMemberStatusCode_ProvisionalMember() {
        setLoginMemberStatusCodeAsMemberStatus(MaCDef.MemberStatus.ProvisionalMember);
    }

    /**
     * Set the value of loginMemberStatusCode as FormalizedMember (FML). <br>
     * Formalized Member
     */
    public void setLoginMemberStatusCode_FormalizedMember() {
        setLoginMemberStatusCodeAsMemberStatus(MaCDef.MemberStatus.FormalizedMember);
    }

    /**
     * Set the value of loginMemberStatusCode as WithdrawalMember (WDL). <br>
     * Withdrawal Member
     */
    public void setLoginMemberStatusCode_WithdrawalMember() {
        setLoginMemberStatusCodeAsMemberStatus(MaCDef.MemberStatus.WithdrawalMember);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of mobileLoginFlg True? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgTrue() {
        MaCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(MaCDef.Flg.True) : false;
    }

    /**
     * Is the value of mobileLoginFlg False? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgFalse() {
        MaCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(MaCDef.Flg.False) : false;
    }

    /**
     * Is the value of loginMemberStatusCode ProvisionalMember? <br>
     * Provisional Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeProvisionalMember() {
        MaCDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(MaCDef.MemberStatus.ProvisionalMember) : false;
    }

    /**
     * Is the value of loginMemberStatusCode FormalizedMember? <br>
     * Formalized Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeFormalizedMember() {
        MaCDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(MaCDef.MemberStatus.FormalizedMember) : false;
    }

    /**
     * Is the value of loginMemberStatusCode WithdrawalMember? <br>
     * Withdrawal Member
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeWithdrawalMember() {
        MaCDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(MaCDef.MemberStatus.WithdrawalMember) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'mobileLoginFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMobileLoginFlgName() {
        MaCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'mobileLoginFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getMobileLoginFlgAlias() {
        MaCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected OptionalEntity<MemberStatus> _memberStatus;

    /**
     * [get] MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberStatus> getMemberStatus() {
        if (_memberStatus == null) { _memberStatus = OptionalEntity.relationEmpty(this, "memberStatus"); }
        return _memberStatus;
    }

    /**
     * [set] MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(OptionalEntity<MemberStatus> memberStatus) {
        _memberStatus = memberStatus;
    }

    /** MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

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
        if (obj instanceof BsMemberLogin) {
            BsMemberLogin other = (BsMemberLogin)obj;
            if (!xSV(_memberLoginId, other._memberLoginId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberLoginId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberStatus != null && _memberStatus.isPresent())
        { sb.append(li).append(xbRDS(_memberStatus, "memberStatus")); }
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberLoginId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_loginDatetime));
        sb.append(dm).append(xfND(_mobileLoginFlg));
        sb.append(dm).append(xfND(_loginMemberStatusCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberStatus != null && _memberStatus.isPresent())
        { sb.append(dm).append("memberStatus"); }
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberLogin clone() {
        return (MemberLogin)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_LOGIN_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_LOGIN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberLoginId() {
        checkSpecifiedProperty("memberLoginId");
        return _memberLoginId;
    }

    /**
     * [set] MEMBER_LOGIN_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} <br>
     * @param memberLoginId The value of the column 'MEMBER_LOGIN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberLoginId(Integer memberLoginId) {
        registerModifiedProperty("memberLoginId");
        _memberLoginId = memberLoginId;
    }

    /**
     * [get] MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] LOGIN_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @return The value of the column 'LOGIN_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getLoginDatetime() {
        checkSpecifiedProperty("loginDatetime");
        return _loginDatetime;
    }

    /**
     * [set] LOGIN_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @param loginDatetime The value of the column 'LOGIN_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setLoginDatetime(java.time.LocalDateTime loginDatetime) {
        registerModifiedProperty("loginDatetime");
        _loginDatetime = loginDatetime;
    }

    /**
     * [get] MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * @return The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMobileLoginFlg() {
        checkSpecifiedProperty("mobileLoginFlg");
        return _mobileLoginFlg;
    }

    /**
     * [set] MOBILE_LOGIN_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * @param mobileLoginFlg The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setMobileLoginFlg(Integer mobileLoginFlg) {
        checkClassificationCode("MOBILE_LOGIN_FLG", MaCDef.DefMeta.Flg, mobileLoginFlg);
        registerModifiedProperty("mobileLoginFlg");
        _mobileLoginFlg = mobileLoginFlg;
    }

    /**
     * [get] LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @return The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLoginMemberStatusCode() {
        checkSpecifiedProperty("loginMemberStatusCode");
        return _loginMemberStatusCode;
    }

    /**
     * [set] LOGIN_MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param loginMemberStatusCode The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setLoginMemberStatusCode(String loginMemberStatusCode) {
        registerModifiedProperty("loginMemberStatusCode");
        _loginMemberStatusCode = loginMemberStatusCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param mobileLoginFlg The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingMobileLoginFlg(Integer mobileLoginFlg) {
        setMobileLoginFlg(mobileLoginFlg);
    }
}
