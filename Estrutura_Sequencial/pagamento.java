package Estrutura_Sequencial;

import java.util.Scanner;

public class pagamento {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double vhora,horat, pagamento;

        System.out.print("Nome:");
        nome = sc.next();
        System.out.print("Valor pro hora: ");
        vhora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horat = sc.nextDouble();
        pagamento = vhora * horat;
        System.out.printf("O pagamento para %s deve ser %.2f%n", nome ,pagamento);
    }
}
