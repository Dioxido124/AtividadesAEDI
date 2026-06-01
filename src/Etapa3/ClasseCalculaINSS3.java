package Etapa3;

public class ClasseCalculaINSS3 {
   public static void MetodoCalculaINSS3() {
     double salario, inss;
     System.out.print("Informe o valor do seu salário: ");
     salario = C14EX01.teclado.nextDouble();
     if (salario <= 300)
        inss = salario * 0.08;
     else
        if (salario <= 1000)
           inss = salario * 0.09;
        else
           inss = salario * 0.1;
     System.out.println("Valor do INSS = "+inss);
   }
}
