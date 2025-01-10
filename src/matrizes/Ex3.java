package matrizes;
/*
3. Soma de duas matrizes
Crie um programa que:

Leia duas matrizes A e B de tamanho 2x2.
Crie uma matriz C onde cada elemento é a soma dos elementos correspondentes de A e B.
Exiba a matriz C.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[][] matrizA = {
                {2,3},
                {4,5}
        };
        int[][] matrizB = {
                {5,7},
                {6,10}
        };

        int[][] matrizC = new int[matrizB.length][matrizB.length];

        for(int i = 0; i<matrizA.length; i++){
            for(int j = 0; j<matrizA[i].length; j++ ){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        for(int[] i : matrizC){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
