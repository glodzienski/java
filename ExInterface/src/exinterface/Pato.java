package exinterface;

public class Pato extends Animal implements Falante{

    public Pato() {
        numeroPatas=2;
    }

    
    @Override
    void mover() {
        System.out.println("Sou um pato estou andando com minhas " + numeroPatas + " patas.");
    }

    @Override
    public void falar() {
        System.out.println("Quack Quack!");
    }
    
}
