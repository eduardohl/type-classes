package com.inaccurate.playground

trait NumberPrinter[A] {
  def print(number: A): String
}

object NumberPrinter {

  def apply[A](implicit printer: NumberPrinter[A]): NumberPrinter[A] = printer

  implicit class NumberPrinterOps[A: NumberPrinter](number: A) {
    def print: String = NumberPrinter[A].print(number)
  }

  implicit val intPrinter: NumberPrinter[Int] = int => s"Int: $int"
  implicit val floatPrinter: NumberPrinter[Float] = float => s"Float: $float"
  implicit val doublePrinter: NumberPrinter[Double] = double => s"Double: $double"
}