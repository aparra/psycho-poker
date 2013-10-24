package br.com.devamil.jogada.avaliador

import br.com.devamil.model.Carta

object Sequencia {

  object naipe {
    def avalia(cartas: List[Carta]): Boolean =
      cartas.groupBy(_.naipe).mapValues(_.size).values.size == 1
  }

  object valor {
    def avalia(cartas: List[Carta]): Boolean = {
      cartas.map(_.valor.ordinal()).reduce(_ - _) == 1
    }
  }
}