package Etapa1;

import java.util.Scanner;

public class C06EX08 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double pesoMin, pesoMax, altura;
        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite sua altura em metros: ");
        altura = teclado.nextDouble();

        pesoMin = 20*Math.pow(altura, 2);
        pesoMax = 25*Math.pow(altura, 2);
        System.out.printf("Peso Minimo = %.2f", pesoMin);
        System.out.printf("Peso Maximo = %.2f", pesoMax);

        teclado.close();
    }
}
