package com.softtek.modelo;
import com.softtek.modelo.Kriptoniano;
public class Superman extends Kriptoniano implements Volador {
    public String despegar() {
        return "Superman está despegando hacia el cielo.";
    }

    @Override
    public String aterrizar() {
        return "Superman está aterrizando suavemente.";
    }

    @Override
    public String volar() {
        return "Superman está volando a gran velocidad.";
    }

    public String saltarEdificio() {
        return "Superman está saltando un edificio.";
    }

    public String detenerBala() {
        return "Superman está deteniendo una bala.";
    }

    public String comer() {
        return super.comer();
    }
}

