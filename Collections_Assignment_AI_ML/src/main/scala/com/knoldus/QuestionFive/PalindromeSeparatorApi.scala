//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionFive

/*Here we are creating a class Palindrome Separator which contains two methods
* that will return two list one containing the palindrome strings and other contains
* non palindrome strings.*/

class PalindromeSeparatorApi {
  /*Here we are defining a method separatePalindrome with full implementation.
  * that will return the two list one containing the palindrome strings and other contains
  * non palindrome strings.
  * */
  def separatePalindrome (inputList: List[String]): (List[String], List[String]) ={
    inputList.foldLeft((List[String](),List[String]())){
      (iteratorOne,iteratorTwo) =>
        if(iteratorTwo == iteratorTwo.reverse){
          (iteratorTwo :: iteratorOne._1,iteratorOne._2)
        }
        else{
          (iteratorOne._1,iteratorTwo :: iteratorOne._2)

        }
    }
  }

  /*Here we are defining a method separatePalindromeUsingBuiltIn using a built in method partition
  * that will return the two list one containing the palindrome strings and other contains
  * non palindrome strings.
  * */

  def separatePalindromeUsingBuiltIn(inputList: List[String]): (List[String], List[String]) = {
    inputList partition(string => string == string.reverse)
  }


}
