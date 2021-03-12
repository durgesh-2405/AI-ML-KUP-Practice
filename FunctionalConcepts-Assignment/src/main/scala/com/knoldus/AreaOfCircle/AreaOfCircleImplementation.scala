//Functional Assignment by Durgesh Gupta
package com.knoldus.AreaOfCircle

import scala.io.StdIn.readLine

object AreaOfCircleImplementation extends App{
  print("Enter the radius of the circle: \n")
  val inputRadius= readLine()
  val areaOfCircleImplementation = new AreaOfCircleApi()
  print("The area of circle is: " + areaOfCircleImplementation.areaOfCircle(inputRadius))

}
