package br.com.devamil.jogada.avaliador

import org.specs2.mutable._
import br.com.devamil.jogada.Cartas

class AgrupamentoTest extends Specification {

  {val cartas = Cartas("2C 9C 8C 2D 7C"); cartas.mkString(" ") should {
    "formam UM par" in {
      Agrupamento.avalia(cartas).umPar must beTrue
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beFalse
      Agrupamento.avalia(cartas).quadra must beFalse
    }
  }}

  {val cartas = Cartas("2C 9C 8C 2D 9D"); cartas.mkString(" ") should {
    "formam DOIS pares" in {
      Agrupamento.avalia(cartas).umPar must beFalse
      Agrupamento.avalia(cartas).doisPares must beTrue
      Agrupamento.avalia(cartas).trinca must beFalse
      Agrupamento.avalia(cartas).quadra must beFalse
    }
  }}

  {val cartas = Cartas("2C 9C 8C 9S 9D"); cartas.mkString(" ") should {
    "formam UMA trinca" in {
      Agrupamento.avalia(cartas).umPar must beFalse
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beTrue
      Agrupamento.avalia(cartas).quadra must beFalse
    }
  }}

  {val cartas = Cartas("9H 9C 8C 9S 9D"); cartas.mkString(" ") should {
    "formam UMA quadra" in {
      Agrupamento.avalia(cartas).umPar must beFalse
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beFalse
      Agrupamento.avalia(cartas).quadra must beTrue
    }
  }}

  {val cartas = Cartas("2C 9C 2H 9S 9D"); cartas.mkString(" ") should {
    "formam UM par e UMA trinca" in {
      Agrupamento.avalia(cartas).umPar must beTrue
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beTrue
      Agrupamento.avalia(cartas).quadra must beFalse
    }
  }}
  
  {val cartas = Cartas("2C 3C 6H 7S 9D"); cartas.mkString(" ") should {
    "nao formam nenhum grupo" in {
      Agrupamento.avalia(cartas).umPar must beFalse
      Agrupamento.avalia(cartas).doisPares must beFalse
      Agrupamento.avalia(cartas).trinca must beFalse
      Agrupamento.avalia(cartas).quadra must beFalse
    }
  }}
}
