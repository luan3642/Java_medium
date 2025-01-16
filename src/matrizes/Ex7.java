package matrizes;

/*
Task: Write a program to calculate the sum of the diagonals of a square matrix.

Instructions:

Input a square matrix (e.g., 3x3 or 4x4).
Calculate the sum of the primary diagonal and secondary diagonal separately.
 */

public class Ex7 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int sumDiagonalFirst = 0;
        int sumDiagonalSecond = 0;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                if(i == j){
                    sumDiagonalFirst += matriz[i][j];
                }
            }
        }

        for(int i = matriz.length - 1; i>=0; i--){
            for(int j = matriz[i].length - 1; j>=0; j--){
                if(i == j){
                    sumDiagonalSecond += matriz[i][j];
                }
            }
        }

        System.out.println("a sum of first diagonal: "+sumDiagonalFirst);
        System.out.println("a sum of second diagonal: "+sumDiagonalSecond);
    }
}
