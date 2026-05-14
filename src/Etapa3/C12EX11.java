package Etapa3;

import java.util.Scanner;

public class C12EX11 {
    public static void main(String[] args){
        int maiorNota = 0;
        String nomeMax = " ";
        int nota[] = new int[8];
        String nome[] = new String[8];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < nota.length; i++){
            System.out.print("Digite o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.print("Digite a nota: ");
            nota[i] = teclado.nextInt();
            teclado.nextLine();
        }

        for(int i = 0; i < nota.length; i++){
            if(nota[i] > maiorNota){
                maiorNota = nota[i];
                nomeMax = nome[i];
            }
        }

        System.out.println("Aluno com a maior nota = "+nomeMax);
        teclado.close();
    }
    
}
