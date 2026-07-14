package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class dardo {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b ,c;
        System.out.print("Digite 3 distancias:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if(a>b&&b>c){
            System.out.println("Maior distancia: " + a);
        } else if (a<b&& b>c) {
            System.out.println("Maior distancia: " + b);
        }else {
            System.out.println("Maior distancia: " + c);
        }
    }
}
