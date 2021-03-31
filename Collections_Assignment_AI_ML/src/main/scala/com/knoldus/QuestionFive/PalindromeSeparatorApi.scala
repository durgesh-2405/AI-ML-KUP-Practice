//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionFive

class PalindromeSeparatorApi {
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

}
