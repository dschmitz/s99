/*
 * Copyright 2017 David Schmitz
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

package io.uport.s99

/*
P46 (**) Truth tables for logical expressions.
Define functions and, or, nand, nor, xor, impl, and equ (for logical equivalence) which return true or false according to the result of their respective
operations; e.g. and(A, B) is true if and only if both A and B are true.

scala> and(true, true)
res0: Boolean = true

scala> xor(true. true)
res1: Boolean = false

A logical expression in two variables can then be written as an function of two variables, e.g: (a: Boolean, b: Boolean) => and(or(a, b), nand(a, b))
Now, write a function called table2 which prints the truth table of a given logical expression in two variables.

scala> table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
A B result
true true true
true false true
false true false
false false false
 */
object P46 {}
