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
 * The DB meta of PRODUCT_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RoyProductStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RoyProductStatusDbm _instance = new RoyProductStatusDbm();
    private RoyProductStatusDbm() {}
    public static RoyProductStatusDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((RoyProductStatus)et).getProductStatusCode(), (et, vl) -> ((RoyProductStatus)et).setProductStatusCode((String)vl), "productStatusCode");
        setupEpg(_epgMap, et -> ((RoyProductStatus)et).getProductStatusName(), (et, vl) -> ((RoyProductStatus)et).setProductStatusName((String)vl), "productStatusName");
        setupEpg(_epgMap, et -> ((RoyProductStatus)et).getDisplayOrder(), (et, vl) -> ((RoyProductStatus)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PRODUCT_STATUS";
    protected final String _tableDispName = "PRODUCT_STATUS";
    protected final String _tablePropertyName = "productStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("PRODUCT_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(RoyDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, String.class, "productStatusCode", null, true, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, "productList,summaryProductList", null, false);
    protected final ColumnInfo _columnProductStatusName = cci("PRODUCT_STATUS_NAME", "PRODUCT_STATUS_NAME", null, null, String.class, "productStatusName", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "INTEGER", 2000000000, 10, null, null, false, null, null, null, null, null, false);

    /**
     * PRODUCT_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * PRODUCT_STATUS_NAME: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusName() { return _columnProductStatusName; }
    /**
     * DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductStatusCode());
        ls.add(columnProductStatusName());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductStatusCode()); }
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
     * PRODUCT by PRODUCT_STATUS_CODE, named 'productList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), RoyProductDbm.getInstance().columnProductStatusCode());
        return cri("FK_PRODUCT_PRODUCT_STATUS_CODE_PRODUCT_STATUS", "productList", this, RoyProductDbm.getInstance(), mp, false, "productStatus");
    }
    /**
     * SUMMARY_PRODUCT by PRODUCT_STATUS_CODE, named 'summaryProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSummaryProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), RoySummaryProductDbm.getInstance().columnProductStatusCode());
        return cri("FK_SUMMARY_PRODUCT_PRODUCT_STATUS", "summaryProductList", this, RoySummaryProductDbm.getInstance(), mp, false, "productStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exentity.RoyProductStatus"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.cbean.RoyProductStatusCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exbhv.RoyProductStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RoyProductStatus> getEntityType() { return RoyProductStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RoyProductStatus newEntity() { return new RoyProductStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RoyProductStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RoyProductStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
