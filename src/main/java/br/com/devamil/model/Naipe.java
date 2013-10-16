package br.com.devamil.model;

import java.util.HashMap;
import java.util.Map;

public enum Naipe {

    PAUS("C"),
    OURO("D"),
    ESPADA("S"),
    COPAS("H");
    
    private static Map<String, Naipe> mapBySimbolo = new HashMap<String, Naipe>();

    static {
        for (Naipe naipe : Naipe.values()) {
            mapBySimbolo.put(naipe.simbolo, naipe);
        }
    }
    
    private String simbolo;

    private Naipe(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public static Naipe from(String simbolo) {
        return mapBySimbolo.get(simbolo);
    }
}
