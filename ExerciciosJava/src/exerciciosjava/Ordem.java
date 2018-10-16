
package exerciciosjava;

import java.util.Scanner;

public class Ordem {
    public Ordem() {
        System.out.println("");
        System.out.println("EXERCÍCIO 1 - ORDEM");
        System.out.println("");
        double n1=0, n2=0, n3=0, n4=0;
        int resposta=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o PRIMEIRO número:");
        n1 = teclado.nextDouble();

        System.out.println("Digite o SEGUNDO número:");
        n2 = teclado.nextDouble();

        System.out.println("Digite o TERCEIRO número:");
        n3 = teclado.nextDouble();

        System.out.println("Digite o QUARTO número:");
        n4 = teclado.nextDouble();

        resposta = analisa(n1, n2, n3, n4);
        switch(resposta){
            case -1:
                System.out.println("ORDEM DECRESCENTE");
                break;
            case 0:
                System.out.println("DESORDENADO");
                break;
            case 1:
                System.out.println("ORDEM CRESCENTE");
                break;
            default:
                System.out.println("Houve um erro.");
                break;
        }
    }
    
    int analisa(double n1,double n2,double n3,double n4){
        if ((n1 < n2) && (n2 < n3) && (n3 < n4)) {
            return 1;
        } else if ((n1 > n2) && (n2 > n3) && (n3 > n4)) {
            return -1;
        } else{
            return 0;
        }
    }
}