package com.vladsch.flexmark.util;

/**
 * Represents an operation that accepts a single input argument and returns no
 * result. Unlike most other functional interfaces, {@code Consumer} is expected
 * to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(int)}.
 *
 */
public interface IntConsumer {
    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    void accept(int t);
}
