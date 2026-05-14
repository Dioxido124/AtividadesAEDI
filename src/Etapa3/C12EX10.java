package Etapa3;

import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args){
        int media = 0;
        int nota[] = new int[50];
        String nome[] = new String[50];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < nota.length; i++){
            System.out.print("Digite o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.print("Digite a nota: ");
            nota[i] = teclado.nextInt();
            teclado.nextLine();
            media += nota[i];
        }
        media /= nota.length;

        for(int i = 0; i < nota.length; i++){
            if(nota[i] > media){
                System.out.printf("\nNome: %s - ACIMA DA MEDIA", nome[i]);
            }
        }
        teclado.close();
    }
    
}
