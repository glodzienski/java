package provaex1;

/**
 *
 * @author Crystopher
 */
public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    void info() {
        try {
            super.verificarInfos();
            System.out.println("");
            System.out.println("Nome: " + super.getNome());
            System.out.println("Salário: " + (super.getSalarioBase() / 2));
            System.out.println("");
        } catch (RuntimeException e) {
            System.out.println("ERRO! " + e.getMessage());
        }
    }

}
