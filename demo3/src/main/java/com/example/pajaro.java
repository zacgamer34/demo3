package com.example;

public class pajaro {
    

public class Pajaro extends Mascota {

    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro canta: ¡Pío Pío!");
    }

    @Override
    public void alimentar() {
        System.out.println("El pájaro se alimenta con semillas y frutas.");
    }

    @Override
    public void cuidar() {
        System.out.println("Al pájaro se le debe limpiar la jaula y darle agua fresca.");
    }
}


@import com.example.animales.Mascota;

}


