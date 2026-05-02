package Etapa1;
import java.util.Scanner;

public class C07EX04 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Digite o nome da equipe de futebol: ");
            String equipe = teclado.nextLine().trim();

            System.out.println("---");

            switch (equipe.toLowerCase()) {
                case "américa", "atlético", "cruzeiro", "villa nova":
                    System.out.println("Estado: Minas Gerais");
                    break;

                case "botafogo", "flamengo", "fluminense", "vasco":
                    System.out.println("Estado: Rio de Janeiro");
                    break;

                case "corinthians", "palmeiras", "santos", "são paulo":
                    System.out.println("Estado: São Paulo");
                    break;

                case "grêmio", "internacional", "juventude":
                    System.out.println("Estado: Rio Grande do Sul");
                    break;

                case "náutico", "santa cruz", "sport":
                    System.out.println("Estado: Pernambuco");
                    break;

                default:
                    System.out.println("Equipe não encontrada na base de dados.");
                    break;
            }

            teclado.close();
        }
    }