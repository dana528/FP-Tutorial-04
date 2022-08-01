object Q01{

  def main(args:Array[String])
  {
    print("\nEnter your deposit amount:-\n");
    var depo_value = scala.io.StdIn.readDouble();
    println(depo_value);

    cal_interest(depo_value);
  }

  def cal_interest(n:Double)
  {
    if(n <= 20000){
      var x = n *0.02;
      println("Interest = " + x);
    }
    else if(n <= 200000)
    {
      var x = n * 0.04;
      println("Interest = " + x);
    }
    else if(n <= 2000000)
    {
      var x = n * 0.035;
      println("Interest = " + x);
    }
     else
    {
      var x = n * 0.065;
      println("Interest = " + x);
    }

}
}
