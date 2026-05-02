package Etapa2;

import java.util.Scanner;

public class C08EX04 {
    public static void main(String[]args){
        String nome;
        int idade, mais18 = 0, menos18 = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i<50; i++){
            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite a sua idade: ");
            idade = teclado.nextInt();
            if(idade<=18){
                menos18++;
            }else
                mais18++;
            teclado.nextLine();
        }

        System.out.println("Até 18 -> "+menos18);
        System.out.println("Acima de 18 -> "+mais18);

        teclado.close();
    }
}
