package Etapa2;

import java.util.Scanner;

public class C08EX31 {
    public static void main(String[] args){
        String nome, cargo, cargoM = "", nomeM = "";
        double sal, cont = 0, quantOutros = 0, media = 0, salM = 0, contA = 0;
        Scanner teclado = new Scanner(System.in);

        for(int i = 1; i <= 7; i++){
            System.out.print("Digite seu nome: ");
            nome = teclado.next();
            System.out.print("Digite o codigo do seu cargo: ");
            cargo = teclado.next();
            System.out.print("Digite seu salario: ");
            sal = teclado.nextDouble();

            if(cargo.equalsIgnoreCase("C") && sal < 2500){
                System.out.println("ABAIXO DO SALARIO MINIMO");
            }
            if(cargo.equalsIgnoreCase("P") && sal < 4650){
                System.out.println("ABAIXO DO SALARIO MINIMO");
            }
            if(cargo.equalsIgnoreCase("O") && sal < 3200){
                System.out.println("ABAIXO DO SALARIO MINIMO");
            }
            if(cargo.equalsIgnoreCase("A") && sal < 5100){
                System.out.println("ABAIXO DO SALARIO MINIMO");
                contA++;
                media += sal;
            }

            if(cargo.equalsIgnoreCase("C") && sal >= 2500){
                cont++;
            }
            if(cargo.equalsIgnoreCase("P") && sal >= 4650){
                cont++;
            }
            if(cargo.equalsIgnoreCase("O") && sal >= 3200){
                cont++;
            }
            if(cargo.equalsIgnoreCase("A") && sal >= 5100){
                cont++;
                contA++;
                media += sal;
            }

            if(cargo.equalsIgnoreCase("X") && sal >= 5000){
                quantOutros++;
            }

            if(i == 1 || sal < salM){
                salM = sal;
                nomeM = nome;
                if (cargo.equalsIgnoreCase("P")){
                    cargoM = "Engenheiro Projetista";
                }else if(cargo.equalsIgnoreCase("A")){
                    cargoM = "Engenheiro Administrador";
                } else if (cargo.equalsIgnoreCase("C")) {
                    cargoM = "Engenheiro Calculista";
                } else if (cargo.equalsIgnoreCase("O")) {
                    cargoM = "Engenheiro de Obra";
                }else{
                    cargoM = "Outros";
                }
            }
        }

        media /= contA;
        System.out.printf("Média dos salario dos Administradores = R$%.2f\n", media);
        System.out.println("Quantidade de salarios acima do minimo = "+cont);
        System.out.println("Quantidade de engenheiros de cargo 'Outros' que recebem acima de 5000 = "+quantOutros);
        System.out.println("Nome, cargo e salario do engenheiro de menor salário: "+ nomeM+", "+cargoM+", "+salM);
        teclado.close();
    }
}
