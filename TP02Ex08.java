// Exercício 08:
// Multiplicar matriz e armazenar em outra matriz.
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

import java.util.Scanner;

public class TP02Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int[][] nova = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Constante: ");
        int k = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nova[i][j] = matriz[i][j] * k;
            }
        }

        System.out.println("Nova matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nova[i][j] + " ");
            }
            System.out.println();
        }
    }
}
