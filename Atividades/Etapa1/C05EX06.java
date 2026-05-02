package Etapa1;

import java.util.Scanner;

public class C05EX06 {
    public static void main(String[]args){
        //Felipe Bertoldo Alvarenga

        double a,b,c,x,y,r,d;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();
        System.out.print("Digite a posição de X: ");
        x = teclado.nextDouble();
        System.out.print("Digite a posição de Y: ");
        y = teclado.nextDouble();

        r = a*x + b*y + c;

        d = r/Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("A distancia é "+d);
        teclado.close();
    }
}
