package Repetitivas;

import java.util.Scanner;

public class media_idades {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double idade, count, soma, media;
        count = 0;
        soma = 0;
        System.out.print("Digite as idades: ");
        idade = sc.nextInt();
        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            while (idade >= 0) {
                count += 1;
                soma += idade;
                System.out.print("Digite as idades: ");
                idade = sc.nextInt();
            }
            media = soma / count;
            System.out.printf("Media = %.2f%n" , media);
        }
    }
}
