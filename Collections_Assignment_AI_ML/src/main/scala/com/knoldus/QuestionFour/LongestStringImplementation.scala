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

  print("The longest string using Built In method in the list is: " + longestStringImplementation.longestStringUsingBuiltInFunction(inputList) + "\n")
  print("The longest string using fold method method in the list is: " + longestStringImplementation.longestStringUsingFold(inputList) + "\n")
  print("The longest string using reduce method in the list is: " + longestStringImplementation.longestStringUsingReduce(inputList) + "\n")
  print(s"The longest string using Generic type parameters in the list is:  ")
  print(longestStringImplementation.longestStringUsingGeneric[String](inputList, (a,b) => if(a.length > b.length) a else b))
}
