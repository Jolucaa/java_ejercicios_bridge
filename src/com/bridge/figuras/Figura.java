package com.bridge.figuras;

public abstract class Figura {
    private String nombre;

    public abstract String getNombre();

    public abstract void setNombre(String nombre);

    public abstract void dibujar();
}
