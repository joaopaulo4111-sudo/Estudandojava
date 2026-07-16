package Vetores;

import java.util.Scanner;

public class negativos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n,a;
        double[] vetor = new double[10];
        System.out.print("Quantos numeros vc vai  digitar");
        n = sc.nextDouble();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            a = sc.nextDouble();
            vetor[i] = a;
        }
        System.out.println("Numeros negativos");
        for (int i = 0; i < n; i++) {
            if (vetor[i]<0){
                System.out.println(vetor[i]);
            }
        }
    }
}
