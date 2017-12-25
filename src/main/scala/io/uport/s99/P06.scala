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
P06 (*) Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
 */
object P06 {

  def isPalindromeBuiltin(list: List[Int]): Boolean = list == list.reverse

  def isPalindromeTailRecursive(list: List[Int]): Boolean = list == P05.reverseBuiltin(list)

  def isPalindromeFunctional(list: List[Int]): Boolean = list == P05.reverseFunctional(list)

}
