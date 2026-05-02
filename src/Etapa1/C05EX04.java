package Etapa1;

import java.util.Scanner;

public class C05EX04 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double x1, y1, x2, y2, distancia;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a cordenada x do primeiro ponto: ");
        x1 = teclado.nextDouble();
        System.out.print("Digite a cordenada y do primeiro ponto: ");
        y1 = teclado.nextDouble();
        System.out.print("Digite a cordenada x do segundo ponto: ");
        x2 = teclado.nextDouble();
        System.out.print("Digite a cordenada y do segundo ponto: ");
        y2 = teclado.nextDouble();

        distancia = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("A distancia entre os dois pontos é: "+distancia);
        teclado.close();
    }
}
