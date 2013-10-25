package br.com.devamil.jogada.avaliador

import org.specs2.mutable._
import br.com.devamil.jogada.Cartas

class AgrupamentoTest extends Specification {

  "Um avaliador de agrupamento" should {
    "reconhecer UM par" in {
      val cartas = Cartas("2C 9C 8C 2D 7C")
      Agrupamento.avalia(cartas).umPar must beTrue
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beFalse
      Agrupamento.avalia(cartas).quadra must beFalse
    }
    
    "reconhecer DOIS pares" in {
      val cartas = Cartas("2C 9C 8C 2D 9D")
      Agrupamento.avalia(cartas).umPar must beFalse
      Agrupamento.avalia(cartas).doisPares must beTrue
      Agrupamento.avalia(cartas).trinca must beFalse
      Agrupamento.avalia(cartas).quadra must beFalse
    }

    "reconhecer UMA trinca" in {
      val cartas = Cartas("2C 9C 8C 9S 9D")
      Agrupamento.avalia(cartas).umPar must beFalse
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beTrue
      Agrupamento.avalia(cartas).quadra must beFalse
    }

    "reconhecer UMA quadra" in {
      val cartas = Cartas("9H 9C 8C 9S 9D")
      Agrupamento.avalia(cartas).umPar must beFalse
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beFalse
      Agrupamento.avalia(cartas).quadra must beTrue
    }

    "reconhecer UM par e UMA trinca" in {
      val cartas = Cartas("2C 9C 2H 9S 9D")
      Agrupamento.avalia(cartas).umPar must beTrue
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beTrue
      Agrupamento.avalia(cartas).quadra must beFalse
    }
  
    "reconhecer quando nao existe agrupamento" in {
      val cartas = Cartas("2C 3C 6H 7S 9D")
      Agrupamento.avalia(cartas).umPar must beFalse
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beFalse
      Agrupamento.avalia(cartas).quadra must beFalse
    }
  }
}
