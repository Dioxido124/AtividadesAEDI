package Etapa1;

import java.util.Scanner;

public class C04EX02 {
    public static void main (String[] args){
        //Felipe Bertoldo Alvarenga
        String nome, cpf, id, empresa;
        long titulo, cnh;
        double salario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite seu CPF: ");
        cpf = teclado.nextLine();
        System.out.print("Digite o numero da sua identidade: ");
        id = teclado.nextLine();
        System.out.print("Digite o numero do seu titulo de eleitor: ");
        titulo = teclado.nextLong();
        System.out.print("Digite sua CNH: ");
        cnh = teclado.nextLong();
        System.out.print("Digite seu salario: ");
        salario = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Digite a empresa que trabalha: ");
        empresa = teclado.nextLine();

        System.out.println("FICHA FUNCIONAL: "+nome);
        System.out.println("Documentos:\n" +
                "CPF....................................." + cpf +
                "\nC.I....................................." + id +
                "\nTitulo de eleitor......................." + titulo +
                "\nCarteira de motorista..................." + cnh);
        System.out.printf("\nEmpresa: %s\nSalário:R$ %1.2f", empresa, salario);

        teclado.close();
    }
}