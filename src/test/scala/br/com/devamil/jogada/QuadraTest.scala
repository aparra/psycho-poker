package br.com.devamil.jogada

import org.specs2.mutable._

class QuadraTest extends Specification {

  "A jogada quadra" should {
    "ter o nome 'four-of-a-kind'" in {
      Quadra.nome must be equalTo "four-of-a-kind"
    }
  }
  
  {val cartas = Cartas("2C 2H 2S 2D 7C"); cartas.mkString(" ") should {
    "formar a jogada quadra" in {
      Quadra.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 2H 8C 2D 7C"); cartas.mkString(" ") should {
    "nao forma a jogada um par" in {
      Quadra.avalia(cartas) must beFalse
    }
  }}
}