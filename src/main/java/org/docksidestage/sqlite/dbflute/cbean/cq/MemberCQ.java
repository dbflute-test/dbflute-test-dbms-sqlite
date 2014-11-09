package org.docksidestage.sqlite.dbflute.cbean.cq;

import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.docksidestage.sqlite.dbflute.cbean.PurchaseCB;
import org.docksidestage.sqlite.dbflute.cbean.cq.bs.BsMemberCQ;

/**
 * The condition-query of MEMBER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberCQ extends BsMemberCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param referrerQuery The instance of referrer query. (Nullable: If null, this is base query)
     * @param sqlClause The instance of SQL clause. (NotNull)
     * @param aliasName The alias name for this query. (NotNull)
     * @param nestLevel The nest level of this query. (If zero, this is base query)
     */
    public MemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                       Arrange Query
    //                                                                       =============
    // You can make your arranged query methods here.
    //public void arrangeXxx() {
    //    ...
    //}
    /**
     * Arrange the query for selecting service members.
     * o starts 'S'
     * o status 'Formalized'
     * o exists the special product
     */
    public void arrangeServiceMember() {
        final Integer specialProductId = 3;
        setMemberName_LikeSearch("S", op -> op.likePrefix());
        setMemberStatusCode_Equal_FormalizedMember();
        existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setProductId_Equal(specialProductId);
            }
        });
    }

    // ===================================================================================
    //                                                                        Empty String
    //                                                                        ============
    public void setMemberName_Equal_EmptyString() {
        doSetMemberName_Equal("");
    }
}
