package matrizes;

public class Ex8 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int topo = 0;
        int baixo = matriz.length - 1;
        int esquerda = 0;
        int direita = matriz[0].length - 1; // Correção para número de colunas

        while (topo <= baixo && esquerda <= direita) {
            // Percorrer da esquerda para a direita no topo
            for (int i = esquerda; i <= direita; i++) {
                System.out.print(matriz[topo][i] + " ");
            }
            topo++;

            // Percorrer de cima para baixo na direita
            for (int i = topo; i <= baixo; i++) {
                System.out.print(matriz[i][direita] + " ");
            }
            direita--;

            // Percorrer da direita para a esquerda na base
            if (topo <= baixo) {
                for (int i = direita; i >= esquerda; i--) {
                    System.out.print(matriz[baixo][i] + " ");
                }
                baixo--;
            }

            // Percorrer de baixo para cima na esquerda
            if (esquerda <= direita) {
                for (int i = baixo; i >= topo; i--) {
                    System.out.print(matriz[i][esquerda] + " ");
                }
                esquerda++;
            }
        }
    }
}
