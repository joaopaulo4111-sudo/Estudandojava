package Vetores;

import java.util.Scanner;

public class numeros_pares {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[10];
        double n, a, count;
        count = 0;
        System.out.print("Quantos numeros vc vai digitar? ");
        n = sc.nextDouble();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            a = sc.nextDouble();
            vetor[i] = a;
        }
        System.out.print("Numeros pares: ");
        for (int i = 0; i < n; i++) {
            if(vetor[i]%2==0){
                System.out.print(vetor[i] + "  ");
                count +=1;
            }
        }
        System.out.println(" ");
        System.out.print("Quantidade de numeros pares = " + count);
    }
}
