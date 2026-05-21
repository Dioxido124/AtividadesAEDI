package Etapa3;

import java.util.Scanner;

public class C12EX22 {
    public static void main(String[] args){
        int pos = -1;
        String valorProc;
        String placa[] = new String[100];
        String nome[] = new String[100];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < placa.length; i++){
            System.out.print("Digite a placa de um carro: ");
            placa[i] = teclado.nextLine();

            System.out.print("Digite o nome do dono da vaga: ");
            nome[i] = teclado.nextLine();
        }

        System.out.print("Digite a placa ou o nome que deseja procurar: ");
        valorProc = teclado.nextLine();

        for (int i = 0; i < placa.length; i++){
            if(valorProc.equalsIgnoreCase(placa[i]) || valorProc.equalsIgnoreCase(nome[i])){
                pos = i+1;
                break;
            }
        }

        if(pos == -1){
            System.out.println("Não encontrado");
        }else {
            System.out.println("O numero da sua vaga é "+pos);
        }

        teclado.close();
    }
}
