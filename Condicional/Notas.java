package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, notaf;
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        notaf = nota1 + nota2;
        System.out.printf("Nota final = %.1f%n", notaf);
        if (notaf <= 60) {
            System.out.println("Reprovado");
        }
    }
}
