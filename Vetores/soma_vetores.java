package Vetores;

import java.util.Scanner;

public class soma_vetores {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        double a,b;
        double vetora[] = new double[n];
        double vetorb[] = new double[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            a = sc.nextDouble();
            vetora[i]=a;
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            a = sc.nextDouble();
            vetorb[i]=a;
        }
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            b = vetorb[i]+vetora[i];
            System.out.println(b);
        }
    }
}
