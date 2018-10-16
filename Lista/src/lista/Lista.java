/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Crystopher
 */
public class Lista {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        
        lista.add(0);
        lista.add(1);
        lista.add(1);
        lista.add(0);
        
        //Exercício 1
        //embaralhar(lista);
        //System.out.println(lista);
        
        //Exercício 2
        if (palindromo(lista)){
            System.out.println("É palindromo");
        }else{
            System.out.println("Não é palindromo");
        }
    }
    
    static boolean palindromo(ArrayList<Integer> lista){
        ArrayList<Integer> listaInvertida = new ArrayList();
        
        listaInvertida = (ArrayList<Integer>) lista.clone();
                
        Collections.reverse(lista);
       
        if (lista.equals(listaInvertida)){
            return true; 
        }else{
            return false;
        }
    }
    
    static void embaralhar(ArrayList<Integer> lista){
        Collections.shuffle(lista);
    }
    
}
