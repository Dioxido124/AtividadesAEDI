package Etapa1;
import java.util.Scanner;

public class C06EX90 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- PROCESSO SELETIVO: RESPONDA COM 'VERDADEIRO' OU 'FALSO' ---");

        System.out.print("Você tem curso técnico de programação? ");
        boolean tecnico = Boolean.parseBoolean(teclado.next().toLowerCase());

        System.out.print("Você tem curso superior de programação? ");
        boolean superior = Boolean.parseBoolean(teclado.next().toLowerCase());

        System.out.print("Você tem menos de 3 anos de experiência? ");
        boolean menos3Anos = Boolean.parseBoolean(teclado.next().toLowerCase());

        System.out.print("Você se considera uma pessoa criativa? ");
        boolean criativo = Boolean.parseBoolean(teclado.next().toLowerCase());

        System.out.print("Você prefere liderar a ser liderado? ");
        boolean liderar = Boolean.parseBoolean(teclado.next().toLowerCase());

        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe? ");
        boolean sozinho = Boolean.parseBoolean(teclado.next().toLowerCase());

        System.out.print("Você é autodidata? ");
        boolean autodidata = Boolean.parseBoolean(teclado.next().toLowerCase());

        System.out.print("Aceitaria remuneração inicial de R$1500? ");
        boolean aceitaSalario = Boolean.parseBoolean(teclado.next().toLowerCase());

        System.out.print("Só aceita trabalhar em escritórios na Grande BH? ");
        boolean apenasBH = Boolean.parseBoolean(teclado.next().toLowerCase());

        boolean apto = true;

        if (!tecnico && !superior) apto = false;

        if (tecnico && !superior && menos3Anos) apto = false;

        if (liderar && aceitaSalario) apto = false;

        if (!autodidata) apto = false;

        System.out.println("\n------------------------------------");
        if (apto) {
            System.out.println("RESULTADO: VOCÊ ESTÁ APTO PARA A VAGA!");
        } else {
            System.out.println("RESULTADO: VOCÊ NÃO ATENDE AOS REQUISITOS DA VAGA.");
        }

        teclado.close();
    }
}
