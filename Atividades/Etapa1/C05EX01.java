package Etapa1;

import java.util.Scanner;

public class C05EX01 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double fx, x;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();

        fx = Math.pow(x,3) + 4*x + 10;
        System.out.print("O resultado da função f(x) é "+fx);
        teclado.close();
    }
}
