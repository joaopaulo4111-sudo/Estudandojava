package Matrizes;

import java.util.Scanner;

public class matriz_geral {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();
        double matriz[][] = new double[n][n];
        double soma = 0;
        int linha;
        int coluna;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > 0) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.print("SOMA DOS POSITIVOS: " + soma);
        System.out.println();
        System.out.print("Escolha um linha: ");
        linha = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[linha][i] + " ");
        }
        System.out.println();
        System.out.print("Escolha uma coluna: ");
        coluna = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][coluna] + " ");
        }
        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        System.out.print("MATRIZ ALTERADA: ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] *= matriz[i][j];
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

