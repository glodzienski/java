/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saque;

import java.util.Scanner;

/**
 *
 * @author Crystopher
 */
public class Saque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		
        double altura, peso, imc;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        peso = teclado.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();

        imc = peso/(altura * altura);

        if(imc < 18.5) {
                System.out.println("abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso ideal, parabéns!");
        } else if (imc > 24.9 && imc <= 29.9) {
                System.out.println("Levemente acima do peso, cuidado.");
        } else if (imc > 29.9 && imc <= 34.9) {
                System.out.println("Obesidade grau I");
        } else if (imc > 34.9 && imc <= 39.9) {
                System.out.println("Obesidade grau II (severa)");
        } else {
                System.out.println("Obesidade III (mórbida)");
        }
    }
}