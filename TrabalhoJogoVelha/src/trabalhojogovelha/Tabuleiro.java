package trabalhojogovelha;

public class Tabuleiro {
    
    int[][]mat = new int[3][3];
    
    int verificar() {
        
        return 0;
    }

    void imprimir() {
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean preencher(int i, int j, int jogador) {
        
        if(i<0 || i >2 || j< 0 || j>2){//jogador deu uma coordenada invalida
            return false;
        }
        if(mat[i][j]!=0){// jogador deu uma coordenada que já está ocupada
            return false;
        }
        
        mat[i][j]=jogador;
        
        return true;
    }
    
}
