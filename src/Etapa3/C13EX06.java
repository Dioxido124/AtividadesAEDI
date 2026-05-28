package Etapa3;

import java.util.Scanner;

public class C13EX06 {
    public static void main(String[] args) {
        int count = 0;
        String familia, nome;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome de uma familia: ");
        familia = teclado.nextLine();

        for(int i = 1; i <= 100; i++){
            System.out.print("Digite um nome completo: ");
            nome = teclado.nextLine();
            String[] nomeSplit = nome.split(" ");
            if(nomeSplit[nomeSplit.length -1].equalsIgnoreCase(familia)){
                System.out.println("Pertence a familia");
                count++;
            }else
                System.out.println("Não pertence a familia");
        }

        System.out.println("Quantidade de pessoas dessa familia: "+count);

        teclado.close();
    }
    
}
