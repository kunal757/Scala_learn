

final class chapter$minus9$_ {
def args = chapter$minus9_sc.args$
def scriptPath = """chapter-9.sc"""
/*<script>*/
object curry{
    def first(x: Int) = (y: Int) => x + y
    def main(args:Array[String]):Unit={
        val second= first(5)
        println(second(2))
    }
}
/*</script>*/ /*<generated>*//*</generated>*/
}

object chapter$minus9_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new chapter$minus9$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export chapter$minus9_sc.script as `chapter-9`

