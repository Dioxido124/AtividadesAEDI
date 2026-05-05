package Etapa2;

import java.util.Scanner;

public class C11EX05 {
    public static void main(String[] args){
        String nome;
        int cod, contIn = 0, valorMes, media = 0, cont = 0, totalOp1 = 0, totalOp2 = 0, totalOp3 = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.print("Digite o seu nome: ");
            nome = teclado.nextLine();
            System.out.print(("Digite o seu codigo da opção: "));

            if (!nome.equalsIgnoreCase("FIM")) {
                cod = teclado.nextInt();
                teclado.nextLine();
                cont++;
                switch (cod){
                    case 1:
                        valorMes = 100;
                        totalOp1 += valorMes;
                        media += valorMes;
                        System.out.println(nome+" Valor da mensalidade R$"+valorMes);
                        contIn++;
                        break;
                    case 2:
                        valorMes = 150;
                        totalOp2 += valorMes;
                        media += valorMes;
                        System.out.println(nome+" Valor da mensalidade R$"+valorMes);
                        break;
                    case 3:
                        valorMes = 120;
                        totalOp3 += valorMes;
                        media += valorMes;
                        System.out.println(nome+" Valor da mensalidade R$"+valorMes);
                        break;
                    default:
                        System.out.println("Codigo invalido");
                }
            }
        }while(!nome.equalsIgnoreCase("FIM"));
        media /= cont;
        System.out.println("Quantidade de alunos matriculados em Inglês = "+contIn);
        System.out.println("Media das mensalidades = "+media);
        System.out.println("Total da Opção 1: "+totalOp1+"\nTotal da Opçao 2: "+totalOp2+"\nTotal da Opçao 3: "+totalOp3);
        teclado.close();
    }
}
