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

object Logic {

  def and(a: Boolean, b: Boolean): Boolean =
    (a, b) match {
      case (true, true) => true
      case (_, _)       => false
    }

  def or(a: Boolean, b: Boolean): Boolean =
    (a, b) match {
      case (false, false) => false
      case (_, _)         => true
    }

  def not(a: Boolean): Boolean =
    a match {
      case true  => false
      case false => true
    }

  def nand(a: Boolean, b: Boolean): Boolean = not(and(a, b))

  def nor(a: Boolean, b: Boolean): Boolean = not(or(a, b))

  def xor(a: Boolean, b: Boolean): Boolean =
    (a, b) match {
      case (false, true) => true
      case (true, false) => true
      case (_, _)        => false
    }

  def impl(a: Boolean, b: Boolean): Boolean =
    (a, b) match {
      case (true, false) => false
      case (_, _)        => true
    }

  def equ(a: Boolean, b: Boolean): Boolean = not(xor(a, b))

}
