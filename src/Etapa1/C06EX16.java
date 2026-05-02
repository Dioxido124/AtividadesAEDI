package Etapa1;
import java.util.Scanner;

public class C06EX16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Faltas: ");
        int faltas = teclado.nextInt();
        System.out.print("Notas das 3 provas: ");
        double p1 = teclado.nextDouble();
        double p2 = teclado.nextDouble();
        double p3 = teclado.nextDouble();
        System.out.print("Nota do trabalho: ");
        double notaTrabalho = teclado.nextDouble();
        System.out.print("Idade do aluno: ");
        int idade = teclado.nextInt();

        int peso1;
        if
            (faltas <= 5) peso1 = 3;
        else
            if (faltas <= 10) peso1 = 2;
        else peso1 = 1;

        int peso2;
        if (idade <= 17) peso2 = 1;
        else if (idade <= 50) peso2 = 2;
        else peso2 = 3;

        double menorNota = Math.min(p1, Math.min(p2, p3));
        double mediaMaioresProvas = (p1 + p2 + p3 - menorNota) / 2.0;

        double notaFinal = (mediaMaioresProvas * peso1) + (notaTrabalho * peso2);

        String classificacao;
        if (notaFinal <= 50) classificacao = "Reprovado";
        else if (notaFinal <= 70) classificacao = "Regular";
        else if (notaFinal <= 80) classificacao = "Bom";
        else if (notaFinal <= 90) classificacao = "Muito Bom";
        else classificacao = "Excelente";

        System.out.printf("\nNota Final: %.2f", notaFinal);
        System.out.println("\nResultado Final: " + classificacao);

        teclado.close();
    }
}
