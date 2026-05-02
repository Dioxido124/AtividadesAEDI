package Etapa2;

import java.util.Scanner;

public class C08EX01 {
    public static void main(String[] args){
        double raio, area;
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            System.out.print("Digite o valor do raio: ");
            raio = teclado.nextDouble();
            area = 3.1416*(raio*raio);
            System.out.println("Area = "+ area);
        }

        teclado.close();
    }
}
