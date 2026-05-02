package Etapa2;

import java.util.Scanner;

public class C08EX09 {
    public static void main(String[]args){
        String nome = "", sexo;
        int idade = 0, quantPess, quantM = 0, quantF = 0, somaM = 0, somaF = 0;
        double mediaM, mediaF;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        quantPess = teclado.nextInt();
        teclado.nextLine();

        for(int i = 0; i<quantPess; i++){
            System.out.print("Digite o nome da pessoa: ");
            nome = teclado.nextLine();
            System.out.print("Digite sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Digite o seu sexo(F feminino e M masculino): ");
            sexo = teclado.nextLine();

            if(sexo.equalsIgnoreCase("M")){
                somaM += idade;
                quantM++;
            }else{
                somaF += idade;
                quantF++;
            }
        }
        mediaM = (float) somaM/quantM;
        mediaF = (float) somaF/quantF;

        System.out.println("Média das idades dos homens = "+mediaM);
        System.out.println("Média das idades dos homens = "+mediaF);
        teclado.close();
    }
}
