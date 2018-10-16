package jogodavelha;

import java.util.ArrayList;
import java.util.Collections;

public class OponenteNivelQuaseDificil extends Oponente {

    private ArrayList<Coordenada> ListaCampos = new ArrayList();
    private ArrayList<Jogada> ListaJogadas = new ArrayList();
    private ArrayList<Jogada> ListaJogadasDisponiveis = new ArrayList();

    public OponenteNivelQuaseDificil(String nome) {
        super(nome);
        //Criandos os campos possiveis
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                Coordenada campo = new Coordenada(linha, coluna);
                ListaCampos.add(campo);
            }
        }

        MontarCoordenadas();
    }

    void MontarCoordenadas() {
        //Linhas
        Jogada linha1 = new Jogada();
        linha1.Coordenadas.add(ListaCampos.get(0));
        linha1.Coordenadas.add(ListaCampos.get(1));
        linha1.Coordenadas.add(ListaCampos.get(2));
        this.ListaJogadas.add(linha1);

        Jogada linha2 = new Jogada();
        linha2.Coordenadas.add(ListaCampos.get(3));
        linha2.Coordenadas.add(ListaCampos.get(4));
        linha2.Coordenadas.add(ListaCampos.get(5));
        this.ListaJogadas.add(linha2);

        Jogada linha3 = new Jogada();
        linha3.Coordenadas.add(ListaCampos.get(6));
        linha3.Coordenadas.add(ListaCampos.get(7));
        linha3.Coordenadas.add(ListaCampos.get(8));
        this.ListaJogadas.add(linha3);

        //Colunas
        Jogada coluna1 = new Jogada();
        coluna1.Coordenadas.add(ListaCampos.get(0));
        coluna1.Coordenadas.add(ListaCampos.get(3));
        coluna1.Coordenadas.add(ListaCampos.get(6));
        this.ListaJogadas.add(coluna1);

        Jogada coluna2 = new Jogada();
        coluna2.Coordenadas.add(ListaCampos.get(1));
        coluna2.Coordenadas.add(ListaCampos.get(4));
        coluna2.Coordenadas.add(ListaCampos.get(7));
        this.ListaJogadas.add(coluna2);

        Jogada coluna3 = new Jogada();
        coluna3.Coordenadas.add(ListaCampos.get(2));
        coluna3.Coordenadas.add(ListaCampos.get(5));
        coluna3.Coordenadas.add(ListaCampos.get(8));
        this.ListaJogadas.add(coluna3);

        //Diagonais
        Jogada diagonal1 = new Jogada();
        diagonal1.Coordenadas.add(ListaCampos.get(0));
        diagonal1.Coordenadas.add(ListaCampos.get(4));
        diagonal1.Coordenadas.add(ListaCampos.get(8));
        this.ListaJogadas.add(diagonal1);

        Jogada diagonal2 = new Jogada();
        diagonal2.Coordenadas.add(ListaCampos.get(2));
        diagonal2.Coordenadas.add(ListaCampos.get(4));
        diagonal2.Coordenadas.add(ListaCampos.get(6));
        this.ListaJogadas.add(diagonal2);
    }

    void Avaliar() {
        char caracter = super.getCaracter();
        //Linhas
        if ((super.tabuleiro.matriz[0][0] == caracter || super.tabuleiro.matriz[0][0] == ' ')
                && (super.tabuleiro.matriz[0][1] == caracter || super.tabuleiro.matriz[0][1] == ' ')
                && (super.tabuleiro.matriz[0][2] == caracter || super.tabuleiro.matriz[0][2] == ' ')) {
            this.ListaJogadasDisponiveis.add(this.ListaJogadas.get(0));
        }
        if ((super.tabuleiro.matriz[1][0] == caracter || super.tabuleiro.matriz[1][0] == ' ')
                && (super.tabuleiro.matriz[1][1] == caracter || super.tabuleiro.matriz[1][1] == ' ')
                && (super.tabuleiro.matriz[1][2] == caracter || super.tabuleiro.matriz[1][2] == ' ')) {
            this.ListaJogadasDisponiveis.add(this.ListaJogadas.get(1));
        }
        if ((super.tabuleiro.matriz[2][0] == caracter || super.tabuleiro.matriz[2][0] == ' ')
                && (super.tabuleiro.matriz[2][1] == caracter || super.tabuleiro.matriz[2][1] == ' ')
                && (super.tabuleiro.matriz[2][2] == caracter || super.tabuleiro.matriz[2][2] == ' ')) {
            this.ListaJogadasDisponiveis.add(this.ListaJogadas.get(2));
        }
        //Colunas
        if ((super.tabuleiro.matriz[0][0] == caracter || super.tabuleiro.matriz[0][0] == ' ')
                && (super.tabuleiro.matriz[1][0] == caracter || super.tabuleiro.matriz[1][0] == ' ')
                && (super.tabuleiro.matriz[2][0] == caracter || super.tabuleiro.matriz[2][0] == ' ')) {
            this.ListaJogadasDisponiveis.add(this.ListaJogadas.get(3));
        }
        if ((super.tabuleiro.matriz[0][1] == caracter || super.tabuleiro.matriz[0][1] == ' ')
                && (super.tabuleiro.matriz[1][1] == caracter || super.tabuleiro.matriz[1][1] == ' ')
                && (super.tabuleiro.matriz[2][1] == caracter || super.tabuleiro.matriz[2][1] == ' ')) {
            this.ListaJogadasDisponiveis.add(this.ListaJogadas.get(4));
        }
        if ((super.tabuleiro.matriz[0][2] == caracter || super.tabuleiro.matriz[0][2] == ' ')
                && (super.tabuleiro.matriz[1][2] == caracter || super.tabuleiro.matriz[1][2] == ' ')
                && (super.tabuleiro.matriz[2][2] == caracter || super.tabuleiro.matriz[2][2] == ' ')) {
            this.ListaJogadasDisponiveis.add(this.ListaJogadas.get(5));
        }
        //Diagonal principal
        if ((super.tabuleiro.matriz[0][0] == caracter || super.tabuleiro.matriz[0][0] == ' ')
                && (super.tabuleiro.matriz[1][1] == caracter || super.tabuleiro.matriz[1][1] == ' ')
                && (super.tabuleiro.matriz[2][2] == caracter || super.tabuleiro.matriz[2][2] == ' ')) {
            this.ListaJogadasDisponiveis.add(this.ListaJogadas.get(6));
        }
        //Diagonal secundária 
        if ((super.tabuleiro.matriz[0][2] == caracter || super.tabuleiro.matriz[0][2] == ' ')
                && (super.tabuleiro.matriz[1][1] == caracter || super.tabuleiro.matriz[1][1] == ' ')
                && (super.tabuleiro.matriz[2][0] == caracter || super.tabuleiro.matriz[2][0] == ' ')) {
            this.ListaJogadasDisponiveis.add(this.ListaJogadas.get(7));
        }
    }

    @Override
    void jogar() {
        boolean bAchouBomCampo = false;
        Jogada Jogada;

        Avaliar();

        Collections.shuffle(this.ListaJogadasDisponiveis);
        while (!bAchouBomCampo) {
            Jogada = this.ListaJogadasDisponiveis.get(0);
            for (Coordenada coor : Jogada.Coordenadas) {
                bAchouBomCampo = super.tabuleiro.Preencher(coor.linha, coor.coluna, super.getCaracter());
                this.ListaCampos.remove(coor);
                if (bAchouBomCampo) {
                    break;
                }
            }

            if (bAchouBomCampo) {
                for (int linha = 0; linha < 3; linha++) {
                    for (int coluna = 0; coluna < 3; coluna++) {
                        if (super.tabuleiro.matriz[linha][coluna] == ' ') {
                            tabuleiro.Preencher(linha, coluna, super.getCaracter());
                        }
                    }
                }
            }

        }
    }
}
