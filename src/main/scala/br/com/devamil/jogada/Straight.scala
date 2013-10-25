package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.{ Sequencia, Jogada }

object Straight extends Jogada {

  def avalia(cartas: List[Carta]): Boolean = 
    Sequencia.valor.avalia(cartas) && !Sequencia.naipe.avalia(cartas)
  
  def nome = "straight"
}