package Etapa3;

import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args){
        int soma = 0;
        int vet[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = teclado.nextInt();
            soma += vet[i];
        }

        System.out.print("Os divisores são: ");

        for(int i = 0; i < vet.length; i++){
            if(soma % vet[i] == 0){
                System.out.print(" "+vet[i]);
            }
        }
        teclado.close();
    }
    
}
