package exerciciosjava;

public class NumPrimo {

    public NumPrimo() {
        System.out.println("");
        System.out.println("EXERCÍCIO 2 - NÚMERO PRIMO");
        System.out.println("");
        for (int iCount = 1; iCount <= 500; iCount++) {
            if (ehPrimo(iCount)) {
                System.out.println("Número "+iCount+" é primo");
            }
        }
    }

    private boolean ehPrimo(int iNumero) {
        //Declarações
        int iCountDivisores = 0;

        //Implementação
        if ((iNumero % 2 == 0) && (iNumero != 2)) {
            return false;
        } else {
            for (int iCount = 1; iCount <= iNumero; iCount++) {
                if (iCountDivisores >= 3) {
                    return false;
                } else if ((iNumero % iCount) == 0) {
                    iCountDivisores++;
                }
            }
            if (iCountDivisores == 2){
                return true;
            }else{
                return false;
            }
        }
    }
}
