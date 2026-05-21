package Etapa3;

import java.util.Scanner;

public class C13EX01 {
    public static void main(String[] args){
        int x1, x2, y1, y2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x1: ");
        x1 = teclado.nextInt();
        System.out.print("Digite o valor de x2: ");
        x2 = teclado.nextInt();
        System.out.print("Digite o valor de y1: ");
        y1 = teclado.nextInt();
        System.out.print("Digite o valor de y2: ");
        y2 = teclado.nextInt();

        System.out.println("Distancia = "+ Distancia(x1, x2, y1, y2));

        teclado.close();
    }

    public static double Distancia(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 -y2), 2));
    }
}