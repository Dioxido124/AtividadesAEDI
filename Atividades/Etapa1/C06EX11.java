package Etapa1;

import java.util.Scanner;

public class C06EX11 {
    public static void main(String[]args){
        //Felipe Bertoldo Alvarenga
        String equipe1, equipe2;
        double setEq1, setEq2, pontos1 = 0, pontos2 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome da equipe 1: ");
        equipe1 = teclado.nextLine();
        System.out.print("Digite o nome da equipe 2: ");
        equipe2 = teclado.nextLine();
        System.out.print("Digite a quantidade de sets que o "+equipe1+ " fez: ");
        setEq1 = teclado.nextDouble();
        System.out.print("Digite a quantidade de sets que o "+equipe2+ " fez: ");
        setEq2 = teclado.nextDouble();

        if(setEq1 == 3 && setEq2 == 0 || setEq1 == 3 && setEq2 == 1){
            pontos1 = 3;
            pontos2 = 0;
        }else
            if(setEq2 == 3 && setEq1 == 0 || setEq2 == 3 && setEq1 == 1){
                pontos1 = 0;
                pontos2 = 3;
            }else
                if(setEq1 == 3 && setEq2 == 2){
                    pontos1 = 2;
                    pontos2 = 1;
                }else
                if(setEq2 == 3 && setEq1 == 2){
                    pontos1 = 1;
                    pontos2 = 2;
                }

        System.out.printf("Pontos do %s = %.0f", equipe1, pontos1);
        System.out.printf("\nPontos do %s = %.0f", equipe2, pontos2);

        teclado.close();
    }
}
