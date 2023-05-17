package com.softtek.fundamentos.modelo;

public class Tallerpintura implements Taller{

    @Override
    public String reparar(Coche c) {
        return "El coche esta pintado";
    }
}
