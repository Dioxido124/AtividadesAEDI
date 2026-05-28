package Etapa3;

import java.util.Scanner;

public class C13EX03 {
    public static void main(String[] args) {
        int num;
        int pos;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero que deseja decompor: ");
        num = teclado.nextInt();
        System.out.print("Digite a posicao que deseja retornar: ");
        pos = teclado.nextInt();

        System.out.println("\nRetorno: "+C13EX03METODO.decomposition(num, pos));
        teclado.close();
    }
    
}
