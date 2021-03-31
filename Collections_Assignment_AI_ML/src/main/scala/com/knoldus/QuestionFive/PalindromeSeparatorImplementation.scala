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

  print(palindromeSeparatorImplementation.separatePalindrome(inputList))

}
