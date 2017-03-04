package org.docksidestage.sqlite.dbflute.allcommon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.dbflute.Entity;
import org.dbflute.hook.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class MaImplementedCommonColumnAutoSetupper implements CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** The logger instance for this class. (NotNull) */
    private static final Logger _log = LoggerFactory.getLogger(MaImplementedCommonColumnAutoSetupper.class);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /** {@inheritDoc} */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        final MaEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "INSERT");
        }
        doHandleCommonColumnOfInsertIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfInsertIfNeeds(MaEntityDefinedCommonColumn entity) {
        final java.time.LocalDateTime tableNameRegisterDatetime = org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setTableNameRegisterDatetime(tableNameRegisterDatetime);
        final String tableNameRegisterUser = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setTableNameRegisterUser(tableNameRegisterUser);
        final String tableNameRegisterProcess = org.dbflute.hook.AccessContext.getAccessProcessOnThread();
        entity.setTableNameRegisterProcess(tableNameRegisterProcess);
        final java.time.LocalDateTime tableNameUpdateDatetime = entity.getTableNameRegisterDatetime();
        entity.setTableNameUpdateDatetime(tableNameUpdateDatetime);
        final String tableNameUpdateUser = entity.getTableNameRegisterUser();
        entity.setTableNameUpdateUser(tableNameUpdateUser);
        final String tableNameUpdateProcess = entity.getTableNameRegisterProcess();
        entity.setTableNameUpdateProcess(tableNameUpdateProcess);
    }

    /** {@inheritDoc} */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        final MaEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "UPDATE");
        }
        doHandleCommonColumnOfUpdateIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfUpdateIfNeeds(MaEntityDefinedCommonColumn entity) {
        final java.time.LocalDateTime tableNameUpdateDatetime = entity.getTableNameUpdateDatetime() != null ? entity.getTableNameUpdateDatetime() : org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setTableNameUpdateDatetime(tableNameUpdateDatetime);
        final String tableNameUpdateUser = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setTableNameUpdateUser(tableNameUpdateUser);
        final String tableNameUpdateProcess = org.dbflute.hook.AccessContext.getAccessProcessOnThread();
        entity.setTableNameUpdateProcess(tableNameUpdateProcess);
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected MaEntityDefinedCommonColumn askIfEntitySetup(Entity targetEntity) {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        return downcastEntity(targetEntity);
    }

    protected boolean hasCommonColumn(Entity targetEntity) {
        return targetEntity instanceof MaEntityDefinedCommonColumn;
    }

    protected MaEntityDefinedCommonColumn downcastEntity(Entity targetEntity) {
        return (MaEntityDefinedCommonColumn)targetEntity;
    }

    // =====================================================================================
    //                                                                               Logging
    //                                                                               =======
    protected boolean isInternalDebugEnabled() {
        return MaDBFluteConfig.getInstance().isInternalDebug() && _log.isDebugEnabled();
    }

    protected void logSettingUp(MaEntityDefinedCommonColumn entity, String keyword) {
        _log.debug("...Setting up column columns of " + entity.asTableDbName() + " before " + keyword);
    }
}
