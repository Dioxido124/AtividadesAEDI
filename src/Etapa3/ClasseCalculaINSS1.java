package Etapa3;

public class ClasseCalculaINSS1 {
   public static void MetodoCalculaINSS1() {
     double salario, inss;
     System.out.print("Informe o valor do seu salário: ");
     salario = C14EX01.teclado.nextDouble();
     inss = salario * 0.08;
     System.out.println("O valor do INSS = "+inss);
   }
}
