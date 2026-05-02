package Etapa1;

import java.util.Scanner;

public class C05EX09 {
    public static void main(String[]args){
        //Felipe Bertoldo Alvarenga
        double nota1, nota2, nota3, media;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = teclado.nextDouble();

        media = (nota1*2+nota2*3+nota3*5)/(2+3+5);
        System.out.println("Sua media é: "+media);
        teclado.close();
    }
}
