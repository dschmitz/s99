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
P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
 */
object P08 {

  def compressRecursive[T](list: List[T]): List[T] = list match {
    case e1 :: e2 :: tail if (e1 == e2) => compressRecursive(e1 :: tail)
    case head :: tail                   => head :: compressRecursive(tail)
    case Nil                            => Nil
  }

  def compressFunctional[T](list: List[T]): List[T] =
    list.foldRight(List[T]()) {
      case (e, ls) if (ls.headOption == Option(e)) => ls
      case (e, ls)                                 => e :: ls
    }
}
