package Etapa2;

import java.util.Scanner;

public class C08EX08 {
    public static void main(String[] args){
        double nota, faltas, soma = 0, contFalta = 0, contAp = 0, media;
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i<50;i++){
            System.out.print("Digite a sua nota final: ");
            nota = teclado.nextDouble();
            System.out.print("Digite o numero de faltas: ");
            faltas = teclado.nextDouble();

            if(nota < 65 || faltas > 16){
                System.out.println("Aluno Reprovado");
            }else{
                System.out.println("Aluno aprovado");
                soma += nota;
                contAp++;
            }
            if(faltas > 16){
                contFalta++;
            }
        }
        media = (float) soma/contAp;
        System.out.println("A media das notas dos aprovados é : "+media);
        System.out.println("Quantidade de alunos com mais de 16 faltas é "+contFalta);
        teclado.close();
    }
}
