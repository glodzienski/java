package jogodavelha;

public class Tabuleiro {

    public int partidas = 0;
    public char[][] matriz = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    public Player vez;
    public Humano JogadorHumano;
    public Oponente JogadorMaquina;

    void Imprimir() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (coluna != 2) {
                    System.out.print(matriz[linha][coluna] + " | ");
                } else {
                    System.out.print(matriz[linha][coluna] + " ");
                }
            }
            System.out.println();
        }
    }

    boolean Preencher(int linha, int coluna, char caracter) {
        //jogador informou uma coordenada inválida
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            return false;
        }
        // jogador deu uma coordenada que já possui jogada
        if (this.matriz[linha][coluna] != ' ') {
            return false;
        }

        this.matriz[linha][coluna] = caracter;

        return true;
    }

    boolean Vitoria(Player jogador) { // faz a validação de todas as possíveis maneiras de ganhar o jogo
        char caracter = jogador.getCaracter();
        if (this.matriz[0][0] == caracter && this.matriz[0][1] == caracter && this.matriz[0][2] == caracter) {
            return true;
        } else if (this.matriz[1][0] == caracter && this.matriz[1][1] == caracter && this.matriz[1][2] == caracter) {
            return true;
        } else if (this.matriz[2][0] == caracter && this.matriz[2][1] == caracter && this.matriz[2][2] == caracter) {
            return true;
        } else if (this.matriz[0][0] == caracter && this.matriz[1][1] == caracter && this.matriz[2][2] == caracter) {
            return true;
        } else if (this.matriz[0][2] == caracter && this.matriz[1][1] == caracter && this.matriz[2][0] == caracter) {
            return true;
        } else if (this.matriz[0][0] == caracter && this.matriz[1][0] == caracter && this.matriz[2][0] == caracter) {
            return true;
        } else if (this.matriz[0][1] == caracter && this.matriz[1][1] == caracter && this.matriz[2][1] == caracter) {
            return true;
        } else {
            return this.matriz[0][2] == caracter && this.matriz[1][2] == caracter && this.matriz[2][2] == caracter;
        }

    }

    boolean Velha() {
        int cont = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (this.matriz[linha][coluna] != ' ') {
                    cont++;
                }
            }
        }

        return cont == 9;
    }

    int Verificar() {
        if (Vitoria(this.JogadorHumano)) {
            partidas = partidas + 1;
            return 1; //vitória do jogador humano
        } else if (Vitoria(this.JogadorMaquina)) {
            partidas = partidas + 1;
            return 2; //vitória do jogador máquina
        } else if (Velha()) {
            partidas = partidas + 1;
            return 3;//se deu velha
        } else {
            return 0;//se não acabou o jogo ainda
        }

    }

    void LimparTabuleiro() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                this.matriz[linha][coluna] = ' ';
            }

        }
    }

    public void placar() {
        System.out.println(JogadorHumano.nome + ":");
        System.out.println(" Vitórias = " + JogadorHumano.vitorias);
        System.out.println(" Derrotas = " + JogadorHumano.derrotas);
        System.out.println(" Velhas = " + JogadorHumano.velhas);

        System.out.println("");

        System.out.println(JogadorMaquina.nome + ":");
        System.out.println(" Vitórias = " + JogadorMaquina.vitorias);
        System.out.println(" Derrotas = " + JogadorMaquina.derrotas);
        System.out.println(" Velhas = " + JogadorMaquina.velhas);
        System.out.println("");
        System.out.println("Total partidas jogadas até agora: " + partidas);

    }
}
