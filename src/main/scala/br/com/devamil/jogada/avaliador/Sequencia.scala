package br.com.devamil.jogada.avaliador

import br.com.devamil.model.Carta
import br.com.devamil.model.Valor.AS

object Sequencia {

  object naipe {
    def avalia(cartas: List[Carta]): Boolean = cartas.groupBy(_.naipe).mapValues(_.size).values.size == 1
  }

  object valor {
    def avalia(cartas: List[Carta]): Boolean =
      if (cartas.exists(_.valor == AS))
        ehUmaSequencia(cartas.map(_.valor.ordinal)) || ehUmaSequencia(cartas.map(x => if (x.valor.ordinal == 0) 13 else x.valor.ordinal))
      else
        ehUmaSequencia(cartas.map(_.valor.ordinal))

    private def ehUmaSequencia(razoes: List[Int]): Boolean = !razoes.sortWith(_ < _).sliding(2).map(x => x(1) - x(0)).exists(_ != 1)
  }
}
