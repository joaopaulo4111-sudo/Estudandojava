package Matrizes;

import java.util.Scanner;

public class diagonal_negativos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz?");
        int n = sc.nextInt();
        int count = 0;
        double matriz[][] = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d] : ", i,j);
                matriz[i][j]= sc.nextDouble();
                if (matriz[i][j]<0){
                    count +=1;
                }
            }
        }
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i]+ " ");
        }
        System.out.println();
        System.out.println("quantidade de negativos: "+ count);
    }
}
