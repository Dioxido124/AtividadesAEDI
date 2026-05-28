package Etapa3;

import java.util.Scanner;

public class C13EX09 {
    public static void main(String[] args) {
        String frase;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um frase: ");
        frase = teclado.nextLine();

        String [] fraseSlit = frase.split(" ");

        for(int i = 0; i < fraseSlit.length; i++){
            System.out.print(fraseSlit[i].substring(0,1).toUpperCase() + fraseSlit[i].substring(1)+" ");
        }

        teclado.close();
    }
    
}