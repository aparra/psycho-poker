package br.com.devamil.jogada.avaliador

import br.com.devamil.model.Carta
import br.com.devamil.jogada.{ StraightFlush, Quadra, FullHouse, Flush, Straight, Trinca, DoisPares, UmPar, MaiorCarta }

trait Jogada {
  def avalia(cartas: List[Carta]): Boolean
  def nome: String
  def ranking: Int
}

object Jogadas {

  private val possibildiades = List(StraightFlush, Quadra, FullHouse, Flush, Straight, Trinca, DoisPares, UmPar, MaiorCarta)

  def avalia(cartas: List[Carta]): Jogada = possibildiades.find(_.avalia(cartas)).get
}