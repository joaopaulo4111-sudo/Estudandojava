package Vetores;

import java.util.Scanner;

public class Soma_vetor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[10];
        double a , n , soma, media;
        soma =0;
        System.out.print("Quantos numeros vc vai digitar? ");
        n = sc.nextDouble();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            a = sc.nextDouble();
            vetor[i]= a;
        }
        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i]+"  ");
            soma += vetor[i];
        }
        System.out.println();
        System.out.println("soma = " + soma);
        media = soma/n;
        System.out.println("media = " +media);
    }
}
