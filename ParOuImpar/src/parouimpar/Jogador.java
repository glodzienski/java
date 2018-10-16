package parouimpar;

import java.util.Random;

public class Jogador {
    public int vitorias;
    public int derrotas;
    public String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }
    
    int jogar(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(6);
        return randomNumber;
    }
    
    void descreve(){
        System.out.println("");
        System.out.println("NOME: " + this.nome);
        System.out.println("VITÓRIAS: " + this.vitorias);
        System.out.println("DERROTAS: " + this.derrotas);
        System.out.println("");
    }
}
