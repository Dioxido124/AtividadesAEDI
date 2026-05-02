package Etapa2;

import java.util.Scanner;

public class C10EX01 {
    public static void main(String[] args){
        double num,soma = 0, multa = 0, media, cont = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.print("Digite o valor(digite -1 para encerrar): ");
            num = teclado.nextDouble();
            if(num != -1){
                cont++;
                multa = num * 10/100;
                soma += multa;
                System.out.println("Multa = "+multa);
            }
        }while(num != -1);

        media = soma/cont;
        System.out.printf("Media = %.2f", media);

        teclado.close();
    }
}
