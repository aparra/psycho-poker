package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.Agrupamento
import br.com.devamil.jogada.avaliador.Sequencia

object Straight {

  def avalia(cartas: List[Carta]): Boolean = Sequencia.valor.avalia(cartas)
  
  def nome = "straight"
}