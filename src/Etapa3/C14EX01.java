package Etapa3;

import java.util.Scanner;

public class C14EX01 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Calcula INSS com alíquota única");
            System.out.println("2 - Calcula INSS com duas alíquotas");
            System.out.println("3 - Calcula INSS com três alíquotas");
            System.out.println("9 - Sair");
            System.out.print(">>> ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: ClasseCalculaINSS1.MetodoCalculaINSS1(); break;
                case 2: ClasseCalculaINSS2.MetodoCalculaINSS2(); break;
                case 3: ClasseCalculaINSS3.MetodoCalculaINSS3(); break;
                case 9: break;
                default: System.out.println("OPÇÃO INVÁLIDA"); break;
      }
    }
            System.out.println("FIM DO PROGRAMA"); 
            teclado.close();

            
    }
}
