package br.com.devamil

import org.specs2.mutable._
import br.com.devamil.model.Rodada

class VidenteTest extends Specification {

  "Um bom vidente" should {
    "prever um straight flush" in {
      Vidente.melhorJogada(Rodada("TH JH QC QD QS QH KH AH 2S 6S")) must be equalTo "straight-flush"
    }
    
    "prever uma quadra" in {
      Vidente.melhorJogada(Rodada("2H 2S 3H 3S 3C 2D 3D 6C 9C TH")) must be equalTo "four-of-a-kind"
    }

    "prever um full house" in {
      Vidente.melhorJogada(Rodada("2H 2S 3H 3S 3C 2D 9C 3D 6C TH")) must be equalTo "full-house"
    }
    
    "prever um flush" in {
      Vidente.melhorJogada(Rodada("2H AD 5H AC 7H AH 6H 9H 4H 3C")) must be equalTo "flush"
    }
    
    "prever um straight" in {
      Vidente.melhorJogada(Rodada("AC 2D 9C 3S KD 5S 4D KS AS 4C")) must be equalTo "straight"
    }
    
    "prever uma trinca" in {
      Vidente.melhorJogada(Rodada("KS AH 2H 3C 4H KC 2C TC 2D AS")) must be equalTo "three-of-a-kind"
    }

    "prever dois pares" in {
      Vidente.melhorJogada(Rodada("AH 2C 9S AD 3C QH KS JS JD KD")) must be equalTo "two-pairs"
    }

    "prever um par" in {
      Vidente.melhorJogada(Rodada("6C 9C 8C 2D 7C 2H TC 4C 9S AH")) must be equalTo "one-pair"
    }

    "prever maior carta" in {
      Vidente.melhorJogada(Rodada("3D 5S 2H QD TD 6S KH 9H AD QH")) must be equalTo "highest-card"
    }
  }
}