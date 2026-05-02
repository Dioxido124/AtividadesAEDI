package Etapa1;
import java.util.Scanner;

public class C07EX03 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            // Entrada de dados
            System.out.print("Digite o valor do imposto (R$): ");
            double valorImposto = teclado.nextDouble();

            System.out.print("Digite a quantidade de dias de atraso: ");
            int dias = teclado.nextInt();

            double multa = 0;

            // Processamento com switch case
            switch (dias) {
                // Até 5 dias: Isenta
                case 0: case 1: case 2: case 3: case 4: case 5:
                    multa = 0;
                    break;

                // De 6 a 8 dias: 2%
                case 6: case 7: case 8:
                    multa = valorImposto * 0.02;
                    break;

                // De 9 a 10 dias: 10% + 0,5% por dia de atraso
                case 9: case 10:
                    multa = (valorImposto * 0.10) + (valorImposto * 0.005 * dias);
                    break;

                // Acima de 10 dias
                default:
                    if (dias > 10) {
                        multa = (valorImposto * 1.50) + (1.00 * dias);
                    } else {
                        System.out.println("Quantidade de dias inválida.");
                    }
                    break;
            }

            // Saída de resultados
            System.out.println("\n--- Relatório de Multa ---");
            System.out.printf("Valor do Imposto: R$ %.2f%n", valorImposto);
            System.out.println("Dias de atraso: " + dias);
            System.out.printf("Valor da multa a pagar: R$ %.2f%n", multa);

            teclado.close();
        }
    }