package org.docksidestage.sqlite.dbflute.readonly.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.*;
import org.docksidestage.sqlite.dbflute.readonly.bsbhv.loader.*;
import org.docksidestage.sqlite.dbflute.readonly.exentity.*;
import org.docksidestage.sqlite.dbflute.readonly.bsentity.dbmeta.*;
import org.docksidestage.sqlite.dbflute.readonly.cbean.*;

/**
 * The behavior of MEMBER as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, MEMBER_REGISTER_DATETIME, MEMBER_REGISTER_USER, MEMBER_REGISTER_PROCESS, MEMBER_UPDATE_DATETIME, MEMBER_UPDATE_USER, MEMBER_UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_ADDRESS(AsValid), MEMBER_SECURITY(AsOne), MEMBER_WITHDRAWAL(AsOne)
 *
 * [referrer table]
 *     MEMBER_ADDRESS, MEMBER_LOGIN, MEMBER_SERVICE, PURCHASE, MEMBER_SECURITY, MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     memberStatus, memberAddressAsValid, memberSecurityAsOne, memberWithdrawalAsOne
 *
 * [referrer property]
 *     memberAddressList, memberLoginList, memberServiceList, purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class RoyBsMemberBhv extends AbstractBehaviorReadable<RoyMember, RoyMemberCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public RoyMemberDbm asDBMeta() { return RoyMemberDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "MEMBER"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public RoyMemberCB newConditionBean() { return new RoyMemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of RoyMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<RoyMemberCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * RoyMemberCB cb = <span style="color: #70226C">new</span> RoyMemberCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of RoyMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(RoyMemberCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">member</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">member</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of RoyMember. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<RoyMember> selectEntity(CBCall<RoyMemberCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * RoyMemberCB cb = <span style="color: #70226C">new</span> RoyMemberCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(member <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = member.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(member <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = member.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of RoyMember. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<RoyMember> selectEntity(RoyMemberCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<RoyMember> facadeSelectEntity(RoyMemberCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends RoyMember> OptionalEntity<ENTITY> doSelectOptionalEntity(RoyMemberCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * RoyMember <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">member</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of RoyMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public RoyMember selectEntityWithDeletedCheck(CBCall<RoyMemberCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * RoyMemberCB cb = <span style="color: #70226C">new</span> RoyMemberCB();
     * cb.query().set...;
     * RoyMember member = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = member.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of RoyMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public RoyMember selectEntityWithDeletedCheck(RoyMemberCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId : PK, ID, NotNull, INTEGER(2000000000, 10), FK to MEMBER_ADDRESS. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<RoyMember> selectByPK(Integer memberId) {
        return facadeSelectByPK(memberId);
    }

    protected OptionalEntity<RoyMember> facadeSelectByPK(Integer memberId) {
        return doSelectOptionalByPK(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends RoyMember> ENTITY doSelectByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberId), tp);
    }

    protected <ENTITY extends RoyMember> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberId, tp), memberId);
    }

    protected RoyMemberCB xprepareCBAsPK(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberAccount : UQ, NotNull, TEXT(2000000000, 10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<RoyMember> selectByUniqueOf(String memberAccount) {
        return facadeSelectByUniqueOf(memberAccount);
    }

    protected OptionalEntity<RoyMember> facadeSelectByUniqueOf(String memberAccount) {
        return doSelectByUniqueOf(memberAccount, typeOfSelectedEntity());
    }

    protected <ENTITY extends RoyMember> OptionalEntity<ENTITY> doSelectByUniqueOf(String memberAccount, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(memberAccount), tp), memberAccount);
    }

    protected RoyMemberCB xprepareCBAsUniqueOf(String memberAccount) {
        assertObjectNotNull("memberAccount", memberAccount);
        return newConditionBean().acceptUniqueOf(memberAccount);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;RoyMember&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (RoyMember <span style="color: #553000">member</span> : <span style="color: #553000">memberList</span>) {
     *     ... = <span style="color: #553000">member</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of RoyMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<RoyMember> selectList(CBCall<RoyMemberCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * RoyMemberCB cb = <span style="color: #70226C">new</span> RoyMemberCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;RoyMember&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (RoyMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.get...;
     * }
     * </pre>
     * @param cb The condition-bean of RoyMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<RoyMember> selectList(RoyMemberCB cb) {
        return facadeSelectList(cb);
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;RoyMember&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (RoyMember member : <span style="color: #553000">page</span>) {
     *     ... = member.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of RoyMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<RoyMember> selectPage(CBCall<RoyMemberCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * RoyMemberCB cb = <span style="color: #70226C">new</span> RoyMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;RoyMember&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (RoyMember member : <span style="color: #553000">page</span>) {
     *     ... = member.get...();
     * }
     * </pre>
     * @param cb The condition-bean of RoyMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<RoyMember> selectPage(RoyMemberCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of RoyMember. (NotNull)
     * @param entityLambda The handler of entity row of RoyMember. (NotNull)
     */
    public void selectCursor(CBCall<RoyMemberCB> cbLambda, EntityRowHandler<RoyMember> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * RoyMemberCB cb = <span style="color: #70226C">new</span> RoyMemberCB();
     * cb.query().set...
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of RoyMember. (NotNull)
     * @param entityRowHandler The handler of entity row of RoyMember. (NotNull)
     */
    public void selectCursor(RoyMemberCB cb, EntityRowHandler<RoyMember> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<RoyMemberCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param memberList The entity list of member. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<RoyMember> memberList, ReferrerLoaderHandler<RoyLoaderOfMember> loaderLambda) {
        xassLRArg(memberList, loaderLambda);
        loaderLambda.handle(new RoyLoaderOfMember().ready(memberList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param member The entity of member. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(RoyMember member, ReferrerLoaderHandler<RoyLoaderOfMember> loaderLambda) {
        xassLRArg(member, loaderLambda);
        loaderLambda.handle(new RoyLoaderOfMember().ready(xnewLRAryLs(member), _behaviorSelector));
    }

    /**
     * Load referrer of memberAddressList by the set-upper of referrer. <br>
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberAddress</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">addressCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">addressCB</span>.setupSelect...
     *     <span style="color: #553000">addressCB</span>.query().set...
     *     <span style="color: #553000">addressCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (RoyMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberAddressList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<RoyMemberAddress> loadMemberAddress(List<RoyMember> memberList, ReferrerConditionSetupper<RoyMemberAddressCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberAddress(memberList, new LoadReferrerOption<RoyMemberAddressCB, RoyMemberAddress>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberAddressList by the set-upper of referrer. <br>
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberAddress</span>(<span style="color: #553000">member</span>, <span style="color: #553000">addressCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">addressCB</span>.setupSelect...
     *     <span style="color: #553000">addressCB</span>.query().set...
     *     <span style="color: #553000">addressCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberAddressList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<RoyMemberAddress> loadMemberAddress(RoyMember member, ReferrerConditionSetupper<RoyMemberAddressCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberAddress(xnewLRLs(member), new LoadReferrerOption<RoyMemberAddressCB, RoyMemberAddress>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<RoyMemberAddress> doLoadMemberAddress(List<RoyMember> memberList, LoadReferrerOption<RoyMemberAddressCB, RoyMemberAddress> option) {
        return helpLoadReferrerInternally(memberList, option, "memberAddressList");
    }

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberLogin</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (RoyMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<RoyMemberLogin> loadMemberLogin(List<RoyMember> memberList, ReferrerConditionSetupper<RoyMemberLoginCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberLogin(memberList, new LoadReferrerOption<RoyMemberLoginCB, RoyMemberLogin>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberLogin</span>(<span style="color: #553000">member</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<RoyMemberLogin> loadMemberLogin(RoyMember member, ReferrerConditionSetupper<RoyMemberLoginCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberLogin(xnewLRLs(member), new LoadReferrerOption<RoyMemberLoginCB, RoyMemberLogin>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<RoyMemberLogin> doLoadMemberLogin(List<RoyMember> memberList, LoadReferrerOption<RoyMemberLoginCB, RoyMemberLogin> option) {
        return helpLoadReferrerInternally(memberList, option, "memberLoginList");
    }

    /**
     * Load referrer of memberServiceList by the set-upper of referrer. <br>
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberService</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">serviceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">serviceCB</span>.setupSelect...
     *     <span style="color: #553000">serviceCB</span>.query().set...
     *     <span style="color: #553000">serviceCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (RoyMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberServiceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<RoyMemberService> loadMemberService(List<RoyMember> memberList, ReferrerConditionSetupper<RoyMemberServiceCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberService(memberList, new LoadReferrerOption<RoyMemberServiceCB, RoyMemberService>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberServiceList by the set-upper of referrer. <br>
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberService</span>(<span style="color: #553000">member</span>, <span style="color: #553000">serviceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">serviceCB</span>.setupSelect...
     *     <span style="color: #553000">serviceCB</span>.query().set...
     *     <span style="color: #553000">serviceCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberServiceList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<RoyMemberService> loadMemberService(RoyMember member, ReferrerConditionSetupper<RoyMemberServiceCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberService(xnewLRLs(member), new LoadReferrerOption<RoyMemberServiceCB, RoyMemberService>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<RoyMemberService> doLoadMemberService(List<RoyMember> memberList, LoadReferrerOption<RoyMemberServiceCB, RoyMemberService> option) {
        return helpLoadReferrerInternally(memberList, option, "memberServiceList");
    }

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br>
     * PURCHASE by MEMBER_ID, named 'purchaseList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.setupSelect...
     *     <span style="color: #553000">purchaseCB</span>.query().set...
     *     <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (RoyMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<RoyPurchase> loadPurchase(List<RoyMember> memberList, ReferrerConditionSetupper<RoyPurchaseCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadPurchase(memberList, new LoadReferrerOption<RoyPurchaseCB, RoyPurchase>().xinit(refCBLambda));
    }

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br>
     * PURCHASE by MEMBER_ID, named 'purchaseList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">member</span>, <span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.setupSelect...
     *     <span style="color: #553000">purchaseCB</span>.query().set...
     *     <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<RoyPurchase> loadPurchase(RoyMember member, ReferrerConditionSetupper<RoyPurchaseCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadPurchase(xnewLRLs(member), new LoadReferrerOption<RoyPurchaseCB, RoyPurchase>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<RoyPurchase> doLoadPurchase(List<RoyMember> memberList, LoadReferrerOption<RoyPurchaseCB, RoyPurchase> option) {
        return helpLoadReferrerInternally(memberList, option, "purchaseList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'RoyMemberStatus'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<RoyMemberStatus> pulloutMemberStatus(List<RoyMember> memberList)
    { return helpPulloutInternally(memberList, "memberStatus"); }

    /**
     * Pull out the list of foreign table 'RoyMemberAddress'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<RoyMemberAddress> pulloutMemberAddressAsValid(List<RoyMember> memberList)
    { return helpPulloutInternally(memberList, "memberAddressAsValid"); }

    /**
     * Pull out the list of referrer-as-one table 'RoyMemberSecurity'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<RoyMemberSecurity> pulloutMemberSecurityAsOne(List<RoyMember> memberList)
    { return helpPulloutInternally(memberList, "memberSecurityAsOne"); }

    /**
     * Pull out the list of referrer-as-one table 'RoyMemberWithdrawal'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<RoyMemberWithdrawal> pulloutMemberWithdrawalAsOne(List<RoyMember> memberList)
    { return helpPulloutInternally(memberList, "memberWithdrawalAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<RoyMember> memberList)
    { return helpExtractListInternally(memberList, "memberId"); }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<RoyMember> memberList)
    { return helpExtractListInternally(memberList, "memberAccount"); }


    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * memberBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * memberBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * memberBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * memberBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * memberBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * memberBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * memberBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * memberBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * memberBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * memberBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * memberBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * memberBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * memberBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * memberBhv.outideSql().removeBlockComment().selectList()
     * memberBhv.outideSql().removeLineComment().selectList()
     * memberBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<RoyMemberBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    @Override
    protected boolean hasUpdateDateValue(Entity et) { return downcast(et).getMemberUpdateDatetime() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends RoyMember> typeOfSelectedEntity() { return RoyMember.class; }
    protected Class<RoyMember> typeOfHandlingEntity() { return RoyMember.class; }
    protected Class<RoyMemberCB> typeOfHandlingConditionBean() { return RoyMemberCB.class; }
}
