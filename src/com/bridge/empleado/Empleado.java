package com.bridge.empleado;

public class Empleado {

    private String nombre;
    private String departamento;

    private double bonificacion;

    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.setNombre(nombre);
        this.setSueldo(sueldo);
        this.setDepartamento("");
        this.setBonificacion(0);
    }

    public Empleado(String nombre, double sueldo, String departamento) {
        this(nombre, sueldo);
        this.setDepartamento(departamento);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, double sueldo, String departamento, double bonificacion) {
        this(nombre, sueldo, departamento);
        this.setBonificacion(bonificacion);
    }

    public void bonus(String departamento) {
        boolean isSameDepartamento = departamento.equals(this.getDepartamento());
        this.setBonificacion(isSameDepartamento ? 50 : 0);
    }

    public double sueldoNeto() {
        double sueldoTotal = this.getSueldo();
        if (this.isInInterval(0d, 1500d, this.getSueldo())) {
            sueldoTotal -= this.getSueldo() * 0.09;
        } else if (this.isInInterval(1501d, 3000d, this.getSueldo())) {
            sueldoTotal -= this.getSueldo() * 0.12;
        } else {
            sueldoTotal -= this.getSueldo() * 0.15;
        }
        return sueldoTotal;
    }

    public double getSueldoTotal() {
        return this.getBonificacion() + this.getSueldo();
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        double minSueeldo = 1080d;
        double maxSueeldo = minSueeldo * 5;
        this.sueldo = (this.isInInterval(minSueeldo, maxSueeldo, sueldo)) ? sueldo : this.getSueldo();
    }

    private boolean isInInterval(double min, double max, double compared) {
        return min >= compared && compared <= max;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonificacion() {
        return this.bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        double min = 0;
        double max = 500;
        double totalBonificacion = this.getBonificacion() + bonificacion;
        boolean isInInterval = this.isInInterval(min, max, totalBonificacion);
        this.bonificacion = isInInterval ? totalBonificacion : this.getBonificacion();
    }
}
