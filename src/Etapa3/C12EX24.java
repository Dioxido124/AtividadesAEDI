package Etapa3;

import java.util.Scanner;

public class C12EX24 {
    public static void main(String[] args) {
        int temp;
        String tempNome;
        int pont[] = new int[20];
        String nome[] = new String[20];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < pont.length; i++) {
            System.out.print("Digite o nome do time: ");
            nome[i] = teclado.nextLine();
            System.out.print("Digite a pontuacao do time: ");
            pont[i] = teclado.nextInt();
            teclado.nextLine();
        }
        for (int j = 0; j < pont.length - 1; j++) {
            for (int i = 0; i < pont.length - 1; i++) {
                if (pont[i] < pont[i + 1]) {
                    temp = pont[i];
                    pont[i] = pont[i + 1];
                    pont[i + 1] = temp;
                    tempNome = nome[i];
                    nome[i] = nome[i + 1];
                    nome[i + 1] = tempNome;
                }
            }
        }

        for (int i = 0; i < pont.length; i++) {
            if (i <= 3) {
                System.out.println(nome[i] + " - " + pont[i] + " - Classificado para libertadores");
            } else if (i < 12) {
                System.out.println(nome[i] + " - " + pont[i] + " - Classificado para Sul-americana");
            }else if(i <= 15){
                System.out.println(nome[i] + " - " + pont[i]);
            }else {
                System.out.println(nome[i] + " - " + pont[i] + " - Rebaixado");
            }
        }
        teclado.close();
    }
}
