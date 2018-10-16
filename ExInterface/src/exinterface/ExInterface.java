package exinterface;

public class ExInterface {

    public static void main(String[] args) {
        
        Animal rex = new Cachorro();
        
        //rex.mover();
        
        ((Falante)rex).falar();
        
    }
    
}
