package com.inaccurate.playground

import org.scalatest.{FeatureSpec, Matchers}

class NumberPrinterTest extends FeatureSpec with Matchers {
  feature ("Class extensions through type class") {
    scenario ("Verifying all functionality from NumberPrinter") {
      import com.inaccurate.playground.NumberPrinter._

      123.print should be ("Int: 123")
      123f.print should be ("Float: 123.0")
      123d.print should be ("Double: 123.0")
    }
  }
}
