package Etapa1;

import java.util.Scanner;

public class C06EX04 {
    public static void main(String[]args){
        //Felipe Bertoldo Alvarenga
        String nome;
        double altura, peso, imc;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();
        System.out.print("Digite sus altura: ");
        altura = teclado.nextDouble();

        imc = peso / Math.pow(altura,2);

        if(imc<18){
            System.out.println(nome+" esta desnutrida");
        }else if(imc<20){
            System.out.println(nome+" está abaixo do peso");
        }else if(imc<=25){
            System.out.println(nome+" esta no peso ideal");
        }else if(imc<27){
            System.out.println(nome+" esta acima do peso");
        }else{
            System.out.println(nome+" está obesa");
        }
        teclado.close();
    }
}
