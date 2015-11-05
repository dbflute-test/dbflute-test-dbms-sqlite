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
 * The condition-query for in-line of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public class RoyPurchaseCIQ extends RoyAbstractBsPurchaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyBsPurchaseCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyPurchaseCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, RoyBsPurchaseCQ myCQ) {
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
    protected ConditionValue xgetCValuePurchaseId() { return _myCQ.xdfgetPurchaseId(); }
    protected ConditionValue xgetCValueMemberId() { return _myCQ.xdfgetMemberId(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValuePurchaseDatetime() { return _myCQ.xdfgetPurchaseDatetime(); }
    protected ConditionValue xgetCValuePurchaseCount() { return _myCQ.xdfgetPurchaseCount(); }
    protected ConditionValue xgetCValuePurchasePrice() { return _myCQ.xdfgetPurchasePrice(); }
    protected ConditionValue xgetCValuePaymentCompleteFlg() { return _myCQ.xdfgetPaymentCompleteFlg(); }
    protected ConditionValue xgetCValuePurchaseRegisterDatetime() { return _myCQ.xdfgetPurchaseRegisterDatetime(); }
    protected ConditionValue xgetCValuePurchaseRegisterUser() { return _myCQ.xdfgetPurchaseRegisterUser(); }
    protected ConditionValue xgetCValuePurchaseRegisterProcess() { return _myCQ.xdfgetPurchaseRegisterProcess(); }
    protected ConditionValue xgetCValuePurchaseUpdateDatetime() { return _myCQ.xdfgetPurchaseUpdateDatetime(); }
    protected ConditionValue xgetCValuePurchaseUpdateUser() { return _myCQ.xdfgetPurchaseUpdateUser(); }
    protected ConditionValue xgetCValuePurchaseUpdateProcess() { return _myCQ.xdfgetPurchaseUpdateProcess(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(RoyPurchaseCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(RoyPurchaseCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(RoyPurchaseCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(RoyPurchaseCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return RoyPurchaseCB.class.getName(); }
    protected String xinCQ() { return RoyPurchaseCQ.class.getName(); }
}
