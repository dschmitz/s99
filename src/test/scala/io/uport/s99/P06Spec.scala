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

class P06Spec extends ProblemSpec {

  def tests(testName: String, ls: List[Int] => Boolean): Unit = {
    testName should "return true single element's list" in {
      ls(List(3)) should equal(true)
    }

    it should "return false for empty list" in {
      ls(List()) should be(true)
    }

    it should "return true for palindrome list" in {
      ls(List(1, 2, 3, 2, 1)) should be(true)
    }
  }

  tests("IsPalindromeBuiltin", P06.isPalindromeBuiltin)
  tests("IsPalindromeTailRecursive", P06.isPalindromeTailRecursive)
  tests("IsPalindromeFunctional", P06.isPalindromeFunctional)
}
