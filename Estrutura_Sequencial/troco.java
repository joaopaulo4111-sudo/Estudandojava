package Estrutura_Sequencial;

import java.sql.SQLOutput;
import java.util.Scanner;

public class troco {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco, qtd,recebido,troco,valor;
        System.out.print("digite o preço do produto: ");
        preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtd = sc.nextDouble();
        System.out.print("Dinheiro recebido: ");
        recebido = sc.nextDouble();
        valor = preco *qtd;
        troco = recebido - valor;
        if (recebido>=valor){
            System.out.println("Troco = "+ troco);
        }
        else {
            System.out.println("pobre");
        }
    }
}
