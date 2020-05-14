package com.learn.web.gwt.client.sap;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;

/**
 * Methods marked with this annotation will be used as dimensions for the data mining framework. The method will be called,
 * if the dimension value of a Fact is requested.<br />
 * The marked method has to match the following conditions or the data mining could fail:
 * <ul>
 *      <li>Has no parameters (except if the parameter list is exactly {@link Locale}, {@link ResourceBundleStringMessages})</li>
 *      <li>The return type isn't <code>void</code></li>
 *      <li>Is side effect free</li>
 * </ul>
 * 
 * The return type of a marked method should be:
 * <ul>
 *      <li>A primitive type or wrapper class.</li>
 *      <li>Classes that implement <code>equals()</code>, <code>hashCode()</code> and <code>toString()</code>.
 * </ul>
 * Otherwise the grouping could become incorrect and the result presentation will be unreadable.
 * 
 * @author Lennart Hensler (D054527)
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Dimension {

    /**
     * The message key used for internationalization.<br />
     * If there is more than one message key in a function (e.g. if the function is an instance of ConcatenatingCompoundFunction),
     * then the messages will be concatenated (separated by a space).
     */
    public String messageKey();
    
    /**
     * The ordinal used for the sorting of functions. The default value is {@link Integer#MAX_VALUE}.<br />
     * <br />
     * The standard sorting with this ordinal is ascending (The function with ordinal 0 is the first and the
     * function with <code>Integer.MAX_VALUE</code> is the last in the list).<br />
     * If there are more than one ordinal in a function (e.g. if the function is an instance of ConcatenatingCompoundFunction),
     * then the smallest ordinal is the used ordinal.
     */
    public int ordinal() default Integer.MAX_VALUE;
    
}
