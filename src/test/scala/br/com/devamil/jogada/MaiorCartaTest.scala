package br.com.devamil.jogada

import org.specs2.mutable._

class MaiorCartaTest extends Specification {

  "A jogada maior carta" should {
    "ter o nome 'highest-card'" in {
      MaiorCarta.nome must be equalTo "highest-card"
    }
    
    "ter o ranking 3" in {
      MaiorCarta.ranking must be equalTo 1
    }
  }
}