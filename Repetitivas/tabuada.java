package Repetitivas;

import java.util.Scanner;

public class tabuada {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Deseja a tabuada para qual valor? ");
        a = sc.nextInt();

        for (int i = 0; i < 10 +1; i++) {
            System.out.printf("%d X %d = %d %n",a,i,a*i);
        }
    }
}
