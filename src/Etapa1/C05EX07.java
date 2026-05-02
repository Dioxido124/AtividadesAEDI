package Etapa1;

import java.util.Scanner;

public class C05EX07 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double x, fx;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        x = teclado.nextDouble();

        fx = Math.sqrt(Math.pow(x/4.0+1,2)+1/5.0*x);
        System.out.println("O valor de f(x) é "+fx);
        teclado.close();
    }
}
