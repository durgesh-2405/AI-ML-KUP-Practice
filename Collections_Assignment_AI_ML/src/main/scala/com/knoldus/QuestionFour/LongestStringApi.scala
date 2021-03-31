//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionFour

class LongestStringApi {
  def longestString(inputList: List[String]): String ={
    inputList.minBy(0 - _.length)
  }

}
