package Etapa1;

import java.util.Scanner;

public class C05EX11 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        long numCheq, banco, agen, seq;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero do cheque: ");
        numCheq = teclado.nextLong();

        banco = numCheq/1000000;
        agen = numCheq/1000 %1000;
        seq = numCheq%1000;
        System.out.println("Banco = "+banco);
        System.out.println("Agencia = "+agen);
        System.out.println("Sequencial = "+seq);
        teclado.close();
    }
}
