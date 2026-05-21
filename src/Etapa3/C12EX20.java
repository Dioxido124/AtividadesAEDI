package Etapa3;

import java.util.Scanner;

public class C12EX20 {
    public static void main(String[] args){
        double media = 0;
        int count = 0;
        int num[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = teclado.nextInt();
        }

        System.out.print("Numeros maiores que o ultimo numero informado: ");

        for(int i = 0; i < num.length; i++){
            if(num[i] > num[num.length-1]){
                System.out.print(num[i]+" ");
                count++;
                media += num[i];
            }
        }
        media /= count;
        System.out.print("\nMedia dos numeros impressos = "+media);

        teclado.close();
    }
}
