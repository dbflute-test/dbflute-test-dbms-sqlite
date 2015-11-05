package org.docksidestage.sqlite.dbflute.readonly.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.sqlite.dbflute.readonly.cbean.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.bs.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.cq.*;

/**
 * The condition-query for in-line of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class RoyProductCIQ extends RoyAbstractBsProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyBsProductCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyProductCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, RoyBsProductCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_ExistsReferrer_PurchaseList(RoyPurchaseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_PurchaseList(RoyPurchaseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_PurchaseList(RoyPurchaseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_PurchaseList(RoyPurchaseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_PurchaseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueProductName() { return _myCQ.xdfgetProductName(); }
    protected ConditionValue xgetCValueProductHandleCode() { return _myCQ.xdfgetProductHandleCode(); }
    protected ConditionValue xgetCValueProductCategoryCode() { return _myCQ.xdfgetProductCategoryCode(); }
    protected ConditionValue xgetCValueProductStatusCode() { return _myCQ.xdfgetProductStatusCode(); }
    protected ConditionValue xgetCValueRegularPrice() { return _myCQ.xdfgetRegularPrice(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueRegisterProcess() { return _myCQ.xdfgetRegisterProcess(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected ConditionValue xgetCValueUpdateProcess() { return _myCQ.xdfgetUpdateProcess(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(RoyProductCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(RoyProductCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(RoyProductCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(RoyProductCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return RoyProductCB.class.getName(); }
    protected String xinCQ() { return RoyProductCQ.class.getName(); }
}
