package Etapa3;

import java.util.Scanner;

public class C12EX17{
    public static void main(String[] args) {
        int num[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = teclado.nextInt();
        }

        System.out.println("Numeros pares");

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                System.out.print(num[i]+" ");
            }
        }
        teclado.close();
    }
}