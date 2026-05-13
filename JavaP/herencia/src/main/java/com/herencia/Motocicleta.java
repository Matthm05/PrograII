package com.herencia;

public class Motocicleta extends Vehiculo {
    private String tipoManubrio;

    public Motocicleta(int plazas, String color, String modelo, int año, int llantas, String tipoManubrio) {
        super(plazas, color, modelo, año, llantas);
        this.tipoManubrio = tipoManubrio;
    }
    
    // public Motocicleta(){
    //     super();
    // }

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
@Override
    public void frenar(){
        System.out.println("Frenando con las palancas del manubrio");
    }
@Override
    public void acelerar(){
        System.out.println("Acelerando las marchas con el manubrio");
    }

    public void levantarAsiento(){
        System.out.println("Levantando el asiento para almacenar");
    }

}
