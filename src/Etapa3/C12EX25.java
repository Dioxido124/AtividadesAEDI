package Etapa3;

import java.util.Scanner;

public class C12EX25 {
    public static void main(String[] args){
        String frase;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        frase = teclado.nextLine();

        String[] split = frase.split(" ");

        for(int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }

        teclado.close();
    }
    
}
