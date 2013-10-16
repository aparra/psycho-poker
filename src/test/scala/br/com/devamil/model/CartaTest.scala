package br.com.devamil.model

import org.specs2.mutable._
import br.com.devamil.model.Naipe._
import br.com.devamil.model.Valor._

class CartaTest extends Specification {

  "Uma Carta DOIS de PAUS representada por 2C" should {
    val doisPaus = Carta("2C")

    "ter o Valor DOIS" in {
      doisPaus.valor must be equalTo DOIS  
    }
    
    "ser do Naipe PAUS" in {
      doisPaus.naipe must be equalTo PAUS  
    }
  }
}