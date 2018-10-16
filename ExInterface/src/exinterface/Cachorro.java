package exinterface;

public class Cachorro extends Animal implements Falante{
    
    public Cachorro(){
        numeroPatas=4;
    }
    @Override
    void mover() {
        System.out.println("Sou um cachorro andando com minhas " + numeroPatas + " patas.");
    }

    @Override
    public void falar() {
        System.out.println("Au au!");
    }
    
}
