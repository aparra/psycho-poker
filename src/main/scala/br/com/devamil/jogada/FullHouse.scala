package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.{ Agrupamento, Jogada }

object FullHouse extends Jogada {

  def avalia(cartas: List[Carta]): Boolean = {
    val agrupamento = Agrupamento.avalia(cartas)
    agrupamento.umPar && agrupamento.trinca
  } 
  
  def nome = "full-house"
  def ranking = 7  
}