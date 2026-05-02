package Etapa1;

import java.util.Scanner;

public class C06EX07 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double salario, fixo, plBr, plLi, impRend;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o salario do empregado: ");
        salario = teclado.nextDouble();

        if (salario<=300){
            fixo = 500;
            plBr = fixo + salario*7.0/10;
            impRend = plBr * 25.0/100;
            plLi = plBr - impRend;
        }else
            if(salario<1000){
                fixo = 200;
                plBr = fixo + salario*50.0/100;
                impRend = plBr * 25.0/100;
                plLi = plBr - impRend;
            }
            else{
                fixo = 0;
                plBr = fixo + salario*30.0/100;
                impRend = plBr * 25.0/100;
                plLi = plBr - impRend;
            }
            System.out.printf("PL Liquido = %.2f", plLi);

        teclado.close();
    }
}
