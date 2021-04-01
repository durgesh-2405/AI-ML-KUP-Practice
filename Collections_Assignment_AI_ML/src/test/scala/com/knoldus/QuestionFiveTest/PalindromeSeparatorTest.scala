//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionFiveTest

import com.knoldus.QuestionFive.PalindromeSeparatorApi
import org.scalatest.flatspec.AnyFlatSpec

/* Here we are writing unit test cases to test the methods defined in the
* PalindromeSeparatorApi that will return the two list
* one containing the list of palindrome and other with non palindrome*/

class PalindromeSeparatorTest  extends AnyFlatSpec{

  val separatorTest = new PalindromeSeparatorApi
  val testList = List("otto","Durgesh","Hi","Hello","racecar")

  //Unit Test cases to test separatePalindromeUsingBuiltIn method
  "separatePalindromeUsingBuiltIn method" should "be valid" in {
    val actualResult = separatorTest.separatePalindromeUsingBuiltIn(testList)
    val expectedResult = (List("otto","racecar"), List("Durgesh","Hi","Hello"))
    assert(actualResult === expectedResult)
  }


  "separatePalindromeUsingBuiltIn method" should "be invalid" in {
    val actualResult = separatorTest.separatePalindromeUsingBuiltIn(testList)
    assert(actualResult != null)
  }

  //Unit Test cases to test the separatePalindrome method
  "separatePalindrome method" should "be valid" in {
    val actualResult = separatorTest.separatePalindrome(testList)
    val expectedResult = (List("racecar", "otto"),List("Hello", "Hi", "Durgesh"))
    assert(actualResult === expectedResult)
  }


  "separatePalindrome method" should "be invalid" in {
    val actualResult = separatorTest.separatePalindrome(testList)
    assert(actualResult != null)
  }





}
