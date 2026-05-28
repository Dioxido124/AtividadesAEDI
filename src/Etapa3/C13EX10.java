package Etapa3;

import java.util.Scanner;

public class C13EX10 {
    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        nome = teclado.nextLine();

        String [] nomeSplit = nome.split("");

        for(int i = 0; i < nomeSplit.length; i++){
            System.out.println(nomeSplit[i].toUpperCase());
        }
        teclado.close();
    }
    
}
