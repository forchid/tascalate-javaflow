/**
 * ﻿Copyright 2013-2018 Valery Silaev (http://vsilaev.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.javaflow.extras;

/**
 * Represents an continuable operation on a single operand that produces a result of the
 * same type as its operand.  This is a specialization of {@code ContinuableFunction} for
 * the case where the operand and result are of the same type.
 *
 * <p>This is a functional interface
 * whose functional method is {@link #apply(Object)}.
 *
 * @param <T> the type of the operand and result of the operator
 *
 * @see ContinuableFunction
 */
@FunctionalInterface
public interface ContinuableUnaryOperator<T> extends ContinuableFunction<T, T> {

    /**
     * Returns a unary operator that always returns its input argument.
     *
     * @param <T> the type of the input and output of the operator
     * @return a unary operator that always returns its input argument
     */
    static <T> ContinuableUnaryOperator<T> identity() {
        return new ContinuableUnaryOperator<T>() {
            @Override
            public T apply(T value) {
                return value;
            }
        };
    }
}