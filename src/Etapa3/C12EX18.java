package Etapa3;

import java.util.Scanner;

public class C12EX18 {
    public static void main(String[] args){
        double mult;
        double num[] = new double[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = teclado.nextDouble();
        }

        System.out.print("Digite um numero para multiplicaçao: ");
        mult = teclado.nextDouble();

        System.out.print("\nNumeros multiplicados: ");

        for(int i = 0; i < num.length; i++){
            num[i] *= mult;
            System.out.print(num[i]+" ");
        }
        teclado.close();
    }
}
