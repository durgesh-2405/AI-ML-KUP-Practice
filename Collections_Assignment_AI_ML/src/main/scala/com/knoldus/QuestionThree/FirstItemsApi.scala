//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionThree

class FirstItemsApi {
  def first[A](inputList: List[A], countOfItems: Int): List[A] ={
    if(countOfItems > 0 && inputList.tail != Nil){
      inputList.head :: first(inputList.tail, countOfItems-1)
    }
    else{
      Nil
    }
  }


}
