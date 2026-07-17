package Matrizes;

import java.util.Scanner;

public class problema_exemplo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double matriz[][] = new double[5][5];
        double m,n;
        System.out.print("Quantas linhas vai ter a matriz? ");
        m = sc.nextDouble();
        System.out.print("Quantas colunas vai ter a matriz? ");
        n = sc.nextDouble();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ",i,j);
                matriz[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Matriz digitada: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]+ " ");

            }
            System.out.println();
        }
    }
}
