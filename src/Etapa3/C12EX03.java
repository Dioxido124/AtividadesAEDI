package Etapa3;

import java.util.Scanner;

public class C12EX03 {
    public static void main(String[] args){
        int vet[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = teclado.nextInt();
        }

        System.out.print("Os numeros elevados: ");
        
        for(int i = 0; i < vet.length; i++){
            vet[i] = vet[i]*vet[i];
            System.out.print(" "+vet[i]);
        }
        teclado.close();
    }
    
}
