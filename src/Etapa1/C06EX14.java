package Etapa1;
import java.util.Scanner;

public class C06EX14 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Digite um número de 4 dígitos: ");
            int numero = teclado.nextInt();

            if (numero < 1000 || numero > 9999) {
                System.out.println("NÚMERO TEM QUE TER 4 DÍGITOS");
            } else {

                int d4 = numero % 10;
                int resto1 = numero / 10;

                int d3 = resto1 % 10;
                int resto2 = resto1 / 10;

                int d2 = resto2 % 10;
                int d1 = resto2 / 10;

                System.out.println("Invertido: " + d4 + d3 + d2 + d1);
            }

            teclado.close();
        }
    }
