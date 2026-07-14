package Condicional;

import java.util.Scanner;

public class operadora {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos, Valor;
        Valor = 50;
        System.out.print("digite a quantidade de minutos: ");
        minutos = sc.nextInt();

        if(minutos>100){
            Valor += (minutos -100) *2;
        }
        System.out.println("Total a pagar: R$"+Valor );
    }
}
