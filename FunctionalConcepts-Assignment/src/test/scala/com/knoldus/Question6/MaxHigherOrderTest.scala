//Functional Assignment by Durgesh Gupta
package com.knoldus.Question6

import org.scalatest.flatspec.AnyFlatSpec

class MaxHigherOrderTest extends AnyFlatSpec {

  val maxHigherOrderTest = new MaximumHigherOrderApi()
  "Maximum Higher Order Method " should "be valid" in {
    val actualResult = maxHigherOrderTest.maxInHigherOrder((100,50,300),maxHigherOrderTest.maxOfTwo)
    val expectedResult = 300
    assert(actualResult === expectedResult)
  }

  "Maximum Higher Order Method" should "be invalid" in {
    val actualResult = maxHigherOrderTest.maxInHigherOrder((35,90,108),maxHigherOrderTest.maxOfTwo)
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

}
