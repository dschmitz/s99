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

class P05Spec extends ProblemSpec {

  def tests(testName: String, ls: List[Int] => List[Int]): Unit = {
    testName should "return same list for single element's list" in {
      ls(List(3)) should equal(List(3))
    }

    it should "return empty list for empty list" in {
      ls(List()) should be(List())
    }

    it should "return reverse list of list" in {
      ls(List(1, 1, 2, 3, 5, 8)) should be(List(8, 5, 3, 2, 1, 1))
    }
  }

  tests("ReverseBuiltin", P05.reverseBuiltin)
  tests("ReverseTailRecursive", P05.reverseTailRecursive)
  tests("ReverseFunctional", P05.reverseFunctional)

}
