package Etapa1;
import java.util.Scanner;

public class C07EX01 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Digite o nome do apostador: ");
            String nome = teclado.nextLine();

            System.out.print("Digite a quantidade de acertos (0 a 13): ");
            int acertos = teclado.nextInt();

            String premio;

            switch (acertos) {
                case 0: case 1: case 2: case 3: case 4: case 5:
                    premio = "Nenhum";
                    break;
                case 6: case 7: case 8: case 9: case 10:
                    premio = "Outro cartão para apostar";
                    break;
                case 11:
                    premio = "R$ 100,00";
                    break;
                case 12:
                    premio = "R$ 1.000,00";
                    break;
                case 13:
                    premio = "R$ 50.000,00";
                    break;
                default:
                    premio = "Quantidade de acertos inválida!";
                    break;
            }

            System.out.println("\n--- Resultado ---");
            System.out.println("Apostador: " + nome);
            System.out.println("Prêmio: " + premio);

            teclado.close();
        }
    }