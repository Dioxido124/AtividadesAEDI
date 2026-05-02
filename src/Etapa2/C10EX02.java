package Etapa2;

import java.util.Scanner;

public class C10EX02 {
    public static void main(String[] args){
        double num, media, total = 0, cont = 0, cont2 = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.print("Digite um valor(digite 0 para terminar): ");
            num = teclado.nextDouble();
            if(num == 0)
                break;
            if(num >= 1000)
                cont2++;
            cont++;
            total += num;
        }while(num != 0);

        media = total/cont;
        System.out.println("O valor total recebido = "+total);
        System.out.println("A media dos valores recbidos = "+media);
        System.out.println("Quantidade de valores acima de 1000 = "+cont2);
    }
}
