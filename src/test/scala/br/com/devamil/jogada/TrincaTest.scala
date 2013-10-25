package br.com.devamil.jogada

import org.specs2.mutable._

class TrincaTest extends Specification {

  "A jogada trinca" should {
    "ter o nome 'three-of-a-kind'" in {
      Trinca.nome must be equalTo "three-of-a-kind"
    }
    
    "ter o ranking 4" in {
      Trinca.ranking must be equalTo 4
    }
  }
  
  {val cartas = Cartas("2C 9C 2H 2D 7C"); cartas.mkString(" ") should {
    "formar a jogada trinca" in {
      Trinca.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 2H 2S 9D 9C"); cartas.mkString(" ") should {
    "nao forma a jogada trinca" in {
      Trinca.avalia(cartas) must beFalse
    }
  }}
}