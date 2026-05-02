package Etapa1;
import java.util.Scanner;

public class C07EX02 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("--- Sistema de Notas ---");
            System.out.print("Digite a 1ª nota (0-10): ");
            int n1 = teclado.nextInt();

            System.out.print("Digite a 2ª nota (0-10): ");
            int n2 = teclado.nextInt();

            System.out.print("Digite a 3ª nota (0-10): ");
            int n3 = teclado.nextInt();

            int notaFinal = (n1 + n2 + n3) / 3;

            char conceito;

            switch (notaFinal) {
                case 10:
                case 9:
                    conceito = 'A';
                    break;
                case 8:
                    conceito = 'B';
                    break;
                case 7:
                    conceito = 'C';
                    break;
                case 6:
                case 5:
                    conceito = 'D';
                    break;
                case 4:
                case 3:
                case 2:
                case 1:
                    conceito = 'E';
                    break;
                case 0:
                    conceito = 'E';
                    break;
                default:
                    conceito = '?';
                    break;
            }

            System.out.println("\n--- Resultado Final ---");
            System.out.println("Média (Parte Inteira): " + notaFinal);
            if (conceito == '?') {
                System.out.println("Erro: Notas inválidas inseridas.");
            } else {
                System.out.println("Conceito do Aluno: " + conceito);
            }

            teclado.close();
        }
    }