package com.herencia;

public class Camioneta extends Vehiculo implements Cargable {
    private double capacidadValde;
    public Camioneta(int plazas, String color, String modelo, int año, int llantas, double capacidadValde) {
        super(plazas, color, modelo, año, llantas);
        this.capacidadValde = capacidadValde;
    }

    // public Camioneta(){ Como se comento el constructor padre, ya no se puede usar este constructor
    //     super();
    // }

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
@Override
    public void frenar(){
        System.out.println("Frenando con los pedales de la camioneta");
    }
@Override
    public void acelerar(){
        System.out.println("Acelerando con la palanca de cambios");
    }
@Override
    public void cargar(double peso){
        System.out.println("Cargando "+ peso + "kilos");
    }
@Override
    public void descargar(double peso){
        System.out.println("Descargando "+ peso + "kilos");
    }

}
