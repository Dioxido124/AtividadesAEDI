package Etapa2;

import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args){
        String nome, cargo, nomeM = "", cargoM = "";
        double salario, idade, soma = 0, media, salarioM = 0;
        Scanner teclado = new Scanner(System.in);

        for(int i = 1; i<=7; i++){
            System.out.print("Digite o seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite o seu cargo: ");
            cargo = teclado.nextLine();
            System.out.print("Digite o seu salario: ");
            salario = teclado.nextDouble();
            System.out.print("Digite o sua idade: ");
            idade = teclado.nextDouble();
            teclado.nextLine();

            if(salario>10000 && idade>50){
                System.out.println("SENIOR");
            }

            if(idade<=18){
                soma += salario;
            }

            if(salario>salarioM){
                nomeM = nome;
                cargoM = cargo;
            }
        }
        media = soma/7;
        System.out.println("A meida dos salarios dos funcionarios com até 18 anos: "+media);
        System.out.println("O nome e o cargo do funcionario que tem o maior salario: "+nomeM+" "+cargoM);
        teclado.close();
    }
}
