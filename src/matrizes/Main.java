package matrizes;

import java.util.Arrays;

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

        // matriz irregulares (jagged arrays)
        int[][] matrizesIrregulares = new int [3][];
        matrizesIrregulares[0] = new int[1];
        matrizesIrregulares[1] = new int[2];
        matrizesIrregulares[2] = new int[1];

        System.out.println();

        //percorrendo a matriz irregular com forEach
        for(int[] linha : matrizDeclaracaoValor){
            for(int elemento : linha){
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        System.out.println();
        //metodos uteis com vetor
        int[] vetor = {1,2,20};

        System.out.println(Arrays.toString(vetor));


        int[][] matrizTeste = {
                {1,666,777},
                {444,222}
        };
        // imprimindo matriz com método abaixo
        System.out.println(Arrays.deepToString(matrizTeste));
    }


}
