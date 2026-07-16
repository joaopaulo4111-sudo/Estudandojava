package Vetores;

import java.util.Scanner;

public class maior_posicao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[10];
        double n, a ,x,y;
        x = 0;
        y = 0;
        System.out.print("Quantos numeros vc vai digitar? ");
        n = sc.nextDouble();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            a = sc.nextDouble();
            vetor[i]=a;
        }
        for (int i = 0; i < n; i++) {
            if (vetor[i]>x){
                x = vetor[i];
                y = i;
            }
        }
        System.out.println("maior valor = "+x);
        System.out.println("Posição: "+ y);
    }
}
