package matrizes;

public class Ex6 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i == j){
                    matriz[i][j] = 1;
                } else{
                    matriz[i][j] = 0;
                }
            }
        }

        for(int [] i : matriz){
            for(int j : i ){
                System.out.print(j+ " ");
            }
            System.out.println();
        }


    }
}
