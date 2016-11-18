package org.docksidestage.sqlite.dbflute.readonly.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyDBMetaInstanceHandler;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The entity of SUMMARY_PRODUCT as VIEW. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PRODUCT_STATUS
 *
 * [referrer table]
 *     PURCHASE
 *
 * [foreign property]
 *     productStatus
 *
 * [referrer property]
 *     purchaseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer productId = entity.getProductId();
 * String productName = entity.getProductName();
 * String productStatusCode = entity.getProductStatusCode();
 * String latestPurchaseDatetime = entity.getLatestPurchaseDatetime();
 * entity.setProductId(productId);
 * entity.setProductName(productName);
 * entity.setProductStatusCode(productStatusCode);
 * entity.setLatestPurchaseDatetime(latestPurchaseDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class RoyBsSummaryProduct extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_ID: {PK, INTEGER(2000000000, 10)} */
    protected Integer _productId;

    /** PRODUCT_NAME: {TEXT(2000000000, 10)} */
    protected String _productName;

    /** PRODUCT_STATUS_CODE: {TEXT(2000000000, 10), FK to PRODUCT_STATUS} */
    protected String _productStatusCode;

    /** LATEST_PURCHASE_DATETIME: {UnknownType(2000000000, 10)} */
    protected String _latestPurchaseDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return RoyDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SUMMARY_PRODUCT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_productId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'. */
    protected OptionalEntity<RoyProductStatus> _productStatus;

    /**
     * [get] PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'productStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<RoyProductStatus> getProductStatus() {
        if (_productStatus == null) { _productStatus = OptionalEntity.relationEmpty(this, "productStatus"); }
        return _productStatus;
    }

    /**
     * [set] PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @param productStatus The entity of foreign property 'productStatus'. (NullAllowed)
     */
    public void setProductStatus(OptionalEntity<RoyProductStatus> productStatus) {
        _productStatus = productStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PURCHASE by PRODUCT_ID, named 'purchaseList'. */
    protected List<RoyPurchase> _purchaseList;

    /**
     * [get] PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RoyPurchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<RoyPurchase> purchaseList) {
        _purchaseList = purchaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof RoyBsSummaryProduct) {
            RoyBsSummaryProduct other = (RoyBsSummaryProduct)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_productStatus != null && _productStatus.isPresent())
        { sb.append(li).append(xbRDS(_productStatus, "productStatus")); }
        if (_purchaseList != null) { for (RoyPurchase et : _purchaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productName));
        sb.append(dm).append(xfND(_productStatusCode));
        sb.append(dm).append(xfND(_latestPurchaseDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_productStatus != null && _productStatus.isPresent())
        { sb.append(dm).append("productStatus"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(dm).append("purchaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public RoySummaryProduct clone() {
        return (RoySummaryProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, INTEGER(2000000000, 10)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, INTEGER(2000000000, 10)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_NAME: {TEXT(2000000000, 10)} <br>
     * @return The value of the column 'PRODUCT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return _productName;
    }

    /**
     * [set] PRODUCT_NAME: {TEXT(2000000000, 10)} <br>
     * @param productName The value of the column 'PRODUCT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }

    /**
     * [get] PRODUCT_STATUS_CODE: {TEXT(2000000000, 10), FK to PRODUCT_STATUS} <br>
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {TEXT(2000000000, 10), FK to PRODUCT_STATUS} <br>
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductStatusCode(String productStatusCode) {
        registerModifiedProperty("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {UnknownType(2000000000, 10)} <br>
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getLatestPurchaseDatetime() {
        checkSpecifiedProperty("latestPurchaseDatetime");
        return _latestPurchaseDatetime;
    }

    /**
     * [set] LATEST_PURCHASE_DATETIME: {UnknownType(2000000000, 10)} <br>
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLatestPurchaseDatetime(String latestPurchaseDatetime) {
        registerModifiedProperty("latestPurchaseDatetime");
        _latestPurchaseDatetime = latestPurchaseDatetime;
    }
}
