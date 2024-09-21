package com.example;

public class gato {
    

public class Gato extends Mascota {

    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau Miau!");
    }

    @Override
    public void alimentar() {
        System.out.println("El gato se alimenta con alimento balanceado.");
    }

    @Override
    public void cuidar() {
        System.out.println("Al gato se le debe cepillar y limpiar regularmente.");
    }
}


@import com.example.animales.Mascota;

}



