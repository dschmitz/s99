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

class P04Spec extends ProblemSpec {

  def tests(testName: String, ls: (List[Int]) => Int): Unit = {
    testName should "return length for single element's list" in {
      ls(List(3)) should equal(1)
    }

    it should "return 0 for empty list" in {
      ls(List()) should be(0)
    }

    it should "return length of list" in {
      ls(List(1, 1, 2, 3, 5, 8)) should be(6)
    }
  }

  tests("lengthBuiltin", P04.lengthBuiltin)
  tests("lengthRecursive", P04.lengthRecursive)
  tests("lengthFunctional", P04.lengthFunctional)

}
