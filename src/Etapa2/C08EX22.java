package Etapa2;

import java.util.Scanner;

public class C08EX22 {
    public static void main(String[] args){
        int num, cont = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro maior que 0: ");
        num = teclado.nextInt();

        if(num <= 1){
            System.out.printf("O numero %d não é primo", num);
        }

        for(int i = 1; i<=num; i++){
            if(num%i == 0){
                cont++;
            }
        }

        if(cont == 2){
            System.out.printf("O numero %d é primo", num);
        }else {
            System.out.printf("O numero %d nao é primo", num);
        }
        teclado.close();
    }
}
