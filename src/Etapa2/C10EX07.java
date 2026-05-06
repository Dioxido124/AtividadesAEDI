package Etapa2;

import java.util.Scanner;

public class C10EX07 {
    public static void main(String[] args){
        double pop, contamina = 1;
        int totalDias = 0, anos, mes, dias;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        pop = teclado.nextDouble();

        do{
            if (contamina < pop) {
                contamina += contamina * 0.003;
                totalDias ++;
            }
        }while(contamina < pop);

        anos = totalDias / 365;
        mes = (totalDias % 365)/30;
        dias = (totalDias % 365)%30;

        System.out.printf("Anos = %d\nMeses = %d\nDias = %d", anos, mes, dias);

        teclado.close();
    }
}
