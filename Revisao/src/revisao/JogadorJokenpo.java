package revisao;

import java.util.ArrayList;
import java.util.Collections;

public class JogadorJokenpo {

    public int vitorias;
    public int derrotas;
    public int empates;
    public String nome;
    private ArrayList<String> opcoesJokenpo;

    public JogadorJokenpo(String nome) {
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.nome = nome;
        this.opcoesJokenpo = new ArrayList();
        this.opcoesJokenpo.add("pedra");
        this.opcoesJokenpo.add("papel");
        this.opcoesJokenpo.add("tesoura");
    }

    String jogar() {
        Collections.shuffle(opcoesJokenpo);
        return opcoesJokenpo.get(0);
    }
    
    void descrever(){
        System.out.println("Jogador :" + this.nome);
        System.out.println("Vitórias :" + this.vitorias);
        System.out.println("Derrotas :" + this.derrotas);
        System.out.println("Empates :" + this.empates);
    }
}
