package com.herencia;

public class Main {
    public static void main(String[] args) {
        //ejemploComposicion();
        //ejemploAgregacion();
    }

    public static void ejemploComposicion() {
        Casa casa1 = new Casa();
        System.out.println("Tamaño de la habitacion: " + casa1.getHabitacion().getArea()); 
    }

    public static void ejemploAgregacion() {
        Cliente cliente1 = new Cliente("Henry");
        Empresa empresa1 = new Empresa(cliente1);
        
    }

}