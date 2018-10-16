package provaex1;

/**
 *
 * @author Crystopher
 */
public abstract class Funcionario {

    protected double salarioBase = 0;
    private final String nome;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    abstract void info();

    void verificarInfos() {
        if (this.salarioBase == 0) {
            throw new RuntimeException("Salário base não está preenchido");
        }

        if (this.nome.isEmpty()) {
            throw new RuntimeException("Nome não está preenchido");
        }
    }
}
