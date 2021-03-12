//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.SlicingList

import scala.io.StdIn.{readInt, readLine}

object SlicingListImplementation extends App {
  val slicingListImplementation = new SlicingListApi()
  print("Enter the number of list: \n")
  val sizeOfList = readInt()
  print("Enter the input list: \n")
  val inputList: List[Any] = List.fill(sizeOfList){
    readLine()
  }
  print("Enter the ith index: \n")
  val ithIndex: Int = readInt()
  print("Enter the kth index: \n")
  val kthIndex: Int = readInt()

  val result = slicingListImplementation.listSlicing(ithIndex, kthIndex, inputList)
  print(result)

}
