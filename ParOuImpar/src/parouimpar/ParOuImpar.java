package parouimpar;

public class ParOuImpar {

    public static void main(String[] args) {
        Jogador j1 = new Jogador("Teste 1");
        Jogador j2 = new Jogador("Teste 2");
        Jogador j3 = new Jogador("Teste 3");
        
        duelo(j1,j2);
        duelo(j1,j3);
        duelo(j2,j3);
        duelo(j2,j1);
        duelo(j3,j2);
        duelo(j3,j1);
        
        j1.descreve();
        j2.descreve();
        j3.descreve();
    }

    static void duelo(Jogador a, Jogador b) {
        int resultado = a.jogar() + b.jogar();
        //se for par
        if (resultado % 2 == 0) {
            a.vitorias++;
            b.derrotas++;
        } else {
            a.derrotas++;
            b.vitorias++;
        }
    }
}
