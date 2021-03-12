//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.KthElementTest

import com.knoldus.KthElementOfList.KthElementApi
import org.scalatest.flatspec.AnyFlatSpec

class KthElementTest extends  AnyFlatSpec{
  val negativeInput:Double= -2
  val kthElementTest = new KthElementApi()

  //Test case for Character Type List
  "Kth Element" should "be valid for the elements of Character Type" in {
    val actualResult = kthElementTest.kthElementOfList(2,List('D','u','r','g','e','s','h'))
    assert(actualResult == 'r')
  }

  //Test case for String Type List
  "Kth Element" should "be valid for the elements of String Type" in {
    val actualResult = kthElementTest.kthElementOfList(3,List("Some","How","any","etc","something"))
    assert(actualResult == "etc")
  }

  //Test case for Integer Type List
  "Kth Element" should "be valid for elements of Integer Type" in {
    val actualResult = kthElementTest.kthElementOfList(1,List(0,1,2,3))
    assert(actualResult == 1)
  }


  //Test case for Any Type List
  "Nth Element" should "be valid if the elements are of Any Type" in {
    val actualResult = kthElementTest.kthElementOfList(1,List(0.1,"Durgesh","some",'D',0,1,'%','T',negativeInput))
    assert(actualResult == "Durgesh")
  }

  //Test case for invalid output
  "Nth Element" should "be invalid" in {
    val actualResult = kthElementTest.kthElementOfList(2,List('D','u','r','g','e','s','h'))
    assert(actualResult != 'u')
  }


}
