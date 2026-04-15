// Exercício 10:
// Matriz inversa (2x2 simplificada).
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

import java.util.Scanner;

public class TP02Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int det = m[0][0]*m[1][1] - m[0][1]*m[1][0];

        if (det == 0) {
            System.out.println("Sem inversa");
        } else {
            System.out.println("Inversa:");
            System.out.println(m[1][1]/(double)det + " " + (-m[0][1]/(double)det));
            System.out.println(-m[1][0]/(double)det + " " + (m[0][0]/(double)det));
        }
    }
}
