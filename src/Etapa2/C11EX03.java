package Etapa2;

import java.util.Scanner;

public class C11EX03 {
    public static void main(String[] args){
        double valMulta, total = 0;
        int dia, pontos, cont = 0;
        String placa;
        Scanner arquivo = new Scanner(C11EX03.class.getResourceAsStream("multas.txt"));

        do{
            dia = arquivo.nextInt();
            if (dia != 99) {
                arquivo.nextLine();
                placa = arquivo.nextLine();
                pontos = arquivo.nextInt();
                if(pontos == 3){
                    valMulta = 42.0;
                    total += valMulta;
                    System.out.println("Valor da multa = "+valMulta);
                } else if (pontos == 5) {
                    valMulta = 108.0;
                    total += valMulta;
                    System.out.println("Valor da multa = "+valMulta);
                }else {
                    valMulta = 479.0;
                    total += valMulta;
                    System.out.println("Valor da multa = "+valMulta);
                }

                if(pontos == 8 && dia <=15){
                    cont++;
                }
            }
        }while(dia!=99);

        System.out.println("Quantidade de multas de pontuacçao 8 da primeira quinzena do mês = "+cont);
        System.out.println("O valor total arrecado com as multas = "+total);

        arquivo.close();
    }
}
