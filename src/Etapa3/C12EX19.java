package Etapa3;

import java.util.Scanner;

public class C12EX19 {
    public static void main(String[] args){
        int j = 0;
        double num[] = new double[10];
        double numIn[] = new double[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = teclado.nextDouble();
        }

        for (int i = num.length - 1; i >= 0; i--){

            numIn[j] = num[i];
            System.out.print(numIn[j]+" ");
            j++;
        }

        teclado.close();
    }
}
