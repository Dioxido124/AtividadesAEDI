package Etapa1;

import java.util.Scanner;

public class C06EX01 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double x, fx;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();

        if(x<4){
            fx = (5*x + 3)/Math.sqrt(16 - Math.pow(x,2));
        }
        else{
            if(x == 4){
                fx = 0;
            }else{
                fx = (5*x +3) / Math.sqrt(Math.pow(x, 2)- 16);
            }
        }
        System.out.println("f(x) = "+ fx);
        teclado.close();
    }
}
