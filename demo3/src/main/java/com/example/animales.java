package com.example;

public class animales {
    

    public abstract class Mascota {
        private String nombre;
        private String especie;
        private String raza;
        private int edad;
        private String tamaño;
        private String color;
        private String estadoSalud;
    
        public Mascota(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
            this.nombre = nombre;
            this.especie = especie;
            this.raza = raza;
            this.edad = edad;
            this.tamaño = tamaño;
            this.color = color;
            this.estadoSalud = estadoSalud;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public String getEspecie() {
            return especie;
        }
    
        public String getRaza() {
            return raza;
        }
    
        public int getEdad() {
            return edad;
        }
    
        public String getTamaño() {
            return tamaño;
        }
    
        public String getColor() {
            return color;
        }
    
        public String getEstadoSalud() {
            return estadoSalud;
        }
    
        // Métodos abstractos
        public abstract void hacerSonido();
        public abstract void alimentar();
        public abstract void cuidar();
    
        // Método concreto
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Especie: " + especie);
            System.out.println("Raza: " + raza);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Tamaño: " + tamaño);
            System.out.println("Color: " + color);
            System.out.println("Estado de salud: " + estadoSalud);
        }
    }
    


}
