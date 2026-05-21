package Etapa3;

import java.util.Scanner;

public class C12EX23 {
    public static void main(String[] args){
        int num3[] = new int[10];
        int num[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = teclado.nextInt();
        }

        System.out.print("\nNumeros divisiveis por 3: ");

        for (int i = 0; i < num3.length; i++) {
            if(num[i]%3==0){
                num3[i] = num[i];
            }
            System.out.print(num3[i]+" ");
        }
        teclado.close();
    }
}
