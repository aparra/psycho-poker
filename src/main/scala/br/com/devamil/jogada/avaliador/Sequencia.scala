package br.com.devamil.jogada.avaliador

import br.com.devamil.model.Carta
import br.com.devamil.model.Valor.AS

object Sequencia {

  object naipe {
    def avalia(cartas: List[Carta]): Boolean =
      cartas.groupBy(_.naipe).mapValues(_.size).values.size == 1
  }

  object valor {

    def avalia(cartas: List[Carta]): Boolean = {
      val razoes = cartas.map(_.valor.ordinal).sortWith(_ < _).sliding(2).map(x => x(1) - x(0))

      if (cartas.exists(_.valor == AS))
        !razoes.exists(_ != 1) || !cartas.map(x => if (x.valor.ordinal == 0) 13 else x.valor.ordinal).sortWith(_ < _).sliding(2).map(x => x(1) - x(0)).exists(_ != 1)
      else
        !razoes.exists(_ != 1)
    }
  }
}
