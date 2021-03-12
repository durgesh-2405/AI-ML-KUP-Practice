//Functional Assignment by Durgesh Gupta
package com.knoldus.NTimesDuplicate

import scala.io.StdIn.{readInt, readLine}

object NTimesDuplicateImpl extends App{
  print("Enter the size of list: \n")
  val sizeOfList = readInt()
  print("Enter the input list: \n")
  val inputList: List[Any] = List.fill(sizeOfList){
    readLine()
  }
  print("Enter the number of times duplication is required: \n")
  val numberOfDuplication = readInt()

  val nTimesDuplicateImpl = new NTimesDuplicateApi()
  val result = nTimesDuplicateImpl.duplicateNTimes(numberOfDuplication,inputList)
  print(result)


}
