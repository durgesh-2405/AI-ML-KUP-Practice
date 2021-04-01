//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionThree

/* Here we are creating an FirstItem Api class which contains
* four different methods that will return the elements from starting
* to the count that has been provided.*/

class FirstItemsApi {
  /* Recursive method that will return the first x elements.
  * */
  def firstWithRecursion[A](inputList: List[A], countOfItems: Int): List[A] ={
    if(countOfItems > 0 && inputList.tail != Nil){
      inputList.head :: firstWithRecursion(inputList.tail, countOfItems-1)
    }
    else{
      Nil
    }
  }

  /* For loop method defined that will return the first x elements from the list
  * */

  def firstUsingForLoop[A](inputList: List[A], countOfItems: Int): List[A] ={
    val outputList = for(iterator <- 0 until countOfItems) yield inputList(iterator)
    outputList.toList
  }

  /* Here we are using in built method take to return the first c elements from the list.
  *  */

  def firstUsingInBuiltMethod[A](inputList: List[A], countOfItems: Int): List[A] ={
   inputList take countOfItems
  }

  /*Here we are defining the foldLeft method that will return first x elements
  * from the list.
  * */


  def firstUsingFoldLeft[A](inputList: List[A], countOfItems: Int): List[A] ={
    inputList.foldLeft[List[A]](Nil){
      (a: List[A], i: A) =>
        if(a.size >= countOfItems){
          a
        }
        else{
          i :: a
        }
    }.reverse
  }



}
