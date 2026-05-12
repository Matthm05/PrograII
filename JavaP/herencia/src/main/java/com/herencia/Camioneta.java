package com.herencia;

public class Camioneta extends Vehiculo {
    private double capacidadValde;
    public Camioneta(int plazas, String color, String modelo, int año, int llantas, double capacidadValde) {
        super(plazas, color, modelo, año, llantas);
        this.capacidadValde = capacidadValde;
    }

    public Camioneta(){
        super();
    }

    public double getCapacidadValde() {
        return capacidadValde;
    }
    public void setCapacidadValde(double capacidadValde) {
        this.capacidadValde = capacidadValde;
    }
    
@Override
    public void encender(){
        System.out.println("Camioneta encendida");
    }

}
