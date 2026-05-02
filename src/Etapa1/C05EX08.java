package Etapa1;

import java.util.Scanner;

public class C05EX08 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double s, a, r, pi;
        Scanner teclado = new Scanner(System.in);
        pi = 3.1416;

        System.out.print("Digite o valor da area de um setor circular: ");
        s = teclado.nextDouble();
        System.out.print("Digite o valor do angulo: ");
        a = teclado.nextDouble();

        r = Math.sqrt(360*s/(a*pi));
        System.out.println("O raio é: "+r);
        teclado.close();
    }
}
