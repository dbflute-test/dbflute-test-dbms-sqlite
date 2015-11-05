package org.docksidestage.sqlite.dbflute.readonly.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyDBMetaInstanceHandler;
import org.docksidestage.sqlite.dbflute.readonly.allcommon.RoyCDef;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;

/**
 * The entity of SERVICE_RANK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SERVICE_RANK_CODE
 * 
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     
 * 
 * [referrer table]
 *     MEMBER_SERVICE
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberServiceList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String serviceRankCode = entity.getServiceRankCode();
 * String serviceRankName = entity.getServiceRankName();
 * String servicePointIncidence = entity.getServicePointIncidence();
 * Integer newAcceptableFlg = entity.getNewAcceptableFlg();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setServiceRankCode(serviceRankCode);
 * entity.setServiceRankName(serviceRankName);
 * entity.setServicePointIncidence(servicePointIncidence);
 * entity.setNewAcceptableFlg(newAcceptableFlg);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class RoyBsServiceRank extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SERVICE_RANK_CODE: {PK, NotNull, TEXT(2000000000, 10)} */
    protected String _serviceRankCode;

    /** SERVICE_RANK_NAME: {NotNull, TEXT(2000000000, 10)} */
    protected String _serviceRankName;

    /** SERVICE_POINT_INCIDENCE: {NotNull, REAL(2000000000, 10)} */
    protected String _servicePointIncidence;

    /** NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} */
    protected Integer _newAcceptableFlg;

    /** DESCRIPTION: {NotNull, TEXT(2000000000, 10)} */
    protected String _description;

    /** DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _displayOrder;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return RoyDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SERVICE_RANK";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_serviceRankCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of newAcceptableFlg as the classification of Flg. <br>
     * NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public RoyCDef.Flg getNewAcceptableFlgAsFlg() {
        return RoyCDef.Flg.codeOf(getNewAcceptableFlg());
    }

    /**
     * Set the value of newAcceptableFlg as the classification of Flg. <br>
     * NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setNewAcceptableFlgAsFlg(RoyCDef.Flg cdef) {
        setNewAcceptableFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of newAcceptableFlg as True (1). <br>
     * Yes: means valid
     */
    public void setNewAcceptableFlg_True() {
        setNewAcceptableFlgAsFlg(RoyCDef.Flg.True);
    }

    /**
     * Set the value of newAcceptableFlg as False (0). <br>
     * No: means invalid
     */
    public void setNewAcceptableFlg_False() {
        setNewAcceptableFlgAsFlg(RoyCDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of newAcceptableFlg True? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNewAcceptableFlgTrue() {
        RoyCDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.equals(RoyCDef.Flg.True) : false;
    }

    /**
     * Is the value of newAcceptableFlg False? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNewAcceptableFlgFalse() {
        RoyCDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.equals(RoyCDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'newAcceptableFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getNewAcceptableFlgName() {
        RoyCDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'newAcceptableFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getNewAcceptableFlgAlias() {
        RoyCDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'. */
    protected List<RoyMemberService> _memberServiceList;

    /**
     * [get] MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * @return The entity list of referrer property 'memberServiceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RoyMemberService> getMemberServiceList() {
        if (_memberServiceList == null) { _memberServiceList = newReferrerList(); }
        return _memberServiceList;
    }

    /**
     * [set] MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * @param memberServiceList The entity list of referrer property 'memberServiceList'. (NullAllowed)
     */
    public void setMemberServiceList(List<RoyMemberService> memberServiceList) {
        _memberServiceList = memberServiceList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof RoyBsServiceRank) {
            RoyBsServiceRank other = (RoyBsServiceRank)obj;
            if (!xSV(_serviceRankCode, other._serviceRankCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _serviceRankCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberServiceList != null) { for (RoyMemberService et : _memberServiceList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberServiceList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_serviceRankCode));
        sb.append(dm).append(xfND(_serviceRankName));
        sb.append(dm).append(xfND(_servicePointIncidence));
        sb.append(dm).append(xfND(_newAcceptableFlg));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_displayOrder));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberServiceList != null && !_memberServiceList.isEmpty())
        { sb.append(dm).append("memberServiceList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public RoyServiceRank clone() {
        return (RoyServiceRank)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SERVICE_RANK_CODE: {PK, NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getServiceRankCode() {
        checkSpecifiedProperty("serviceRankCode");
        return _serviceRankCode;
    }

    /**
     * [set] SERVICE_RANK_CODE: {PK, NotNull, TEXT(2000000000, 10)} <br>
     * @param serviceRankCode The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setServiceRankCode(String serviceRankCode) {
        registerModifiedProperty("serviceRankCode");
        _serviceRankCode = serviceRankCode;
    }

    /**
     * [get] SERVICE_RANK_NAME: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'SERVICE_RANK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getServiceRankName() {
        checkSpecifiedProperty("serviceRankName");
        return _serviceRankName;
    }

    /**
     * [set] SERVICE_RANK_NAME: {NotNull, TEXT(2000000000, 10)} <br>
     * @param serviceRankName The value of the column 'SERVICE_RANK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setServiceRankName(String serviceRankName) {
        registerModifiedProperty("serviceRankName");
        _serviceRankName = serviceRankName;
    }

    /**
     * [get] SERVICE_POINT_INCIDENCE: {NotNull, REAL(2000000000, 10)} <br>
     * @return The value of the column 'SERVICE_POINT_INCIDENCE'. (basically NotNull if selected: for the constraint)
     */
    public String getServicePointIncidence() {
        checkSpecifiedProperty("servicePointIncidence");
        return _servicePointIncidence;
    }

    /**
     * [set] SERVICE_POINT_INCIDENCE: {NotNull, REAL(2000000000, 10)} <br>
     * @param servicePointIncidence The value of the column 'SERVICE_POINT_INCIDENCE'. (basically NotNull if update: for the constraint)
     */
    public void setServicePointIncidence(String servicePointIncidence) {
        registerModifiedProperty("servicePointIncidence");
        _servicePointIncidence = servicePointIncidence;
    }

    /**
     * [get] NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * @return The value of the column 'NEW_ACCEPTABLE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNewAcceptableFlg() {
        checkSpecifiedProperty("newAcceptableFlg");
        return _newAcceptableFlg;
    }

    /**
     * [set] NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br>
     * @param newAcceptableFlg The value of the column 'NEW_ACCEPTABLE_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setNewAcceptableFlg(Integer newAcceptableFlg) {
        checkClassificationCode("NEW_ACCEPTABLE_FLG", RoyCDef.DefMeta.Flg, newAcceptableFlg);
        registerModifiedProperty("newAcceptableFlg");
        _newAcceptableFlg = newAcceptableFlg;
    }

    /**
     * [get] DESCRIPTION: {NotNull, TEXT(2000000000, 10)} <br>
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] DESCRIPTION: {NotNull, TEXT(2000000000, 10)} <br>
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)} <br>
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {NotNull, INTEGER(2000000000, 10)} <br>
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param newAcceptableFlg The value of the column 'NEW_ACCEPTABLE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingNewAcceptableFlg(Integer newAcceptableFlg) {
        setNewAcceptableFlg(newAcceptableFlg);
    }
}
