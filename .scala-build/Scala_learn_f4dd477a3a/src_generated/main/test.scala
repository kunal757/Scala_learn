

final class test$_ {
def args = test_sc.args$
def scriptPath = """test.sc"""
/*<script>*/
import scala.collection._
object HelloWorld {
  def main(args: Array[String]): Unit = {
    val a=Seq(1 to 10).flatten
    val b=a.map(i=> scala.math.pow(i,2)).reduce(_+_)-scala.math.pow(a.reduce(_+_),2)
    println(b.toLong)
  }
}
//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s
/*</script>*/ /*<generated>*//*</generated>*/
}

object test_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new test$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export test_sc.script as `test`

