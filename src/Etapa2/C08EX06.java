package Etapa2;

import java.util.Scanner;

public class C08EX06 {
    public static void main(String[] args){
        double numero, contDiv3 = 0, soma = 0;
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i<10;i++){
            System.out.print("Digite um numero inteiro: ");
            numero = teclado.nextDouble();

            if(numero%2==0){
                System.out.println("O numero é par");
            }else {
                System.out.println("O numero é impar");
            }

            if(numero%4==0){
                soma+=numero;
            }
            if(numero%3==0){
                contDiv3++;
            }
        }

        System.out.println("A soma dos números divisiveis por 4 = "+soma);
        System.out.println("Quantidade de numeros divisiveis por 3 = "+contDiv3);
        teclado.close();
    }
}
