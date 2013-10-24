package br.com.devamil.jogada.avaliador

import org.specs2.mutable._
import br.com.devamil.jogada.Cartas

class SequenciaValorTest  extends Specification {

  {val cartas = Cartas("2C 3C 4C 5C 6C"); cartas.mkString(" ") should {
    "formam UMA sequencia de valor" in {
      Sequencia.naipe.avalia(cartas) must beTrue
    }
  }}
  
  {val cartas = Cartas("2C 9C 8C 2D 7C"); cartas.mkString(" ") should {
    "nao formam uma sequencia de valor" in {
      Sequencia.naipe.avalia(cartas) must beFalse
    }
  }}
}