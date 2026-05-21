package Etapa3;

import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args){
        int num[] = new int[20];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = teclado.nextInt();
        }

        System.out.println("\nNumeros impressos: ");

        for(int i = 0; i < num.length; i++){
            if(i % 2 == 0){
                System.out.print(num[i]+" ");
            }
        }

        for(int i = 0; i < num.length; i++){
            if(i % 2 != 0){
                System.out.print(num[i]+" ");
            }
        }

        teclado.close();
    }
}
