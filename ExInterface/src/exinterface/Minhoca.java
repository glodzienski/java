package exinterface;

public class Minhoca extends Animal{

    public Minhoca() {
        numeroPatas=0;
    }
    
    @Override
    void mover() {
        System.out.println("Sou uma minhoca, estou rastejando com minhas " + numeroPatas + " patas.");
    }
    
}
