// Exercício 09:
// Matriz MxN e sua transposta.
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

import java.util.Scanner;

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matriz = new int[m][n];
        int[][] t = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                t[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
