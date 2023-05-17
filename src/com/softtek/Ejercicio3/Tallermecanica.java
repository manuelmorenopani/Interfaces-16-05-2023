package com.softtek.fundamentos.modelo;

import org.springframework.stereotype.Component;

@Component
public class Tallermecanica implements Taller{
    public String reparar(Coche c) {
        return "El coche esta reparado";
    }
}
