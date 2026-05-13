package com.herencia;

public abstract class Vehiculo {
    private int plazas;
    private String color;
    private String modelo;
    private int año;
    private int llantas;

    //Constructor
    public Vehiculo(int plazas, String color, String modelo, 
        int año, int llantas) {
            this.plazas = plazas;
            this.color = color;
            this.modelo = modelo;
            this.año = año;
            this.llantas = llantas;
    }

    /*
    public Vehiculo(){
        //Constructor por defecto
    }
    */
    
    public int getPlazas() {
        return plazas;
    }


    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAño() {
        return año;
    }


    public void setAño(int año) {
        this.año = año;
    }


    public int getLlantas() {
        return llantas;
    }


    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }


    //Metodos
    public void encender() {
        System.out.println("El vehiculo ha sido encendido");
    }
    public abstract void frenar();
    public abstract void acelerar();
    public final void apagar() {
        System.out.println("El vehiculo ha sido apagado");
    }
}
