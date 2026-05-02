package Etapa1;

import java.util.Scanner;

public class C06EX09 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double altura, pesoIdeal;
        String sexo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Digite seu sexo(F para feminino e M para masculino): ");
        sexo = teclado.nextLine();


        if(sexo.equalsIgnoreCase("F")){
            pesoIdeal = 62.1*altura-44.7;
            System.out.printf("Seu peso ideal é: %.3f", pesoIdeal);
        }else
            if(sexo.equalsIgnoreCase("M")){
                pesoIdeal = 72.7*altura-58;
                System.out.printf("Seu peso ideal é: %.3f", pesoIdeal);
            }
            else{
                System.out.println("Digite F(feminino) ou M(masculino) para falar o seu sexo");
            }

        teclado.close();

    }
}
