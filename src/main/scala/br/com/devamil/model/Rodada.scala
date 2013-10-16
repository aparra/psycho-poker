package br.com.devamil.model

import scala.util.matching.Regex
import scala.util.parsing.combinator.RegexParsers

case class Rodada(mao: List[Carta], monte: List[Carta]) {
  require(mao != null && mao.size == 5)
  require(monte != null && monte.size == 5)
}

object Rodada extends RegexParsers {

  def carta: Parser[Carta] = """([A2-9TJQK][CDSH])""".r ^^ { Carta(_) }
  def rodada = repN(5, carta) ~ repN(5, carta) ^^ { case mao ~ carta => new Rodada(mao, carta) }

  def apply(entrada: String): Rodada = parseAll(rodada, entrada) match {
    case Success(resultado, _) => resultado
    case failure: NoSuccess => throw new IllegalArgumentException("rodada.invalida")
  }
}
