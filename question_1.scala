//19001037
object myapp extends App{

  var x = new Rational(2)
  println(x.neg)
}

class Rational(n:Int,d:Int) {
  require(d>0,"d must be greater than 0")
  def numer = n
  def denom = d
  def this(n:Int) = this(n,1)
  def neg = new Rational(-this.numer,this.denom)
  override def toString = numer+"/"+denom

}
