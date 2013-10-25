package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.{ Agrupamento, Jogada }

object DoisPares extends Jogada {

  def avalia(cartas: List[Carta]): Boolean = Agrupamento.avalia(cartas).doisPares
  
  def nome = "two-pairs"
  def ranking = 3
}