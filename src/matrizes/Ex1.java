package matrizes;

/*
1. Soma dos elementos de uma matriz
Crie um programa que:

Leia os valores de uma matriz 3x3 do usuário.
Calcule e exiba a soma de todos os elementos da matriz.
 */
import java.util.Scanner;
public class Ex1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int soma = 0;

        int[][] matriz = new int[3][3];
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.println("informe os valores para uma matriz 3x3: "+i);
                matriz[i][j] = scan.nextInt();
                soma += matriz[i][j];
            }

        }

        System.out.println("a soma é: "+soma);


    }
}
