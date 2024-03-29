package org.docksidestage.sqlite;

import java.io.File;
import java.io.IOException;

import org.dbflute.util.DfReflectionUtil;
import org.dbflute.util.DfResourceUtil;

/**
 * The bean for resolving a path to a database of SQLite. <br />
 * This is NOT an important class as example. So you don't need to read this.
 * @author jflute
 */
public class EmbeddedSQLiteUrlFactoryBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private String urlSuffix;
    private String referenceClassName;

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    public Object getObject() throws Exception {
        return getUrl();
    }

    public Class<?> getObjectType() {
        return String.class;
    }

    public boolean isSingleton() {
        return true;
    }

    private String getUrl() {
        try {
            final File f = getBuildDir();
            final String canonicalPath = f.getCanonicalPath();
            final String url = "jdbc:sqlite:" + canonicalPath.replace('\\', '/') + urlSuffix;
            return url;
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    private File getBuildDir() {
        final Class<?> clazz = DfReflectionUtil.forName(referenceClassName);
        return DfResourceUtil.getBuildDir(clazz);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setReferenceClassName(final String referenceClassName) {
        this.referenceClassName = referenceClassName;
    }

    public void setUrlSuffix(final String urlSuffix) {
        this.urlSuffix = urlSuffix;
    }
}
