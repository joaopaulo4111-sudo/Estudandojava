package Condicional;

import java.util.Scanner;

public class menor_de_tres {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Segundo valor: ");
        b = sc.nextInt();
        System.out.print("Terceiro valor: ");
        c = sc.nextInt();
        if (a>b&&b>c){
            System.out.println("menor ="+c);
        } else if (a>b&&c>b) {
            System.out.println("menor = "+b);
        }else {
            System.out.println("menor = "+a);
        }
    }
}
