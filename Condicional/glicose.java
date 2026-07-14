package Condicional;

import java.util.Scanner;

public class glicose {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.print("Digite a media de glicose: ");
        a = sc.nextDouble();
        if (a<=100){
            System.out.println("Classificação: normal");
        } else if (a<=140) {
            System.out.println("Classificação: elevado");
        }else {
            System.out.println("Classificação: diabetes");
        }
    }
}
