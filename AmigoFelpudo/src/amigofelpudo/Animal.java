package amigofelpudo;

public class Animal {

    private String especie;
    private boolean disponivel;
    private int tamanho;

    public Animal(String especie, boolean disponivel, int tamanho) {
        this.especie = especie;
        this.disponivel = disponivel;
        this.tamanho = tamanho;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    void apresentar() {
        System.out.println("Olá, sou um(a) " + this.especie);
        if (this.disponivel) {
            System.out.println("Estou livre para adoção");
        } else {
            System.out.println("Não estou livre para adoção");
        }
        if (this.tamanho >= 100) {
            System.out.println("Meu porte é grande");
        } else if (this.tamanho >= 50 && this.tamanho < 100) {
            System.out.println("Meu porte é médio");
        } else if (this.tamanho < 50) {
            System.out.println("Meu porte é pequeno");
        }
    }
}
