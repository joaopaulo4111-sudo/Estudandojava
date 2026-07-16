package Vetores;

import java.util.Scanner;

public class aprovados {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();
        sc.nextLine();
        double media, soma = 0;
        double vetor[] = new double[n];
        String vetorn[] = new String[n];
        double vetora[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i +1) + "° aluno: ");
            vetorn[i] = sc.nextLine();
            vetor[i] = sc.nextDouble();
            vetora[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            if ((vetora[i]+vetor[i])/2>= 6){
                System.out.println(vetorn[i]);
            }
        }
    }
}
