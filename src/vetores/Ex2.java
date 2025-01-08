package vetores;
/*
Pesquisa de valor no array

Crie um array de 6 posições (inteiros).
Peça para o usuário preencher os valores.
Em seguida, pergunte qual valor o usuário deseja pesquisar.
Informe se o valor está no array (e em qual posição) ou não foi encontrado.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        int[] vetor = new int[6];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<vetor.length; i++){
            System.out.println("digite: "+i+ " valor");
            vetor[i] = scan.nextInt();
        }

        boolean encontrou = false;

        System.out.println("Informe o valor que deseja pesquisar");
        int valor = scan.nextInt();

        ArrayList<Integer> valores = new ArrayList<Integer>();

        for(int s = 0; s<vetor.length; s++){
            if(valor == vetor[s]){
                valores.add(s);
                encontrou = true;
            }
        }

        if(encontrou){
            System.out.println(" valor encontrado na posicao: "+ valores );
        }else{
            System.out.println("valor nao encontrado");
        }


    }
}
