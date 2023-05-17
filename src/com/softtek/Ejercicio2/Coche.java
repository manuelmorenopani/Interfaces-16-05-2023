package com.softtek.Ejercicio2;

public class Coche implements Vehiculo {
    int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    public String moverse() {
        if (deposito > 0) {
            return "El coche se esta moviendo.";
        } else {
            return "El coche no se esta movimiento";
        }
    }
}
