package org.docksidestage.sqlite.dbflute.readonly.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.customize.*;

/**
 * The DB meta of UnpaidSummaryMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RoyUnpaidSummaryMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RoyUnpaidSummaryMemberDbm _instance = new RoyUnpaidSummaryMemberDbm();
    private RoyUnpaidSummaryMemberDbm() {}
    public static RoyUnpaidSummaryMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((RoyUnpaidSummaryMember)et).getUnpaidManId(), (et, vl) -> ((RoyUnpaidSummaryMember)et).setUnpaidManId(cti(vl)), "unpaidManId");
        setupEpg(_epgMap, et -> ((RoyUnpaidSummaryMember)et).getUnpaidManName(), (et, vl) -> ((RoyUnpaidSummaryMember)et).setUnpaidManName((String)vl), "unpaidManName");
        setupEpg(_epgMap, et -> ((RoyUnpaidSummaryMember)et).getUnpaidPriceSummary(), (et, vl) -> ((RoyUnpaidSummaryMember)et).setUnpaidPriceSummary((String)vl), "unpaidPriceSummary");
        setupEpg(_epgMap, et -> ((RoyUnpaidSummaryMember)et).getStatusName(), (et, vl) -> ((RoyUnpaidSummaryMember)et).setStatusName((String)vl), "statusName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "UnpaidSummaryMember";
    protected final String _tableDispName = "UnpaidSummaryMember";
    protected final String _tablePropertyName = "unpaidSummaryMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("UnpaidSummaryMember", _tableDbName);
    { _tableSqlName.xacceptFilter(RoyDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUnpaidManId = cci("UNPAID_MAN_ID", "UNPAID_MAN_ID", null, null, Integer.class, "unpaidManId", null, true, false, false, "null", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnpaidManName = cci("UNPAID_MAN_NAME", "UNPAID_MAN_NAME", null, null, String.class, "unpaidManName", null, false, false, false, "null", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnpaidPriceSummary = cci("UNPAID_PRICE_SUMMARY", "UNPAID_PRICE_SUMMARY", null, null, String.class, "unpaidPriceSummary", null, false, false, false, "null", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatusName = cci("STATUS_NAME", "STATUS_NAME", null, null, String.class, "statusName", null, false, false, false, "null", 2147483647, 0, null, null, false, null, null, null, null, null, false);

    /**
     * UNPAID_MAN_ID: {PK, null(2147483647), refers to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnpaidManId() { return _columnUnpaidManId; }
    /**
     * UNPAID_MAN_NAME: {null(2147483647), refers to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnpaidManName() { return _columnUnpaidManName; }
    /**
     * UNPAID_PRICE_SUMMARY: {null(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnpaidPriceSummary() { return _columnUnpaidPriceSummary; }
    /**
     * STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatusName() { return _columnStatusName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUnpaidManId());
        ls.add(columnUnpaidManName());
        ls.add(columnUnpaidPriceSummary());
        ls.add(columnStatusName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUnpaidManId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exentity.customize.RoyUnpaidSummaryMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RoyUnpaidSummaryMember> getEntityType() { return RoyUnpaidSummaryMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RoyUnpaidSummaryMember newEntity() { return new RoyUnpaidSummaryMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RoyUnpaidSummaryMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RoyUnpaidSummaryMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
