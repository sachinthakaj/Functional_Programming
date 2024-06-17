@main def main() =
  println(s"Area of the disk is " + Q1Area())
  println("Fahrenheit value of 35`C is " + Q2Fahrenheit() )
  println("Volume of the  sphere with radius 5 is " + Q3volume())
  println("Total wholesale cost for 60 copies is " + Q4wholesalecost())
  println("Total running time is " + Q5totalrunningtime() + " minutes")

def Q1Area() =
  val pi = math.Pi
  val r = 5
  pi * r * r

def Q2Fahrenheit() =
  val temp = 35.00
  temp * 1.80 + 32.00

def Q3volume() =
  val pi = math.Pi
  val r = 5.0
  (4.0 / 3.0) * pi * r * r * r

def Q4wholesalecost() =
  val price = 24.95
  val copies = 60
  val discount = 0.40
  val ship50 = 3
  val shipadd = 0.75
  val discountprice = price * (1 - discount)
  val shippingprice = ship50 + (copies - 50) * shipadd
  discountprice * 60 + shippingprice

def Q5totalrunningtime() =
  val easypace = 4
  val tempo = 3
  val easytimeper1km = 8
  val tempotimeper1km = 7
  easypace * easytimeper1km + tempo * tempotimeper1km







