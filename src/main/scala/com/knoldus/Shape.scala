trait Shape {
  val width: Double
  val height: Double

  def area: Double = {
    width * height
  }
}

class Square(side: Double) extends Shape {
  override val height: Double = side
  override val width: Double = side
}

class Rectangle(length: Double, breadth: Double) extends Shape {
  override val width: Double = length
  override val height: Double = breadth
}

object Shape {
  def main(args: Array[String]): Unit = {
    val objSquare = new Square(10)
    println("area of square: " + objSquare.area)
    val objRectangle = new Rectangle(10, 20)
    println("area of rectangle: " + objRectangle.area)
  }
}