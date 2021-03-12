//Functional Assignment by Durgesh Gupta
package com.knoldus.NTimesDuplicate

import org.scalatest.flatspec.AnyFlatSpec

class NTimesDuplicationTest extends AnyFlatSpec{

  val nTimesDuplicationTest = new NTimesDuplicateApi()

  //Test case for Character Type List
  "N times duplication" should "be valid if the elements are of Character Type" in {
    val actualResult = nTimesDuplicationTest.duplicateNTimes(3,List('a','b','c'))
    val expectedResult = List('a','a','a','b','b','b','c','c','c')
    assert(actualResult === expectedResult)
  }

  //Test case for String Type List
  "N times duplication" should "be valid if the elements are of String type" in {
    val actualResult = nTimesDuplicationTest.duplicateNTimes(2,List("Durgesh","Gupta"))
    val expectedResult = List("Durgesh","Durgesh","Gupta","Gupta")
    assert(actualResult === expectedResult)
  }

  //Test case for Integer Type List
  "N Times Duplication" should "be valid for the elements  Integer Type" in {
    val actualResult = nTimesDuplicationTest.duplicateNTimes(3,List(1,2,3))
    val expectedResult = List(1,1,1,2,2,2,3,3,3)
    assert(actualResult === expectedResult)
  }

  //Test case for Any Type List
  "N Times Duplication" should "be valid for the elements are of Any Type" in {
    val actualResult = nTimesDuplicationTest.duplicateNTimes(3,List(1.1,"some",3,'a','%'))
    val expectedResult = List(1.1,1.1,1.1,"some","some","some",3,3,3,'a','a','a','%','%','%')
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "N time should " should "be invalid" in {
    val actualResult = nTimesDuplicationTest.duplicateNTimes(3,List(1.1,"some",3,'a','%'))
    val expectedResult = List(3,3,3)
    assert(actualResult != expectedResult)
  }


}
