package Etapa3;

import java.util.Scanner;

public class C13EX04 {
    public static void main(String[] args) {
        int num, count = 0;
        int random =(int) (Math.random()*101);
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um numero entre 0 e 100: ");
            num = teclado.nextInt();
            count++;
            if(num == random){
                System.out.println("O numero esta correto");
                break;
            }
            if(num < random)
                System.out.println("O numero é maior");
            else
                System.out.println("O numero é menor");

        }while(num != random);

        System.out.println("A quantidade de tentativas foi: "+count);


        teclado.close();
    }
    
}
