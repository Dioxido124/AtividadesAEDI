package Etapa2;

import java.util.Scanner;

public class C08EX02 {
    public static void main(String[] args){
        double nota, faltas;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i<50; i++){
            System.out.print("Digite a nota final: ");
            nota = teclado.nextDouble();
            System.out.print("Digite o numero de faltas: ");
            faltas = teclado.nextDouble();
            if(nota>=65 && faltas<=16){
                System.out.println("APROVADO");
            }else
                System.out.println("Reprovado");
        }

        teclado.close();
    }
}
