

final class reader$_ {
def args = reader_sc.args$
def scriptPath = """reader.sc"""
/*<script>*/
import scala.io.Source
import scala.collection.mutable._
//import scala.collection.immutable._
object reader{
    def main(args: Array[String]):Unit={
        if (args.length > 0) {
            println("flag")
            for (line <- Source.fromFile(args(0)).getLines())
                println(line)
            }
        else
            Console.err.println("Please enter filename")
        val states=Map(1->"AMD",2->"CMD",3->"MDMA")
        println(states.apply(1))
        states(1)="Kunal"
        println(states(1))
        //Creating a sorted set Or Treeset with ordering, Ordering is optional
        val order=Ordering.fromLessThan[String](_>_)
        var tree=TreeSet.empty(order)
        tree+="one"+="two"+="three"+="four"+="Pratik"
        println(tree)
        tree-="one"
        println(tree)
        var seq:Seq[Int]=Array(5,3,2,1)
        println(seq)
        seq=seq.reverse
        println(seq)
    }    
}
/*</script>*/ /*<generated>*//*</generated>*/
}

object reader_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new reader$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export reader_sc.script as `reader`

