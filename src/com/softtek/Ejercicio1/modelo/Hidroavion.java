package com.softtek.modelo;

public class Hidroavion extends Avion implements Nautico {
    public String atracar() {
        return "La Hidroavion esta atracando.";
    }

    @Override
    public String navegar() {
        return "La Hidroavion esta navegando.";
    }

    public String volar() {
        return "La Hidroavion esta volando.";
    }
    public String aterrizar() {
        return "La Hidroavion esta aterrizando.";
    }
    public String despegar() {
        return "La Hidroavion esta aterrizando.";
    }
}
