package Etapa1;
import java.util.Scanner;

public class C04EX03 {
    static void main() {
        //Felipe Bertoldo Alvarenga
        double limit1, limit2, preco1, preco2, preco3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o limite 1: ");
        limit1 = teclado.nextDouble();
        System.out.println("Digite o preço da primeira multa: ");
        preco1 = teclado.nextDouble();
        System.out.println("Digite o limite 2: ");
        limit2 = teclado.nextDouble();
        System.out.println("Digite o segundo preço da multa: ");
        preco2 = teclado.nextDouble();
        System.out.println("Digite o preço da terceira multa: ");
        preco3 = teclado.nextDouble();


        System.out.printf("==================================================" +
                "\nQuantidade de Poluente Emitido X Valor da Multa\n" +
                "--------------------------------------------------\n");
        System.out.printf("Até %1.2f multa de R$ %1.2f", limit1, preco1);
        System.out.printf("\nEntre %1.2f e %1.2f multa de R$ %1.2f", limit1, limit2, preco2);
        System.out.printf("\nAcima %1.2f multa de R$ %1.2f por poluente emitido", limit2, preco3);
        teclado.close();
    }
}
