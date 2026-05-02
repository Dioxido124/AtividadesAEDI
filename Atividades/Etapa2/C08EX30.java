package Etapa2;

import java.util.Scanner;

public class C08EX30 {
    public static void main(String[] args){
        double x, n, s = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();
        System.out.print("Digite o valor de n: ");
        n = teclado.nextDouble();
        double in = Math.log(x);

        for(int i = 1; i <= n; i++){
            s += in + Math.pow(x, i)/i;
        }

        System.out.print(s);
    }
}
