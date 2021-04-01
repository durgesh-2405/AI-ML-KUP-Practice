//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionFourTest

import com.knoldus.QuestionFour.LongestStringApi
import org.scalatest.flatspec.AnyFlatSpec

/*Here we are defining unit test cases to test the different methods defined
* in the LongestStringApi Class.
* */

class LongestStringTest extends AnyFlatSpec{

  val longestStringTest = new LongestStringApi

  val inputListOfString= List("Durgesh Gupta","Praanav","Tanishka", "Nikhil", "Priya", "Swantika","Rahul")

  //Unit Test cases to test the longestStringUsingGeneric method.
  "longestStringUsingGeneric method" should "be valid" in {
    val actualResult = longestStringTest.longestStringUsingGeneric[String](inputListOfString, (a,b) => if (a.length > b.length) a else b)
    val expectedResult = "Durgesh Gupta"
    assert(actualResult === expectedResult)
  }

  "longestStringUsingGeneric method" should "be invalid" in {
    val actualResult = longestStringTest.longestStringUsingGeneric[String](inputListOfString, (a,b) => if (a.length > b.length) a else b)
    val expectedResult = "Praanav"
    assert(actualResult != expectedResult)
  }

  //Unit Test cases to test the  longestStringUsingFold method
  "longestStringUsingFold method" should "be valid" in {
    val actualResult = longestStringTest.longestStringUsingFold(inputListOfString)
    val expectedResult = "Durgesh Gupta"
    assert(actualResult === expectedResult)
  }

  "longestStringUsingFold method" should "be invalid" in {
    val actualResult = longestStringTest.longestStringUsingFold(inputListOfString)
    val expectedResult = "Praanav"
    assert(actualResult != expectedResult)
  }

  //Unit test cases to test the longestStringUsingReduce method
  "longestStringUsingReduce method" should "be valid" in {
    val actualResult = longestStringTest.longestStringUsingReduce(inputListOfString)
    val expectedResult = "Durgesh Gupta"
    assert(actualResult === expectedResult)
  }

  "longestStringUsingReduce method" should "be invalid" in {
    val actualResult = longestStringTest.longestStringUsingReduce(inputListOfString)
    val expectedResult = "Praanav"
    assert(actualResult != expectedResult)
  }

  //Unit test cases to test the longestStringUsingBuiltInFunction method
  "longestStringUsingBuiltInFunction method" should "be valid" in {
    val actualResult = longestStringTest.longestStringUsingBuiltInFunction(inputListOfString)
    val expectedResult = "Durgesh Gupta"
    assert(actualResult === expectedResult)
  }

  "longestStringUsingBuiltInFunction method" should "be invalid" in {
    val actualResult = longestStringTest.longestStringUsingBuiltInFunction(inputListOfString)
    val expectedResult = "Praanav"
    assert(actualResult != expectedResult)
  }



}
