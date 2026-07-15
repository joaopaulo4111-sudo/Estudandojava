package Repetitivas;

import java.util.Scanner;

public class Crescente {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = 0;
        y= 1;
        while (x!=y){
            System.out.print("Digite dois numeros: ");
            x = sc.nextInt();
            y = sc.nextInt();
            if (x<y){
                System.out.println("Crescente");
            }else if (x>y){
                System.out.println("Decrescente");
            }else {
                System.out.println("");
            }
        }
    }
}
