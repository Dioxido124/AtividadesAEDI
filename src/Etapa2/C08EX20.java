package Etapa2;

import java.util.Scanner;

public class C08EX20 {
    public static void main(String[] args){
        double n, soma = 0, x = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        n = teclado.nextInt();

        for(int i = 1; i <n; i++){
            x*=2;
            soma += x;
            System.out.println(x);
        }

        System.out.printf("A soma dos %.0f primeiros termos é %f", n, soma);
        teclado.close();
    }
}
