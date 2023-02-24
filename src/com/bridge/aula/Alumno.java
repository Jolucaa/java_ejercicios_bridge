package com.bridge.aula;

public class Alumno {
    String nombre;
    double nota;
    String curso;
    int actitud;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.nota = 0;
        this.curso = "";
        this.actitud = 0;
    }

    public void puntuar(double nota){
        this.nota = nota;
    }

    public void castigo(){
        this.actitud--;
    }

    public void recompensa(){
        this.actitud++;
    }

    private double getNota() {
        return this.nota;
    }

    private int getActitud() {
        return this.actitud;
    }

    public boolean aprobado(){
        return this.getActitud() >= 5 && this.getNota() >= 5;
    }
}
