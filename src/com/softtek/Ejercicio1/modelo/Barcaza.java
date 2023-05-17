package com.softtek.modelo;

public class Barcaza extends Vehiculo implements Nautico{
    public String atracar() {
        return "La Barzaca esta atracando.";
    }

    @Override
    public String navegar() {
        return "La Barzaca esta navegando.";
    }

}
