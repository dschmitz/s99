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

import io.uport.s99.Logic._

class LogicSpec extends ProblemSpec {

  "and" should "return true for (true, true)" in {
    Logic.and(true, true) should be(true)
  }

  it should "return false for all other cases" in {
    Logic.and(false, true) should be(false)
    Logic.and(true, false) should be(false)
    Logic.and(false, false) should be(false)
  }

  "or" should "return true for (true, true), (true, false), (false, true)" in {
    Logic.or(true, true) should be(true)
    Logic.or(true, false) should be(true)
    Logic.or(false, true) should be(true)
  }

  it should "return false for (false, false)" in {
    Logic.or(false, false) should be(false)
  }

  "not" should "be true for false and vice versa" in {
    Logic.not(true) should be(false)
    Logic.not(false) should be(true)
  }

  "nand" should "return true for (true, true)" in {
    Logic.nand(true, true) should be(false)
  }

  it should "return true for other cases" in {
    Logic.nand(false, true) should be(true)
    Logic.nand(true, false) should be(true)
    Logic.nand(false, false) should be(true)
  }

  "nor" should "return false for (true, true), (true, false), (false, true)" in {
    Logic.nor(true, true) should be(false)
    Logic.nor(true, false) should be(false)
    Logic.nor(false, true) should be(false)
  }

  it should "return true for (false, false)" in {
    Logic.nor(false, false) should be(true)
  }

  "xor" should "return true for (true, false) or (false, true)" in {
    Logic.xor(true, true) should be(false)
    Logic.xor(true, false) should be(true)
    Logic.xor(false, true) should be(true)
    Logic.xor(false, false) should be(false)
  }

}
