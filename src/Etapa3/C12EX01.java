package Etapa3;

import java.util.Scanner;

public class C12EX01 {
    public static void main(String[] args){
        int cont = 0;
        int vet[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = teclado.nextInt();

            if(vet[i] % 5 == 0 && vet[i] % 7 == 0){
                cont++;
            }
        }

        System.out.println("A quantidade de numeros por 5 e 7 ao mesmo tempo: "+cont);

        teclado.close();
    }
    
}
