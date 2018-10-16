package excomputador;

public class ExComputador {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        
        
        
        Computador c = (Desktop)Class.forName("excomputador.Desktop").newInstance();
        c.memoria=8;
        c.processadores=4;
        ((Desktop)c).acessorios=400;
        
        System.out.println("Valor final: " + c.calculaValor());

    }
    
}
