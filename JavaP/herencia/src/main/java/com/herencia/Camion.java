package com.herencia;

public class Camion extends Vehiculo {
    private double capCarga;

    public Camion(int plazas, String color, String modelo, int año, int llantas, double capCarga) {
        super(plazas, color, modelo, año, llantas);
        this.capCarga = capCarga;
    }

    public Camion(){
        super();
    }

    public double getCapacidadCarga() {
        return capCarga;
    }

    public void setCapacidadCarga(double capCarga) {
        this.capCarga = capCarga;
    }
    
    @Override
    public void encender(){
        System.out.println("Camion encendido");
    }
}
