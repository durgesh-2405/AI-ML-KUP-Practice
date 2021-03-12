//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.PrintValuesBy5

import scala.annotation.tailrec

class PrintingValuesByFiveApi {
  @tailrec
  final def valuesByFives(presentItem: Int, lastItem: Int, outputList: List[Int]): List[Int] = {
    if(presentItem <= lastItem) {
      valuesByFives(presentItem, lastItem-5, outputList :+ lastItem)
    }
    else{
      outputList.reverse
    }
  }

}
