package br.com.devamil.jogada.avaliador

import org.specs2.mutable._
import br.com.devamil.jogada.Cartas

class SequenciaNaipeTest extends Specification {

  {val cartas = Cartas("2C 9C 8C 3C 7C"); cartas.mkString(" ") should {
    "formam UMA sequencia de naipe" in {
      Sequencia.naipe.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 9C 8C 2D 7C"); cartas.mkString(" ") should {
    "nao formam uma sequencia de naipe" in {
      Sequencia.naipe.avalia(cartas) must beFalse
    }
  }}
}