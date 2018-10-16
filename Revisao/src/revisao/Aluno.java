package revisao;

public class Aluno {
    String nome;
    int matricula;
    double desconto;
    Curso curso;

    public Aluno(String nome, int matricula, double desconto, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
    }
    
    void descrever(){
        System.out.println("Informações do aluno.");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso.nome);
        System.out.println("Desconto + " + this.desconto);
    }
    
    void pagamento(){
        double valorCurso = 0;
        valorCurso = this.curso.mensalidade - this.desconto;
        if (valorCurso <= 0) {
            System.out.println("Aluno não paga!");
        } else {
            System.out.println("Aluno " + this.nome + "do curso " + this.curso.nome + "paga R$" + valorCurso);
        }
        
    }  
    
}
