package Etapa1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class C04EX05 {
    public static void main(String[] args) {
        //Felipe Bertoldo Alvarenga
        String nome, cpf, id, empresa;
        long titulo, cnh;
        double salario;

        Scanner arquivo = new Scanner(C04EX05.class.getResourceAsStream("dados.txt"));
        nome = arquivo.nextLine();
        cpf = arquivo.nextLine();
        id = arquivo.nextLine();
        titulo = arquivo.nextLong();
        cnh = arquivo.nextLong();
        arquivo.nextLine();
        salario = arquivo.nextDouble();
        arquivo.nextLine();
        empresa = arquivo.nextLine();

        JOptionPane.showMessageDialog(null, "FICHA FUNCIONAL: " + nome + "\nDocumentos:\n" +
                        "CPF....................................." + cpf +
                        "\nC.I....................................." + id +
                        "\nTitulo de eleitor......................." + titulo +
                        "\nCarteira de motorista..................." + cnh + "\nEmpresa: " + empresa +
                        String.format("\nSalario: R$%1.2f", salario),
                "Exercicio4", JOptionPane.INFORMATION_MESSAGE);

        arquivo.close();
    }
}
