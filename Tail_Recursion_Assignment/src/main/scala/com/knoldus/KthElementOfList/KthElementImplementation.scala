//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.KthElementOfList

import scala.io.StdIn.{readInt, readLine}

object KthElementImplementation extends App{
  print("Enter the number of the elements in the list: \n")
  val sizeoflist = readInt()
  print("Enter the input list: \n")
  val inputlist: List[Any]= List.fill(sizeoflist){
    readLine()
  }
  print("Enter the kth index: \n")
  val kthIndex = readInt()

  val kthElementImplementation = new KthElementApi()
  val result = kthElementImplementation.kthElementOfList(kthIndex, inputlist)
  print(result)

}
