/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaex1;

import java.util.Scanner;

/**
 *
 * @author Crystopher
 */
public class ProvaEx1 {

    public static void visualizarFuncionarios(Funcionario gerente, Funcionario estagiario) {
        System.out.println("Visualizar funcionários:");
        System.out.println("");
        System.out.println("Gerente:");
        gerente.info();
        System.out.println("");
        System.out.println("Estagiário:");
        estagiario.info();
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double salarioBase;

        System.out.println("Informe um salário base: ");
        salarioBase = teclado.nextFloat();

        System.out.println("Informe o nome do gerente:");
        nome = teclado.next();
        Gerente gerente = new Gerente(nome, salarioBase);

        System.out.println("Informe o nome do estagiário:");
        nome = teclado.next();
        Estagiario estagiario = new Estagiario(nome, salarioBase);

        int op = 100;
        do {
            System.out.println("");
            System.out.println("/////////////////////////////////////////");
            System.out.println("//  Escolha uma das opções abaixo      //");
            System.out.println("//  1 - Visualizar funcionários        //");
            System.out.println("//  0 - Sair.                          //");
            System.out.println("/////////////////////////////////////////");
            System.out.println("");
            op = teclado.nextInt();
            if (op == 1) {
                visualizarFuncionarios(gerente, estagiario);
            }
        } while (op != 0);
    }

}
