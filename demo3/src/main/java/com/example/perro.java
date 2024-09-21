package com.example;

public class perro {
    package com.mascotas.gestion;
    
    public class Perro extends Mascota {
    
        public Perro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
            super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
        }
    
        @Override
        public void hacerSonido() {
            System.out.println("El perro ladra: ¡Guau Guau!");
        }
    
        @Override
        public void alimentar() {
            System.out.println("El perro se alimenta con croquetas.");
        }
    
        @Override
        public void cuidar() {
            System.out.println("Al perro se le debe sacar a pasear y cepillar su pelaje.");
        }
    }
    

import com.example.animales.Mascota;

}
