package com.softtek.modelo;
import com.softtek.modelo.Animal;
public class Ave extends Animal implements Volador {
    public String despegar() {
        return "El ave está volando desde el suelo.";
    }

    @Override
    public String aterrizar() {
        return "El ave está aterrizando en una rama.";
    }

    @Override
    public String volar() {
        return "El ave está volando por el cielo.";
    }

    public String hacerNido() {
        return "El ave está haciendo un nido.";
    }

    public String ponerHuevos() {
        return "El ave está poniendo huevos en el nido.";
    }
    public String comer() {
        return super.comer();
    }
}
