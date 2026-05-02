package Etapa2;

import java.util.Scanner;

public class C08EX07 {
    public static void main(String[] args){
        String nome;
        int idade = 0, cont12 = 0, cont30 = 0;
        double soma = 0, media = 0;
        Scanner teclado = new Scanner(System.in);

        for(int i = 0;i<50;i++){
            System.out.print("Digite o nome do aluno: ");
            nome = teclado.nextLine();
            System.out.print("Digite a idade do aluno: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            soma += idade;

            if(idade<=12)
                cont12++;
            if(idade>30)
                cont30++;
        }

        media = soma/5.0;
        System.out.printf("Alunos que tem até 12 anos = %d\n" +"Alunos que tem acima de 30 anos = %d\n" +
                "Media das idades informadas = %.1f", cont12, cont30, media);
        teclado.close();
    }
}
