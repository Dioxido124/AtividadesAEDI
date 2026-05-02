package Etapa2;

import java.util.Scanner;

public class C09EX03 {
    public static void main(String[] args){
        double serieN = 0, quant;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos a ser gerada: ");
        quant = teclado.nextDouble();

        for(int i = 1; i <= quant; i++){
            serieN += (1 + Math.sqrt(i*4))/(i*3);
        }
        System.out.println(serieN);
    }
}
