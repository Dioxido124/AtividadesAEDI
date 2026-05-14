package Etapa3;

import java.util.Scanner;

public class C12EX04 {
    public static void main(String[] args){
        int corre[] = new int[20];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < corre.length; i++){
            System.out.printf("Digite o numero do corredor que chegou em %d°: ", i+1);
            corre[i] = teclado.nextInt();
        }

        System.out.println("A ordem das duplas é: ");

        for(int i = 0; i<corre.length; i++){
            System.out.printf("%d° - %d/%d\n", i+1, corre[i], corre[i+10]);
        }
        teclado.close();
    }
    
}
