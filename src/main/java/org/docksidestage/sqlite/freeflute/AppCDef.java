package org.docksidestage.sqlite.freeflute;

import java.util.*;

import static org.docksidestage.sqlite.freeflute.AppCDef.XInternalCDefUtil.emptyStrings;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface AppCDef {

    /**
     * Get the code of the classification.
     * @return The code of the classification. (NotNull)
     */
    String code();

    /**
     * Get the name, means identity name, of the classification.
     * @return The name of the classification. (NotNull)
     */
    String name();

    /**
     * Get the alias, means display name, of the classification.
     * @return The code of the classification. (NullAllowed: when an alias is not specified in its setting)
     */
    String alias();

    /**
     * Get the set of sisters (alternate codes) for the classification.
     * @return The read-only set of sister code for the classification. (NotNull, EmptyAllowed)
     */
    Set<String> sisterSet();

    /**
     * Is the classification in the group?
     * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns false)
     * @return The determination, true or false. (true: this classification is in the group)
     */
    boolean inGroup(String groupName);

    /**
     * Get the map of sub items that are your original attributes.
     * @return The read-only map of sub-items. (NotNull, EmptyAllowed)
     */
    Map<String, Object> subItemMap();

    /**
     * Get the meta of the classification.
     * @return The meta of the classification. (NotNull)
     */
    DefMeta meta();

    class XInternalCDefUtil {
        private static String[] EMPTY_SISTERS = new String[]{};
        public static String[] emptyStrings() { return EMPTY_SISTERS; }
    }

    class ClassificationNotFoundException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public ClassificationNotFoundException(String msg) {
            super(msg);
        }
    }

    public enum MemberStatus implements AppCDef {
        /** Provisional Member */
        ProvisionalMember("PRV", "Provisional Member", emptyStrings())
        ,
        /** Formalized Member */
        FormalizedMember("FML", "Formalized Member", emptyStrings())
        ,
        /** Withdrawal Member */
        WithdrawalMember("WDL", "Withdrawal Member", emptyStrings())
        ;
        private static final Map<String, MemberStatus> _codeClsMap = new HashMap<String, MemberStatus>();
        private static final Map<String, MemberStatus> _nameClsMap = new HashMap<String, MemberStatus>();
        static {
            for (MemberStatus value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private MemberStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return AppCDef.DefMeta.MemberStatus; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<MemberStatus> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof MemberStatus) { return Optional.of((MemberStatus)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<MemberStatus> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof MemberStatus) { return (MemberStatus)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<MemberStatus> listAll() {
            return new ArrayList<MemberStatus>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<MemberStatus> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: MemberStatus." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<MemberStatus> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<MemberStatus> clsList = new ArrayList<MemberStatus>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<MemberStatus> groupOf(String groupName) {
            return new ArrayList<MemberStatus>(4);
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta {
        MemberStatus
        ;
        public String classificationName() {
            return name(); // same as definition name
        }

        public AppCDef codeOf(Object code) { // null if not found, old style so use of(code)
            if (MemberStatus.name().equals(name())) { return AppCDef.MemberStatus.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public AppCDef nameOf(String name) { // null if not found, old style so use byName(name)
            if (MemberStatus.name().equals(name())) { return AppCDef.MemberStatus.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<AppCDef> listAll() {
            if (MemberStatus.name().equals(name())) { return toClsList(AppCDef.MemberStatus.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<AppCDef> listByGroup(String groupName) { // exception if not found
            if (MemberStatus.name().equals(name())) { return toClsList(AppCDef.MemberStatus.listByGroup(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<AppCDef> listOf(Collection<String> codeList) {
            if (MemberStatus.name().equals(name())) { return toClsList(AppCDef.MemberStatus.listOf(codeList)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<AppCDef> groupOf(String groupName) { // old style
            if (MemberStatus.name().equals(name())) { return toClsList(AppCDef.MemberStatus.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<AppCDef> toClsList(List<?> clsList) {
            return (List<AppCDef>)clsList;
        }

        public static Optional<AppCDef.DefMeta> find(String classificationName) { // instead of valueOf()
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            if (MemberStatus.name().equalsIgnoreCase(classificationName)) { return Optional.of(AppCDef.DefMeta.MemberStatus); }
            return Optional.empty();
        }

        public static AppCDef.DefMeta meta(String classificationName) { // old style so use find(name)
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            if (MemberStatus.name().equalsIgnoreCase(classificationName)) { return AppCDef.DefMeta.MemberStatus; }
            throw new IllegalStateException("Unknown classification: " + classificationName);
        }

        @SuppressWarnings("unused")
        private String[] xinternalEmptyString() {
            return emptyStrings(); // to suppress 'unused' warning of import statement
        }
    }
}
