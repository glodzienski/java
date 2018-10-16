package jogodavelha;

public abstract class Oponente extends Player {

    Tabuleiro tabuleiro;

    public Oponente(String nome) {
        super(nome);
        super.setNome("Máquina");
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void vitoria() {
        super.vitoria();
    }

    @Override
    public void derrota() {
        super.derrota();
    }

    @Override
    public void velha() {
        super.velha();
    }

    @Override
    public void escolherCaracter(char caracter) {
        super.escolherCaracter(caracter);
    }

    abstract void jogar();

}
