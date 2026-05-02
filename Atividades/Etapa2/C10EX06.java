package Etapa2;

import java.util.Scanner;

public class C10EX06 {
    public static void main(String[] args){
        double a, b, c, x, y, d;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();

        do{
            System.out.print("Digite a posição de X: ");
            x = teclado.nextDouble();
            System.out.print("Digite a posição de Y: ");
            y = teclado.nextDouble();

            d = (a*x + b*y + c)/Math.sqrt((a*a + b*b));
            if(d != 0) {
                System.out.println("Distancia = " + d);
            }
        }while(d != 0);

        teclado.close();
    }
}
