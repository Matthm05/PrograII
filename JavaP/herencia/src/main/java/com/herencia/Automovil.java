package com.herencia;

public class Automovil extends Vehiculo {
    private boolean convertible;

    public Automovil(int plazas, String color, String modelo, int año, int llantas, boolean convertible) {
        super(plazas, color, modelo, año, llantas);
        this.convertible = convertible;
    }

    public Automovil(){
        super();
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    
}
