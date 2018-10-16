package jogodavelha;

public abstract class Player {

    public String nome;
    public int vitorias;
    public int derrotas;
    public int velhas;
    private char caracter;
    

    //GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVelhas() {
        return velhas;
    }

    public void setVelhas(int velhas) {
        this.velhas = velhas;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    //ROTINAS//
    public void vitoria() {
        System.out.println(nome + " ganhou, parabéns!! :D");
        setVitorias(getVitorias() + 1);
    }

    public void derrota() {
        System.out.println(nome + " perdeu... :(");
        setDerrotas(getDerrotas() + 1);
    }

    public void velha() {
        System.out.println("Velha!!!");
        setVelhas(getVelhas() + 1);
    }

    public void escolherCaracter(char caracter) {
        setCaracter(caracter);
    }

    public Player(String nome) {
        this.nome = nome;
    }

}
