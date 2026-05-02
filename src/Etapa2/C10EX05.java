package Etapa2;

import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args){
        String sexo;
        double altura, peso, cont = 0, quantF = 0, media = 0, contM = 0, quantPesoF = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.print("Qual sua altura em metros: ");
            altura = teclado.nextDouble();
            if(altura != 0){
                System.out.print("Qual o seu peso: ");
                peso = teclado.nextDouble();
                System.out.print("Qual o seu sexo?(M ou F): ");
                sexo = teclado.next();
                cont++;

                if(sexo.equalsIgnoreCase("F")){
                    quantF++;
                 }

                if(sexo.equalsIgnoreCase("M")){
                    contM++;
                    media += altura;
                }

                if(sexo.equalsIgnoreCase("F") && peso < 60){
                 quantPesoF++;
                }
            }
        }while(altura != 0);

        media /= contM;

        System.out.println("Total de pessoas pesquisadas = "+cont);
        System.out.println("Quantidade de mulheres = "+quantF);
        System.out.println("Altura media dos homens = "+media);
        System.out.println("Quantidade de mulheres com peso inferior a 60 = "+quantPesoF);
        teclado.close();
    }
}
