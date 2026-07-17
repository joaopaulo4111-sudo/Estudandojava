package Matrizes;

import java.util.Scanner;

public class soma_linhas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("quantidade de linhas da matriz: ");
        int m = sc.nextInt();
        System.out.print("quantidade de colunas da matriz: ");
        int n = sc.nextInt();

        double matriz[][] = new double[m][n];
        double vetor[] = new double[m];

        for (int i = 0; i < m; i++) {
            System.out.printf("Digite os elementos %d° linha: ", i + 1);
            System.out.println();
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Vetor gerado: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                vetor[i] += matriz[i][j];
            }
            System.out.println(vetor[i]);
        }
    }
}
