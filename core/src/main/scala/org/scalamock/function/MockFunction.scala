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

package org.scalamock.function

import org.scalamock.context.{MockContext, Call}
import org.scalamock.handlers._
import org.scalamock.matchers.MockParameter
import org.scalamock.util.Defaultable

trait MockFunction { self: FakeFunction =>
  
  protected def onUnexpected(call: Call) = mockContext.reportUnexpectedCall(call)
}

class MockFunction0[R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction0[R](mockContext, name) with MockFunction {
  
  def expects() = mockContext.add(new CallHandler0[R](this))
  def expects(matcher: FunctionAdapter0[Boolean]) = mockContext.add(new CallHandler0[R](this, matcher))
  
  def stubs() = mockContext.add(new CallHandler0[R](this)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter0[Boolean]) = mockContext.add(new CallHandler0[R](this, matcher)).anyNumberOfTimes
}

class MockFunction1[T1, R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction1[T1, R](mockContext, name) with MockFunction {

  def expects(v1: MockParameter[T1]) = mockContext.add(new CallHandler1[T1, R](this, v1))
  def expects(matcher: FunctionAdapter1[T1, Boolean]) = mockContext.add(new CallHandler1[T1, R](this, matcher))

  def stubs(v1: MockParameter[T1]) = mockContext.add(new CallHandler1[T1, R](this, v1)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter1[T1, Boolean]) = mockContext.add(new CallHandler1[T1, R](this, matcher)).anyNumberOfTimes
}

class MockFunction2[T1, T2, R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction2[T1, T2, R](mockContext, name) with MockFunction {

  def expects(v1: MockParameter[T1], v2: MockParameter[T2]) = mockContext.add(new CallHandler2[T1, T2, R](this, v1, v2))
  def expects(matcher: FunctionAdapter2[T1, T2, Boolean]) = mockContext.add(new CallHandler2[T1, T2, R](this, matcher))

  def stubs(v1: MockParameter[T1], v2: MockParameter[T2]) = mockContext.add(new CallHandler2[T1, T2, R](this, v1, v2)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter2[T1, T2, Boolean]) = mockContext.add(new CallHandler2[T1, T2, R](this, matcher)).anyNumberOfTimes
}

class MockFunction3[T1, T2, T3, R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction3[T1, T2, T3, R](mockContext, name) with MockFunction {

  def expects(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3]) = mockContext.add(new CallHandler3[T1, T2, T3, R](this, v1, v2, v3))
  def expects(matcher: FunctionAdapter3[T1, T2, T3, Boolean]) = mockContext.add(new CallHandler3[T1, T2, T3, R](this, matcher))

  def stubs(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3]) = mockContext.add(new CallHandler3[T1, T2, T3, R](this, v1, v2, v3)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter3[T1, T2, T3, Boolean]) = mockContext.add(new CallHandler3[T1, T2, T3, R](this, matcher)).anyNumberOfTimes
}

class MockFunction4[T1, T2, T3, T4, R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction4[T1, T2, T3, T4, R](mockContext, name) with MockFunction {

  def expects(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4]) = mockContext.add(new CallHandler4[T1, T2, T3, T4, R](this, v1, v2, v3, v4))
  def expects(matcher: FunctionAdapter4[T1, T2, T3, T4, Boolean]) = mockContext.add(new CallHandler4[T1, T2, T3, T4, R](this, matcher))

  def stubs(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4]) = mockContext.add(new CallHandler4[T1, T2, T3, T4, R](this, v1, v2, v3, v4)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter4[T1, T2, T3, T4, Boolean]) = mockContext.add(new CallHandler4[T1, T2, T3, T4, R](this, matcher)).anyNumberOfTimes
}

class MockFunction5[T1, T2, T3, T4, T5, R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction5[T1, T2, T3, T4, T5, R](mockContext, name) with MockFunction {

  def expects(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5]) = mockContext.add(new CallHandler5[T1, T2, T3, T4, T5, R](this, v1, v2, v3, v4, v5))
  def expects(matcher: FunctionAdapter5[T1, T2, T3, T4, T5, Boolean]) = mockContext.add(new CallHandler5[T1, T2, T3, T4, T5, R](this, matcher))

  def stubs(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5]) = mockContext.add(new CallHandler5[T1, T2, T3, T4, T5, R](this, v1, v2, v3, v4, v5)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter5[T1, T2, T3, T4, T5, Boolean]) = mockContext.add(new CallHandler5[T1, T2, T3, T4, T5, R](this, matcher)).anyNumberOfTimes
}

