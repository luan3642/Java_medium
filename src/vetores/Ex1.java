package vetores;

import java.util.Scanner;

/*

Média dos elementos de um array

Crie um array de 4 posições para guardar notas de um aluno (tipo double).
Peça para o usuário digitar as 4 notas.

 */
public class Ex1 {
    public static void main(String[] args) {
     double[] vetor;
     vetor = new double[4];

     int soma = 0, media = 0;

     Scanner scan = new Scanner(System.in);

     for(int i = 0; i <vetor.length; i++){
         System.out.println("Digite: "+i+ " nota");
         vetor[i] = scan.nextDouble();
         soma +=vetor[i];
     }

     media = soma/ vetor.length;


     System.out.println("A media é: "+media);







    }
}