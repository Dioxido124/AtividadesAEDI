package Etapa1;

import java.util.Scanner;

public class C06EX06 {
    public static void main (String[] args){
        //Felipe Bertoldo Alvarenga
        double a,b,c,x1,x2, delta;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();

        delta = Math.pow(b,2)- 4*a*c;

        if(delta>0){
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Teremos 2 raízes "+x1 +" e " +x2);
        } else
            if(delta==0){
                x1 = (-b + Math.sqrt(delta))/(2*a);
                System.out.println("Teremos 1 raíz "+x1);
            }
            else {
                System.out.println("Não teremos nenhuma raíz ");
            }
        teclado.close();
    }
}
