package Etapa3;

import java.util.Scanner;

public class C12EX12 {
    public static void main(String[] args) {
        int maiorNota = 0;
        int nota[] = new int[8];
        String nome[] = new String[8];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nota.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.print("Digite a nota: ");
            nota[i] = teclado.nextInt();
            teclado.nextLine();

            if (nota[i] >= maiorNota) {
                maiorNota = nota[i];
            }
        }

        System.out.print("Aluno com a maior nota = ");

        for (int i = 0; i < nota.length; i++) {
            if (nota[i] == maiorNota) {
                System.out.print(" "+nome[i]);
            }
        }

        teclado.close();
    }
}
