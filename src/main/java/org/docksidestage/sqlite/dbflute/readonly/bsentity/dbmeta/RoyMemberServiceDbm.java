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
 * The DB meta of MEMBER_SERVICE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RoyMemberServiceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RoyMemberServiceDbm _instance = new RoyMemberServiceDbm();
    private RoyMemberServiceDbm() {}
    public static RoyMemberServiceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((RoyMemberService)et).getMemberServiceId(), (et, vl) -> ((RoyMemberService)et).setMemberServiceId(cti(vl)), "memberServiceId");
        setupEpg(_epgMap, et -> ((RoyMemberService)et).getMemberId(), (et, vl) -> ((RoyMemberService)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((RoyMemberService)et).getServicePointCount(), (et, vl) -> ((RoyMemberService)et).setServicePointCount(cti(vl)), "servicePointCount");
        setupEpg(_epgMap, et -> ((RoyMemberService)et).getServiceRankCode(), (et, vl) -> ((RoyMemberService)et).setServiceRankCode((String)vl), "serviceRankCode");
        setupEpg(_epgMap, et -> ((RoyMemberService)et).getRegisterDatetime(), (et, vl) -> ((RoyMemberService)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((RoyMemberService)et).getRegisterUser(), (et, vl) -> ((RoyMemberService)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((RoyMemberService)et).getUpdateDatetime(), (et, vl) -> ((RoyMemberService)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((RoyMemberService)et).getUpdateUser(), (et, vl) -> ((RoyMemberService)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((RoyMemberService)et).getVersionNo(), (et, vl) -> ((RoyMemberService)et).setVersionNo(cti(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((RoyMemberService)et).getMember(), (et, vl) -> ((RoyMemberService)et).setMember((OptionalEntity<RoyMember>)vl), "member");
        setupEfpg(_efpgMap, et -> ((RoyMemberService)et).getServiceRank(), (et, vl) -> ((RoyMemberService)et).setServiceRank((OptionalEntity<RoyServiceRank>)vl), "serviceRank");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_SERVICE";
    protected final String _tableDispName = "MEMBER_SERVICE";
    protected final String _tablePropertyName = "memberService";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_SERVICE", _tableDbName);
    { _tableSqlName.xacceptFilter(RoyDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberServiceId = cci("MEMBER_SERVICE_ID", "MEMBER_SERVICE_ID", null, null, Integer.class, "memberServiceId", null, true, true, true, "INTEGER", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "INTEGER", 2000000000, 10, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnServicePointCount = cci("SERVICE_POINT_COUNT", "SERVICE_POINT_COUNT", null, null, Integer.class, "servicePointCount", null, false, false, true, "INTEGER", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnServiceRankCode = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, null, String.class, "serviceRankCode", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, "serviceRank", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "INTEGER", 2000000000, 10, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberServiceId() { return _columnMemberServiceId; }
    /**
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * SERVICE_POINT_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServicePointCount() { return _columnServicePointCount; }
    /**
     * SERVICE_RANK_CODE: {NotNull, TEXT(2000000000, 10), FK to SERVICE_RANK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServiceRankCode() { return _columnServiceRankCode; }
    /**
     * REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
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
        ls.add(columnMemberServiceId());
        ls.add(columnMemberId());
        ls.add(columnServicePointCount());
        ls.add(columnServiceRankCode());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
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
    protected UniqueInfo cpui() { return hpcpui(columnMemberServiceId()); }
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
        return cfi("FK_MEMBER_SERVICE_MEMBER_ID_MEMBER", "member", this, RoyMemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberServiceList", false);
    }
    /**
     * SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignServiceRank() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnServiceRankCode(), RoyServiceRankDbm.getInstance().columnServiceRankCode());
        return cfi("FK_MEMBER_SERVICE_SERVICE_RANK_CODE_SERVICE_RANK", "serviceRank", this, RoyServiceRankDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberServiceList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exentity.RoyMemberService"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.cbean.RoyMemberServiceCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exbhv.RoyMemberServiceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RoyMemberService> getEntityType() { return RoyMemberService.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RoyMemberService newEntity() { return new RoyMemberService(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RoyMemberService)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RoyMemberService)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
