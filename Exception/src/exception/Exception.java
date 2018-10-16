package exception;

public class Exception {

    public static void main(String[] args) {
        try{
            throw new RuntimeException("AAAA");
        } catch(RuntimeException e){
            System.out.println("EROOOOO " + e.getMessage());
        }
    }
    
}
