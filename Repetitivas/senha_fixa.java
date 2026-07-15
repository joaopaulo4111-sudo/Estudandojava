package Repetitivas;

import java.util.Scanner;

public class senha_fixa {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        System.out.print("digite a senha:");
        senha = sc.nextInt();
        while (senha != 2002){
            System.out.print("Senha invalida! Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");
    }
}
