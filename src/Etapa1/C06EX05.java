package Etapa1;

import java.util.Scanner;

public class C06EX05 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        long num;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        num = teclado.nextLong();

        if(num%5 == 0 && num%7 == 0){
            System.out.println(num+" é divisivel por 5 e 7 simultaneamente");
        }else{
            System.out.println(num+" não é divisivel por 5 e 7 simultaneamente");
        }
        teclado.close();
    }
}
