package exeraluno;

public class Aluno {
    String nome;
    int matricula;
    double desconto;
    Curso curso;
    
    
    double pagamento(){
        return curso.mensalidade* (100-desconto) /100 ;
    }
    
    void descrever(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Nome Curso: " + curso.nome);
        System.out.println("Mensalidade Curso: " + curso.mensalidade);
        System.out.println("Valor pago: " + pagamento() );
    }
    
}
