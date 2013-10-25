package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.Agrupamento

object UmPar {

  def avalia(cartas: List[Carta]): Boolean = {
    val agrupamento = Agrupamento.avalia(cartas)
    agrupamento.umPar && !agrupamento.doisPares && !agrupamento.trinca
  } 
  
  def nome = "one-pair"
}
