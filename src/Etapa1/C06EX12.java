package Etapa1;

import java.util.Scanner;

public class C06EX12 {
    public static void main(String[]args){
        //Felipe Bertoldo Alvarenga
        double quantProdBol, bolDef, custoCaixa, aluguel, mesCopa, quantCaixas, totalCaixas, quantGalp, totalAluguel, total;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de bolas produzidas: ");
        quantProdBol = teclado.nextDouble();
        System.out.print("Digite a quantidade de bolas com defeito: ");
        bolDef = teclado.nextDouble();
        System.out.print("Digite preço unitario das caixas: ");
        custoCaixa = teclado.nextDouble();
        System.out.print("Digite o valor do aluguel: ");
        aluguel = teclado.nextDouble();
        System.out.print("Digite os meses para a copa: ");
        mesCopa = teclado.nextDouble();

        quantCaixas = (quantProdBol-bolDef)/10;
        totalCaixas = Math.ceil(quantCaixas)*custoCaixa;
        quantGalp = quantCaixas/850;
        totalAluguel = Math.ceil(quantGalp)*aluguel*mesCopa;
        total = totalAluguel + totalCaixas;

        System.out.printf("Custo total = R$ %.2f", total);

        teclado.close();
    }
}
