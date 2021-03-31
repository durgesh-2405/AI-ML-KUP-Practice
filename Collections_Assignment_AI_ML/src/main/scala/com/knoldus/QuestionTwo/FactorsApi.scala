//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionTwo

class FactorsApi {
  def factors(inputValue: Int, list: List[Int] = List()): List[Int] = {
    for(iterator <- 2 until inputValue + 1 if inputValue % iterator == 0) {
      factors(inputValue / iterator, list :+ iterator)
    }
    list
  }

}
