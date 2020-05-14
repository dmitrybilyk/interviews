package com.learn.web.gwt.client.sap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

//import com.sap.sse.common.util.MappingIterable;
//import com.sap.sse.common.util.MappingIterator;
//import com.sap.sse.common.util.NaturalComparator;


public class Util {

    public static class Pair<A, B> implements Serializable {
        private static final long serialVersionUID = -7631774746419135931L;
    
        private A a;
    
        private B b;
    
        private transient int hashCode;
    
        // required for some serialization frameworks such as GWT RPC
        @Deprecated
        protected Pair() {
        }

        public Pair(A a, B b) {
            this.a = a;
            this.b = b;
            hashCode = 0;
        }

        public A getA() {
            return a;
        }

        public B getB() {
            return b;
        }

        @Override
        public int hashCode() {
            if (hashCode == 0) {
                hashCode = 17;
                hashCode = 37 * hashCode + (a != null ? a.hashCode() : 0);
                hashCode = 37 * hashCode + (b != null ? b.hashCode() : 0);
            }
            return hashCode;
        }

        @Override
        public boolean equals(Object obj) {
            boolean result;
            if (this == obj) {
                result = true;
            } else if (obj instanceof Pair<?, ?>) {
                Pair<?, ?> pair = (Pair<?, ?>) obj;
                result = (this.a != null && this.a.equals(pair.a) || this.a == null && pair.a == null)
                        && (this.b != null && this.b.equals(pair.b) || this.b == null && pair.b == null);
            } else {
                result = false;
            }
            return result;
        }

        @Override
        public String toString() {
            return "[" + (a == null ? "null" : a.toString()) + ", " + (b == null ? "null" : b.toString()) + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }
    }

    public static class Triple<A, B, C> implements Serializable {
        private static final long serialVersionUID = 6806146864367514601L;

        private A a;

        private B b;

        private C c;

        private transient int hashCode;

        @SuppressWarnings("unused")
        // required for some serialization frameworks such as GWT RPC
        private Triple() {
        }

        public Triple(A a, B b, C c) {
            this.a = a;
            this.b = b;
            this.c = c;
            hashCode = 0;
        }

        public A getA() {
            return a;
        }

        public B getB() {
            return b;
        }

        public C getC() {
            return c;
        }

        @Override
        public int hashCode() {
            if (hashCode == 0) {
                hashCode = 17;
                hashCode = 37 * hashCode + (a != null ? a.hashCode() : 0);
                hashCode = 37 * hashCode + (b != null ? b.hashCode() : 0);
                hashCode = 37 * hashCode + (c != null ? c.hashCode() : 0);
            }
            return hashCode;
        }

        @Override
        public boolean equals(Object obj) {
            boolean result;
            if (this == obj) {
                result = true;
            } else if (obj instanceof Triple<?, ?, ?>) {
                Triple<?, ?, ?> thrice = (Triple<?, ?, ?>) obj;
                result = (this.a != null && this.a.equals(thrice.a) || this.a == null && thrice.a == null)
                        && (this.b != null && this.b.equals(thrice.b) || this.b == null && thrice.b == null)
                        && (this.c != null && this.c.equals(thrice.c) || this.c == null && thrice.c == null);
            } else {
                result = false;
            }
            return result;
        }

        @Override
        public String toString() {
            return "[" + a + ", " + b + ", " + c + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        }
    }

    /**
     * Adds all elements from <code>what</code> to <code>addTo</code> and returns <code>addTo</code> for chained use.
     * If <code>what</code> is <code>null</code>, this operation does nothing, not even fail with an exception, but
     * return the unmodified <code>addTo</code>.
     */
    public static <T> Collection<T> addAll(Iterable<? extends T> what, Collection<T> addTo) {
        if (what != null) {
            for (T t : what) {
                addTo.add(t);
            }
        }
        return addTo;
    }
    
