object Q02{

  def main(args:Array[String]){
    
    println("Insert a number :- ")
    var input = scala.io.StdIn.readInt()

    input match{

      case x if input <= 0 => println("Negative/Zero is input")
      case x if input %2 == 0 => println("Even number is given")
      case x if input % 2!=0 => println("Odd number is given")


    }
  }

  }
