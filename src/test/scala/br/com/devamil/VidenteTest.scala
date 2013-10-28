package br.com.devamil

import org.specs2.mutable._
import br.com.devamil.model.Rodada

class VidenteTest extends Specification {

  "Um bom vidente" should {
    "prever um straight flush" in {
      Vidente.avalia(Rodada("TH JH QC QD QS QH KH AH 2S 6S")) must be equalTo "Mao: TH JH QC QD QS Monte: QH KH AH 2S 6S Melhor Jogo: straight-flush"
    }
    
    "prever uma quadra" in {
      Vidente.avalia(Rodada("2H 2S 3H 3S 3C 2D 3D 6C 9C TH")) must be equalTo "Mao: 2H 2S 3H 3S 3C Monte: 2D 3D 6C 9C TH Melhor Jogo: four-of-a-kind"
    }

    "prever um full house" in {
      Vidente.avalia(Rodada("2H 2S 3H 3S 3C 2D 9C 3D 6C TH")) must be equalTo "Mao: 2H 2S 3H 3S 3C Monte: 2D 9C 3D 6C TH Melhor Jogo: full-house"
    }
    
    "prever um flush" in {
      Vidente.avalia(Rodada("2H AD 5H AC 7H AH 6H 9H 4H 3C")) must be equalTo "Mao: 2H AD 5H AC 7H Monte: AH 6H 9H 4H 3C Melhor Jogo: flush"
    }
    
    "prever um straight" in {
      Vidente.avalia(Rodada("AC 2D 9C 3S KD 5S 4D KS AS 4C")) must be equalTo "Mao: AC 2D 9C 3S KD Monte: 5S 4D KS AS 4C Melhor Jogo: straight"
    }
    
    "prever uma trinca" in {
      Vidente.avalia(Rodada("KS AH 2H 3C 4H KC 2C TC 2D AS")) must be equalTo "Mao: KS AH 2H 3C 4H Monte: KC 2C TC 2D AS Melhor Jogo: three-of-a-kind"
    }

    "prever dois pares" in {
      Vidente.avalia(Rodada("AH 2C 9S AD 3C QH KS JS JD KD")) must be equalTo "Mao: AH 2C 9S AD 3C Monte: QH KS JS JD KD Melhor Jogo: two-pairs"
    }

    "prever um par" in {
      Vidente.avalia(Rodada("6C 9C 8C 2D 7C 2H TC 4C 9S AH")) must be equalTo "Mao: 6C 9C 8C 2D 7C Monte: 2H TC 4C 9S AH Melhor Jogo: one-pair"
    }

    "prever maior carta" in {
      Vidente.avalia(Rodada("3D 5S 2H QD TD 6S KH 9H AD QH")) must be equalTo "Mao: 3D 5S 2H QD TD Monte: 6S KH 9H AD QH Melhor Jogo: highest-card"
    }
  }
}