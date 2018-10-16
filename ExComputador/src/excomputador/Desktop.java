package excomputador;

public class Desktop extends Computador{

    double acessorios;
    
    @Override
    double calculaValor() {
        return memoria*200+ processadores*400 + acessorios;
    }
    
}
