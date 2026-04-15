// Exercício 02:
// Entrar com dez valores positivos. Após a digitação, exibir:
// maior valor, soma e média.
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

import java.util.Scanner;

public class TP02Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, maior = 0, soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um valor positivo: ");
            valor = sc.nextInt();

            while (valor < 0) {
                System.out.println("Erro! Digite um valor positivo.");
                valor = sc.nextInt();
            }

            soma += valor;

            if (i == 1 || valor > maior) {
                maior = valor;
            }
        }

        double media = soma / 10.0;

        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
