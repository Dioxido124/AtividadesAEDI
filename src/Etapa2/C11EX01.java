package Etapa2;

import java.util.Scanner;

public class C11EX01 {
    public static void main(String[] args){
        double num, fx, media = 0, cont = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        num = teclado.nextDouble();

        for(double i = 1; i<= num; i++){
            if(i == 1 || i%2 == 1){
                fx = (i*i)+(4*i -2)/5.0;
                media += fx;
                cont++;
                System.out.println("x = "+i+" f(x) = "+fx);
            }
        }
        media /= cont;
        System.out.println("Média de f(x) = "+media);
        teclado.close();
    }
}
