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
  
  "Tentar criar uma Rodada invalida usando o parser" should {
    "lancar IllegalArgumentException para cartas invalidas" in {
      (Rodada("69 JH QC QD QS QH KH AH 2S 6S")) must throwA(new IllegalArgumentException("rodada.invalida"))
    }

    "lancar IllegalArgumentException para numero cartas invalidas" in {
      (Rodada("QS QH KH AH 2S 6S")) must throwA(new IllegalArgumentException("rodada.invalida"))
      (Rodada("TH JH QC QD QS QH KH AH 2S 6S 2H")) must throwA(new IllegalArgumentException("rodada.invalida"))
    }
  }
  
  "Tentar criar uma Rodada invalida 'na mao'" should {
    "lancar IllegalArgumentException para valores nulos" in {
      (new Rodada(null, null)) must throwAn[IllegalArgumentException]
    }
    
    "lancar IllegalArgumentException para numero de cartas" in {
      (new Rodada(List(Carta("QS")), List(Carta("QD")))) must throwAn[IllegalArgumentException]
    }
  }
}