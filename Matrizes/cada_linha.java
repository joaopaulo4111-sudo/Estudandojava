package Matrizes;

import java.util.Scanner;

public class cada_linha {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();
        double matriz[][] = new double[n][n];
        double x;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextDouble();
            }
        }
        System.out.println("MAIOR ELEMENDO DE CADA LINHA: ");
        for (int i = 0; i < n; i++) {
            x = 0;
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > x) {
                    x = matriz[i][j];
                }
            }
            System.out.println(x);
        }
    }
}
