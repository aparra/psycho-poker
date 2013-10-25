package br.com.devamil.jogada

import br.com.devamil.model.Carta
import br.com.devamil.jogada.avaliador.Jogada

object MaiorCarta extends Jogada {

  def avalia(cartas: List[Carta]): Boolean = true
  
  def nome = "highest-card"
  def ranking = 1  
}