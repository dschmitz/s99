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
P07 (**) Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */
object P07 {

  @SuppressWarnings(Array("org.wartremover.warts.Any"))
  def flattenBuiltin(list: List[Any]): List[Any] = list.flatMap {
    case l: List[Any] => flattenBuiltin(l)
    case e            => List(e)
  }

  @SuppressWarnings(
    Array("org.wartremover.warts.Any")
  )
  def flattenRecursive(list: List[Any]): List[Any] = list match {
    case (head: List[Any]) :: tail => flattenRecursive(head ++ tail)
    case head :: tail              => head :: flattenRecursive(tail)
    case Nil                       => Nil
  }
}
