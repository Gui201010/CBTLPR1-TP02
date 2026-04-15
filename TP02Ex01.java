// Exercício 01:
// Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
// Caso contrário solicitar novamente apenas o segundo valor.
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

import java.util.Scanner;

public class TP02Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro valor: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        num2 = sc.nextInt();

        while (num2 <= num1) {
            System.out.println("Erro! O segundo valor deve ser maior.");
            System.out.print("Digite novamente o segundo valor: ");
            num2 = sc.nextInt();
        }

        System.out.println("Valores válidos!");
    }
}
