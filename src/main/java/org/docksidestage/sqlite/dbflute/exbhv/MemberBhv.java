package org.docksidestage.sqlite.dbflute.exbhv;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import org.dbflute.Entity;
import org.docksidestage.sqlite.dbflute.bsbhv.BsMemberBhv;
import org.docksidestage.sqlite.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import org.docksidestage.sqlite.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import org.docksidestage.sqlite.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The behavior of MEMBER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberBhv extends BsMemberBhv {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger _log = LoggerFactory.getLogger(MemberBhv.class);

    protected boolean zeroUpdateExistenceMocked;

    // ===================================================================================
    //                                                                          CSV Output
    //                                                                          ==========
    public void makeCsvPurchaseSummaryMember(PurchaseSummaryMemberPmb pmb) {
        outsideSql().selectCursor(pmb, new PurchaseSummaryMemberCursorHandler() {
            public Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                while (cursor.next()) {
                    final Integer memberId = cursor.getMemberId();
                    final String memberName = cursor.getMemberName();
                    final LocalDate birthdate = cursor.getBirthdate();
                    final LocalDateTime formalizedDatetime = cursor.getFormalizedDatetime();
                    final Long purchaseSummary = cursor.getPurchaseSummary();

                    // logging only here because of example
                    final String c = ", ";
                    StringBuilder sb = new StringBuilder();
                    sb.append(memberId).append(c).append(memberName).append(c);
                    sb.append(birthdate).append(c).append(formalizedDatetime).append(c);
                    sb.append(purchaseSummary);
                    _log.debug(sb.toString());
                }
                return null;
            }
        });
    }

    // ===================================================================================
    //                                                                               Mock
    //                                                                              ======
    @Override
    protected int countZeroUpdateExistence(Entity entity, boolean hasPK, Set<String> uniqueProps) {
        if (zeroUpdateExistenceMocked) {
            return 1;
        }
        return super.countZeroUpdateExistence(entity, hasPK, uniqueProps);
    }

    public void mockZeroUpdateExistence() {
        zeroUpdateExistenceMocked = true;
    }

    public void restoreZeroUpdateExistence() {
        zeroUpdateExistenceMocked = false;
    }
}
