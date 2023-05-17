package com.softtek.presentacion;

import com.softtek.Ejercicio1.modelo.*;


public class Main {
    public static void main(String[] args) {
        Nautico barcaza = new Barcaza();
        Nautico hidroavion = new Hidroavion();
        Volador avion = new Avion();
        Volador ave = new Ave();
        Volador superman = new Superman();

        Volador[] voladores = {avion, ave, superman, (Volador) hidroavion};

        for (Volador volador : voladores) {
            System.out.println(volador.despegar());
            System.out.println(volador.volar());
            System.out.println(volador.aterrizar());

            if (volador instanceof Ave) {
                System.out.println(((Ave) volador).hacerNido());
                System.out.println(((Ave) volador).ponerHuevos());
                System.out.println(((Ave) volador).comer());
            }

            if (volador instanceof Superman) {
                System.out.println(((Superman) volador).saltarEdificio());
                System.out.println(((Superman) volador).detenerBala());
                System.out.println(((Superman) volador).comer());
            }
            if (volador instanceof Hidroavion){
                System.out.println(((Hidroavion) hidroavion).atracar());
                System.out.println(((Hidroavion) hidroavion).navegar());
            }

        }
        Nautico [] nauticos = {barcaza, hidroavion};
        for (Nautico nautico : nauticos) {
            System.out.println(nautico.atracar());
            System.out.println(nautico.navegar());

            if (nautico instanceof Hidroavion) {
                System.out.println(((Hidroavion) nautico).despegar());
                System.out.println(((Hidroavion) nautico).aterrizar());
                System.out.println(((Hidroavion) nautico).volar());
            }
        }

    }

}
