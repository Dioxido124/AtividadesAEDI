package Etapa1;

import java.util.Scanner;

public class C05EX02 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double area, pi, r, volume;
        pi = 3.1416;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        r = teclado.nextDouble();

        area = 4*pi*Math.pow(r,2);
        volume = 4/3.0*pi*Math.pow(r,3);

        System.out.println("A area da esfera é: "+area);
        System.out.println("O volume da esfera é: "+volume);
        teclado.close();
    }
}
