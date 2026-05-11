package com.herencia;

public class Vehiculo {
    private int numAsientos;
    private String color;
    private String modelo;
    private int año;
    private int hp;
    private int numPuertas;

    //Constructor
    public Vehiculo(int numAsientos, String color, String modelo, int año, int hp, int numPuertas) {
        this.numAsientos = numAsientos;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
        this.hp = hp;
        this.numPuertas = numPuertas;

    }

    //Metodos
    public void encender() {
        System.out.println("El vehiculo ha sido encendido");
    }
    public void frenar() {
        System.out.println("Frenando");
    }
    public void acelerar() {
        System.out.println("Acelerando");
    }
    public void apagar() {
        System.out.println("El vehiculo ha sido apagado");
    }
}
