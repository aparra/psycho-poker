package br.com.devamil.model;

import java.util.HashMap;
import java.util.Map;

public enum Valor {

    AS("A"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("T"),
    VALETE("J"),
    DAMA("Q"),
    REI("K");
    
    private String simbolo;

    private static Map<String, Valor> mapBySimbolo = new HashMap<String, Valor>();

    static {
        for (Valor valor : Valor.values()) {
            mapBySimbolo.put(valor.simbolo, valor);
        }
    }

    private Valor(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public static Valor from(String simbolo) {
        return mapBySimbolo.get(simbolo);
    }
}
