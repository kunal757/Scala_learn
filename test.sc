import scala.collection._
object HelloWorld {
  def main(args: Array[String]): Unit = {
    val a=Seq(1 to 10)
    val b=a.map(_**2).reduce(_+_)-a.reduce(_+_)**2
    println(b)
  }
}