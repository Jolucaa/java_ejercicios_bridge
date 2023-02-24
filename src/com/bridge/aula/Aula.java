package com.bridge.aula;

public class Aula {
    String nombre;
    int capacidad;

    public Aula(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public boolean caben(int cantidad){
        return this.getCapacidad() < cantidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
