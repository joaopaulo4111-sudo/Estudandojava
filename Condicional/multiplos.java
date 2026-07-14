package Condicional;

import java.util.Scanner;

public class multiplos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Digite 2 numeros inteiros:");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a % b == 0 || b % a == 0) {
            System.out.println("são multiplos");
        } else {
            System.out.println("não multiplos");
        }
    }
}
