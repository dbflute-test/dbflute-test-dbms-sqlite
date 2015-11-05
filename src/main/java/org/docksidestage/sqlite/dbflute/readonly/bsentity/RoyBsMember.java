package org.docksidestage.sqlite.dbflute.readonly.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyDBMetaInstanceHandler;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyCDef;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The entity of MEMBER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, MEMBER_REGISTER_DATETIME, MEMBER_REGISTER_USER, MEMBER_REGISTER_PROCESS, MEMBER_UPDATE_DATETIME, MEMBER_UPDATE_USER, MEMBER_UPDATE_PROCESS, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_ADDRESS(AsValid), MEMBER_SECURITY(AsOne), MEMBER_WITHDRAWAL(AsOne)
 * 
 * [referrer table]
 *     MEMBER_ADDRESS, MEMBER_LOGIN, MEMBER_SERVICE, PURCHASE, MEMBER_SECURITY, MEMBER_WITHDRAWAL
 * 
 * [foreign property]
 *     memberStatus, memberAddressAsValid, memberSecurityAsOne, memberWithdrawalAsOne
 * 
 * [referrer property]
 *     memberAddressList, memberLoginList, memberServiceList, purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * String memberAccount = entity.getMemberAccount();
 * String memberStatusCode = entity.getMemberStatusCode();
 * java.time.LocalDateTime formalizedDatetime = entity.getFormalizedDatetime();
 * java.time.LocalDate birthdate = entity.getBirthdate();
 * java.time.LocalDateTime memberRegisterDatetime = entity.getMemberRegisterDatetime();
 * String memberRegisterUser = entity.getMemberRegisterUser();
 * String memberRegisterProcess = entity.getMemberRegisterProcess();
 * java.time.LocalDateTime memberUpdateDatetime = entity.getMemberUpdateDatetime();
 * String memberUpdateUser = entity.getMemberUpdateUser();
 * String memberUpdateProcess = entity.getMemberUpdateProcess();
 * Integer versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setMemberAccount(memberAccount);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setBirthdate(birthdate);
 * entity.setMemberRegisterDatetime(memberRegisterDatetime);
 * entity.setMemberRegisterUser(memberRegisterUser);
 * entity.setMemberRegisterProcess(memberRegisterProcess);
 * entity.setMemberUpdateDatetime(memberUpdateDatetime);
 * entity.setMemberUpdateUser(memberUpdateUser);
 * entity.setMemberUpdateProcess(memberUpdateProcess);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class RoyBsMember extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS} */
    protected Integer _memberId;

    /** MEMBER_NAME: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberName;

    /** MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)} */
    protected String _memberAccount;

    /** MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** FORMALIZED_DATETIME: {DATETIME(2000000000, 10)} */
    protected java.time.LocalDateTime _formalizedDatetime;

    /** BIRTHDATE: {DATE(2000000000, 10)} */
    protected java.time.LocalDate _birthdate;

    /** MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.time.LocalDateTime _memberRegisterDatetime;

    /** MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberRegisterUser;

    /** MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberRegisterProcess;

    /** MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.time.LocalDateTime _memberUpdateDatetime;

    /** MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberUpdateUser;

    /** MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _memberUpdateProcess;

    /** VERSION_NO: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return RoyDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberAccount : UQ, NotNull, TEXT(2000000000, 10). (NotNull)
     */
    public void uniqueBy(String memberAccount) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberAccount");
        setMemberAccount(memberAccount);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public RoyCDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return RoyCDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br>
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
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
    /** MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected OptionalEntity<RoyMemberStatus> _memberStatus;

    /**
     * [get] MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<RoyMemberStatus> getMemberStatus() {
        if (_memberStatus == null) { _memberStatus = OptionalEntity.relationEmpty(this, "memberStatus"); }
        return _memberStatus;
    }

    /**
     * [set] MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(OptionalEntity<RoyMemberStatus> memberStatus) {
        _memberStatus = memberStatus;
    }

    /** MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'. */
    protected OptionalEntity<RoyMemberAddress> _memberAddressAsValid;

    /**
     * [get] MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberAddressAsValid'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<RoyMemberAddress> getMemberAddressAsValid() {
        if (_memberAddressAsValid == null) { _memberAddressAsValid = OptionalEntity.relationEmpty(this, "memberAddressAsValid"); }
        return _memberAddressAsValid;
    }

    /**
     * [set] MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param memberAddressAsValid The entity of foreign property 'memberAddressAsValid'. (NullAllowed)
     */
    public void setMemberAddressAsValid(OptionalEntity<RoyMemberAddress> memberAddressAsValid) {
        _memberAddressAsValid = memberAddressAsValid;
    }

    /** MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'. */
    protected OptionalEntity<RoyMemberSecurity> _memberSecurityAsOne;

    /**
     * [get] MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<RoyMemberSecurity> getMemberSecurityAsOne() {
        if (_memberSecurityAsOne == null) { _memberSecurityAsOne = OptionalEntity.relationEmpty(this, "memberSecurityAsOne"); }
        return _memberSecurityAsOne;
    }

    /**
     * [set] MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param memberSecurityAsOne The entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed)
     */
    public void setMemberSecurityAsOne(OptionalEntity<RoyMemberSecurity> memberSecurityAsOne) {
        _memberSecurityAsOne = memberSecurityAsOne;
    }

    /** MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'. */
    protected OptionalEntity<RoyMemberWithdrawal> _memberWithdrawalAsOne;

    /**
     * [get] MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<RoyMemberWithdrawal> getMemberWithdrawalAsOne() {
        if (_memberWithdrawalAsOne == null) { _memberWithdrawalAsOne = OptionalEntity.relationEmpty(this, "memberWithdrawalAsOne"); }
        return _memberWithdrawalAsOne;
    }

    /**
     * [set] MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param memberWithdrawalAsOne The entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed)
     */
    public void setMemberWithdrawalAsOne(OptionalEntity<RoyMemberWithdrawal> memberWithdrawalAsOne) {
        _memberWithdrawalAsOne = memberWithdrawalAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'. */
    protected List<RoyMemberAddress> _memberAddressList;

    /**
     * [get] MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RoyMemberAddress> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = newReferrerList(); }
        return _memberAddressList;
    }

    /**
     * [set] MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @param memberAddressList The entity list of referrer property 'memberAddressList'. (NullAllowed)
     */
    public void setMemberAddressList(List<RoyMemberAddress> memberAddressList) {
        _memberAddressList = memberAddressList;
    }

    /** MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'. */
    protected List<RoyMemberLogin> _memberLoginList;

    /**
     * [get] MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RoyMemberLogin> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = newReferrerList(); }
        return _memberLoginList;
    }

    /**
     * [set] MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    public void setMemberLoginList(List<RoyMemberLogin> memberLoginList) {
        _memberLoginList = memberLoginList;
    }

    /** MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'. */
    protected List<RoyMemberService> _memberServiceList;

    /**
     * [get] MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'.
     * @return The entity list of referrer property 'memberServiceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RoyMemberService> getMemberServiceList() {
        if (_memberServiceList == null) { _memberServiceList = newReferrerList(); }
        return _memberServiceList;
    }

    /**
     * [set] MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'.
     * @param memberServiceList The entity list of referrer property 'memberServiceList'. (NullAllowed)
     */
    public void setMemberServiceList(List<RoyMemberService> memberServiceList) {
        _memberServiceList = memberServiceList;
    }

    /** PURCHASE by MEMBER_ID, named 'purchaseList'. */
    protected List<RoyPurchase> _purchaseList;

    /**
     * [get] PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RoyPurchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<RoyPurchase> purchaseList) {
        _purchaseList = purchaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof RoyBsMember) {
            RoyBsMember other = (RoyBsMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberStatus != null && _memberStatus.isPresent())
        { sb.append(li).append(xbRDS(_memberStatus, "memberStatus")); }
        if (_memberAddressAsValid != null && _memberAddressAsValid.isPresent())
        { sb.append(li).append(xbRDS(_memberAddressAsValid, "memberAddressAsValid")); }
        if (_memberSecurityAsOne != null && _memberSecurityAsOne.isPresent())
        { sb.append(li).append(xbRDS(_memberSecurityAsOne, "memberSecurityAsOne")); }
        if (_memberWithdrawalAsOne != null && _memberWithdrawalAsOne.isPresent())
        { sb.append(li).append(xbRDS(_memberWithdrawalAsOne, "memberWithdrawalAsOne")); }
        if (_memberAddressList != null) { for (RoyMemberAddress et : _memberAddressList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberAddressList")); } } }
        if (_memberLoginList != null) { for (RoyMemberLogin et : _memberLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberLoginList")); } } }
        if (_memberServiceList != null) { for (RoyMemberService et : _memberServiceList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberServiceList")); } } }
        if (_purchaseList != null) { for (RoyPurchase et : _purchaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_memberAccount));
        sb.append(dm).append(xfND(_memberStatusCode));
        sb.append(dm).append(xfND(_formalizedDatetime));
        sb.append(dm).append(xfND(_birthdate));
        sb.append(dm).append(xfND(_memberRegisterDatetime));
        sb.append(dm).append(xfND(_memberRegisterUser));
        sb.append(dm).append(xfND(_memberRegisterProcess));
        sb.append(dm).append(xfND(_memberUpdateDatetime));
        sb.append(dm).append(xfND(_memberUpdateUser));
        sb.append(dm).append(xfND(_memberUpdateProcess));
        sb.append(dm).append(xfND(_versionNo));
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
        if (_memberAddressAsValid != null && _memberAddressAsValid.isPresent())
        { sb.append(dm).append("memberAddressAsValid"); }
        if (_memberSecurityAsOne != null && _memberSecurityAsOne.isPresent())
        { sb.append(dm).append("memberSecurityAsOne"); }
        if (_memberWithdrawalAsOne != null && _memberWithdrawalAsOne.isPresent())
        { sb.append(dm).append("memberWithdrawalAsOne"); }
        if (_memberAddressList != null && !_memberAddressList.isEmpty())
        { sb.append(dm).append("memberAddressList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty())
        { sb.append(dm).append("memberLoginList"); }
        if (_memberServiceList != null && !_memberServiceList.isEmpty())
        { sb.append(dm).append("memberServiceList"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(dm).append("purchaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public RoyMember clone() {
        return (RoyMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {NotNull, TEXT(2000000000, 10)} <br>
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberAccount() {
        checkSpecifiedProperty("memberAccount");
        return _memberAccount;
    }

    /**
     * [set] MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)} <br>
     * @param memberAccount The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAccount(String memberAccount) {
        registerModifiedProperty("memberAccount");
        _memberAccount = memberAccount;
    }

    /**
     * [get] MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] FORMALIZED_DATETIME: {DATETIME(2000000000, 10)} <br>
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getFormalizedDatetime() {
        checkSpecifiedProperty("formalizedDatetime");
        return _formalizedDatetime;
    }

    /**
     * [set] FORMALIZED_DATETIME: {DATETIME(2000000000, 10)} <br>
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.time.LocalDateTime formalizedDatetime) {
        registerModifiedProperty("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] BIRTHDATE: {DATE(2000000000, 10)} <br>
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getBirthdate() {
        checkSpecifiedProperty("birthdate");
        return _birthdate;
    }

    /**
     * [set] BIRTHDATE: {DATE(2000000000, 10)} <br>
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.time.LocalDate birthdate) {
        registerModifiedProperty("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getMemberRegisterDatetime() {
        checkSpecifiedProperty("memberRegisterDatetime");
        return _memberRegisterDatetime;
    }

    /**
     * [set] MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @param memberRegisterDatetime The value of the column 'MEMBER_REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberRegisterDatetime(java.time.LocalDateTime memberRegisterDatetime) {
        registerModifiedProperty("memberRegisterDatetime");
        _memberRegisterDatetime = memberRegisterDatetime;
    }

    /**
     * [get] MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberRegisterUser() {
        checkSpecifiedProperty("memberRegisterUser");
        return _memberRegisterUser;
    }

    /**
     * [set] MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * @param memberRegisterUser The value of the column 'MEMBER_REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setMemberRegisterUser(String memberRegisterUser) {
        registerModifiedProperty("memberRegisterUser");
        _memberRegisterUser = memberRegisterUser;
    }

    /**
     * [get] MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_REGISTER_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberRegisterProcess() {
        checkSpecifiedProperty("memberRegisterProcess");
        return _memberRegisterProcess;
    }

    /**
     * [set] MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * @param memberRegisterProcess The value of the column 'MEMBER_REGISTER_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setMemberRegisterProcess(String memberRegisterProcess) {
        registerModifiedProperty("memberRegisterProcess");
        _memberRegisterProcess = memberRegisterProcess;
    }

    /**
     * [get] MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getMemberUpdateDatetime() {
        checkSpecifiedProperty("memberUpdateDatetime");
        return _memberUpdateDatetime;
    }

    /**
     * [set] MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @param memberUpdateDatetime The value of the column 'MEMBER_UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberUpdateDatetime(java.time.LocalDateTime memberUpdateDatetime) {
        registerModifiedProperty("memberUpdateDatetime");
        _memberUpdateDatetime = memberUpdateDatetime;
    }

    /**
     * [get] MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberUpdateUser() {
        checkSpecifiedProperty("memberUpdateUser");
        return _memberUpdateUser;
    }

    /**
     * [set] MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * @param memberUpdateUser The value of the column 'MEMBER_UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setMemberUpdateUser(String memberUpdateUser) {
        registerModifiedProperty("memberUpdateUser");
        _memberUpdateUser = memberUpdateUser;
    }

    /**
     * [get] MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'MEMBER_UPDATE_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberUpdateProcess() {
        checkSpecifiedProperty("memberUpdateProcess");
        return _memberUpdateProcess;
    }

    /**
     * [set] MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * @param memberUpdateProcess The value of the column 'MEMBER_UPDATE_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setMemberUpdateProcess(String memberUpdateProcess) {
        registerModifiedProperty("memberUpdateProcess");
        _memberUpdateProcess = memberUpdateProcess;
    }

    /**
     * [get] VERSION_NO: {NotNull, INTEGER(2000000000, 10)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, INTEGER(2000000000, 10)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
