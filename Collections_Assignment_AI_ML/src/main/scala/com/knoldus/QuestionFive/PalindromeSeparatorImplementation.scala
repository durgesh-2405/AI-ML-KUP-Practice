//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionFive

import scala.io.StdIn.{readInt, readLine}

object PalindromeSeparatorImplementation extends App {
  print("Enter the number of strings you want to enter: " + "\n")
  val sizeOfList = readInt
  print(s"Enter $sizeOfList strings to the list:"  + "\n")
  val inputList: List[String] = List.fill(sizeOfList){
    readLine
  }

  val palindromeSeparatorImplementation = new PalindromeSeparatorApi

  print("Separated list of palindromes and non palindromes: ")
  print(palindromeSeparatorImplementation.separatePalindrome(inputList) + "\n")
  print("Separated list of palindromes and non palindromes using built in method: ")
  print(palindromeSeparatorImplementation.separatePalindromeUsingBuiltIn(inputList) + "\n")


}
