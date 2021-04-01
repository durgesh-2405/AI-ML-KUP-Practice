//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionFour

/*Here are are creating a class LongestStringApi which contains four methods
* that return the longest string present in the list.
* */
class LongestStringApi {
  /*Here we are defining the BuiltIn function that will return the longest
  * string present in the list.
  * */

  def longestStringUsingBuiltInFunction(inputList: List[String]): String ={
    inputList.minBy(0 - _.length)
  }


  /*Here we are defining the fold function that will return the longest
  * string present in the list.
  * */

  def longestStringUsingFold(inputList: List[String]):String={
    inputList.fold("")((iteratorOne, iteratorTwo) => if(iteratorOne.length < iteratorTwo.length) iteratorTwo else iteratorOne)
  }

  /*Here we are defining the reduce function that will return the longest
  * string present in the list.
  * */

  def longestStringUsingReduce(inputList: List[String]): String={
    inputList.reduce(((iteratorOne, iteratorTwo) => if(iteratorOne.length < iteratorTwo.length) iteratorTwo else iteratorOne))
  }

  /*Here we are defining the function with a Generic list as parameter that will return the longest
  * string present in the list.
  * */

  def longestStringUsingGeneric[A](inputList: List[A], max: (A,A) => A): A ={
    inputList reduce((a,b)=> max(a,b))
  }



}
