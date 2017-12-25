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
P04 (*) Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
 */
object P04 {

  // builtin
  def lengthBuiltin(list: List[Int]): Int = list.length

  // tail recursive
  def lengthRecursive(listA: List[Int]): Int = {

    def lengthRec(acc: Int, listB: List[Int]): Int = listB match {
      case Nil       => acc
      case _ :: tail => lengthRec(acc + 1, tail)
    }
    lengthRec(0, listA)
  }

  // pure functional
  def lengthFunctional(list: List[Int]): Int =
    list.fold(0) { (acc, _) =>
      acc + 1
    }

}
