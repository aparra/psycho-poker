package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.{ Agrupamento, Jogada }

object Trinca extends Jogada {

  def avalia(cartas: List[Carta]): Boolean = {
    val agrupamento = Agrupamento.avalia(cartas)
    agrupamento.trinca && !agrupamento.umPar
  } 
  
  def nome = "three-of-a-kind"
}