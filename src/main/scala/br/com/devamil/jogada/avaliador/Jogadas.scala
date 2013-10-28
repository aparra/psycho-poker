package br.com.devamil.jogada.avaliador

import br.com.devamil.model.Carta
import br.com.devamil.jogada.{ StraightFlush, Quadra, FullHouse, Flush, Straight, Trinca, DoisPares, UmPar, MaiorCarta }

trait Jogada {
  def avalia(cartas: List[Carta]): Boolean
  def nome: String
  def ranking: Int
  def > (jogada: Jogada): Boolean = this.ranking > jogada.ranking
}

object Jogadas {
  private val possibilidades = List(StraightFlush, Quadra, FullHouse, Flush, Straight, Trinca, DoisPares, UmPar, MaiorCarta)
  def avalia(cartas: List[Carta]): Jogada = possibilidades.find(jogada => jogada.avalia(cartas)).get
}