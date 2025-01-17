package matrizes;

public class Ex8 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        System.out.println("linhas: " +linhas);
        System.out.println("colunas " +colunas);

        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                if(i == 0){
                    System.out.print(matriz[i][j] + " ");
                } else{
                    System.out.println(matriz[i][j] );
                }



            }
            System.out.println();

        }
    }
}
