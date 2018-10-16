package exerciciosjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotacao {

    public Rotacao() {
        Scanner teclado = new Scanner(System.in);
        
        int tamanho = 0;
        int iUltimoNumero = 0;
        int iSomaLista = 0;
        
        System.out.println("Informe quantos elementos a lista terá:");
        tamanho = teclado.nextInt();
        
        ArrayList<Integer> lista = new ArrayList();
        for (int i = 0; i < tamanho; i++) {        
            System.out.println("Informe um número para a posição " + (i + 1) + " da lista");
            lista.add(teclado.nextInt());            
        }
        
        System.out.println("Lista original");
        for (Integer iCount = 0 ; iCount < lista.size(); iCount++) {
            System.out.println(lista.get(iCount));
        }
        System.out.println("");
        System.out.println("Lista rotacionada");
        
        iUltimoNumero = lista.get(lista.size() -1);
        
        for (Integer iCount = lista.size() -1; iCount >= 0; iCount--) {
            if (iCount == 0){
                lista.set(iCount, iUltimoNumero);
            } else {
                lista.set(iCount,lista.get(iCount - 1));
            }
        }
        
        for (Integer iCount = 0 ; iCount < lista.size(); iCount++) {
            System.out.println(lista.get(iCount));
            iSomaLista = iSomaLista + lista.get(iCount);
        }
        
        System.out.println("Soma da lista: " + iSomaLista);
    }
}
