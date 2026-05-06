package Etapa2;

import java.util.Scanner;

public class C08EX21 {
    public static void main(String[] args){
        String sc = "";
        double altura = 0, imc = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();

        System.out.print("Peso  IMC   Situação Corporea\n");

        for(int peso = 60; peso <= 100; peso++){
            imc = peso/Math.pow(altura, 2);

            if(imc<20){
                sc = "ABAIXO DO PESO";
            }else
                if(imc <= 25){
                    sc = "PESO IDEAL";
                }else {
                    sc = "ACIMA DO PESO";
                }

            System.out.printf("%d | %.2f | %s\n",peso, imc, sc);
            teclado.close();
        }
    }
}
