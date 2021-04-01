//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionTwo
/*Here we are creating an FactorsApi class
* that contains a method factors which will return
* a list containing factors of the given input value.
* */
class FactorsApi {
  def factors(inputValue: Int): List[Int] ={
    (2 until inputValue-1 filter(inputValue % _ ==0)).toList

  }

}
