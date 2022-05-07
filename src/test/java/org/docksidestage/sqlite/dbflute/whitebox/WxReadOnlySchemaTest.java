package org.docksidestage.sqlite.dbflute.whitebox;

import org.dbflute.bhv.BehaviorWritable;
import org.docksidestage.sqlite.dbflute.exbhv.MemberBhv;
import org.docksidestage.sqlite.dbflute.readonly.exbhv.RoyMemberBhv;
import org.docksidestage.sqlite.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxReadOnlySchemaTest extends UnitContainerTestCase {

    public void test_readonly_behavior() throws Exception {
        assertTrue(BehaviorWritable.class.isAssignableFrom(MemberBhv.class));
        assertFalse(BehaviorWritable.class.isAssignableFrom(RoyMemberBhv.class));
    }
}
