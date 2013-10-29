package br.com.devamil

import br.com.devamil.model.{ Carta, Rodada }
import br.com.devamil.jogada.avaliador.{ Jogada, Jogadas => analisador }

object Vidente {

  def avalia(rodada: Rodada): String = {
    var maiorJogada: Jogada = analisador.avalia(rodada.mao)

    for (trocas <- split(rodada.monte)) {
      for (combinacao <- combina(rodada.mao, trocas)) {
        var jogada = analisador.avalia(combinacao)
        if (jogada > maiorJogada) maiorJogada = jogada
      }
    }  
    
    s"$rodada Melhor Jogo: ${maiorJogada.nome}"
  }

  private def split(cartas: List[Carta]) =
    for (i <- 1 to cartas.size) yield cartas.slice(0, i)
  
  private def combina(mao: List[Carta], trocas: List[Carta]) =
    mao.combinations(mao.size - trocas.size).map(_ ++ trocas)
}
