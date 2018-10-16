package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void EscolherCaracter(Tabuleiro tabuleiro) {
        int op = 1000;

        String nome;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("");
            System.out.println("/////////////////////////////////////////");
            System.out.println("//  Escolha uma das opções abaixo      //");
            System.out.println("//  1 - X                              //");
            System.out.println("//  2 - O                              //");
            System.out.println("/////////////////////////////////////////");
            System.out.println("");
            op = teclado.nextInt();

            if (op == 1) {
                System.out.println("Qual seu nome?");
                nome = teclado.next();
                //Criando o jogador humano
                Humano jogadorHumano = new Humano(nome);
                jogadorHumano.setCaracter('X');
                jogadorHumano.tabuleiro = tabuleiro;
                tabuleiro.JogadorHumano = jogadorHumano;
                tabuleiro.vez = jogadorHumano;
                //Setando o caracter do jogador máquina
                tabuleiro.JogadorMaquina.setCaracter('O');
            } else if (op == 2) {
                System.out.println("Qual seu nome?");
                nome = teclado.next();
                //Criando o jogador humano
                Humano jogadorHumano = new Humano(nome);
                jogadorHumano.tabuleiro = tabuleiro;
                jogadorHumano.setCaracter('O');
                tabuleiro.JogadorHumano = jogadorHumano;
                tabuleiro.vez = jogadorHumano;
                //Setando o caracter do jogador máquina
                tabuleiro.JogadorMaquina.setCaracter('X');
            }

        } while ((op != 0) && (op != 1));
    }

    public static void EscolherDificuldade(Tabuleiro tabuleiro) {
        int op = 1000;
        Oponente jogadorMaquina;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("");
            System.out.println("/////////////////////////////////////////");
            System.out.println("//  Qual dificuldade deseja jogar?     //");
            System.out.println("//  1 - Fácil                          //");
            System.out.println("//  2 - Médio                          //");
            System.out.println("//  3 - Difícil                        //");
            System.out.println("/////////////////////////////////////////");
            System.out.println("");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    jogadorMaquina = new OponenteNivelFacil("Máquina");
                    jogadorMaquina.tabuleiro = tabuleiro;
                    tabuleiro.JogadorMaquina = jogadorMaquina;
                    break;
                case 2:
                    jogadorMaquina = new OponenteNivelMedio("Máquina");
                    jogadorMaquina.tabuleiro = tabuleiro;
                    tabuleiro.JogadorMaquina = jogadorMaquina;
                    break;
                case 3:
                    jogadorMaquina = new OponenteNivelQuaseDificil("Máquina");
                    jogadorMaquina.tabuleiro = tabuleiro;
                    tabuleiro.JogadorMaquina = jogadorMaquina;
                    break;
                default:
                    break;
            }
        } while ((op != 3) && (op != 2) && (op != 1));
        EscolherCaracter(tabuleiro);
    }

    public static void MenuJogoDaVelha(Tabuleiro tabuleiro) {
        int op = 1000;
        if (tabuleiro.JogadorHumano == null) {
            do {
                Scanner teclado = new Scanner(System.in);
                System.out.println("");
                System.out.println("");
                System.out.println("/////////////////////////////////////////");
                System.out.println("//       Escolha uma opção abaixo      //");
                System.out.println("//       1 - Começar novo jogo         //");
                System.out.println("//       2 - Verificar placar          //");
                System.out.println("//       0 - SAIR                      //");
                System.out.println("/////////////////////////////////////////");
                System.out.println("");
                System.out.println("");
                op = teclado.nextInt();

                if (op == 1) {
                    EscolherDificuldade(tabuleiro);
                    DecorrerDoJogo(teclado, tabuleiro);
                } else if (op == 2) {

                    if (tabuleiro.partidas == 0) {
                        System.out.println("Jogo não iniciado!");
                    } else {
                        tabuleiro.placar();
                    }
                }

            } while (op != 0);
            System.exit(0);
        } else {
            do {
                Scanner teclado = new Scanner(System.in);
                System.out.println("");
                System.out.println("");
                System.out.println("/////////////////////////////////////////");
                System.out.println("//       Escolha uma opção abaixo      //");
                System.out.println("//       1 - Jogar novamente           //");
                System.out.println("//       2 - Verificar placar          //");
                System.out.println("//       0 - SAIR                      //");
                System.out.println("/////////////////////////////////////////");
                System.out.println("");
                System.out.println("");
                op = teclado.nextInt();

                if (op == 1) {
                    DecorrerDoJogo(teclado, tabuleiro);
                } else if (op == 2) {

                    if (tabuleiro.partidas == 0) {
                        System.out.println("Jogo não iniciado!");
                    } else {
                        tabuleiro.placar();
                    }
                }

            } while (op != 0);
            System.exit(0);
        }

    }

    public static void DecorrerDoJogo(Scanner teclado, Tabuleiro tabuleiro) {
        boolean bJogoAcabou = false;
        int iSituacaoJogo = 0;

        while (!bJogoAcabou) {
            if ((tabuleiro.vez).equals(tabuleiro.JogadorHumano)) {//se for vez do jogador humano
                boolean bJogou = false;
                Coordenada coor = new Coordenada(0, 0);
                do {
                    tabuleiro.Imprimir();//imprimindo tabuleiro
                    tabuleiro.JogadorHumano.jogar(teclado, coor);
                    bJogou = tabuleiro.Preencher(coor.linha, coor.coluna, tabuleiro.JogadorHumano.getCaracter());
                } while (!bJogou);
                tabuleiro.vez = tabuleiro.JogadorMaquina;//passando a vez
            } else if ((tabuleiro.vez).equals(tabuleiro.JogadorMaquina)) {//se for vez do jogador máquina
                tabuleiro.JogadorMaquina.jogar();
                tabuleiro.vez = tabuleiro.JogadorHumano;//passando a vez
            }

            //Verifica situação do jogo
            iSituacaoJogo = tabuleiro.Verificar();

            switch (iSituacaoJogo) {
                case 0:
                    //não faz nada continua o jogo
                    break;
                case 1:
                    tabuleiro.JogadorHumano.vitoria();
                    tabuleiro.JogadorMaquina.derrota();
                    tabuleiro.LimparTabuleiro();
                    MenuJogoDaVelha(tabuleiro);
                    break;

                case 2:
                    tabuleiro.JogadorMaquina.vitoria();
                    tabuleiro.JogadorHumano.derrota();
                    tabuleiro.LimparTabuleiro();
                    MenuJogoDaVelha(tabuleiro);
                    break;
                case 3:
                    tabuleiro.JogadorMaquina.velha();
                    tabuleiro.JogadorHumano.velha();
                    tabuleiro.LimparTabuleiro();
                    MenuJogoDaVelha(tabuleiro);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //Objeto que guarda o tabuleiro
        Tabuleiro tabuleiro = new Tabuleiro();
        //Executando o Menu do jogo da velha
        MenuJogoDaVelha(tabuleiro);
        DecorrerDoJogo(teclado, tabuleiro);
    }

}
