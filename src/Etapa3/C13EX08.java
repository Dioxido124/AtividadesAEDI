package Etapa3;

import java.util.Scanner;

public class C13EX08 {
    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        nome = teclado.nextLine();

        String [] lastName = nome.split(" ");
        System.out.print(lastName[lastName.length - 1].toUpperCase()+", ");

        for(int i = 0; i < lastName.length - 1; i++){
            System.out.print((lastName[i].charAt(0)+"").toUpperCase()+". ");
        }

        teclado.close();
    }
    
}
