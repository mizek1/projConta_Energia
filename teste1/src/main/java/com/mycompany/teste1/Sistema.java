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

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o tipo de cliente:");
        System.out.println("1 - Residencial\n2 - Comercial\n3 - Industrial");
        int tipo = in.nextInt();
        Conta conta;
        double tarifa;
        switch (tipo) {
            case 1:
                conta = new Residencial();
                tarifa = 0.10;
                break;
            case 2:
                conta = new Comercial();
                tarifa = 0.20;
                break;
            default:
                conta = new Industrial();
                tarifa = 0.03;
                break;
        }

        System.out.println("Insira o nome do cliente:");
        conta.setNomeDoCliente(in.next());
        System.out.println("Insira o consumo do cliente:");
        conta.setConsumo(in.nextDouble());

        System.out.println("\n=== CONTA DE ENERGIA ELÃ‰TRICA ===");
        System.out.println("Nome do cliente: " + conta.getNomeDoCliente());
        System.out.println("Consumo: " + conta.getConsumo() + " Kwh");
        System.out.println("Tarifa: R$ " + tarifa);
        System.out.println("Multa: R$ " + conta.calcularMulta(conta.getConsumo()));
        System.out.println("Total a pagar: R$ " + conta.calcularConta(conta.getConsumo()));

    }

}
