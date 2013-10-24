package br.com.devamil.jogada.avaliador

import br.com.devamil.model.Carta

object Agrupamento {

  def avalia(cartas: List[Carta]) = new {
    val avaliacao = cartas.groupBy(_.valor).mapValues(_.size).values

    def umPar = avaliacao.filter(_ == 2).size == 1

    def doisPares = avaliacao.filter(_ == 2).size == 2

    def trinca = avaliacao.exists(_ == 3)

    def quadra = avaliacao.exists(_ == 4)
  }
}