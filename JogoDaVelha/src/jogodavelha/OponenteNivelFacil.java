package jogodavelha;

public class OponenteNivelFacil extends Oponente {

    public OponenteNivelFacil(String nome) {
        super(nome);
    }

    @Override
    void jogar() {
        boolean bJogou = false;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (super.tabuleiro.matriz[linha][coluna] == ' ') {
                    bJogou = tabuleiro.Preencher(linha, coluna, super.getCaracter());
                    break;
                }
            }
            if (bJogou) {break;}
        }
    }

}
