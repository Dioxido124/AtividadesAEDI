package Etapa2;

import java.util.Scanner;

public class C08EX18 {
    public static void main(String[] args){
        int x;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 9: ");
        x = teclado.nextInt();

        for(int i = 1; i <= 9; i++){
            int mult = x * i;
            System.out.println(i+"x"+x+"="+mult);
        }
        teclado.close();
    }
}
