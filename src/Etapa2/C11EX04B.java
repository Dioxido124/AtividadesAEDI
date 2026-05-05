package Etapa2;

import java.util.Scanner;

public class C11EX04B {
    public static void main(String[] args){
        String nome, sexo, velha = " ";
        double idade, pontos, valMulta, total = 0, mediaId = 0, cont = 0, contF = 0, contM = 0, idadeM = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                System.out.print("Digite sua idade: ");
                idade = teclado.nextDouble();
                System.out.print("Digite seu sexo: ");
                sexo = teclado.next();
                System.out.print("Digite a quantidade de pontos: ");
                pontos = teclado.nextDouble();
                System.out.print("Digite o valor da multa: ");
                valMulta = teclado.nextDouble();
                teclado.nextLine();

                cont++;
                total += valMulta;
                mediaId += idade;

                if(sexo.equalsIgnoreCase("M")){
                    contM++;
                }

                if(sexo.equalsIgnoreCase("F")&& pontos == 7){
                    contF++;
                }

                if(idade > idadeM){
                    idadeM = idade;
                    velha = nome;
                }
            }
        }while(!nome.equalsIgnoreCase("X"));
        mediaId /= cont;
        contM /= cont*100;

        System.out.println("Idade media dos condutores = "+mediaId);
        System.out.println("Valor total das multas aplicadas = "+total);
        System.out.printf("Percentual de homens multados = %.2f", contM);
        System.out.println("Quantidade de mulheres que perderam 7 pontos = "+contF);
        System.out.println("Nome e idade da pessoa mais velha = "+velha+" "+idadeM);

        teclado.close();
    }
}
