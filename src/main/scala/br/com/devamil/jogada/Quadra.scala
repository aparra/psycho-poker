package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.Agrupamento

object Quadra {

  def avalia(cartas: List[Carta]): Boolean = {
    val agrupamento = Agrupamento.avalia(cartas)
    agrupamento.quadra
  } 
  
  def nome = "four-of-a-kind"
}