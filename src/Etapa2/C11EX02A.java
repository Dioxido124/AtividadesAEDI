package Etapa2;

import java.util.Scanner;

public class C11EX02A {
    public static void main(String[] args){
        String nome = " ", menor = " ";
        double valAplic = 0, contB = 0, contP = 0, contO = 0, media = 0, total = 0, valMenor = 0;
        Scanner teclado = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            System.out.print("Digite o seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite o valor aplicado: ");
            valAplic = teclado.nextDouble();
            teclado.nextLine();

            total += valAplic;

            if(valAplic <= 1000){
                System.out.println(nome +" Categoria: Bronze");
                media += valAplic;
                contB++;
            }else if(valAplic <= 5000){
                System.out.println(nome + " Categoria: Prata");
                contP++;
            }else{
                System.out.println(nome + " Categoria: Ouro");
                contO++;
            }

            if(i == 1 || valAplic < valMenor){
                valMenor = valAplic;
                menor = nome;
            }

        }
        media /= contB;

        System.out.println("Total de Bronze = "+contB);
        System.out.println("Total de Prata = "+contP);
        System.out.println("Total de Ouro = "+contO);
        System.out.println("Média das aplicaçoes dos clientes bronzes = R$ "+media);
        System.out.println("Volume total das aplicaçoes = R$ "+total);
        System.out.println("Nome do aplicador de menor aplicaçao = "+menor);

        teclado.close();
    }
}
