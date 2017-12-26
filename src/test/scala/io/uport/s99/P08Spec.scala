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

class P08Spec extends ProblemSpec {

  def tests(testName: String, ls: List[Any] => List[Any]): Unit = {
    testName should "return list for single element's list" in {
      ls(List(3)) should equal(List(3))
    }

    it should "return list for empty list" in {
      ls(List()) should be(List())
    }

    it should "return a compressed list" in {
      ls(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be(List('a, 'b, 'c, 'a, 'd, 'e))
    }
  }

  tests("CompressRecursive", P08.compressRecursive)
  tests("CompressFunctional", P08.compressFunctional)

}
