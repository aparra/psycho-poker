package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.{ Sequencia, Jogada }

object Flush extends Jogada {

  def avalia(cartas: List[Carta]): Boolean =
    Sequencia.naipe.avalia(cartas) && !Sequencia.valor.avalia(cartas)

  def nome = "flush"
  def ranking = 6  
}