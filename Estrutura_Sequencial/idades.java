package Estrutura_Sequencial;

import java.util.Scanner;

public class idades {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome1, nome2;
        double idade1 , idade2, media;

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome:");
        nome1 = sc.next();
        System.out.print("Idade:");
        idade1 = sc.nextDouble();
        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome:");
        nome2 = sc.next();
        System.out.print("Idade:");
        idade2 = sc.nextDouble();

        media = (idade1+idade2)/2;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);
    }
}
