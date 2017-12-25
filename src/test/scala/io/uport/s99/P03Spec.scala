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

class P03Spec extends ProblemSpec {

  def tests(testName: String, ls: (Int, List[Int]) => Option[Int]): Unit = {
    val testList = List(1, 1, 2, 3, 5, 8)

    testName should "return none for element smaller out of list" in {
      ls(-1, testList) should equal(None)
    }

    it should "return none for element bigger out of list" in {
      ls(6, testList) should equal(None)
    }

    it should "return none for empty list" in {
      ls(1, List()) should be(None)
    }

    it should "return nth element of list" in {
      ls(2, testList) should be(Some(2))
    }
  }

  tests("nthBuiltin", P03.nthBuiltin)
  tests("nthTailRecursive", P03.nthTailRecursive)

}
