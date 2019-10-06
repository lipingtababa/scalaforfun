object Closure{
  def main(args: Array[String]) {
    if(args.length < 1)
    {
      println("Please provide a number as args");
      return;
    }
    var given = args(0).toInt;

    val negativeMultiplier = (i:Int)=>multiplier(i) * -1;

    if( given < 0 ){
      println("This is a negative number");
      println("It is "+negativeMultiplier(given)+" after multipltion");
      return;
    }

    println("It is "+multiplier(given)+" after multipltion");

    return;
  }

  //You can modify the factor here
  var factor = 10;
  val multiplier = (i:Int)=>i * factor;
}
