package com.softtek.presentacion;
import com.softtek.Ejercicio3.*;
public class MainEjercicio3 {
    public static void main(String[] args) {
        Segurocoche segurocoche = new Segurocoche(new Tallermecanica(), "Mafre");
        Coche coche = new Coche("123412341234", "Deportivo");
        System.out.println(segurocoche.reparar(coche));
        segurocoche.setT(new Tallerpintura());
        System.out.println(segurocoche.reparar(coche));


    }
}
