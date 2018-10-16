package trabalhojogovelha;

import java.util.Scanner;

public class TrabalhoJogoVelha {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Tabuleiro tab = new Tabuleiro();

        //TODO - criar código que seleciona qual a tática será instanciada
        Oponente maq = new OponenteTatica1();

        maq.tabuleiro= tab;
        
        int vez = 1; // variavel marca de quem é a vez  (1) jogador humano; (2) máquina
        while (tab.verificar() == 0) {
            tab.imprimir();

            if (vez == 1) { //vez do jogador humano

                int i, j;  //coordenadas da jogada

                do { //vai repetir enquanto o usuário não digitar coordenadas válidas
                    System.out.println("Digite a linha e a coluna que deseja jogar:");
                    i = teclado.nextInt();
                    j = teclado.nextInt();
                } while (tab.preencher(i, j, 1) == false ); // método retorna false se o jogador preencher adequadamente 

                vez = 2;
            } else {//vez da máquina
                System.out.println("Jogada da máquina");
                maq.jogar(); // método que faz a jogada do computador
                vez = 1;
            }

        }

    }
}
