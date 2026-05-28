package Etapa3;

import java.util.Scanner;

public class C13EX07 {
    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        nome = teclado.nextLine();

        String [] lastName = nome.split(" ");
        System.out.println(lastName[lastName.length - 1]);
        
        teclado.close();
    }
    
}
