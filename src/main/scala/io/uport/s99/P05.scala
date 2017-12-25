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
P05 (*) Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */
object P05 {

  def reverseBuiltin(list: List[Int]): List[Int] = list.reverse

  def reverseTailRecursive(listA: List[Int]): List[Int] = {

    def reverseRecursive(reverseList: List[Int], listB: List[Int]): List[Int] =
      listB match {
        case Nil       => reverseList
        case h :: tail => reverseRecursive(h :: reverseList, tail)
      }

    reverseRecursive(List(), listA)
  }

  def reverseFunctional(list: List[Int]): List[Int] =
    list.foldLeft(List[Int]()) { (ls, e) =>
      e :: ls
    }
}
