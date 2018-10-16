package mapas;

public class Conta {

    private int numero;
    private String dono;
    private double saldo;
    private double limite;

    boolean sacar(double valor) {
        boolean valida = false;
        if (valor > saldo || valor > limite || valor <= 0) {
            return valida;
        } else {
            saldo -= valor;
            return valida = true;
        }
    }

    boolean depositar(double valor) {
        boolean valida = false;
        if (valor <= 0) {
            return valida;
        } else {
            saldo += valor;
            return valida = true;
        }
    }

    void descrever() {
        System.out.println("\n\nNúmero conta: " + numero);
        System.out.println("Dono: " + dono);
        System.out.println("Limite: " + limite);
        System.out.println("Saldo: R$ " + saldo+"\n\n");
    }

    public int getNumero() {
        return numero;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}
