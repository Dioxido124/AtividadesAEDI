package Etapa2;

import java.util.Scanner;

public class C09EX09 {
    public static void main(String[] args) {
        double calc = 0, seriek, num;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num = teclado.nextDouble();

        for(int i = 1; i<=num; i++){
            calc += Math.pow(3, i+1)/((i+9)*Math.sqrt(Math.pow(i, 4)));
        }
        seriek = 100 - Math.pow(calc, 3);
        System.out.println(seriek);

        teclado.close();
    }
}
