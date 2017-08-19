package org.docksidestage.sqlite.dbflute.readonly.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The DB meta of REGION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RoyRegionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RoyRegionDbm _instance = new RoyRegionDbm();
    private RoyRegionDbm() {}
    public static RoyRegionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((RoyRegion)et).getRegionId(), (et, vl) -> ((RoyRegion)et).setRegionId(cti(vl)), "regionId");
        setupEpg(_epgMap, et -> ((RoyRegion)et).getRegionName(), (et, vl) -> ((RoyRegion)et).setRegionName((String)vl), "regionName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "REGION";
    protected final String _tableDispName = "REGION";
    protected final String _tablePropertyName = "region";
    protected final TableSqlName _tableSqlName = new TableSqlName("REGION", _tableDbName);
    { _tableSqlName.xacceptFilter(RoyDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRegionId = cci("REGION_ID", "REGION_ID", null, null, Integer.class, "regionId", null, true, false, true, "INTEGER", 2000000000, 10, null, null, false, null, null, null, "memberAddressList", null, false);
    protected final ColumnInfo _columnRegionName = cci("REGION_NAME", "REGION_NAME", null, null, String.class, "regionName", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);

    /**
     * REGION_ID: {PK, NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionId() { return _columnRegionId; }
    /**
     * REGION_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionName() { return _columnRegionName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRegionId());
        ls.add(columnRegionName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRegionId()); }
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
    /**
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRegionId(), RoyMemberAddressDbm.getInstance().columnRegionId());
        return cri("FK_MEMBER_ADDRESS_REGION_ID_REGION", "memberAddressList", this, RoyMemberAddressDbm.getInstance(), mp, false, "region");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exentity.RoyRegion"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.cbean.RoyRegionCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exbhv.RoyRegionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RoyRegion> getEntityType() { return RoyRegion.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RoyRegion newEntity() { return new RoyRegion(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RoyRegion)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RoyRegion)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
