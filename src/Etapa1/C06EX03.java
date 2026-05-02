package Etapa1;

import java.util.Scanner;

public class C06EX03 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double salMes, sal, comis;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor mensal vendido: ");
        salMes = teclado.nextDouble();

        if(salMes<=1000){
            comis = 0;
        }
        else {
            if (salMes <= 10000) {
                comis = salMes * 10 / 100;
            } else {
                comis = 1000;
            }
        }
        sal = 240.0 + comis;
        System.out.printf("Seu salario é %.2f", sal);
        teclado.close();
    }
}
