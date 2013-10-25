package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.{ Agrupamento, Jogada }

object Quadra extends Jogada {

  def avalia(cartas: List[Carta]): Boolean = Agrupamento.avalia(cartas).quadra
  
  def nome = "four-of-a-kind"
}