//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.RemovingDuplicates

import scala.io.StdIn.{readInt, readLine}

object RemovingDuplicatesImpl extends App{

  val removingDuplicatesImpl = new RemovingDuplicatesApi()
  print("Enter the number of elements in the list: \n")
  val sizeOfList = readInt()
  print("Enter the input list: \n")
  val inputList: List[Any] = List.fill(sizeOfList){
    readLine()
  }
  val result = removingDuplicatesImpl.removingDuplicate(inputList,Nil)
  print(result)

}
