package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double media, soma = 0;
        double vetor[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        media = soma/n;
        System.out.printf("Media do vetor = %.3f%n" , media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (int i = 0; i < n; i++) {
            if(vetor[i]<media){
                System.out.println(vetor[i]);
            }
        }
    }
}
