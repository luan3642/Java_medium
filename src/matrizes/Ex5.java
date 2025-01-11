package matrizes;
/*
Crie um programa que:

Leia uma matriz 3x3 do usuário.
Calcule a soma de cada linha e de cada coluna.
Exiba as somas.
 */


public class Ex5 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int somaLinha = 0;
        int somaColuna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];

            }
            System.out.println("a somaLinha é: " + somaLinha);
            somaLinha = 0;
        }

        for(int i = 0; i<matriz.length; i++){
            for(int j  = 0; j<matriz.length; j++){
                System.out.println(matriz[i][j]);
                break;
            }
        }
    }
}
