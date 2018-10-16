package jogodavelha;

import java.util.Collections;
import java.util.ArrayList;

public class OponenteNivelMedio extends Oponente {

    private ArrayList<Coordenada> ListaCampos = new ArrayList();

    public OponenteNivelMedio(String nome) {
        super(nome);
        for (int linha = 0; linha < 3; linha++) { // recebe os campos no array Lista
            for (int coluna = 0; coluna < 3; coluna++) {
                Coordenada campo = new Coordenada(linha, coluna);
                ListaCampos.add(campo);
            }
        }
    }

    @Override
    void jogar() {
        boolean bAchouBomCampo = false;

        while (!bAchouBomCampo) {
            Collections.shuffle(this.ListaCampos);
            bAchouBomCampo = super.tabuleiro.Preencher((this.ListaCampos.get(0)).linha, (this.ListaCampos.get(0)).coluna, super.getCaracter());
            this.ListaCampos.remove(this.ListaCampos.get(0));
        }
    }
}
