package com.bridge.banco;

public class CuentaBancaria {
    String titular;
    double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
    }

    public void retirar(double cantidad){
        if(haveManyMoney(cantidad)){
            this.saldo -= cantidad;
        }
    }

    private boolean haveManyMoney(double cantidad){
        return this.saldo < cantidad;
    }
}
