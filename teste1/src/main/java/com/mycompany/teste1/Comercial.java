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
public class Comercial extends Conta {

    @Override
    public double calcularMulta(double consumo) {
        if (consumo > 500) {
            return (consumo - 500) * 0.25;
        }
        return 0;
    }

    @Override
    public double calcularConta(double consumo) {
        return consumo * 0.2 + iluminacaoPublica + calcularMulta(consumo);
    }
}
