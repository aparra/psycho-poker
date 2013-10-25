package br.com.devamil.jogada

import org.specs2.mutable._

class FlushTestTest extends Specification {

  "A jogada flush" should {
    "ter o nome 'flush'" in {
      Flush.nome must be equalTo "flush"
    }
  }
  
  {val cartas = Cartas("2C 9C 3C 8C TC"); cartas.mkString(" ") should {
    "formar a jogada flush" in {
      Flush.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 3C 4C 2D 8C"); cartas.mkString(" ") should {
    "nao forma a jogada flush" in {
      Flush.avalia(cartas) must beFalse
    }
  }}
  
  {val cartas = Cartas("2C 3C 4C 5C 6C"); cartas.mkString(" ") should {
    "nao forma a jogada flush" in {
      Flush.avalia(cartas) must beFalse
    }
  }}

}