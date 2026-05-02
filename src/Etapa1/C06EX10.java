package Etapa1;

import java.util.Scanner;

public class C06EX10 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double capAplic, numDias, taxaDia, rend, imp, valRes;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o capital aplicado: ");
        capAplic = teclado.nextDouble();
        System.out.print("Digite o numero de dias que ficou aplicado: ");
        numDias = teclado.nextDouble();
        System.out.print("Digite a taxa diaria: ");
        taxaDia = teclado.nextDouble();
        taxaDia = taxaDia/100;

        rend = capAplic * taxaDia * numDias;
        imp = rend * 15/100;
        valRes = capAplic + rend - imp - 10;

        System.out.printf("Valor resgatado = %.2f", valRes);

        teclado.close();
    }
}
