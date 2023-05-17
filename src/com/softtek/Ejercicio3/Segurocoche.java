package com.softtek.Ejercicio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Segurocoche {
    @Autowired
    Taller t;
    String aseguradora;
    public Segurocoche(Taller t, String aseguradora) {
        this.t = t;
        this.aseguradora = aseguradora;
    }

    public Taller getT() {
        return t;
    }

    public void setT(Taller t) {
        this.t = t;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }



    public String reparar (Coche c) {
        return t.reparar(c);
    }
}
