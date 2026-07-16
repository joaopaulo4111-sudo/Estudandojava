package Repetitivas;

import java.util.Scanner;

public class fatorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();
        int f = 1;
        if (n <15 ){
            for (int i = n; i > 1; i--) {
                f *= i;
            }
            System.out.println("Resultado " + f);
        }
    }
}
