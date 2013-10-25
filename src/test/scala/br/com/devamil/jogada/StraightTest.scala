package br.com.devamil.jogada

import org.specs2.mutable._

class StraightTest extends Specification {

  "A jogada straight" should {
    "ter o nome 'straight'" in {
      Straight.nome must be equalTo "straight"
    }
  }
  
  {val cartas = Cartas("2C 3C 4H 5D 6C"); cartas.mkString(" ") should {
    "formar a jogada straight" in {
      Straight.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 2H 2S 9D 9C"); cartas.mkString(" ") should {
    "nao forma a jogada straight" in {
      Straight.avalia(cartas) must beFalse
    }
  }}  
}