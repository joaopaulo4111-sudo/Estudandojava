package Repetitivas;

import java.util.Scanner;

public class Divisao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos casos você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Entre com o numerador: ");
            double a = sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            double b = sc.nextDouble();
            if (b==0){
                System.out.println("DIVISÃO IMPOSSIVEL");
            }else {
                System.out.printf("DIVISÃO = %.2f%n", a/b);
            }
        }
    }
}
