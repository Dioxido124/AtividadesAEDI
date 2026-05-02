package Etapa2;

import java.util.Scanner;

public class C10EX03 {
    public static void main(String[] args){
        double a, r, s;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do angulo: ");
        a = teclado.nextDouble();
        do{
            System.out.print("Digite o valor do raio: ");
            r = teclado.nextDouble();
            if(r != -1){
                s = (a*3.1416*Math.pow(r,2))/360;
                System.out.println("S = "+s);
            }
        }while(r != -1);
        teclado.close();
    }
}
