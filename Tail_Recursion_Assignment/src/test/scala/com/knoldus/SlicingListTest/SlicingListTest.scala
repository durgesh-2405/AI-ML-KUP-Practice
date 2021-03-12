//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.SlicingListTest

import com.knoldus.SlicingList.SlicingListApi
import org.scalatest.flatspec.AnyFlatSpec

class SlicingListTest extends  AnyFlatSpec{
  val negativeInput: Double = -2
  val slicingListTest = new SlicingListApi
  //Test case for Character Type List
  "Slice" should "be valid if the elements are of Character Type" in {
    val actualResult = slicingListTest.listSlicing(1,3,List('D','u','r','g','e','s','h'))
    val expectedResult = List('u','r','g','e')
    assert(actualResult === expectedResult)
  }

  //Test case for String Type List
  "Slice" should "be valid if the elements are of String Type" in {
    val actualResult = slicingListTest.listSlicing(1,3,List("some","how","Anything","etc"))
    val expectedResult = List("how")
    assert(actualResult === expectedResult)
  }

  //Test case for Integer Type List
  "Slice" should "be valid if the elements are of Integer Type" in {
    val actualResult = slicingListTest.listSlicing(1,3,List(1,2,0,3))
    val expectedResult = List(2)
    assert(actualResult === expectedResult)
  }

  //Test case for Double Type List
  "Slice" should "be valid if the elements are of Double Type" in {
    val actualResult = slicingListTest.listSlicing(1,3,List(0.1,1.1,1.1,2.2))
    val expectedResult = List(1.1)
    assert(actualResult === expectedResult)
  }

  //Test case for Any Type List
  "Slice" should "be valid if the elements are of Any Type" in {
    val actualResult = slicingListTest.listSlicing(1,3,List(0.1,"Durgesh","Gupta",'a',"string",'%','x',negativeInput))
    val expectedResult = List("Durgesh","Gupta",'a',"string",'%')
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "Slice" should "be invalid" in {
    val actualResult = slicingListTest.listSlicing(1,3,List('D','u','r','g','e','s','h'))
    val expectedResult = List('r')
    assert(actualResult != expectedResult)
  }


}
