package br.com.devamil.jogada.avaliador

import org.specs2.mutable._
import br.com.devamil.jogada.Cartas

class SequenciaTest extends Specification {

  "Um avaliador de sequencia de naipes" should {
    "reconhecer uma sequencia" in {
      Sequencia.naipe.avalia(Cartas("2C 9C 8C 3C 7C")) must beTrue
    }
    
    "reconhecer quando nao existe sequencia" in {
      Sequencia.naipe.avalia(Cartas("2C 3C 4C 5D 6C")) must beFalse
    }
  }
  
  "Um avaliador de sequencia de valores" should {
    "reconhecer uma sequencia" in {
      Sequencia.valor.avalia(Cartas("2C 3C 4C 5C 6C")) must beTrue
    }
    
    "reconhecer quando nao existe sequencia" in {
      Sequencia.valor.avalia(Cartas("2C 9C 8C 2D 7C")) must beFalse
    }
  }
}