package Estrutura_Sequencial;
import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura, comprimento, m2, areat, precot;
        System.out.print("Digite a largura do terreno");
        largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno:");
        comprimento = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado:");
        m2 = sc.nextDouble();
        areat = largura * comprimento;
        precot = areat * m2;

        System.out.println("Area do terreno = " + areat);
        System.out.println("Preço dp terreno = " + precot);
    }
}
