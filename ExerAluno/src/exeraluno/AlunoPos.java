package exeraluno;

public class AlunoPos extends Aluno{
    
    String formacao;
    
    @Override
    double pagamento(){
        return super.pagamento() + 200;
    }
    
    @Override
    void descrever(){
        System.out.println("Formação: " + formacao  );
        super.descrever();
    }
    
}
