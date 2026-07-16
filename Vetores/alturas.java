package Vetores;

import java.util.Scanner;

public class alturas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetor1 = new String[10];
        double[] vetor = new double[10];
        double[] vetor2 = new double[10];
        String nome;
        double idade, altura, n, media, soma, count;
        soma = 0;
        count = 0;
        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextDouble();
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: %n", i+1);
            System.out.print("Nome: ");
            nome = sc.next();
            vetor1[i] = nome;
            System.out.print("idade: ");
            idade = sc.nextDouble();
            vetor2[i] = idade;
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            vetor[i] = altura;
            soma +=vetor[i];
        }
        media = soma / n;
        System.out.printf("Altura media: %.2f%n" , media);
        for (int i = 0; i < n; i++) {
            if (vetor2[i]< 16){
                count +=1;
            }
        }
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n " , (count/n)*100);
        for (int i = 0; i < n; i++) {
            if (vetor2[i]<16){
                System.out.println(vetor1[i]);
            }
        }
    }
}
