// Exercício 06:
// Armazenar seis nomes em uma matriz 2x3 e exibir.
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

import java.util.Scanner;

public class TP02Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] nomes = new String[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                nomes[i][j] = sc.next();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nomes[i][j] + " ");
            }
            System.out.println();
        }
    }
}
