package Etapa3;

import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args){
        int nota[] = new int[5];
        String nome[] = new String[5];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < nota.length; i++){
            System.out.print("Digite o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.print("Digite a nota desse aluno: ");
            nota[i] = teclado.nextInt();
            teclado.nextLine();
        }

        for(int i = 0; i < nota.length; i++){
            if(nota[i] <= 30){
                System.out.println("Nome: "+nome[i]+" - Nota: "+nota[i]+" - Conceito: D");
            }else if(nota[i] <= 60){
                System.out.println("Nome: "+nome[i]+" - Nota: "+nota[i]+" - Conceito: C");
            }else if(nota[i] <= 80){
                System.out.println("Nome: "+nome[i]+" Nota: "+nota[i]+" - Conceito: B");
            }else{
                System.out.println("Nome: "+nome[i]+" - Nota: "+nota[i]+" - Conceito: A");
            }
        }
        teclado.close();
    }
    
}
