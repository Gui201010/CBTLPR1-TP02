// Exercício 11:
// Determinante de matriz 2x2.
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

import java.util.Scanner;

public class TP02Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int det = m[0][0]*m[1][1] - m[0][1]*m[1][0];

        System.out.println("Determinante: " + det);
    }
}
