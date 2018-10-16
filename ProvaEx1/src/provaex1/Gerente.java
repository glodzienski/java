package provaex1;

/**
 *
 * @author Crystopher
 */
public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override
    void info() {
        try{
            super.verificarInfos();
            System.out.println("");
            System.out.println("Nome: " + getNome());
            System.out.println("Salário: " + (super.getSalarioBase() * 2));
            System.out.println("");
        } catch(RuntimeException e){
            System.out.println("ERRO! " + e.getMessage());
        }
    }
    
}
