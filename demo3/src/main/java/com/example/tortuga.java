package com.example;

public class tortuga {
    
package com.mascotas.gestion;

public class Tortuga extends Mascota {

    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La tortuga no emite sonidos característicos.");
    }

    @Override
    public void alimentar() {
        System.out.println("La tortuga se alimenta con vegetales y frutas.");
    }

    @Override
    public void cuidar() {
        System.out.println("La tortuga necesita un entorno limpio y con agua fresca.");
    }
}


import com.example.animales.Mascota;

}
