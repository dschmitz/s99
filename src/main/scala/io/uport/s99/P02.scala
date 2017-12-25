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
P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
 */
object P02 {

  // builtin
  def penultimateBuiltin[Int](list: List[Int]): Option[Int] = list.lift(list.size - 2)

  // recursive
  def penultimateRecursive[Int](list: List[Int]): Option[Int] = list match {
    case head :: _ :: Nil => Some(head)
    case _ :: tail        => penultimateRecursive(tail)
    case _                => None
  }

  // tail recursive

  // pure functional

}
