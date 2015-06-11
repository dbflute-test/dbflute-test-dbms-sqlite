package org.docksidestage.sqlite.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.sqlite.dbflute.allcommon.*;
import org.docksidestage.sqlite.dbflute.exentity.*;

/**
 * The DB meta of MEMBER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberDbm _instance = new MemberDbm();
    private MemberDbm() {}
    public static MemberDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Member)et).getMemberId(), (et, vl) -> ((Member)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((Member)et).getMemberName(), (et, vl) -> ((Member)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((Member)et).getMemberAccount(), (et, vl) -> ((Member)et).setMemberAccount((String)vl), "memberAccount");
        setupEpg(_epgMap, et -> ((Member)et).getMemberStatusCode(), (et, vl) -> ((Member)et).setMemberStatusCode((String)vl), "memberStatusCode");
        setupEpg(_epgMap, et -> ((Member)et).getFormalizedDatetime(), (et, vl) -> ((Member)et).setFormalizedDatetime(ctldt(vl)), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getBirthdate(), (et, vl) -> ((Member)et).setBirthdate(ctld(vl)), "birthdate");
        setupEpg(_epgMap, et -> ((Member)et).getMemberRegisterDatetime(), (et, vl) -> ((Member)et).setMemberRegisterDatetime(ctldt(vl)), "memberRegisterDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getMemberRegisterUser(), (et, vl) -> ((Member)et).setMemberRegisterUser((String)vl), "memberRegisterUser");
        setupEpg(_epgMap, et -> ((Member)et).getMemberRegisterProcess(), (et, vl) -> ((Member)et).setMemberRegisterProcess((String)vl), "memberRegisterProcess");
        setupEpg(_epgMap, et -> ((Member)et).getMemberUpdateDatetime(), (et, vl) -> ((Member)et).setMemberUpdateDatetime(ctldt(vl)), "memberUpdateDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getMemberUpdateUser(), (et, vl) -> ((Member)et).setMemberUpdateUser((String)vl), "memberUpdateUser");
        setupEpg(_epgMap, et -> ((Member)et).getMemberUpdateProcess(), (et, vl) -> ((Member)et).setMemberUpdateProcess((String)vl), "memberUpdateProcess");
        setupEpg(_epgMap, et -> ((Member)et).getVersionNo(), (et, vl) -> ((Member)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberStatus(), (et, vl) -> ((Member)et).setMemberStatus((OptionalEntity<MemberStatus>)vl), "memberStatus");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberAddressAsValid(), (et, vl) -> ((Member)et).setMemberAddressAsValid((OptionalEntity<MemberAddress>)vl), "memberAddressAsValid");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberSecurityAsOne(), (et, vl) -> ((Member)et).setMemberSecurityAsOne((OptionalEntity<MemberSecurity>)vl), "memberSecurityAsOne");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberWithdrawalAsOne(), (et, vl) -> ((Member)et).setMemberWithdrawalAsOne((OptionalEntity<MemberWithdrawal>)vl), "memberWithdrawalAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER";
    protected final String _tableDispName = "MEMBER";
    protected final String _tablePropertyName = "member";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, true, true, true, "INTEGER", 2000000000, 10, null, false, null, null, "memberAddressAsValid,memberSecurityAsOne,memberWithdrawalAsOne", "memberAddressList,memberLoginList,memberServiceList,purchaseList", null, false);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, String.class, "memberName", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, null, String.class, "memberAccount", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, String.class, "memberStatusCode", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus, false);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, java.time.LocalDateTime.class, "formalizedDatetime", null, false, false, false, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, java.time.LocalDate.class, "birthdate", null, false, false, false, "DATE", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberRegisterDatetime = cci("MEMBER_REGISTER_DATETIME", "MEMBER_REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "memberRegisterDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberRegisterUser = cci("MEMBER_REGISTER_USER", "MEMBER_REGISTER_USER", null, null, String.class, "memberRegisterUser", null, false, false, true, "TEXT", 2000000000, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberRegisterProcess = cci("MEMBER_REGISTER_PROCESS", "MEMBER_REGISTER_PROCESS", null, null, String.class, "memberRegisterProcess", null, false, false, true, "TEXT", 2000000000, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberUpdateDatetime = cci("MEMBER_UPDATE_DATETIME", "MEMBER_UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "memberUpdateDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, true, OptimisticLockType.UPDATE_DATE, null, null, null, null, false);
    protected final ColumnInfo _columnMemberUpdateUser = cci("MEMBER_UPDATE_USER", "MEMBER_UPDATE_USER", null, null, String.class, "memberUpdateUser", null, false, false, true, "TEXT", 2000000000, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberUpdateProcess = cci("MEMBER_UPDATE_PROCESS", "MEMBER_UPDATE_PROCESS", null, null, String.class, "memberUpdateProcess", null, false, false, true, "TEXT", 2000000000, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "INTEGER", 2000000000, 10, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * MEMBER_ID: {PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * MEMBER_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * MEMBER_ACCOUNT: {UQ, NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    /**
     * MEMBER_STATUS_CODE: {NotNull, TEXT(2000000000, 10), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * FORMALIZED_DATETIME: {DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * BIRTHDATE: {DATE(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberRegisterDatetime() { return _columnMemberRegisterDatetime; }
    /**
     * MEMBER_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberRegisterUser() { return _columnMemberRegisterUser; }
    /**
     * MEMBER_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberRegisterProcess() { return _columnMemberRegisterProcess; }
    /**
     * MEMBER_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberUpdateDatetime() { return _columnMemberUpdateDatetime; }
    /**
     * MEMBER_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberUpdateUser() { return _columnMemberUpdateUser; }
    /**
     * MEMBER_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberUpdateProcess() { return _columnMemberUpdateProcess; }
    /**
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
        ls.add(columnMemberRegisterDatetime());
        ls.add(columnMemberRegisterUser());
        ls.add(columnMemberRegisterProcess());
        ls.add(columnMemberUpdateDatetime());
        ls.add(columnMemberUpdateUser());
        ls.add(columnMemberUpdateProcess());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnMemberAccount()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS_CODE_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberList", false);
    }
    /**
     * MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberAddressAsValid() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_VALID", "memberAddressAsValid", this, MemberAddressDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null", newArrayList("targetDate"), false, null, false);
    }
    /**
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMemberSecurityAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberSecurityDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER_ID_MEMBER", "memberSecurityAsOne", this, MemberSecurityDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "member", false);
    }
    /**
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMemberWithdrawalAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_ID_MEMBER", "memberWithdrawalAsOne", this, MemberWithdrawalDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "member", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_ADDRESS_MEMBER_ID_MEMBER", "memberAddressList", this, MemberAddressDbm.getInstance(), mp, false, "member");
    }
    /**
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_LOGIN_MEMBER_ID_MEMBER", "memberLoginList", this, MemberLoginDbm.getInstance(), mp, false, "member");
    }
    /**
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberServiceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberServiceDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_SERVICE_MEMBER_ID_MEMBER", "memberServiceList", this, MemberServiceDbm.getInstance(), mp, false, "member");
    }
    /**
     * PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), PurchaseDbm.getInstance().columnMemberId());
        return cri("FK_PURCHASE_MEMBER_ID_MEMBER", "purchaseList", this, PurchaseDbm.getInstance(), mp, false, "member");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnMemberUpdateDatetime; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnMemberRegisterDatetime(), columnMemberRegisterUser(), columnMemberRegisterProcess(), columnMemberUpdateDatetime(), columnMemberUpdateUser(), columnMemberUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnMemberRegisterDatetime(), columnMemberRegisterUser(), columnMemberRegisterProcess(), columnMemberUpdateDatetime(), columnMemberUpdateUser(), columnMemberUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnMemberUpdateDatetime(), columnMemberUpdateUser(), columnMemberUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.sqlite.dbflute.exentity.Member"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlite.dbflute.cbean.MemberCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlite.dbflute.exbhv.MemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Member> getEntityType() { return Member.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Member newEntity() { return new Member(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Member)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Member)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
