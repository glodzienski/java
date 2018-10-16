package revisao;

public class Curso {
    String nome;
    double mensalidade;

    public Curso(String nome, double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }
    
    void descrever(){
        System.out.println("Curso: " + this.nome);
        System.out.println("Mensalidade: " + this.mensalidade);
    }
}
