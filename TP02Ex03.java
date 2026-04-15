// Exercício 03:
// Entrar com N valores (N < 20). Exibir maior, menor, soma, média,
// % positivos e % negativos. Permitir repetir o programa.
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

import java.util.Scanner;

public class TP02Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;

        do {
            int n;

            System.out.print("Digite a quantidade (até 20): ");
            n = sc.nextInt();

            while (n <= 0 || n >= 20) {
                System.out.println("Erro! Digite entre 1 e 19.");
                n = sc.nextInt();
            }

            int maior = 0, menor = 0, soma = 0;
            int positivos = 0, negativos = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Digite um valor: ");
                int valor = sc.nextInt();

                if (i == 1) {
                    maior = menor = valor;
                }

                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;

                soma += valor;

                if (valor >= 0) positivos++;
                else negativos++;
            }

            double media = soma / (double) n;
            double percPos = (positivos * 100.0) / n;
            double percNeg = (negativos * 100.0) / n;

            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("% Positivos: " + percPos);
            System.out.println("% Negativos: " + percNeg);

            System.out.print("Deseja repetir (S/N)? ");
            opcao = sc.next().charAt(0);

        } while (opcao == 'S' || opcao == 's');
    }
}
