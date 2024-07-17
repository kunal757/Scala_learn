

final class functional$_ {
def args = functional_sc.args$
def scriptPath = """functional.sc"""
/*<script>*/
//This is to show that everything in Scala is an object, even all the datatypes
object functional{
    def OncePerSecond(poc: ()=>Unit):Unit={
        while(true){
            poc()
            Thread.sleep(1000)
        }
    }
    def timeflies():Unit={
        println("Time flies like a bird")
    }
    def main(args:Array[String]):Unit={
        OncePerSecond(timeflies)
        OncePerSecond(()=>println("Tester2"))
    }
}
// Need to learn multithreading for this

/*</script>*/ /*<generated>*//*</generated>*/
}

object functional_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new functional$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export functional_sc.script as `functional`

