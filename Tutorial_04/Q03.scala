object Q03{

  def main(args:Array[String])
  {
    print("Enter any string :- ")
    var name  = scala.io.StdIn.readLine()
    println("1.conert to uppercase\n")
    println("2.convert to lowercase\n")
    println("Enter your choice\n")
    var x = scala.io.StdIn.readInt()

    if(x==1)
    {
      println( formatNames(name)(toUpper(_)))
    }else{
      println( formatNames(name)(toLower(_)))
    }
  }

  def formatNames(name:String)(func : String => String):String= {
    func(name)
  }
 
  def toUpper(n:String) :String = {

       n.toUpperCase()
    }

  def toLower(n:String) : String = {
       n.toLowerCase()
  }

}
