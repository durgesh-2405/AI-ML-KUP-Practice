//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionThreeTest

import com.knoldus.QuestionThree.FirstItemsApi
import org.scalatest.flatspec.AnyFlatSpec

class FirstItemsTest extends AnyFlatSpec {

  val firstItemsTest = new FirstItemsApi

  //Unit Test cases to test the firstUsingInBuiltMethod method
  "firstUsingInBuiltMethod method" should "be valid for the List of Char" in {
    val actualResult = firstItemsTest.firstUsingInBuiltMethod(List('D','u', 'r','g','e','s','h'),2)
    val expectedResult = List('D','u')
    assert(actualResult === expectedResult)
  }

  "firstUsingInBuiltMethod method" should "be valid for List of String" in {
    val actualResult = firstItemsTest.firstUsingInBuiltMethod(List("Hello", "How", "are","you"),3)
    val expectedResult = List("Hello", "How", "are")
    assert(actualResult === expectedResult)
  }

  "firstUsingInBuiltMethod method" should "be valid for List of Int" in {
    val actualResult = firstItemsTest.firstUsingInBuiltMethod(List(1,0,2,3),3)
    val expectedResult = List(1,0,2)
    assert(actualResult === expectedResult)
  }

  "firstUsingInBuiltMethod method" should "be valid for List of Double" in {
    val actualResult = firstItemsTest.firstUsingInBuiltMethod(List(1.1,2.2,3.3,0.1),2)
    val expectedResult = List(1.1,2.2)
    assert(actualResult === expectedResult)
  }

  "firstUsingInBuiltMethod method" should "be invalid" in {
    val actualResult = firstItemsTest.firstUsingInBuiltMethod(List("Hello", "How", "are","you"),3)
    val expectedResult =  List("How")
    assert(actualResult != expectedResult)
  }

  //Unit Test cases to test the firstUsingForLoop method
  "firstUsingForLoop method" should "be valid for List of Char" in {
    val actualResult = firstItemsTest.firstUsingForLoop(List('D','u', 'r','g','e','s','h'),2)
    val expectedResult = List('D','u')
    assert(actualResult === expectedResult)
  }

  "firstUsingForLoop method" should "be valid for List of String" in {
    val actualResult = firstItemsTest.firstUsingForLoop(List("Hello", "How", "are","you"),3)
    val expectedResult = List("Hello", "How", "are")
    assert(actualResult === expectedResult)
  }

  "firstUsingForLoop method" should "be valid for List of Int" in {
    val actualResult = firstItemsTest.firstUsingForLoop(List(1,0,2,3),3)
    val expectedResult = List(1,0,2)
    assert(actualResult === expectedResult)
  }

  "firstUsingForLoop method" should "be valid for List of  Double" in {
    val actualResult = firstItemsTest.firstUsingForLoop(List(1.1,2.2,3.3,0.1),2)
    val expectedResult = List(1.1,2.2)
    assert(actualResult === expectedResult)
  }

  "firstUsingForLoop method" should "be invalid" in {
    val actualResult = firstItemsTest.firstUsingForLoop(List('a','e', 'u'),2)
    val expectedResult =  List('a')
    assert(actualResult != expectedResult)
  }

  //Unit test cases to test the firstUsingFoldLeft method
  "firstUsingFoldLeft method" should "be valid for List of Char" in {
    val actualResult = firstItemsTest.firstUsingFoldLeft(List('D','u', 'r','g','e','s','h'),2)
    val expectedResult = List('D','u')
    assert(actualResult === expectedResult)
  }

  "firstUsingFoldLeft method" should "be valid for List of String" in {
    val actualResult = firstItemsTest.firstUsingFoldLeft(List("Hello", "How", "are","you"),3)
    val expectedResult = List("Hello", "How", "are")
    assert(actualResult === expectedResult)
  }

  "firstUsingFoldLeft method" should "be valid for List of type Int" in {
    val actualResult = firstItemsTest.firstUsingFoldLeft(List(1,0,2,3),3)
    val expectedResult = List(1,0,2)
    assert(actualResult === expectedResult)
  }

  "firstUsingFoldLeft method" should "be valid if List is of type Double" in {
    val actualResult = firstItemsTest.firstUsingFoldLeft(List(1.1,2.2,3.3,0.1),2)
    val expectedResult = List(1.1,2.2)
    assert(actualResult === expectedResult)
  }

  "firstUsingFoldLeft method" should "be invalid" in {
    val actualResult = firstItemsTest.firstUsingFoldLeft(List('a','e', 'u'),2)
    val expectedResult =  List('a')
    assert(actualResult != expectedResult)
  }

  //Unit Test cases to test the firstWithRecursion method
  "firstWithRecursion method" should "be valid for List  of Char" in {
    val actualResult = firstItemsTest.firstWithRecursion(List('D','u', 'r','g','e','s','h'),2)
    val expectedResult = List('D','u')
    assert(actualResult === expectedResult)
  }

  "firstWithRecursion method" should "be valid for List of  String" in {
    val actualResult = firstItemsTest.firstWithRecursion(List("Hello", "How", "are","you"),3)
    val expectedResult = List("Hello", "How", "are")
    assert(actualResult === expectedResult)
  }

  "firstWithRecursion method" should "be valid for List of Int" in {
    val actualResult = firstItemsTest.firstWithRecursion(List(1,0,2,3),3)
    val expectedResult = List(1,0,2)
    assert(actualResult === expectedResult)
  }

  "firstWithRecursion method" should "be valid for List of Double" in {
    val actualResult = firstItemsTest.firstWithRecursion(List(1.1,2.2,3.3,0.1),2)
    val expectedResult = List(1.1,2.2)
    assert(actualResult === expectedResult)
  }

  "firstWithRecursion method" should "be invalid" in {
    val actualResult = firstItemsTest.firstWithRecursion(List('a','e', 'u'),2)
    val expectedResult =  List('a')
    assert(actualResult != expectedResult)
  }



}
