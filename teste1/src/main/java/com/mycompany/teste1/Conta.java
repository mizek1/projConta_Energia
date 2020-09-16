/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste1;

/**
 *
 * @author Felix
 */
public abstract class Conta {
    private String nomeDoCliente;
    private double consumo;
    double iluminacaoPublica = 30.00;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public abstract double calcularConta(double consumo);

    public abstract double calcularMulta(double consumo);
    
}
