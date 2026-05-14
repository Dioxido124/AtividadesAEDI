package AtividadesAEDI.src.Etapa3;

import java.util.Scanner;

public class C12EX14 {
    public static void main(String[] args) {
        int pos = -1, proc;
        int bilhete[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < bilhete.length; i++) {
            System.out.print("Digite o numero do bilhete: ");
            bilhete[i] = teclado.nextInt();
        }

        System.out.print("Digite o numero do bilhete que deseja procurar: ");
        proc = teclado.nextInt();

        for (int i = 0; i < bilhete.length; i++) {
            if (bilhete[i] == proc) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Voce nao foi premiado");
        } else
            System.out.println("Voce foi premiado ");

        teclado.close();
    }
}
