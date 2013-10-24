package br.com.devamil.model

case class Carta(valor: Valor, naipe: Naipe) {
  require(valor != null && naipe != null, "carta.invalida")
  
  override def toString = valor.getSimbolo() + naipe.getSimbolo()
}

object Carta {
  
  private val pattern = """^([A2-9TJQK])([CDSH])$""".r
  
  def apply(valor: String): Carta = valor match {
    case pattern(valor, naipe) => new Carta(Valor.from(valor), Naipe.from(naipe))
    case _ => throw new IllegalArgumentException("carta.invalida")  
  }
}
