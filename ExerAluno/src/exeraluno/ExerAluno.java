package exeraluno;

public class ExerAluno {

    public static void main(String[] args) {
        
        Curso ads = new Curso();
        
        ads.mensalidade=1000;
        ads.nome="Análise e Desenvolvimento de Sistemas";
        
        
        Aluno mario = new Aluno();
        
        mario.desconto=10;
        mario.matricula=111222;
        mario.nome="Mario Mario";
        
        AlunoPos luigi = new AlunoPos();
        
        luigi.desconto=15;
        luigi.matricula=111444;
        luigi.nome="Luigi Mario";
        
        mario.curso= ads;
        luigi.curso = ads;
        luigi.formacao= "Encamentos";
//        mario.descrever();
        System.out.println("--------");
        luigi.descrever();
        
        
    }
    
}
