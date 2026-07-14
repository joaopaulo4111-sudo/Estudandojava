package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precop,qtdp,valor, troco, total;

        System.out.print("Preço unitário do produto:");
        precop = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtdp = sc.nextDouble();
        System.out.print("Dinehiro recebido:");
        valor = sc.nextDouble();
        total = precop*qtdp;

        if(total<valor){
            troco = valor - total;
            System.out.printf("troco = %.2f%n", troco);
        }else {
            troco = total - valor;
            System.out.printf("Dinheiro insuficiente. Faltam %.2f reais", troco);
        }

    }
}
