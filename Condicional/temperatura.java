package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class temperatura {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double temp, tempq;
        String a;
        System.out.print("digite a temperatura em qual escala (c/f)? ");
        a = sc.next();
        if (a.equals("c")){
            System.out.print("Digite a temperatura em celcius:");
            temp = sc.nextDouble();
            tempq = (temp*9/5)+32;
            System.out.println("Temperatura equivalente em Fahrenheit: " + tempq);
        }else {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temp = sc.nextDouble();
            tempq = (temp-32)/1.8;
            System.out.printf("Temperatura equivalente em Celcius: %.2f%n" , tempq);
        }
    }
}
