package org.docksidestage.sqlite.dbflute.whitebox.dfprop;

import java.util.List;

import org.dbflute.dbmeta.info.ColumnInfo;
import org.docksidestage.sqlite.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.sqlite.dbflute.bsentity.dbmeta.PurchaseDbm;
import org.docksidestage.sqlite.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.9 (2010/05/12 Wednesday)
 */
public class WxCommonColumnConversionTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    //private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_CommonColumn_DBMeta() {
        // ## Arrange ##
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        List<ColumnInfo> commonColumnList = dbm.getCommonColumnInfoList();
        List<ColumnInfo> beforeInsertList = dbm.getCommonColumnInfoBeforeInsertList();
        List<ColumnInfo> beforeUpdateList = dbm.getCommonColumnInfoBeforeUpdateList();

        // ## Assert ##
        assertNotSame(0, commonColumnList.size());
        assertEquals(dbm.columnMemberRegisterDatetime(), commonColumnList.get(0));
        assertEquals(dbm.columnMemberRegisterUser(), commonColumnList.get(1));
        assertEquals(dbm.columnMemberRegisterProcess(), commonColumnList.get(2));
        assertEquals(dbm.columnMemberUpdateDatetime(), commonColumnList.get(3));
        assertEquals(dbm.columnMemberUpdateUser(), commonColumnList.get(4));
        assertEquals(dbm.columnMemberUpdateProcess(), commonColumnList.get(5));
        assertEquals(PurchaseDbm.getInstance().getCommonColumnInfoList().size(), commonColumnList.size());
        assertNotSame(0, beforeInsertList.size());
        assertNotSame(0, beforeUpdateList.size());
        assertTrue(beforeInsertList.size() > beforeUpdateList.size());
    }
}
