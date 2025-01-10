package matrizes;

import java.util.Scanner;

/*
Crie um programa que:

Leia um número inteiro n e crie uma matriz identidade de tamanho n x n.
Em uma matriz identidade, os elementos da diagonal principal são 1 e os demais são 0.
Exiba a matriz no console.
Exemplo: Entrada: n = 3
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe um número para calcular a matriz identidade");
        int numeroLido = scan.nextInt();
        int[][] matriz = new int[numeroLido][numeroLido];

        for(int i = 0; i<matriz.length; i++){
            for(int j =0; j<matriz[i].length; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }


            }
            System.out.println();
        }
        System.out.println();
        for(int[] i : matriz){
            for (int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
