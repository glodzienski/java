package digitoverificador;

import java.util.Scanner;

public class DigitoVerificador {

    public static void main(String[] args) {
        int numero,n1,n2,n3,dv;
        
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Por favor digite um número de 100 a 999");
            numero = teclado.nextInt();
        }while ((numero < 100) || (numero >=999));
        
        //centenas
        n1 = numero / 100;
        n2 = (numero / 10) % 10;
        n3 = numero % 10;
        
        dv = (n1 + n2 * 3 + n3 * 5) % 7;
        
        System.out.println((numero * 10) + dv);
        
    }
    
}
