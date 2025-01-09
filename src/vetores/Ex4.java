package vetores;

/*
Menor e maior valor

Crie um array de 5 posições (inteiros).
Peça para o usuário preencher os valores.
Identifique e mostre o menor e o maior valor do array.
 */

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        int maior = Integer.MIN_VALUE;
        int menor = 0;
        for(int i = 0; i<vetor.length; i++){
            System.out.println("Digite um valor ");
            vetor[i] = scanner.nextInt();

            if(vetor[i] > maior){
                maior = vetor[i];
            } else{
                menor = vetor[i];
            }
        }

        System.out.println("maior: "+maior);
        System.out.println("menor: "+menor);



    }
}
