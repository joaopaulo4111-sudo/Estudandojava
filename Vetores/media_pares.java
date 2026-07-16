package Vetores;

import java.util.Scanner;

public class media_pares {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double soma = 0, count = 0;
        double vetor[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                count += 1;
            }
        }
        if (soma != 0) {
            System.out.println("MEDIA DOS PARES = " + soma / count);
        }else {
            System.out.println("nenhum numero par");
        }
    }
}