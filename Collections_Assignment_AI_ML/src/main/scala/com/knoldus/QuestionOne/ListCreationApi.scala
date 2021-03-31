//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionOne

class ListCreationApi {

  def usingForLoop (startValue: Long, endValue: Long): IndexedSeq[Long] ={
    for (iterator <- startValue to endValue; value = iterator * 2 + 1) yield value
  }


  def usingFilter(startValue: Long, endValue: Long): IndexedSeq[Long] = {
    startValue to endValue filter(_ % 2 == 1)
  }


  def usingMap(startValue: Long, endValue: Long): IndexedSeq[Long] ={
    startValue to endValue map(_ * 2 + 1)
  }

}
