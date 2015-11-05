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
 * The condition-query for in-line of SERVICE_RANK.
 * @author DBFlute(AutoGenerator)
 */
public class RoyServiceRankCIQ extends RoyAbstractBsServiceRankCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RoyBsServiceRankCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RoyServiceRankCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, RoyBsServiceRankCQ myCQ) {
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
    protected ConditionValue xgetCValueServiceRankCode() { return _myCQ.xdfgetServiceRankCode(); }
    public String keepServiceRankCode_ExistsReferrer_MemberServiceList(RoyMemberServiceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepServiceRankCode_NotExistsReferrer_MemberServiceList(RoyMemberServiceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(RoyMemberServiceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(RoyMemberServiceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueServiceRankName() { return _myCQ.xdfgetServiceRankName(); }
    protected ConditionValue xgetCValueServicePointIncidence() { return _myCQ.xdfgetServicePointIncidence(); }
    protected ConditionValue xgetCValueNewAcceptableFlg() { return _myCQ.xdfgetNewAcceptableFlg(); }
    protected ConditionValue xgetCValueDescription() { return _myCQ.xdfgetDescription(); }
    protected ConditionValue xgetCValueDisplayOrder() { return _myCQ.xdfgetDisplayOrder(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(RoyServiceRankCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(RoyServiceRankCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(RoyServiceRankCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(RoyServiceRankCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return RoyServiceRankCB.class.getName(); }
    protected String xinCQ() { return RoyServiceRankCQ.class.getName(); }
}
