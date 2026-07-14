package Estrutura_Sequencial;
import java.util.Scanner;

public class circulo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, raio;
        System.out.print("Digite o valor do raio do circulo:" );
        raio = sc.nextDouble();

        area = Math.PI* (raio*raio);

        System.out.printf("Area = %.3f%n ", area);
    }
}
