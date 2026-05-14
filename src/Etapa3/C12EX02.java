package Etapa3;

import java.util.Scanner;

public class C12EX02 {
    public static void main(String[] args){
        int vet[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = teclado.nextInt();
        }
        for(int i = 0; i < vet.length; i++){
            if(vet[i] > 5 && vet[i] < 10){
                System.out.println("Numeros maiores que 5 e menores que 10: "+ vet[i]);
            }
        }
        teclado.close();
    }
    
}