    /**
     * Retains all elements from <code>what</code> in <code>retainIn</code> and removes all others from
     * {@code retainIn}.
     * 
     * @return <code>retainIn</code> for chained use.
     * @throws NullPointerException in case {@code what} or {@code retainIn} are {@code null}
     */
    public static <T> Collection<T> retainAll(Iterable<? extends T> what, Collection<T> retainIn) {
        if (what == null || retainIn == null) {
            throw new NullPointerException();
        } else {
            if (what instanceof Collection) {
                retainIn.retainAll((Collection<?>) what);
            } else {
                final Set<T> set = new HashSet<>(); // for quick contains
                addAll(what, set);
                retainIn.retainAll(set);
            }
            return retainIn;
        }
    }
    
    /**
     * Adds <code>v</code> to the value set for key <code>k</code>. If no entry exists yet for <code>k</code>, the
     * entry is created using a {@link HashSet} for the value set.
     */
    public static <K, V> void add(Map<K, Set<V>> map, K k, V v) {
        Set<V> set = map.get(k);
        if (set == null) {
            set = new HashSet<>();
            map.put(k, set);
        }
        set.add(v);
    }

    /**
     * Removes all elements in <code>what</code> from <code>removeFrom</code> and returns <code>removeFrom</code> for chained use.
     * If <code>what</code> is <code>null</code>, this operation does nothing, not even fail with an exception, but
     * return the unmodified <code>removeFrom</code>.
     */
    public static <T> Collection<T> removeAll(Iterable<T> what, Collection<T> removeFrom) {
        if (what != null) {
            for (T t : what) {
                removeFrom.remove(t);
            }
        }
        return removeFrom;
    }

    public static <T> T[] toArray(Iterable<? extends T> what, T[] arr) {
        List<T> list = new ArrayList<T>();
        addAll(what, list);
        return list.toArray(arr);
    }

    public static <T> int size(Iterable<T> i) {
        if (i instanceof Collection<?>) {
            return ((Collection<?>) i).size();
        } else {
            int result = 0;
            Iterator<T> iter = i.iterator();
            while (iter.hasNext()) {
                result++;
                iter.next();
            }
            return result;
        }
    }
    
    /**
     * If {@code iter} {@link Iterator#hasNext has a next element}, that element is returned. Otherwise, {@code null} is
     * the result of this method. If a next element exists, the attempt to fetch it may, as usual, throw a
     * {@link ConcurrentModificationException}.
     */
    public static <T> T nextOrNull(Iterator<T> iter) {
        final T result;
        if (iter.hasNext()) {
            result = iter.next();
        } else {
            result = null;
        }
        return result;
    }

    public static <T> int indexOf(Iterable<? extends T> i, T t) {
        int result;
        if (i instanceof List<?>) {
            List<?> list = (List<?>) i;
            result = list.indexOf(t);
        } else {
            boolean found = false;
            int counter = 0;
            for (T it : i) {
                if (it == null && t == null
                        || it != null && it.equals(t)) {
                    result = counter;
                    found = true;
                    break;
                }
                counter++;
            }
            if (found) {
                result = counter;
            } else {
                result = -1;
            }
        }
        return result;
    }

    public static <T> boolean equals(Iterable<? extends T> a, Iterable<? extends T> b) {
        if (a == null) {
            return b == null;
        } else if (b == null) {
            return a == null;
        } else {
            // neither a nor b are null at this point:
            Iterator<? extends T> aIter = a.iterator();
            Iterator<? extends T> bIter = b.iterator();
            while (aIter.hasNext() && bIter.hasNext()) {
                T ao = aIter.next();
                T bo = bIter.next();
                if (!equalsWithNull(ao, bo)) {
                    return false;
                }
            }
            return !aIter.hasNext() && !bIter.hasNext();
        }
    }

    public static <T> T get(Iterable<T> iterable, int i) {
        if (iterable instanceof List<?>) {
            List<T> l = (List<T>) iterable;
            return l.get(i);
        } else {
            final Iterator<T> iter = iterable.iterator();
            T result = iter.next();
            for (int j=0; j<i; j++) {
                result = iter.next();
            }
            return result;
        }
    }
    
