package Etapa1;

import java.util.Scanner;

public class C05EX12 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        long segundos, h, seg, min;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a duraçao em segundos: ");
        segundos = teclado.nextLong();

        h = segundos/3600;
        min = segundos/60 % 60;
        seg = segundos%60;
        System.out.println("Horas "+h);
        System.out.println("Minutos "+min);
        System.out.println("Segundos "+seg);
        teclado.close();
    }
}
