package jogodavelha;

import java.util.Scanner;

public class Humano extends Player {

    Tabuleiro tabuleiro;

    public Humano(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void vitoria() {
        super.vitoria();
    }

    @Override
    public void derrota() {
        super.derrota();
    }

    @Override
    public void velha() {
        super.velha();
    }

    @Override
    public void escolherCaracter(char caracter) {
        super.escolherCaracter(caracter);
    }

    public void jogar(Scanner teclado, Coordenada coor) {
        System.out.println("");
        System.out.println("Escolha uma coordenada para jogar");
        System.out.println("Linha:");
        coor.linha = teclado.nextInt();
        System.out.println("Coluna:");
        coor.coluna = teclado.nextInt();
        System.out.println("");
    }
    
}
