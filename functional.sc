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
        OncePerSecond(()=>println("Iski behen ki mjje mjje"))
    }
}
// Need to learn multithreading for this
