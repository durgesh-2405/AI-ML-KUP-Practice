//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionTwoTest

import com.knoldus.QuestionTwo.FactorsApi
import org.scalatest.flatspec.AnyFlatSpec

/* Here we are creating the unit test cases to test the
* factor method defined in the FactorsApi.
* */

class FactorsTest extends AnyFlatSpec{

  val factorsTest = new FactorsApi

  val valueOne = 15
  val valueTwo = 25
  val valueThree = 3
  val valueFour = 5

  "Factor method" should "be valid for a prime number" in {
    val result = factorsTest.factors(valueThree)
    assert(result == List())
  }

  "Factor method" should "be valid " in {
    val result = factorsTest.factors(valueOne)
    assert(result == List(valueThree,valueFour))
  }

  "Factor method" should "be invalid" in {
    val result = factorsTest.factors(valueOne)
    assert(result != List())
  }




}
