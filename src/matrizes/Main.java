package matrizes;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        int[][] matrizDeclaracaoValor = {
                {1, 2, 3},
                {4,2,7}
        };

        for(int i = 0; i<matrizDeclaracaoValor.length; i++){
            for(int j = 0; j<matrizDeclaracaoValor[i].length; j++){
                System.out.print(matrizDeclaracaoValor[i][j] + " ");
            }
            System.out.println();
        }
    }
}
