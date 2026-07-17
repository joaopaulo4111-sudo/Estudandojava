package Matrizes;

import java.util.Scanner;

public class negativos_matriz {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Linhas: ");
        int m = sc.nextInt();
        System.out.print("Colunas: ");
        int n = sc.nextInt();
        double matriz[][]= new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i,j);
                matriz[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Valores negativos: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j]<0){
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
