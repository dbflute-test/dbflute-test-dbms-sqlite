package org.docksidestage.sqlite.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.sqlite.dbflute.allcommon.MaEntityDefinedCommonColumn;
import org.docksidestage.sqlite.dbflute.allcommon.MaDBMetaInstanceHandler;
import org.docksidestage.sqlite.dbflute.allcommon.MaCDef;
import org.docksidestage.sqlite.dbflute.exentity.*;

/**
 * The entity of PURCHASE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PURCHASE_ID
 *
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, PURCHASE_REGISTER_DATETIME, PURCHASE_REGISTER_USER, PURCHASE_REGISTER_PROCESS, PURCHASE_UPDATE_DATETIME, PURCHASE_UPDATE_USER, PURCHASE_UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, PRODUCT, SUMMARY_PRODUCT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, product, summaryProduct
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer purchaseId = entity.getPurchaseId();
 * Integer memberId = entity.getMemberId();
 * Integer productId = entity.getProductId();
 * java.time.LocalDateTime purchaseDatetime = entity.getPurchaseDatetime();
 * Integer purchaseCount = entity.getPurchaseCount();
 * Integer purchasePrice = entity.getPurchasePrice();
 * Integer paymentCompleteFlg = entity.getPaymentCompleteFlg();
 * java.time.LocalDateTime purchaseRegisterDatetime = entity.getPurchaseRegisterDatetime();
 * String purchaseRegisterUser = entity.getPurchaseRegisterUser();
 * String purchaseRegisterProcess = entity.getPurchaseRegisterProcess();
 * java.time.LocalDateTime purchaseUpdateDatetime = entity.getPurchaseUpdateDatetime();
 * String purchaseUpdateUser = entity.getPurchaseUpdateUser();
 * String purchaseUpdateProcess = entity.getPurchaseUpdateProcess();
 * Integer versionNo = entity.getVersionNo();
 * entity.setPurchaseId(purchaseId);
 * entity.setMemberId(memberId);
 * entity.setProductId(productId);
 * entity.setPurchaseDatetime(purchaseDatetime);
 * entity.setPurchaseCount(purchaseCount);
 * entity.setPurchasePrice(purchasePrice);
 * entity.setPaymentCompleteFlg(paymentCompleteFlg);
 * entity.setPurchaseRegisterDatetime(purchaseRegisterDatetime);
 * entity.setPurchaseRegisterUser(purchaseRegisterUser);
 * entity.setPurchaseRegisterProcess(purchaseRegisterProcess);
 * entity.setPurchaseUpdateDatetime(purchaseUpdateDatetime);
 * entity.setPurchaseUpdateUser(purchaseUpdateUser);
 * entity.setPurchaseUpdateProcess(purchaseUpdateProcess);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchase extends AbstractEntity implements DomainEntity, MaEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} */
    protected Integer _purchaseId;

    /** MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} */
    protected Integer _memberId;

    /** PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT} */
    protected Integer _productId;

    /** PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.time.LocalDateTime _purchaseDatetime;

    /** PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _purchaseCount;

    /** PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _purchasePrice;

    /** PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} */
    protected Integer _paymentCompleteFlg;

    /** PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.time.LocalDateTime _purchaseRegisterDatetime;

    /** PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _purchaseRegisterUser;

    /** PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _purchaseRegisterProcess;

    /** PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.time.LocalDateTime _purchaseUpdateDatetime;

    /** PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _purchaseUpdateUser;

    /** PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _purchaseUpdateProcess;

    /** VERSION_NO: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return MaDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "PURCHASE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_purchaseId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of paymentCompleteFlg as the classification of Flg. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public MaCDef.Flg getPaymentCompleteFlgAsFlg() {
        return MaCDef.Flg.of(getPaymentCompleteFlg()).orElse(null);
    }

    /**
     * Set the value of paymentCompleteFlg as the classification of Flg. <br>
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPaymentCompleteFlgAsFlg(MaCDef.Flg cdef) {
        setPaymentCompleteFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentCompleteFlg as True (1). <br>
     * Yes: means valid
     */
    public void setPaymentCompleteFlg_True() {
        setPaymentCompleteFlgAsFlg(MaCDef.Flg.True);
    }

    /**
     * Set the value of paymentCompleteFlg as False (0). <br>
     * No: means invalid
     */
    public void setPaymentCompleteFlg_False() {
        setPaymentCompleteFlgAsFlg(MaCDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentCompleteFlg True? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgTrue() {
        MaCDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(MaCDef.Flg.True) : false;
    }

    /**
     * Is the value of paymentCompleteFlg False? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgFalse() {
        MaCDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(MaCDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'paymentCompleteFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPaymentCompleteFlgName() {
        MaCDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'paymentCompleteFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getPaymentCompleteFlgAlias() {
        MaCDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

    /** PRODUCT by my PRODUCT_ID, named 'product'. */
    protected OptionalEntity<Product> _product;

    /**
     * [get] PRODUCT by my PRODUCT_ID, named 'product'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'product'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Product> getProduct() {
        if (_product == null) { _product = OptionalEntity.relationEmpty(this, "product"); }
        return _product;
    }

    /**
     * [set] PRODUCT by my PRODUCT_ID, named 'product'.
     * @param product The entity of foreign property 'product'. (NullAllowed)
     */
    public void setProduct(OptionalEntity<Product> product) {
        _product = product;
    }

    /** SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'. */
    protected OptionalEntity<SummaryProduct> _summaryProduct;

    /**
     * [get] SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'summaryProduct'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<SummaryProduct> getSummaryProduct() {
        if (_summaryProduct == null) { _summaryProduct = OptionalEntity.relationEmpty(this, "summaryProduct"); }
        return _summaryProduct;
    }

    /**
     * [set] SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @param summaryProduct The entity of foreign property 'summaryProduct'. (NullAllowed)
     */
    public void setSummaryProduct(OptionalEntity<SummaryProduct> summaryProduct) {
        _summaryProduct = summaryProduct;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPurchase) {
            BsPurchase other = (BsPurchase)obj;
            if (!xSV(_purchaseId, other._purchaseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _purchaseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_product != null && _product.isPresent())
        { sb.append(li).append(xbRDS(_product, "product")); }
        if (_summaryProduct != null && _summaryProduct.isPresent())
        { sb.append(li).append(xbRDS(_summaryProduct, "summaryProduct")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchaseId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_purchaseDatetime));
        sb.append(dm).append(xfND(_purchaseCount));
        sb.append(dm).append(xfND(_purchasePrice));
        sb.append(dm).append(xfND(_paymentCompleteFlg));
        sb.append(dm).append(xfND(_purchaseRegisterDatetime));
        sb.append(dm).append(xfND(_purchaseRegisterUser));
        sb.append(dm).append(xfND(_purchaseRegisterProcess));
        sb.append(dm).append(xfND(_purchaseUpdateDatetime));
        sb.append(dm).append(xfND(_purchaseUpdateUser));
        sb.append(dm).append(xfND(_purchaseUpdateProcess));
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
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_product != null && _product.isPresent())
        { sb.append(dm).append("product"); }
        if (_summaryProduct != null && _summaryProduct.isPresent())
        { sb.append(dm).append("summaryProduct"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Purchase clone() {
        return (Purchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchaseId() {
        checkSpecifiedProperty("purchaseId");
        return _purchaseId;
    }

    /**
     * [set] PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} <br>
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Integer purchaseId) {
        registerModifiedProperty("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT} <br>
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getPurchaseDatetime() {
        checkSpecifiedProperty("purchaseDatetime");
        return _purchaseDatetime;
    }

    /**
     * [set] PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @param purchaseDatetime The value of the column 'PURCHASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseDatetime(java.time.LocalDateTime purchaseDatetime) {
        registerModifiedProperty("purchaseDatetime");
        _purchaseDatetime = purchaseDatetime;
    }

    /**
     * [get] PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchaseCount() {
        checkSpecifiedProperty("purchaseCount");
        return _purchaseCount;
    }

    /**
     * [set] PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)} <br>
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseCount(Integer purchaseCount) {
        registerModifiedProperty("purchaseCount");
        _purchaseCount = purchaseCount;
    }

    /**
     * [get] PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchasePrice() {
        checkSpecifiedProperty("purchasePrice");
        return _purchasePrice;
    }

    /**
     * [set] PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)} <br>
     * @param purchasePrice The value of the column 'PURCHASE_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePrice(Integer purchasePrice) {
        registerModifiedProperty("purchasePrice");
        _purchasePrice = purchasePrice;
    }

    /**
     * [get] PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPaymentCompleteFlg() {
        checkSpecifiedProperty("paymentCompleteFlg");
        return _paymentCompleteFlg;
    }

    /**
     * [set] PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setPaymentCompleteFlg(Integer paymentCompleteFlg) {
        checkClassificationCode("PAYMENT_COMPLETE_FLG", MaCDef.DefMeta.Flg, paymentCompleteFlg);
        registerModifiedProperty("paymentCompleteFlg");
        _paymentCompleteFlg = paymentCompleteFlg;
    }

    /**
     * [get] PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getPurchaseRegisterDatetime() {
        checkSpecifiedProperty("purchaseRegisterDatetime");
        return _purchaseRegisterDatetime;
    }

    /**
     * [set] PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @param purchaseRegisterDatetime The value of the column 'PURCHASE_REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseRegisterDatetime(java.time.LocalDateTime purchaseRegisterDatetime) {
        registerModifiedProperty("purchaseRegisterDatetime");
        _purchaseRegisterDatetime = purchaseRegisterDatetime;
    }

    /**
     * [get] PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseRegisterUser() {
        checkSpecifiedProperty("purchaseRegisterUser");
        return _purchaseRegisterUser;
    }

    /**
     * [set] PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * @param purchaseRegisterUser The value of the column 'PURCHASE_REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseRegisterUser(String purchaseRegisterUser) {
        registerModifiedProperty("purchaseRegisterUser");
        _purchaseRegisterUser = purchaseRegisterUser;
    }

    /**
     * [get] PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_REGISTER_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseRegisterProcess() {
        checkSpecifiedProperty("purchaseRegisterProcess");
        return _purchaseRegisterProcess;
    }

    /**
     * [set] PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * @param purchaseRegisterProcess The value of the column 'PURCHASE_REGISTER_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseRegisterProcess(String purchaseRegisterProcess) {
        registerModifiedProperty("purchaseRegisterProcess");
        _purchaseRegisterProcess = purchaseRegisterProcess;
    }

    /**
     * [get] PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getPurchaseUpdateDatetime() {
        checkSpecifiedProperty("purchaseUpdateDatetime");
        return _purchaseUpdateDatetime;
    }

    /**
     * [set] PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br>
     * @param purchaseUpdateDatetime The value of the column 'PURCHASE_UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseUpdateDatetime(java.time.LocalDateTime purchaseUpdateDatetime) {
        registerModifiedProperty("purchaseUpdateDatetime");
        _purchaseUpdateDatetime = purchaseUpdateDatetime;
    }

    /**
     * [get] PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseUpdateUser() {
        checkSpecifiedProperty("purchaseUpdateUser");
        return _purchaseUpdateUser;
    }

    /**
     * [set] PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br>
     * @param purchaseUpdateUser The value of the column 'PURCHASE_UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseUpdateUser(String purchaseUpdateUser) {
        registerModifiedProperty("purchaseUpdateUser");
        _purchaseUpdateUser = purchaseUpdateUser;
    }

    /**
     * [get] PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'PURCHASE_UPDATE_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseUpdateProcess() {
        checkSpecifiedProperty("purchaseUpdateProcess");
        return _purchaseUpdateProcess;
    }

    /**
     * [set] PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br>
     * @param purchaseUpdateProcess The value of the column 'PURCHASE_UPDATE_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseUpdateProcess(String purchaseUpdateProcess) {
        registerModifiedProperty("purchaseUpdateProcess");
        _purchaseUpdateProcess = purchaseUpdateProcess;
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

    /** {@inheritDoc} */
    public java.time.LocalDateTime getTableNameRegisterDatetime() {
        return getPurchaseRegisterDatetime();
    }

    /** {@inheritDoc} */
    public void setTableNameRegisterDatetime(java.time.LocalDateTime tableNameRegisterDatetime) {
        setPurchaseRegisterDatetime(tableNameRegisterDatetime);
    }

    /** {@inheritDoc} */
    public String getTableNameRegisterUser() {
        return getPurchaseRegisterUser();
    }

    /** {@inheritDoc} */
    public void setTableNameRegisterUser(String tableNameRegisterUser) {
        setPurchaseRegisterUser(tableNameRegisterUser);
    }

    /** {@inheritDoc} */
    public String getTableNameRegisterProcess() {
        return getPurchaseRegisterProcess();
    }

    /** {@inheritDoc} */
    public void setTableNameRegisterProcess(String tableNameRegisterProcess) {
        setPurchaseRegisterProcess(tableNameRegisterProcess);
    }

    /** {@inheritDoc} */
    public java.time.LocalDateTime getTableNameUpdateDatetime() {
        return getPurchaseUpdateDatetime();
    }

    /** {@inheritDoc} */
    public void setTableNameUpdateDatetime(java.time.LocalDateTime tableNameUpdateDatetime) {
        setPurchaseUpdateDatetime(tableNameUpdateDatetime);
    }

    /** {@inheritDoc} */
    public String getTableNameUpdateUser() {
        return getPurchaseUpdateUser();
    }

    /** {@inheritDoc} */
    public void setTableNameUpdateUser(String tableNameUpdateUser) {
        setPurchaseUpdateUser(tableNameUpdateUser);
    }

    /** {@inheritDoc} */
    public String getTableNameUpdateProcess() {
        return getPurchaseUpdateProcess();
    }

    /** {@inheritDoc} */
    public void setTableNameUpdateProcess(String tableNameUpdateProcess) {
        setPurchaseUpdateProcess(tableNameUpdateProcess);
    }

    /**
     * For framework so basically DON'T use this method.
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingPaymentCompleteFlg(Integer paymentCompleteFlg) {
        setPaymentCompleteFlg(paymentCompleteFlg);
    }
}
