package com.knoldus

trait SecondSolution {
 def area(breadth: Double, length: Double):Double={
   breadth*length
 }

}
class Rectangle extends  SecondSolution {
  override def area(breadth: Double, length: Double): Double={
breadth*length
  }
}
class Square extends Rectangle{
  override def area(breadth: Double, length: Double): Double = {


    if(breadth==length){
      breadth*breadth
    }
    else
      super.area(length,breadth)
  }
}
object SecondSolution{
  def main(args: Array[String]): Unit = {
    val objectRectangle = new Rectangle
    print(objectRectangle.area(10,100) + "    ")
    val objectSquare = new Square
    print(objectSquare.area(10,10))
  }
}