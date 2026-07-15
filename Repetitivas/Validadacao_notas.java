package Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Validadacao_notas {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double media, nota,nota1;
        System.out.print("Digite a primeira nota:");
        nota = sc.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.print("Valor invalido! tente novamente: ");
            nota = sc.nextDouble();
        }
        System.out.print("Digite a segunda nota: ");
        nota1 = sc.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota1 = sc.nextDouble();
        }
        media = (nota + nota1)/2;
        System.out.printf("Media = %.2f%n" , media);
    }
}
