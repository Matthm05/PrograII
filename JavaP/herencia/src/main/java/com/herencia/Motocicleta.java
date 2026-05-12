package com.herencia;

public class Motocicleta extends Vehiculo {
    private String tipoManubrio;

    public Motocicleta(int plazas, String color, String modelo, int año, int llantas, String tipoManubrio) {
        super(plazas, color, modelo, año, llantas);
        this.tipoManubrio = tipoManubrio;
    }
    
    public Motocicleta(){
        super();
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    
@Override
    public void encender(){
        System.out.println("Motocicleta encendida");
    }

}
