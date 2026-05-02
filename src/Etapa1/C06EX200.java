package Etapa1;

import java.util.Scanner;

public class C06EX200 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double pol, multa;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero de poluentes: ");
        pol = teclado.nextDouble();

        if(pol<=1500){
            multa = 0;
        }
        else {
            if ( pol <= 3500)
                multa = 3000.00;
            else
                multa = 5000.0 * pol;
        }

        System.out.printf("O valor da multa é R$ %.2f", multa);
        teclado.close();
    }
}
