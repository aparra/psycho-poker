package br.com.devamil.jogada

import scala.util.parsing.combinator.RegexParsers
import br.com.devamil.model.Carta

object Cartas extends RegexParsers {

  def carta: Parser[Carta] = """([A2-9TJQK][CDSH])""".r ^^ { Carta(_) }
  def rodada = repN(5, carta)

  def apply(entrada: String): List[Carta] = parseAll(rodada, entrada) match {
    case Success(resultado, _) => resultado
    case failure: NoSuccess => throw new IllegalArgumentException("cartas.invalida")
  }
}