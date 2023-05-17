package com.softtek.modelo;

public class Avion extends Vehiculo implements Volador{
    public String despegar() {
        return "El avion esta despegando .";
    }

    @Override
    public String aterrizar() {
        return "El avion esta aterrizando.";
    }

    @Override
    public String volar() {
        return "El avion esta volando.";
    }


}
