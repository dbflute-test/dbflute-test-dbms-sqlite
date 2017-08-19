package org.docksidestage.sqlite.dbflute.readonly.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The DB meta of MEMBER_WITHDRAWAL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RoyMemberWithdrawalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RoyMemberWithdrawalDbm _instance = new RoyMemberWithdrawalDbm();
    private RoyMemberWithdrawalDbm() {}
    public static RoyMemberWithdrawalDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return RoyDBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return RoyDBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return RoyDBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return RoyDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getMemberId(), (et, vl) -> ((RoyMemberWithdrawal)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getWithdrawalReasonCode(), (et, vl) -> ((RoyMemberWithdrawal)et).setWithdrawalReasonCode((String)vl), "withdrawalReasonCode");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getWithdrawalReasonInputText(), (et, vl) -> ((RoyMemberWithdrawal)et).setWithdrawalReasonInputText((String)vl), "withdrawalReasonInputText");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getWithdrawalDatetime(), (et, vl) -> ((RoyMemberWithdrawal)et).setWithdrawalDatetime(ctldt(vl)), "withdrawalDatetime");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getRegisterDatetime(), (et, vl) -> ((RoyMemberWithdrawal)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getRegisterProcess(), (et, vl) -> ((RoyMemberWithdrawal)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getRegisterUser(), (et, vl) -> ((RoyMemberWithdrawal)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getUpdateDatetime(), (et, vl) -> ((RoyMemberWithdrawal)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getUpdateProcess(), (et, vl) -> ((RoyMemberWithdrawal)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getUpdateUser(), (et, vl) -> ((RoyMemberWithdrawal)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((RoyMemberWithdrawal)et).getVersionNo(), (et, vl) -> ((RoyMemberWithdrawal)et).setVersionNo(cti(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((RoyMemberWithdrawal)et).getMember(), (et, vl) -> ((RoyMemberWithdrawal)et).setMember((OptionalEntity<RoyMember>)vl), "member");
        setupEfpg(_efpgMap, et -> ((RoyMemberWithdrawal)et).getWithdrawalReason(), (et, vl) -> ((RoyMemberWithdrawal)et).setWithdrawalReason((OptionalEntity<RoyWithdrawalReason>)vl), "withdrawalReason");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_WITHDRAWAL";
    protected final String _tableDispName = "MEMBER_WITHDRAWAL";
    protected final String _tablePropertyName = "memberWithdrawal";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(RoyDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, true, false, true, "INTEGER", 2000000000, 10, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, null, String.class, "withdrawalReasonCode", null, false, false, false, "TEXT", 2000000000, 10, null, null, false, null, null, "withdrawalReason", null, null, false);
    protected final ColumnInfo _columnWithdrawalReasonInputText = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, null, String.class, "withdrawalReasonInputText", null, false, false, false, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWithdrawalDatetime = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, null, java.time.LocalDateTime.class, "withdrawalDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, String.class, "updateProcess", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "INTEGER", 2000000000, 10, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * MEMBER_ID: {PK, NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * WITHDRAWAL_REASON_CODE: {TEXT(2000000000, 10), FK to WITHDRAWAL_REASON}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    /**
     * WITHDRAWAL_REASON_INPUT_TEXT: {TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonInputText() { return _columnWithdrawalReasonInputText; }
    /**
     * WITHDRAWAL_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalDatetime() { return _columnWithdrawalDatetime; }
    /**
     * REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonInputText());
        ls.add(columnWithdrawalDatetime());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterProcess());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateProcess());
        ls.add(columnUpdateUser());
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

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), RoyMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_ID_MEMBER", "member", this, RoyMemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "memberWithdrawalAsOne", false);
    }
    /**
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWithdrawalReason() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalReasonCode(), RoyWithdrawalReasonDbm.getInstance().columnWithdrawalReasonCode());
        return cfi("FK_MEMBER_WITHDRAWAL_WITHDRAWAL_REASON_CODE_WITHDRAWAL_REASON", "withdrawalReason", this, RoyWithdrawalReasonDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberWithdrawalList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exentity.RoyMemberWithdrawal"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.cbean.RoyMemberWithdrawalCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exbhv.RoyMemberWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RoyMemberWithdrawal> getEntityType() { return RoyMemberWithdrawal.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RoyMemberWithdrawal newEntity() { return new RoyMemberWithdrawal(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RoyMemberWithdrawal)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RoyMemberWithdrawal)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
