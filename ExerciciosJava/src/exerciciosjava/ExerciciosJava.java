package exerciciosjava;

import java.util.Scanner;
import exerciciosjava.Ordem;
import exerciciosjava.NumPrimo;
import exerciciosjava.Rotacao;

public class ExerciciosJava {

    public static void main(String[] args) {
        int op = 1000;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("");
            System.out.println("/////////////////////////////////////////");
            System.out.println("//  Escolha uma opção abaixo           //");
            System.out.println("//  1 - Exercício 1 - ORDEM            //");
            System.out.println("//  2 - Exercício 2 - Números Primos   //");
            System.out.println("//  3 - Exercício 3 - ROTAÇÃO          //");
            System.out.println("//  0 - SAIR                           //");
            System.out.println("/////////////////////////////////////////");
            System.out.println("");
            op = teclado.nextInt();
            
            if(op == 1){
                Ordem exercicio1 = new Ordem();
            } else if (op == 2){
                NumPrimo exercicio2 = new NumPrimo();
            } else if (op == 3){
                Rotacao exercicio3 = new Rotacao();
            }
            
        } while (op != 0);
    }
}
