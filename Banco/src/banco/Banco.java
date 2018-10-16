package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        int opcao = 0;
        double valor = 0.0;
        
        Scanner teclado = new Scanner(System.in);
        
        Conta contaBancaria = new Conta();
        contaBancaria.numero = 1;
        contaBancaria.dono   = "Crystopher";
        contaBancaria.limite = 100000;
        contaBancaria.saldo  = 0;
                
        do{
            System.out.println("Por favor digite uma ação!");
            System.out.println("1 : Sacar.");
            System.out.println("2 : Depositar.");
            System.out.println("3 : Extrato.");
            System.out.println("4 : Sair.\n\n");
            opcao = teclado.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Informe um valor:\n");
                    valor = teclado.nextDouble();
                    if(contaBancaria.sacar(valor)){
                        System.out.println("Sacado R$ "+valor+" reais.\n");
                    }else{
                        System.out.println("Não foi possível sacar.\n"); 
                    }
                    break;
                case 2:
                    System.out.println("Informe um valor:\n");
                    valor = teclado.nextDouble();
                    if(contaBancaria.depositar(valor)){
                        System.out.println("Depositado R$ "+valor+" reais.\n");
                    }else{
                        System.out.println("Não foi possível depositar.\n"); 
                    }
                    break;
                case 3:
                    contaBancaria.descrever();
                    break;
                case 4:
                    System.out.println("Obrigado por escolher nossa empresa. Volte sempre!\n");
                    break;
                default:
                    System.out.println("Opção não encontrada no menu.\n");
            }  
        }while (!(opcao == 4));
    }
}