class MockFunction6[T1, T2, T3, T4, T5, T6, R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction6[T1, T2, T3, T4, T5, T6, R](mockContext, name) with MockFunction {

  def expects(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5], v6: MockParameter[T6]) = mockContext.add(new CallHandler6[T1, T2, T3, T4, T5, T6, R](this, v1, v2, v3, v4, v5, v6))
  def expects(matcher: FunctionAdapter6[T1, T2, T3, T4, T5, T6, Boolean]) = mockContext.add(new CallHandler6[T1, T2, T3, T4, T5, T6, R](this, matcher))

  def stubs(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5], v6: MockParameter[T6]) = mockContext.add(new CallHandler6[T1, T2, T3, T4, T5, T6, R](this, v1, v2, v3, v4, v5, v6)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter6[T1, T2, T3, T4, T5, T6, Boolean]) = mockContext.add(new CallHandler6[T1, T2, T3, T4, T5, T6, R](this, matcher)).anyNumberOfTimes
}

class MockFunction7[T1, T2, T3, T4, T5, T6, T7, R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction7[T1, T2, T3, T4, T5, T6, T7, R](mockContext, name) with MockFunction {

  def expects(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5], v6: MockParameter[T6], v7: MockParameter[T7]) = mockContext.add(new CallHandler7[T1, T2, T3, T4, T5, T6, T7, R](this, v1, v2, v3, v4, v5, v6, v7))
  def expects(matcher: FunctionAdapter7[T1, T2, T3, T4, T5, T6, T7, Boolean]) = mockContext.add(new CallHandler7[T1, T2, T3, T4, T5, T6, T7, R](this, matcher))

  def stubs(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5], v6: MockParameter[T6], v7: MockParameter[T7]) = mockContext.add(new CallHandler7[T1, T2, T3, T4, T5, T6, T7, R](this, v1, v2, v3, v4, v5, v6, v7)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter7[T1, T2, T3, T4, T5, T6, T7, Boolean]) = mockContext.add(new CallHandler7[T1, T2, T3, T4, T5, T6, T7, R](this, matcher)).anyNumberOfTimes
}

class MockFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R](mockContext, name) with MockFunction {

  def expects(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5], v6: MockParameter[T6], v7: MockParameter[T7], v8: MockParameter[T8]) = mockContext.add(new CallHandler8[T1, T2, T3, T4, T5, T6, T7, T8, R](this, v1, v2, v3, v4, v5, v6, v7, v8))
  def expects(matcher: FunctionAdapter8[T1, T2, T3, T4, T5, T6, T7, T8, Boolean]) = mockContext.add(new CallHandler8[T1, T2, T3, T4, T5, T6, T7, T8, R](this, matcher))

  def stubs(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5], v6: MockParameter[T6], v7: MockParameter[T7], v8: MockParameter[T8]) = mockContext.add(new CallHandler8[T1, T2, T3, T4, T5, T6, T7, T8, R](this, v1, v2, v3, v4, v5, v6, v7, v8)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter8[T1, T2, T3, T4, T5, T6, T7, T8, Boolean]) = mockContext.add(new CallHandler8[T1, T2, T3, T4, T5, T6, T7, T8, R](this, matcher)).anyNumberOfTimes
}

class MockFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R: Defaultable](mockContext: MockContext, name: Symbol)
  extends FakeFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](mockContext, name) with MockFunction {

  def expects(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5], v6: MockParameter[T6], v7: MockParameter[T7], v8: MockParameter[T8], v9: MockParameter[T9]) = mockContext.add(new CallHandler9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](this, v1, v2, v3, v4, v5, v6, v7, v8, v9))
  def expects(matcher: FunctionAdapter9[T1, T2, T3, T4, T5, T6, T7, T8, T9, Boolean]) = mockContext.add(new CallHandler9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](this, matcher))

  def stubs(v1: MockParameter[T1], v2: MockParameter[T2], v3: MockParameter[T3], v4: MockParameter[T4], v5: MockParameter[T5], v6: MockParameter[T6], v7: MockParameter[T7], v8: MockParameter[T8], v9: MockParameter[T9]) = mockContext.add(new CallHandler9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](this, v1, v2, v3, v4, v5, v6, v7, v8, v9)).anyNumberOfTimes
  def stubs(matcher: FunctionAdapter9[T1, T2, T3, T4, T5, T6, T7, T8, T9, Boolean]) = mockContext.add(new CallHandler9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](this, matcher)).anyNumberOfTimes
}
