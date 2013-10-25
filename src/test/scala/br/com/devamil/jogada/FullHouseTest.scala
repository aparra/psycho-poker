package br.com.devamil.jogada

import org.specs2.mutable._

class FullHouseTest extends Specification {

  "A jogada full house" should {
    "ter o nome 'full-house'" in {
      FullHouse.nome must be equalTo "full-house"
    }

    "ter o ranking 7" in {
      FullHouse.ranking must be equalTo 7
    }
  }
  
  {val cartas = Cartas("2C 9C 2H 9S 9D"); cartas.mkString(" ") should {
    "formar a jogada full house" in {
      FullHouse.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 2H 2S 2D 8D"); cartas.mkString(" ") should {
    "nao forma a jogada full house" in {
      FullHouse.avalia(cartas) must beFalse
    }
  }}
}