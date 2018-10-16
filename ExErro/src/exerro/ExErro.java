package exerro;

public class ExErro {

    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2() {

        System.out.println("inicio do metodo2");

        try {
            int valor = 4 / 0;

            int[] array = new int[20];
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }

        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Acesso fora dos limites");
        }

        System.out.println("fim do metodo2");
    }
}
