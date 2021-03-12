//Functional Assignment by Durgesh Gupta
package com.knoldus.ListSplit

import org.scalatest.flatspec.AnyFlatSpec

class ListSplitTest extends AnyFlatSpec{

  val listSplitTest = new ListSplitApi()

  //Test case for Character Type List
  "Split Method " should "be valid if the elements are of Character Type" in {
    val actualResult = listSplitTest.splitListFunction(2,List('a','b','c'))
    val expectedResult = (List('a','b') ,List('c'))
    assert(actualResult === expectedResult)
  }

  //Test case for String Type List
  "Split method" should "be valid if the elements are of String Type" in {
    val actualResult = listSplitTest.splitListFunction(2,List("Some","How","Any","How"))
    val expectedResult = (List("Some","How"),List("Any","How"))
    assert(actualResult === expectedResult)
  }

  //Test case for Integer Type List
  "Split Method " should "be valid if the elements are of Integer Type" in {
    val actualResult = listSplitTest.splitListFunction(2,List(1,2,3,0,1,2))
    val expectedResult = (List(1,2),List(3,0,1,2))
    assert(actualResult === expectedResult)
  }


  //Test case for Any Type List
  "Split" should "be valid if the elements are of Any Type" in {
    val actualResult = listSplitTest.splitListFunction(2,List(1.1,"Durgesh",3,'a','%'))
    val expectedResult = (List(1.1,"Durgesh"),List(3,'a','%'))
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "Split" should "be invalid" in {
    val actualResult = listSplitTest.splitListFunction(2,List(1.1,"Durgesh",3,'a','%'))
    val expectedResult = (List(1.1,1.1,"Durgesh","Durgesh",3,3),List())
    assert(actualResult != expectedResult)
  }



}
