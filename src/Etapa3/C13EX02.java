package Etapa3;

import java.util.Scanner;

public class C13EX02 {
    public static void main(String[] args) {
        int x;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.print("Digite o valor de x: ");
            x = teclado.nextInt();
            if(x != -1){
                System.out.println("f(x) = "+ C13EX02METODO.Fx(x));
            }else
                break;

        } while(x != -1);

        
        teclado.close();
    }
    
}
