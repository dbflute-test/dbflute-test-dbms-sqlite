package org.docksidestage.sqlite.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.sqlite.dbflute.allcommon.*;
import org.docksidestage.sqlite.dbflute.exentity.*;

/**
 * The DB meta of PURCHASE_PAYMENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchasePaymentDbm _instance = new PurchasePaymentDbm();
    private PurchasePaymentDbm() {}
    public static PurchasePaymentDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return MaDBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return MaDBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return MaDBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return MaDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPurchasePaymentId(), (et, vl) -> ((PurchasePayment)et).setPurchasePaymentId(cti(vl)), "purchasePaymentId");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPurchaseId(), (et, vl) -> ((PurchasePayment)et).setPurchaseId(cti(vl)), "purchaseId");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPaymentAmount(), (et, vl) -> ((PurchasePayment)et).setPaymentAmount((String)vl), "paymentAmount");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPaymentDatetime(), (et, vl) -> ((PurchasePayment)et).setPaymentDatetime(ctldt(vl)), "paymentDatetime");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPaymentMethodCode(), (et, vl) -> ((PurchasePayment)et).setPaymentMethodCode((String)vl), "paymentMethodCode");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getRegisterDatetime(), (et, vl) -> ((PurchasePayment)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getRegisterUser(), (et, vl) -> ((PurchasePayment)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getRegisterProcess(), (et, vl) -> ((PurchasePayment)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getUpdateDatetime(), (et, vl) -> ((PurchasePayment)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getUpdateUser(), (et, vl) -> ((PurchasePayment)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getVersionNo(), (et, vl) -> ((PurchasePayment)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PURCHASE_PAYMENT";
    protected final String _tableDispName = "PURCHASE_PAYMENT";
    protected final String _tablePropertyName = "purchasePayment";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE_PAYMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(MaDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchasePaymentId = cci("PURCHASE_PAYMENT_ID", "PURCHASE_PAYMENT_ID", null, null, Integer.class, "purchasePaymentId", null, true, true, true, "INTEGER", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, null, Integer.class, "purchaseId", null, false, false, true, "INTEGER", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentAmount = cci("PAYMENT_AMOUNT", "PAYMENT_AMOUNT", null, null, String.class, "paymentAmount", null, false, false, true, "DECIMAL(10,2)", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentDatetime = cci("PAYMENT_DATETIME", "PAYMENT_DATETIME", null, null, java.time.LocalDateTime.class, "paymentDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentMethodCode = cci("PAYMENT_METHOD_CODE", "PAYMENT_METHOD_CODE", null, null, String.class, "paymentMethodCode", null, false, false, true, "CHAR(3)", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR(200)", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, true, "TEXT", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR(200)", 2000000000, 10, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "INTEGER", 2000000000, 10, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * PURCHASE_PAYMENT_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePaymentId() { return _columnPurchasePaymentId; }
    /**
     * PURCHASE_ID: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * PAYMENT_AMOUNT: {NotNull, DECIMAL(10,2)(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentAmount() { return _columnPaymentAmount; }
    /**
     * PAYMENT_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentDatetime() { return _columnPaymentDatetime; }
    /**
     * PAYMENT_METHOD_CODE: {NotNull, CHAR(3)(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentMethodCode() { return _columnPaymentMethodCode; }
    /**
     * REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, VARCHAR(200)(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, VARCHAR(200)(2000000000, 10)}
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
        ls.add(columnPurchasePaymentId());
        ls.add(columnPurchaseId());
        ls.add(columnPaymentAmount());
        ls.add(columnPaymentDatetime());
        ls.add(columnPaymentMethodCode());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
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
    protected UniqueInfo cpui() { return hpcpui(columnPurchasePaymentId()); }
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
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.sqlite.dbflute.exentity.PurchasePayment"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlite.dbflute.cbean.PurchasePaymentCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlite.dbflute.exbhv.PurchasePaymentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PurchasePayment> getEntityType() { return PurchasePayment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PurchasePayment newEntity() { return new PurchasePayment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PurchasePayment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PurchasePayment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
