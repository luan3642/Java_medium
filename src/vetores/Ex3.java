package vetores;

import java.util.Scanner;

/*
Invertendo valores

Crie um array de 5 posições (inteiros).
Peça para o usuário preencher os valores.
Imprima os valores na ordem inversa.
 */
public class Ex3 {

    public static void main(String[] args) {
        int[] vetor = new int[5];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<vetor.length; i++){
            System.out.println("Digite " + i +" o valor:");
            vetor[i] = scan.nextInt();
        }
        System.out.println();
        for(int s = vetor.length-1; s>=0; s--){
            System.out.println(vetor[s]);
        }
    }
}
