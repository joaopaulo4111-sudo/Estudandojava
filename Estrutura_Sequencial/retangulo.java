package Estrutura_Sequencial;

import java.util.Scanner;

public class retangulo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro,diagonal;
        System.out.print("Digite a base do retangulo:");
        base = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        altura = sc.nextDouble();
        area = base * altura;
        perimetro = (base* altura)*2;
        diagonal = Math.sqrt((base*base)+(altura*altura));

        System.out.printf("Area  = %.4f%n" , area);
        System.out.printf("Perimetro = %.4f%n", perimetro);
        System.out.printf("Diagonal = %.4f%n",  diagonal);

    }
}
