package Etapa1;

import java.util.Scanner;

public class C05EX05 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double c, f, k;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius: ");
        c = teclado.nextDouble();

        k = c + 273;
        f = (c * 9/5) + 32;

        System.out.println("A sua temperatura em kelvin é: "+k);
        System.out.println("A sua temperatura em fahrenheit é: "+f);
        teclado.close();
    }
}
