package Etapa1;
import java.util.Scanner;

public class C03EX02 {
        // Função: Calcula a média de 3 números inteiros
        //Felipe Bertoldo Alvarenga
        public static void main(String[] args) {
            long n1, n2, n3, soma;
            double media;
            Scanner teclado = new Scanner(System.in);
            System.out.print("Informe o primeiro numero: ");
            n1 = teclado.nextLong();
            System.out.print("Informe o segundo número: ");
            n2 = teclado.nextLong();
            System.out.print("Informe o terceiro número: ");
            n3 = teclado.nextLong();
            soma = n1 + n2 + n3;
            media = soma / 3.0;
            System.out.println("Média = " + media);
            teclado.close();
        }
}
