package Matrizes;

import java.util.Scanner;

public class soma_matiz {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("linha: ");
        int m = sc.nextInt();
        System.out.print("coluna: ");
        int n = sc.nextInt();

        double matriza[][] = new double[m][n];
        double matrizb[][] = new double[m][n];
        double matrizs[][] = new double[m][n];

        System.out.println("Digite os valores da matriz a:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elementos [%d,%d]: ", i,j );
                matriza[i][j]= sc.nextDouble();
            }
        }
        System.out.println("Digite os valores da matriz b: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elementos [%d,%d]: ", i,j );
                matrizb[i][j]= sc.nextDouble();
            }
        }
        System.out.println("MATRIZ SOMA: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizs[i][j] = matriza[i][j]+matrizb[i][j];
                System.out.print(matrizs[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
