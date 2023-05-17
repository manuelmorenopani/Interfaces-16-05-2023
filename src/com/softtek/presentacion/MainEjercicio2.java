package com.softtek.presentacion;

import com.softtek.Ejercicio2.*;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Conductor conductor = new Conductor(new Coche(0));
        System.out.println(conductor.conducir());
    }
}
