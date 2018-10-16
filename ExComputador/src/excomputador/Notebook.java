package excomputador;

public class Notebook extends Computador implements Calculador{
    
    int polegadas;
    
    @Override
    double calculaValor() {
        return memoria*250 + processadores*500 + polegadas*100; 

    }

    @Override
    public void calcular() {
        
    }
    
}
