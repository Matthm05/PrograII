package com.herencia;

public class Casa {
    private Habitacion habitacion;

    public Casa(){
        this.habitacion = new Habitacion(10);
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    
}
