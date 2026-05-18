package com.herencia;
import java.util.ArrayList;
import java.util.Scanner;

public class Consesionario {
    private String nombre;
    ArrayList<Vehiculo> listaVehiculos;

    public Consesionario(String nombre){
        listaVehiculos = new ArrayList<>();
        this.nombre = nombre;
    }

    public String getNombre(){
        return  this.nombre; 
    }
    public void setNombre( String nombre){
        this.nombre =  nombre;

    }
    private void addVehiculo(Scanner input){
        Vehiculo vehiculo;
        System.out.println("De que tipo es el nuevo vehiculo?");
        System.out.println("1. Automovil");
        System.out.println("2. Camioneta");
        System.out.println("3. Camion");
        System.out.println("4. Motocicleta");
        System.out.println("0. Regresar al menu principal");
        switch(input.nextInt()){
            case 1 -> vehiculo = new Automovil(4, "Plateado", "Spark", 2026, 4, false);
            case 2 -> vehiculo = new Camioneta(2, "Azul", "Hilux", 2025, 4, 500);
            case 3 -> vehiculo = new Camion(2, "Blanco", "GH", 2020, 6, 6);
            case 4 -> vehiculo = new Motocicleta(2, "Negro", "Pasola", 2026, 2, "Normal");
            default -> {
                System.out.println("Opcion no valida, regresando al menu principal");
                return;
            }
        }
        listaVehiculos.add(vehiculo);
    }
    public void menu(){ 
        Scanner input = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Bienvenido al consesionario "+ this.nombre);
            System.out.println("1. Añadir nuevo vehiculo");
            System.out.println("2. Listar Vehiculos");
            System.out.println("3. Vender vehiculo");
            System.out.println("0. Salir");
            opcion = input.nextInt();
            switch(opcion){
                case 1 -> addVehiculo(input);
                case 2 -> listarVehiculos();
                case 3 -> venderVehiculo(input);
                
            }

        }while(opcion != 0);
        input.close();
    }

    private void listarVehiculos(){
        for (var v : this.listaVehiculos) {
            System.out.println(v.toString());
        }
    }
    private void venderVehiculo(Scanner input){

    }
}
