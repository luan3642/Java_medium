package matrizes;

public class Ex4 {
    public static void main(String[] args) {

        int[][] matrizA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Inicialize a matriz transposta com as dimensões invertidas
        int linhas = matrizA.length;          // Número de linhas da matriz original
        int colunas = matrizA[0].length;      // Número de colunas da matriz original
        int[][] matrizTransposta = new int[colunas][linhas]; // Transposta: linhas e colunas invertidas

        // Preencher a matriz transposta
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matrizA[i][j];
            }
        }

        // Imprimir a matriz transposta
        for (int[] linha : matrizTransposta) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
