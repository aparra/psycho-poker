package br.com.devamil.jogada

import org.specs2.mutable._

class DoisParesTest extends Specification {

  "A jogada dois pares" should {
    "ter o nome 'two-pairs'" in {
      DoisPares.nome must be equalTo "two-pairs"
    }
  }
  
  {val cartas = Cartas("2C 9C 8C 2D 9D"); cartas.mkString(" ") should {
    "formar a jogada dois pares" in {
      DoisPares.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 2H 8C 2D 7C"); cartas.mkString(" ") should {
    "nao forma a jogada dois pares" in {
      DoisPares.avalia(cartas) must beFalse
    }
  }}
}