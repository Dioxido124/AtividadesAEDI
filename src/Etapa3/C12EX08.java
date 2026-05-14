package Etapa3;

import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args){
        int soma[] = new int[10];
        int vet[] = new int[20];
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = teclado.nextInt();
        }

        for(int i = 0; i < soma.length; i++){
             soma[i] = vet[i] + vet[i+10];
            System.out.printf("\nA %d° soma: %d", i+1, soma[i]);
        }
        teclado.close();
    }
    
}
