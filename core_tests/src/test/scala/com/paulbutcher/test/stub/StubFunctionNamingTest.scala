// Copyright (c) 2011-2012 Paul Butcher
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.

package com.paulbutcher.test.stub

import com.paulbutcher.test.IsolatedSpec

class StubFunctionNamingTest extends IsolatedSpec {

  behavior of "Stub function"

  it should "have a sensible default name" in {
    val m = stubFunction[String]
    m.toString shouldBe "StubFunction0-1"
  }

  it should "have the name we gave them when we use a symbol" in {
    val m = stubFunction[String](Symbol("a stub function"))
    m.toString shouldBe "a stub function"
  }

  it should "have the name we gave them when we use a string" in {
    val m = stubFunction[String]("another stub function")
    m.toString shouldBe "another stub function"
  }

  it should "resolve ambiguity when taking a symbol argument with no name specified" in {
    val m = stubFunction[Symbol, String]
    m.toString shouldBe "StubFunction1-1"
  }

  it should "resolve ambiguity when taking a symbol argument with a name specified" in {
    val m = stubFunction[Symbol, String](functionName("a named stub"))
    m.toString shouldBe "a named stub"
  }
}
