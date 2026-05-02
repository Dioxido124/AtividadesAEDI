package Etapa2;

import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args){
        String nome, nomeMaior = "";
        double total = 0, preco, quant, insu, custoPar, media, precoMaior = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de insumos: ");
        insu = teclado.nextDouble();
        teclado.nextLine();

        for(int i = 0; i<insu; i++){
            System.out.print("Digite o nome do produto: ");
            nome = teclado.nextLine();
            System.out.print("Digite o preço unitario do produto: ");
            preco = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Digite a quantidade consumida: ");
            quant = teclado.nextDouble();
            custoPar = quant*preco;
            System.out.printf("Custo parcial R$%.2f\n", custoPar);
            teclado.nextLine();

            total += custoPar;
            if(i==0 || custoPar>precoMaior){
                precoMaior = custoPar;
                nomeMaior = nome;
            }
        }
        media = total/insu;

        System.out.printf("Custo total -> R$%.2f\n " +
                "Média dos Custos Parcias -> R$%.2f\n " +
                "Nome do insumo maior custo parcial é %s\n", total, media, nomeMaior);
        teclado.close();
    }
}
