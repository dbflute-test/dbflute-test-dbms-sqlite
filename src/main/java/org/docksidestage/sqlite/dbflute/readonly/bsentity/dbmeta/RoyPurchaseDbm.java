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
 * The DB meta of PURCHASE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RoyPurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RoyPurchaseDbm _instance = new RoyPurchaseDbm();
    private RoyPurchaseDbm() {}
    public static RoyPurchaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchaseId(), (et, vl) -> ((RoyPurchase)et).setPurchaseId(cti(vl)), "purchaseId");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getMemberId(), (et, vl) -> ((RoyPurchase)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getProductId(), (et, vl) -> ((RoyPurchase)et).setProductId(cti(vl)), "productId");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchaseDatetime(), (et, vl) -> ((RoyPurchase)et).setPurchaseDatetime(ctldt(vl)), "purchaseDatetime");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchaseCount(), (et, vl) -> ((RoyPurchase)et).setPurchaseCount(cti(vl)), "purchaseCount");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchasePrice(), (et, vl) -> ((RoyPurchase)et).setPurchasePrice(cti(vl)), "purchasePrice");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPaymentCompleteFlg(), (et, vl) -> {
            ccls(et, columnPaymentCompleteFlg(), vl);
            RoyCDef.Flg cls = (RoyCDef.Flg)gcls(et, columnPaymentCompleteFlg(), vl);
            if (cls != null) {
                ((RoyPurchase)et).setPaymentCompleteFlgAsFlg(cls);
            } else {
                ((RoyPurchase)et).mynativeMappingPaymentCompleteFlg(ctn(vl, Integer.class));
            }
        }, "paymentCompleteFlg");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchaseRegisterDatetime(), (et, vl) -> ((RoyPurchase)et).setPurchaseRegisterDatetime(ctldt(vl)), "purchaseRegisterDatetime");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchaseRegisterUser(), (et, vl) -> ((RoyPurchase)et).setPurchaseRegisterUser((String)vl), "purchaseRegisterUser");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchaseRegisterProcess(), (et, vl) -> ((RoyPurchase)et).setPurchaseRegisterProcess((String)vl), "purchaseRegisterProcess");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchaseUpdateDatetime(), (et, vl) -> ((RoyPurchase)et).setPurchaseUpdateDatetime(ctldt(vl)), "purchaseUpdateDatetime");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchaseUpdateUser(), (et, vl) -> ((RoyPurchase)et).setPurchaseUpdateUser((String)vl), "purchaseUpdateUser");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getPurchaseUpdateProcess(), (et, vl) -> ((RoyPurchase)et).setPurchaseUpdateProcess((String)vl), "purchaseUpdateProcess");
        setupEpg(_epgMap, et -> ((RoyPurchase)et).getVersionNo(), (et, vl) -> ((RoyPurchase)et).setVersionNo(cti(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((RoyPurchase)et).getMember(), (et, vl) -> ((RoyPurchase)et).setMember((OptionalEntity<RoyMember>)vl), "member");
        setupEfpg(_efpgMap, et -> ((RoyPurchase)et).getProduct(), (et, vl) -> ((RoyPurchase)et).setProduct((OptionalEntity<RoyProduct>)vl), "product");
        setupEfpg(_efpgMap, et -> ((RoyPurchase)et).getSummaryProduct(), (et, vl) -> ((RoyPurchase)et).setSummaryProduct((OptionalEntity<RoySummaryProduct>)vl), "summaryProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PURCHASE";
    protected final String _tableDispName = "PURCHASE";
    protected final String _tablePropertyName = "purchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(RoyDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, null, Integer.class, "purchaseId", null, true, true, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Integer.class, "productId", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, "product,summaryProduct", null, null, false);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, null, java.time.LocalDateTime.class, "purchaseDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, null, Integer.class, "purchaseCount", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, null, Integer.class, "purchasePrice", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, null, Integer.class, "paymentCompleteFlg", null, false, false, true, "INTEGER", 2000000000, 10, null, false, null, null, null, null, RoyCDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnPurchaseRegisterDatetime = cci("PURCHASE_REGISTER_DATETIME", "PURCHASE_REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "purchaseRegisterDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseRegisterUser = cci("PURCHASE_REGISTER_USER", "PURCHASE_REGISTER_USER", null, null, String.class, "purchaseRegisterUser", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseRegisterProcess = cci("PURCHASE_REGISTER_PROCESS", "PURCHASE_REGISTER_PROCESS", null, null, String.class, "purchaseRegisterProcess", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseUpdateDatetime = cci("PURCHASE_UPDATE_DATETIME", "PURCHASE_UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "purchaseUpdateDatetime", null, false, false, true, "DATETIME", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseUpdateUser = cci("PURCHASE_UPDATE_USER", "PURCHASE_UPDATE_USER", null, null, String.class, "purchaseUpdateUser", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseUpdateProcess = cci("PURCHASE_UPDATE_PROCESS", "PURCHASE_UPDATE_PROCESS", null, null, String.class, "purchaseUpdateProcess", null, false, false, true, "TEXT", 2000000000, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "INTEGER", 2000000000, 10, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    /**
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    /**
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    /**
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
    /**
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseRegisterDatetime() { return _columnPurchaseRegisterDatetime; }
    /**
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseRegisterUser() { return _columnPurchaseRegisterUser; }
    /**
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseRegisterProcess() { return _columnPurchaseRegisterProcess; }
    /**
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseUpdateDatetime() { return _columnPurchaseUpdateDatetime; }
    /**
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseUpdateUser() { return _columnPurchaseUpdateUser; }
    /**
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseUpdateProcess() { return _columnPurchaseUpdateProcess; }
    /**
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchaseId());
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
        ls.add(columnPurchaseCount());
        ls.add(columnPurchasePrice());
        ls.add(columnPaymentCompleteFlg());
        ls.add(columnPurchaseRegisterDatetime());
        ls.add(columnPurchaseRegisterUser());
        ls.add(columnPurchaseRegisterProcess());
        ls.add(columnPurchaseUpdateDatetime());
        ls.add(columnPurchaseUpdateUser());
        ls.add(columnPurchaseUpdateProcess());
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
    protected UniqueInfo cpui() { return hpcpui(columnPurchaseId()); }
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
        return cfi("FK_PURCHASE_MEMBER_ID_MEMBER", "member", this, RoyMemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }
    /**
     * PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), RoyProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_PRODUCT_ID_PRODUCT", "product", this, RoyProductDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }
    /**
     * SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSummaryProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), RoySummaryProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_SUMMARY_PRODUCT", "summaryProduct", this, RoySummaryProductDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "purchaseList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exentity.RoyPurchase"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.cbean.RoyPurchaseCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.sqlite.dbflute.readonly.exbhv.RoyPurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RoyPurchase> getEntityType() { return RoyPurchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RoyPurchase newEntity() { return new RoyPurchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RoyPurchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RoyPurchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
