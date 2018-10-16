package aula02;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
        
        int num1, num2, resultado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite dois valores");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("Resultado: "+resultado);
        
        //Arrays
        int[] megasena = {01,23,43,12,32,60};
        
        for (int numero : megasena) {
           System.out.println(numero);
        }        
    }   
}
