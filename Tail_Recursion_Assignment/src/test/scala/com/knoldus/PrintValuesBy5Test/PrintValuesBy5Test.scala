//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.PrintValuesBy5Test

import com.knoldus.PrintValuesBy5.PrintingValuesByFiveApi
import org.scalatest.flatspec.AnyFlatSpec

class PrintValuesBy5Test extends AnyFlatSpec{
  val five = 5
  val ten = 10
  val fifteen = 15
  val twenty= 20
  val twentyFive = 25
  val thirty = 30
  val thirtyFive = 35
  val fourty = 40
  val fourtyFive = 45
  val fifty = 50
  val printValuesBy5Test = new PrintingValuesByFiveApi()

  "The values between [5,50] " should "be valid " in {
    val result = printValuesBy5Test.valuesByFives(five,fifty,Nil)
    assert(result == List(five,ten,fifteen,twenty,twentyFive,thirty,thirtyFive,fourty,fourtyFive,fifty))
  }

  "The values between [10,30] " should "be valid " in {
    val result = printValuesBy5Test.valuesByFives(ten,thirty,Nil)
    assert(result == List(ten,fifteen,twenty,twentyFive,thirty))
  }

  "The values between [10,30] " should "be invalid " in {
    val result = printValuesBy5Test.valuesByFives(ten,thirty,Nil)
    assert(result != List(ten,fifteen,twenty,twentyFive,thirtyFive))
  }



}
