//Functional Assignment by Durgesh Gupta
package com.knoldus.Question7

class MultiplicationInHigherOrderApi {

  /*Higher order function with input1 as parameter returning a function with input2 as parameter
  which is returning multiplication of input1 and input2 */
  def multiply(input1: Int): Int => Int = (input2: Int) => input1 * input2

}
