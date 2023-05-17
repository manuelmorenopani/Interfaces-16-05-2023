package com.softtek.presentacion;

import com.softtek.Ejercicio4.*;

public class MainEjercicio4 {
    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao(new AcessoDesarrollo());
        Cliente cliente = new Cliente("Manuel", "1234567890");

        System.out.println(dao.insertar(cliente));

        dao.setId(new AcessoProduccion());
        System.out.println(dao.insertar(cliente));

    }
}
