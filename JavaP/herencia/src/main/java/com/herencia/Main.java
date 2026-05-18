package com.herencia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ejemploComposicion();
        //ejemploAgregacion();
        //ejemploUsoPolimorfismo();
        Consesionario cs = new Consesionario("Super autos");
        cs.menu();
    }
    
    public static void ejemploUsoPolimorfismo() {
        Camioneta camioneta1 = new Camioneta(2, "Plateado", "F-150", 2022, 4, 50);
        Motocicleta moto1 = new Motocicleta(1,"negra","ninja",2020,2,"estrecho");
        Camion camion1 = new Camion(2, "blanco","S070", 2018,6,11);
        //camioneta1.encender();
        //moto1.encender();
        Vehiculo moto2 = new Motocicleta(1,"Verde", "R1", 2026,2,"Plano");
        moto1.levantarAsiento();


        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(camioneta1);
        listaVehiculos.add(moto1);
        listaVehiculos.add(camion1);
        //Con for each
        for(Vehiculo i : listaVehiculos){
            i.encender();
        }
        //Con for tradicional

        for(int i = 0; i < listaVehiculos.size(); i++){
            listaVehiculos.get(i).encender();
        }
    }
    /*public static void ejemploComposicion() {
        Casa casa1 = new Casa();
    }
    
    public static void ejemploAgregacion() {
        Cliente cliente1 = new Cliente("Henry");
        Empresa empresa1 = new Empresa(cliente1);
        
    }
    */
   

}