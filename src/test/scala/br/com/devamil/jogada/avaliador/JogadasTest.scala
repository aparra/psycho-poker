package br.com.devamil.jogada.avaliador

import org.specs2.mutable._
import br.com.devamil.jogada.Cartas

class JogadasTest extends Specification {

  "Um avaliador de jogadas" should {
    "reconhecer um straight flush" in {
      Jogadas.avalia(Cartas("2C 3C 4C 5C 6C")).nome must be equalTo "straight-flush"
    }
    
    "reconhecer uma quadra" in {
      Jogadas.avalia(Cartas("3S 3C 3H 5D 3D")).nome must be equalTo "four-of-a-kind"
    }
    
    "reconhecer um full house" in {
      Jogadas.avalia(Cartas("3S 3C 3H 5D 5C")).nome must be equalTo "full-house"
    }

    "reconhecer um flush" in {
      Jogadas.avalia(Cartas("2C 3C 4C TC KC")).nome must be equalTo "flush"
    }

    "reconhecer um straight" in {
      Jogadas.avalia(Cartas("2S 3D 4C 5C 6C")).nome must be equalTo "straight"
    }

    "reconhecer uma trinca" in {
      Jogadas.avalia(Cartas("2S 2D 4C 2H 6C")).nome must be equalTo "three-of-a-kind"
    }

    "reconhecer dois pares" in {
      Jogadas.avalia(Cartas("2S 2D 4C 4H 6C")).nome must be equalTo "two-pairs"
    }
    
    "reconhecer um par" in {
      Jogadas.avalia(Cartas("2S 2D 5C 7H 6C")).nome must be equalTo "one-pair"
    }

    "reconhecer maior carta" in {
      Jogadas.avalia(Cartas("2S 3D 5C 8H KC")).nome must be equalTo "highest-card"
    }
  }
}