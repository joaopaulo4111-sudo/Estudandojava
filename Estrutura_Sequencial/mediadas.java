package Estrutura_Sequencial;

import java.util.Scanner;

public class mediadas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,at,aq,atr;
        System.out.print("Digite a medida a:");
        a = sc.nextDouble();
        System.out.print("Digite a medida b:");
        b = sc.nextDouble();
        System.out.print("Digite a medida c:");
        c = sc.nextDouble();
        aq = a*a;
        at = (a*b)/2;
        atr = ((a+b)*c)/2;

        System.out.printf("Area do quadrado: %.4f%n",aq);
        System.out.printf("Area do triangulo: %.4f%n",at);
        System.out.printf("Area do trapezio: %.4f%n",atr);

    }
}