    public static <T> T first(Iterable<T> iterable) {
        final Iterator<T> iter = iterable.iterator();
        final T result;
        if (iter.hasNext()) {
            result = iter.next();
        } else {
            result = null;
        }
        return result;
    }
    
    public static <T> T last(Iterable<T> iterable) {
        final T result;
        if (isEmpty(iterable)) {
            result = null;
        } else if (iterable instanceof SortedSet) {
            result = ((SortedSet<T>) iterable).last();
        } else {
            result = get(iterable, size(iterable)-1);
        }
        return result;
    }
    
    public static <T> List<T> createList(Iterable<T> iterable) {
        List<T> list = new ArrayList<>();
        Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
    
    public static <T> Set<T> createSet(Iterable<T> iterable) {
        Set<T> set = new HashSet<>();
        Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next());
        }
        return set;
    }
    
    public static interface Mapper<S, T> { T map(S s); }
    public static <S, T> Iterable<T> map(final Iterable<S> iterable, final Mapper<S, T> mapper) {
        return new MappingIterable<>(iterable, new MappingIterator.MapFunction<S, T>() {
            @Override
            public T map(S s) {
                return mapper.map(s);
            }
        });
    }

    public static <S, T> ArrayList<T> mapToArrayList(final Iterable<S> iterable, final Mapper<S, T> mapper) {
        final ArrayList<T> result = new ArrayList<>();
        addAll(map(iterable, mapper), result);
        return result;
    }

    public static <T> Iterable<T> filter(final Iterable<T> iterable, final Predicate<T> predicate) {
        return StreamSupport.stream(iterable.spliterator(), /* parallel */ false).filter(predicate)::iterator;
    }
    
    /**
     * A null-safe check whether <code>t</code> is contained in <code>ts</code>. For <code>ts==null</code> the method
     * immediately returns <code>false</code>.
     */
    public static <T> boolean contains(Iterable<T> ts, Object t) {
        if (ts == null) {
            return false;
        }
        if (ts instanceof Collection<?>) {
            return ((Collection<?>) ts).contains(t);
        } else {
            for (T t2 : ts) {
                if (equalsWithNull(t2, t)) {
                    return true;
                }
            }
            return false;
        }
    }
    
    /**
     * @return {@code true} if {@code ts} {@link #contains(Iterable, Object) contains} at least one of the elements in
     *         {@code isAnyOfTheseContained}. This means in particular that if {@code isAnyOfTheseContained} is
     *         {@code null} or is empty, {@code false} will result.
     */
    public static <T> boolean containsAny(Iterable<T> ts, Iterable<T> isAnyOfTheseContained) {
        if (isAnyOfTheseContained != null) {
            for (final T t : isAnyOfTheseContained) {
                if (contains(ts, t)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks whether for all elements from {@code what} the method {@link #contains(Iterable, Object)}
     * returns {@code true}. In case {@code what} is empty or {@code null}, {@code true} is returned if and only
     * if {@code ts} is not {@code null}.
     */
    public static <T> boolean containsAll(Iterable<T> ts, Iterable<T> what) {
        if (ts == null) {
            return false;
        }
        if (what == null) {
            return true;
        }
        for (final T w : what) {
            if (!contains(ts, w)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean isEmpty(Iterable<T> ts) {
        if (ts instanceof Collection<?>) {
            return ((Collection<?>) ts).isEmpty();
        } else {
            return !ts.iterator().hasNext();
        }
    }

    public static boolean equalsWithNull(Object o1, Object o2) {
        final boolean result;
        if (o1 == null) {
            result = (o2 == null);
        } else {
            if (o2 == null) {
                result = false;
            } else {
                result = o1.equals(o2);
            }
        }
        return result;
    }
    
    public static boolean equalsWithNull(String s1, String s2, boolean ignoreCase) {
        final String s1LC = ignoreCase?s1==null?null:s1.toLowerCase():s1;
        final String s2LC = ignoreCase?s2==null?null:s2.toLowerCase():s2;
        return equalsWithNull(s1LC, s2LC);
    }

    /**
     * <code>null</code> is permissible for both, <code>o1</code> and <code>o2</code>, where a <code>null</code> value
     * is considered less than a non-null value if <code>nullIsLess</code> is <code>true</code>, greater otherwise.
     */
    public static <T extends Comparable<T>> int compareToWithNull(T o1, T o2, boolean nullIsLess) {
        final int result;
        if (o1 == null) {
            if (o2 == null) {
                result = 0;
            } else {
                result = nullIsLess ? -1 : 1;
            }
        } else {
            if (o2 == null) {
                result = nullIsLess ? 1 : -1;
            } else {
                result = o1.compareTo(o2);
            }
        }
        return result;
    }

    /**
     * Return the default value instead of null, if the map does not contain the key.
     */
    public static <K, V> V get(Map<K, V> map, K key, V defaultVal) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return defaultVal;
    }

    /**
     * Ensures that a {@link Set Set&lt;V&gt;} is contained in {@code map} for {@code key} and
     * then adds {@code value} to that set. No synchronization / concurrency control effort is
     * made. This is the caller's obligation.
     */
    public static <K, V> boolean addToValueSet(Map<K, Set<V>> map, K key, V value) {
        return addToValueSet(map, key, value, new ValueCollectionConstructor<V, Set<V>>() {
            @Override
            public Set<V> createValueCollection() {
                return new HashSet<V>();
            }
        });
    }

    public static interface ValueCollectionConstructor<T, C extends Collection<T>> {
        C createValueCollection();
    }
    
    /**
     * Ensures that a {@link Collection Collection&lt;V&gt;} is contained in {@code map} for {@code key} and then adds {@code value}
     * to that set. No synchronization / concurrency control effort is made. This is the caller's obligation.
     * 
     * @return {@code true} if the {@code value} was not yet contained in the {@code value} collection for {@code key} or if
     *         the {@code map} did not even contain a value set for {@code key} yet.
     */
    public static <K, V, C extends Collection<V>> boolean addToValueSet(Map<K, C> map, K key, V value, ValueCollectionConstructor<V, C> setConstructor) {
        C coll = map.get(key);
        if (coll == null) {
            coll = setConstructor.createValueCollection();
            map.put(key, coll);
        }
        return coll.add(value);
    }

    /**
     * Removes {@code value} from all sets contained as values in {@code map}. If a set is emptied by this removal it is
     * removed from the map. No synchronization / concurrency control effort is made. This is the caller's obligation.
     */
    public static <K, V, S extends Set<V>> void removeFromAllValueSets(Map<K, S> map, V value) {
        for (final Iterator<Entry<K, S>> i=map.entrySet().iterator(); i.hasNext(); ) {
            final Entry<K, S> e = i.next();
            e.getValue().remove(value);
            if (e.getValue().isEmpty()) {
                i.remove();
            }
        }
    }
    
    /**
     * Removes {@code value} from the set that is the value for {@code key} in {@code map} if that key exists. If the
     * set existed and is emptied by this removal it is removed from the map. No synchronization / concurrency control
     * effort is made. This is the caller's obligation.
     * 
     * @return {@code true} if the {@code value} was contained in the set for {@code key} and was removed successfully
     */
    public static <K, V, S extends Set<V>> boolean removeFromValueSet(Map<K, S> map, K key, V value) {
        final S valuesPerKey = map.get(key);
        final boolean removed;
        if (valuesPerKey != null) {
            removed = valuesPerKey.remove(value);
            if (removed && valuesPerKey.isEmpty()) {
                map.remove(key);
            }
        } else {
            removed = false;
        }
        return removed;
    }

    public static String join(String separator, String... strings) {
        return joinStrings(separator, Arrays.asList(strings));
    }

    public static String join(String separator, Object... objects) {
        final String[] strings = new String[objects.length];
        int i=0;
        for (Object o : objects) {
            strings[i++] = o.toString();
        }
        return joinStrings(separator, Arrays.asList(strings));
    }

    public static String joinStrings(String separator, Iterable<String> strings) {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (String string : strings) {
            if (first) {
                first = false;
            } else {
                result.append(separator);
            }
            result.append(string);
        }
        return result.toString();
    }

    public static String join(String separator, Iterable<? extends Named> nameds) {
        return join(separator, toArray(nameds, new Named[0]));
    }

    public static String join(String separator, Named... nameds) {
        String[] strings = new String[nameds.length];
        for (int i=0; i<nameds.length; i++) {
            strings[i] = nameds[i].getName();
        }
        return join(separator, strings);
    }
    
    /**
     * Splits {@code s} along whitespace (blank, tab, line feed, carriage return, form feed) characters that are not
     * within a <em>phrase</em>. <em>Phrases</em> are enclosed by double quotes ({@code "}). To make a double quote or any other
     * character part of a {@link String} in the result, a backslash ({@code \}) must precede the double quote as an escape character. With this,
     * a {@code \} character or a whitespace character can become part of the split result by escaping it with a {@code \} character. If {@code s}'s last character
     * happens to be the (unescaped) escape character it stands for itself.
     * 
     * A double quote {@code "} in the middle of an unquoted phrase marks the beginning of a new quoted phrase. When occurring unescaped in
     * a quoted phrase, it marks the end of that quoted phrase, and a new unquoted phrase starts.
     * <p>
     * 
     * The following example expressions all evaluate to {@code true}:
     * 
     * <pre>
     * {@link #splitAlongWhitespaceRespectingDoubleQuotedPhrases(String) splitAlongWhitespaceRespectingDoubleQuotedPhrases("a b c")}.equals(Arrays.asList("a", "b", "c"))
     * {@link #splitAlongWhitespaceRespectingDoubleQuotedPhrases(String) splitAlongWhitespaceRespectingDoubleQuotedPhrases("a \"b c\"")}.equals(Arrays.asList("a", "b c"))
     * {@link #splitAlongWhitespaceRespectingDoubleQuotedPhrases(String) splitAlongWhitespaceRespectingDoubleQuotedPhrases("a \"b \\\" c\"")}.equals(Arrays.asList("a", "b \" c"))
     * {@link #splitAlongWhitespaceRespectingDoubleQuotedPhrases(String) splitAlongWhitespaceRespectingDoubleQuotedPhrases("a \"bc\"de")}.equals(Arrays.asList("a", "bc", "de"))
     * {@link #splitAlongWhitespaceRespectingDoubleQuotedPhrases(String) splitAlongWhitespaceRespectingDoubleQuotedPhrases("a\"bc\" de")}.equals(Arrays.asList("a", "bc", "de"))
     * {@link #splitAlongWhitespaceRespectingDoubleQuotedPhrases(String) splitAlongWhitespaceRespectingDoubleQuotedPhrases("\\ ")}.equals(Arrays.asList(" "))
     * {@link #splitAlongWhitespaceRespectingDoubleQuotedPhrases(String) splitAlongWhitespaceRespectingDoubleQuotedPhrases("  \\ \\\\ ")}.equals(Arrays.asList(" \\"))
     * {@link #isEmpty(Iterable) isEmpty(splitAlongWhitespaceRespectingDoubleQuotedPhrases(" \n\t  "))
     * </pre>
     * 
     * @return if {@code s==null}, then {@code null}, else a non-{@code null} but possibly empty sequence of {@link String} whose iteration order corresponds with
     *         the occurrence of the split results, left to right, in {@code s}
     */
    public static Iterable<String> splitAlongWhitespaceRespectingDoubleQuotedPhrases(String s) {
        final char ESCAPE_CHARACTER = '\\';
        final List<String> result;
        if (s == null) {
            result = null;
        } else {
            result = new ArrayList<>();
            boolean escaped = false;
            StringBuilder phrase = null;
            boolean inQuotedPhrase = false;
            for (final char c : s.toCharArray()) {
                if (escaped) {
                    if (phrase == null) {
                        phrase = new StringBuilder();
                    }
                    phrase.append(c);
                    escaped = false;
                } else if (c == ESCAPE_CHARACTER) {
                    escaped = true; // don't append but mark for next character to be appended
                } else if (c == '"') {
                    if (inQuotedPhrase) {
                        result.add(phrase.toString());
                        inQuotedPhrase = false;
                        phrase = null;
                    } else {
                        inQuotedPhrase = true;
                        if (phrase != null) { // starts a quoted phrase in the middle of a running phrase
                            result.add(phrase.toString());
                        }
                        phrase = new StringBuilder();
                    }
                } else {
                    if (inQuotedPhrase) {
                        phrase.append(c);
                    } else {
                        if (new String(new char[] {c}).matches("\\s")) { // whitespace
                            if (phrase != null) {
                                // phrase is terminated by this whitespace
                                result.add(phrase.toString());
                                phrase = null;
                            } // else skip whitespace outside of phrases
                        } else {
                            if (phrase == null) {
                                phrase = new StringBuilder();
                            }
                            phrase.append(c);
                        }
                    }
                }
            }
            if (escaped) {
                // escape character as last character stands for itself
                if (phrase == null) {
                    phrase = new StringBuilder();
                }
                phrase.append(ESCAPE_CHARACTER);
            }
            if (phrase != null) {
                // a phrase is also terminated by the end of the string, also (lenient mode) if
                // within an (unterminated) quoted phrase
                result.add(phrase.toString());
            }
        }
        return result;
    }
    
    /**
     * Returns the first non-<code>null</code> object in <code>objects</code> or <code>null</code>
     * if no such object exists.
     */
    @SafeVarargs
    public static <T> T getFirstNonNull(T... objects) {
        for (T t : objects) {
            if (t != null) {
                return t;
            }
        }
        return null;
    }
    
    /**
     * Returns the earlier {@link TimePoint} of a and b. If one of them is <code>null</code> and the other
     * <code>!null</code>, the TimePoint that is not <code>!null</code> gets returned. If both are <code>null</code>,
     * <code>null</code> is the result.
     */
    public static TimePoint getEarliestOfTimePoints(TimePoint a, TimePoint b) {
        TimePoint result = null;
        if (a != null && b != null) {
            result = a.before(b) ? a : b;
        } else {
            result = (a != null && b == null) ? a : (a == null && b != null) ? b : null;
        }
        return result;
    }
    
    /**
     * Returns the latest {@link TimePoint} of a and b. If one of them is <code>null</code> and the other
     * <code>!null</code>, the TimePoint that is not <code>!null</code> gets returned. If both are <code>null</code>,
     * <code>null</code> is the result.
     */
    public static TimePoint getLatestOfTimePoints(TimePoint a, TimePoint b) {
        TimePoint result = null;
        if (a != null && b != null) {
            result = a.after(b) ? a : b;
        } else {
            result = (a != null && b == null) ? a : (a == null && b != null) ? b : null;
        }
        return result;
    }
    
    /**
     * Returns <code>true</code> if <code>timePoint</code> is after <code>a</code> an before <code>b</code>.
     * If one of the parameters is <code>null</code> the method returns <code>false</code>.
     */
    public static boolean isTimePointInRangeOfTimePointsAandB(TimePoint timePoint, TimePoint a, TimePoint b) {
        boolean result = false;
        if (timePoint != null && a != null && b != null) {
            result = timePoint.after(a) && timePoint.before(b);
        }
        return result;
    }
    
    /**
     * Searches the dominant object in an <code>Iterable&lt;T&gt;</code> collection.
     * 
     * @param objects
     *            The <code>Iterable&lt;T&gt;</code> collection which should be analyzed. Objects are compared
     *            by their definition of {@link Object#equals(Object)}.
     * @return <code>T</code> Returns the dominant object. If the collection have two objects with the highest count,
     *         you will get one of them returned. If the collection is <code>null</code> or empty, the method will
     *         return <code>null</code>.
     */
    public static <T> T getDominantObject(Iterable<T> objects) {
        T result = null;
        if (objects != null) {
            if (objects.iterator().hasNext()) {
                HashMap<T, Integer> countPerObject = new HashMap<>();
                int highestCount = 0;
                for (T it : objects) {
                    Integer objectCount = countPerObject.get(it);
                    if (objectCount == null) {
                        objectCount = 0;
                    }
                    objectCount++;
                    countPerObject.put(it, objectCount);
                    if (objectCount > highestCount) {
                        highestCount = objectCount;
                        result = it;
                    }
                }
            }
        }
        return result;
    }

    public static <T> List<T> asList(Iterable<T> iterable) {
        final List<T> list = new ArrayList<>();
        addAll(iterable, list);
        return list;
    }
    
    public static <T> Set<T> asSet(Iterable<T> iterable) {
        final Set<T> result;
        if (iterable instanceof Set<?>) {
            result = (Set<T>) iterable;
        } else {
            result = new HashSet<>();
            addAll(iterable, result);
        }
        return result;
    }

    public static <T> List<T> cloneListOrNull(List<T> list) {
        final List<T> result;
        if (list == null) {
            result = null;
        } else {
            result = new ArrayList<T>(list);
        }
        return result;
    }

    public static <T extends Named> List<T> sortNamedCollection(Collection<T> collection) {
        List<T> sortedCollection = new ArrayList<>(collection);
        Collections.sort(sortedCollection, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return new NaturalComparator().compare(o1.getName(), o2.getName());
            }
        });
        return sortedCollection;
    }
    
    /**
     * Groups the given values by a key. The key is being extracted from the values by using the given {@link Function}. Inner
     * Collections of the resulting Map are created using the given {@link Provider} instance.
     * <br>
     * Can be replaced with Java 8 Stream API in the future.
     * 
     * @param values the values to group
     * @param mappingFunction function that extracts the group key from a value
     * @param newCollectionProvider factory to create new instances of the inner collections
     * @return a map containing all given values in inner collections grouped by a specific criteria
     */
    public static <K, V> Map<K, Iterable<V>> group(Iterable<V> values, Function<V, K> mappingFunction,
            Supplier<? extends Collection<V>> newCollectionProvider) {
        final Map<K, Iterable<V>> result = new HashMap<>();
        for (V value : values) {
            final K key = mappingFunction.apply(value);
            Collection<V> groupValues = (Collection<V>) result.get(key);
            if (groupValues == null) {
                groupValues = newCollectionProvider.get();
                result.put(key, groupValues);
            }
            groupValues.add(value);
        }
        return result;
    }
    
    @SafeVarargs
    public static <T extends Comparable<T>> T min(T... elements) {
        return Collections.min(Arrays.asList(elements));
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T max(T... elements) {
        return Collections.max(Arrays.asList(elements));
    }

    /**
     * Checks if the given map is null, and if, returns an empty map.
     */
    public static <K, V> Map<K, V> nullToEmptyMap(Map<K, V> map) {
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    public static String toStringOrNull(Object toStringOrNull) {
        if (toStringOrNull == null) {
            return null;
        }
        return toStringOrNull.toString();
    }
    
    public static boolean equalStringsWithEmptyIsNull(String o1, String o2) {
        String effectiveO1 = o1 == null || o1.isEmpty() ? null : o1;
        String effectiveO2 = o2 == null || o2.isEmpty() ? null : o2;
        return equalsWithNull(effectiveO1, effectiveO2);
    }
    
    /**
     * Pads a numerical value with '0' characters up to a number of digits left and right of the decimal point. If the
     * number of digits right of the decimal point is zero, no decimal point will be rendered in the result. The sum of
     * digits requested must be greater than zero. Digits will appear left of the decimal point if required to represent
     * the integer part of the {@code value}'s magnitude.
     * 
     * @param digitsLeftOfDecimal
     *            a non-negative number; if zero, no "0" will be used left of the decimal point if the value is less than 1.
     *            Padding occurs only if the number of digits requested is greater than the number of digits the value has
     *            left of the decimal point. If the number of digits requested left of the decimal point is less than what
     *            the number has, no cropping takes place and the result will have more digits left of the decimal point
     *            than requested.
     * @param digitsRightOfDecimal
     *            a non-negative number; if zero, no decimal point will appear at all
     * @param round
     *            whether or not the value shall be rounded to the number of decimals requested. If {@code false}, the
     *            value will be displayed in a truncated form
     */
    public static String padPositiveValue(double value, int digitsLeftOfDecimal, int digitsRightOfDecimal, boolean round) {
        assert value >= 0;
        assert digitsLeftOfDecimal >= 0;
        assert digitsRightOfDecimal >= 0;
        final StringBuilder sb = new StringBuilder();
        final double scalePow = Math.pow(10.0, digitsRightOfDecimal);
        final double scaledValue = round?Math.round(value * scalePow):(value*scalePow);
        double remainder = scaledValue;
        if (digitsLeftOfDecimal==0 && scaledValue>=scalePow) {
            sb.append(Math.round(remainder/scalePow));
            remainder = remainder%scalePow;
        }
        for (int i=digitsLeftOfDecimal+digitsRightOfDecimal; i>0; i--) {
            if (i==digitsRightOfDecimal) {
                sb.append('.');
            }
            final double pow = Math.pow(10.0, i-1);
            sb.append((int) (remainder/pow));
            remainder = remainder % pow;
        }
        return sb.toString();
    }

    /**
     * Retains a copy of only the elements in {@link Iterable toFilter} that are contained in the specified
     * {@link Iterable toRetain}. In other words, removes all elements of toFilter that are not contained in toRetain.
     */
    public static <T> Iterable<T> retainCopy(Iterable<T> toFilter, Iterable<T> toRetain) {
        final List<T> returnValue = Util.asList(toFilter);
        returnValue.retainAll(Util.asList(toRetain));
        return returnValue;
    }

    /**
     * This method will determine the latest entry in the given Iterable
     * 
     * @return The object with the latest time stamp in the input or {@code null} if the input was empty. If multiple
     *         objects have equal time points and no other object has a later time point, the first object in the
     *         iteration order with such an equal time stamp is returned.
     */
    public static <T extends Timed> T latest(Iterable<T> timedObjects) {
        T latest = null;
        for (T timedObject : timedObjects) {
            if (latest == null || timedObject.getTimePoint().after(latest.getTimePoint())) {
                latest = timedObject;
            }
        }
        return latest;
    }
    
    /**
     * Sorts a set of arrays according to the sorting operations to be applied
     * to the {@code keys} array to sort that in ascending order. Any element
     * index change in {@code keys} also applies to all {@code values} arrays.
     */
    public static void sort(double[] keys, double[]... values) {
        List<double[]> arrays = new ArrayList<>();
        for (int i=0; i<keys.length; i++) {
            double[] array = new double[values.length+1];
            array[0] = keys[i];
            for (int j=0; j<values.length; j++) {
                array[j+1] = values[j][i];
            }
            arrays.add(array);
        }
        Collections.sort(arrays, (a1, a2)->Double.compare(a1[0], a2[0]));
        int c=0;
        for (final double[] array : arrays) {
            keys[c] = array[0];
            for (int i=1; i<array.length; i++) {
                values[i-1][c] = array[i];
            }
            c++;
        }
    }

    /**
     * @return a non-parallel stream for the {@link Iterable} passed. Short for
     * {@code StreamSupport.stream(iterable.spliterator(), false)}.
     */
    public static <T> Stream<T> stream(Iterable<T> iterable) {
        return StreamSupport.stream(iterable.spliterator(), /* parallel */ false);
    }
    
    /**
     * Checks whether a given String is <code>null</code> or empty.
     * 
     * @param str
     *            String to check
     * @return <code>false</code> if empty or <code>null</code>, otherwise <code>true</code>.
     */
    public static boolean hasLength(String str) {
        final boolean result;
        if (str == null) {
            result = false;
        } else {
            result = !str.isEmpty();
        }
        return result;
    }

    /**
     * Compares two iterable sequences based on {@link Set} semantics. If both objects turn out to be {@link Set}s,
     * the {@link Set#equals(Object)} method will be used. Otherwise, non-{@link Set} objects will be filled into
     * temporary {@link Set} objects and then compared as sets.
     */
    public static <T> boolean setEquals(Iterable<T> a, Iterable<T> b) {
        return asSet(a).equals(asSet(b));
    }
}
