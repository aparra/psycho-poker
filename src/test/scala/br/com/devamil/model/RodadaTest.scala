package br.com.devamil.model

import org.specs2.mutable._

class RodadaTest extends Specification {
  
  "Uma Rodada" should {
    val rodada = Rodada("TH JH QC QD QS QH KH AH 2S 6S")

    "ter 5 cartas de mao" in {
      rodada.mao must have size(5)
    }

    "ter 5 cartas de monte" in {
      rodada.monte must have size(5)
    }
  }
}