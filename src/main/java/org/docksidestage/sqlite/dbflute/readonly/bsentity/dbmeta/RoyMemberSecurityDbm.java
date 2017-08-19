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
 * The DB meta of MEMBER_SECURITY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RoyMemberSecurityDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RoyMemberSecurityDbm _instance = new RoyMemberSecurityDbm();
    private RoyMemberSecurityDbm() {}
    public static RoyMemberSecurityDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getMemberId(), (et, vl) -> ((RoyMemberSecurity)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getLoginPassword(), (et, vl) -> ((RoyMemberSecurity)et).setLoginPassword((String)vl), "loginPassword");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getReminderQuestion(), (et, vl) -> ((RoyMemberSecurity)et).setReminderQuestion((String)vl), "reminderQuestion");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getReminderAnswer(), (et, vl) -> ((RoyMemberSecurity)et).setReminderAnswer((String)vl), "reminderAnswer");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getReminderUseCount(), (et, vl) -> ((RoyMemberSecurity)et).setReminderUseCount(cti(vl)), "reminderUseCount");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getRegisterDatetime(), (et, vl) -> ((RoyMemberSecurity)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getRegisterProcess(), (et, vl) -> ((RoyMemberSecurity)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getRegisterUser(), (et, vl) -> ((RoyMemberSecurity)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getUpdateDatetime(), (et, vl) -> ((RoyMemberSecurity)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getUpdateProcess(), (et, vl) -> ((RoyMemberSecurity)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getUpdateUser(), (et, vl) -> ((RoyMemberSecurity)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((RoyMemberSecurity)et).getVersionNo(), (et, vl) -> ((RoyMemberSecurity)et).setVersionNo(cti(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((RoyMemberSecurity)et).getMember(), (et, vl) -> ((RoyMemberSecurity)et).setMember((OptionalEntity<RoyMember>)vl), "member");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_SECURITY";
    protected final String _tableDispName = "MEMBER_SECURITY";
    protected final String _tablePropertyName = "memberSecurity";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_SECURITY", _tableDbName);
    { _tableSqlName.xacceptFilter(RoyDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, true, false, true, "INTEGER", 2000000000, 10, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnLoginPassword = cci("LOGIN_PASSWORD", "LOGIN_PASSWORD", null, null, String.class, "loginPassword", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReminderQuestion = cci("REMINDER_QUESTION", "REMINDER_QUESTION", null, null, String.class, "reminderQuestion", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReminderAnswer = cci("REMINDER_ANSWER", "REMINDER_ANSWER", null, null, String.class, "reminderAnswer", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReminderUseCount = cci("REMINDER_USE_COUNT", "REMINDER_USE_COUNT", null, null, Integer.class, "reminderUseCount", null, false, false, true, "INTEGER", 2000000000, 10, null, null, false, null, null, null, null, null, false);
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
     * LOGIN_PASSWORD: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginPassword() { return _columnLoginPassword; }
    /**
     * REMINDER_QUESTION: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderQuestion() { return _columnReminderQuestion; }
    /**
     * REMINDER_ANSWER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderAnswer() { return _columnReminderAnswer; }
    /**
     * REMINDER_USE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderUseCount() { return _columnReminderUseCount; }
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
        ls.add(columnLoginPassword());
        ls.add(columnReminderQuestion());
        ls.add(columnReminderAnswer());
        ls.add(columnReminderUseCount());
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
        return cfi("FK_MEMBER_SECURITY_MEMBER_ID_MEMBER", "member", this, RoyMemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "memberSecurityAsOne", false);
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
    public String getEntityTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exentity.RoyMemberSecurity"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.cbean.RoyMemberSecurityCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exbhv.RoyMemberSecurityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RoyMemberSecurity> getEntityType() { return RoyMemberSecurity.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RoyMemberSecurity newEntity() { return new RoyMemberSecurity(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RoyMemberSecurity)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RoyMemberSecurity)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
