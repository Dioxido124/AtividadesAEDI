package Etapa1;

import java.util.Scanner;

public class C05EX10 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        long numero, n1, n2, n3, n4, n5;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero de 5 digitos: ");
        numero = teclado.nextLong();
        n1 = numero/10000;
        n2 = numero/1000 %10;
        n3 = numero/100 %10;
        n4 = numero%100 /10;
        n5 = numero%10;
        System.out.println("Impressao =");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        teclado.close();
    }
}
