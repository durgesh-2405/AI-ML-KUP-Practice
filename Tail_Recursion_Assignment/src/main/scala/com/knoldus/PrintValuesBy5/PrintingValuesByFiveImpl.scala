//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.PrintValuesBy5

import scala.io.StdIn.readInt

object PrintingValuesByFiveImpl extends App {
  val printingValuesByFiveApi = new PrintingValuesByFiveApi()
  print("Enter the starting value in between 5 to 50: \n")
  val firstValue: Int = readInt()
  print("Enter the end value in between 5 to 50: \n")
  val lastvalue: Int = readInt()
  if((firstValue>=5 && firstValue <= 50) && (lastvalue>=5 && lastvalue <=50)){
    val result = printingValuesByFiveApi.valuesByFives(firstValue,lastvalue,Nil)
    print(result)
  }
  else{
    print("Please enter a valid input...")
  }

}
