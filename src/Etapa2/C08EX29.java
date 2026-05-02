package Etapa2;

import java.util.Scanner;

public class C08EX29 {
    public static void main(String[] args){
        double x, y, pont = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = teclado.nextDouble();

        for(int i = 1; i <= y; i++){
            pont *= x;
        }
        System.out.println("A potencia de x elevado a y é: "+pont);
        teclado.close();
    }
}
