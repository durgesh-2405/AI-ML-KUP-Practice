//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionFour

import scala.io.StdIn.{readInt, readLine}

object LongestStringImplementation extends App{
  print("Enter the number of strings you want to enter: " + "\n")
  val sizeOfList = readInt
  print(s"Enter $sizeOfList strings to the list:"  + "\n")
  val inputList: List[String] = List.fill(sizeOfList){
    readLine
  }

  val longestStringImplementation = new LongestStringApi()

  print("The longest string in the list is: " + longestStringImplementation.longestString(inputList) + "\n")
}
