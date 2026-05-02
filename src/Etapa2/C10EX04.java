package Etapa2;

import java.util.Scanner;

public class C10EX04 {
    public static void main(String[] args){
        String nome = "";
        double bdi, quant, preco, custop = 0, custot = 0, precof;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do bdi em %: ");
        bdi = teclado.nextDouble();
        bdi /= 100;


        do {
            teclado.nextLine();
            System.out.print("Digite o nome do produto(digite xxx para encerrar): ");
            nome = teclado.nextLine();
            if(nome.equalsIgnoreCase("XXX")){
                break;
            }
            System.out.print("Digite a quantidade: ");
            quant = teclado.nextDouble();
            System.out.print("Digite o preço unitario: ");
            preco = teclado.nextDouble();
            custop = quant*preco;
            custot += quant*preco;
            System.out.printf("Custo parcial: R$%.2f", custop);

        }while(!nome.equalsIgnoreCase("XXX"));

        bdi *= custot;
        precof = custot + bdi;

        System.out.printf("Preço final = %.2f", precof);

        teclado.close();
    }
}
