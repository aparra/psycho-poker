package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.Sequencia

object Flush {

  def avalia(cartas: List[Carta]): Boolean = Sequencia.naipe.avalia(cartas)
  
  def nome = "flush"
}