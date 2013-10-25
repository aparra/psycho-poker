package br.com.devamil.jogada

import org.specs2.mutable._

class StraightFlushTest extends Specification {

  "A jogada straight flush" should {
    "ter o nome 'straight-flush'" in {
      StraightFlush.nome must be equalTo "straight-flush"
    }
  }
  
  {val cartas = Cartas("2C 3C 4C 5C 6C"); cartas.mkString(" ") should {
    "formar a jogada straight flush" in {
      StraightFlush.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 3H 4S 5D 6C"); cartas.mkString(" ") should {
    "nao forma a jogada straight flush" in {
      StraightFlush.avalia(cartas) must beFalse
    }
  }}
  
  {val cartas = Cartas("2C 3C 4C 5C 7C"); cartas.mkString(" ") should {
    "nao forma a jogada straight flush" in {
      StraightFlush.avalia(cartas) must beFalse
    }
  }}  
}
