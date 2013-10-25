package br.com.devamil.jogada

import org.specs2.mutable._

class UmParTest extends Specification {

  "A jogada um par" should {
    "ter o nome 'one-pair'" in {
      UmPar.nome must be equalTo "one-pair"
    }
  }
  
  {val cartas = Cartas("2C 9C 8C 2D 7C"); cartas.mkString(" ") should {
    "formar a jogada um par" in {
      UmPar.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 2H 8C 2D 7C"); cartas.mkString(" ") should {
    "nao forma a jogada um par" in {
      UmPar.avalia(cartas) must beFalse
    }
  }}
}