package AtividadesAEDI.src.Etapa3;

import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args){
        int pos = - 1;
        String proc;
        String nome[] = new String[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < nome.length; i++){
            System.out.print("Digite um nome: ");
            nome[i] = teclado.nextLine();
        }

        System.out.print("Digite o nome que deseja procurar: ");
        proc = teclado.nextLine();

        for(int i = 0; i < nome.length; i++){
            if(nome[i].equalsIgnoreCase(proc)){
                pos = i+1;
                break;
            }
        }

        if(pos == -1){
            System.out.println("Nome nao encontrado");
        }else
            System.out.println("Nome encontrado na posição "+pos);

        teclado.close();
    }
}
