package Etapa1;

import java.util.Scanner;

public class C05EX03 {
    public static void main(String[]args){
        //Felipe Bertoldo Alvarenga
        double salario, liq, imp;
        long numDep;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu salario: ");
        salario = teclado.nextDouble();
        System.out.print("Informe o numero de dependentes: ");
        numDep = teclado.nextLong();

        liq = salario - (numDep*60.0);
        imp = liq *15/100;
        System.out.println("Seu valor liquido é: "+liq);
        System.out.println("O valor do seu imposto de renda é: "+imp);
        teclado.close();
    }
}
