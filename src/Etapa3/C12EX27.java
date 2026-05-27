package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
    public static void main(String[] args) {
        List <Double> cpf = new ArrayList<Double>();
        List <String> address = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);

        double cpf2, cpfProc;
        String address2;

        do{
            System.out.print("Digite o CPF: ");
            cpf2 = teclado.nextDouble();
            teclado.nextLine();
            if(cpf2 != 0){
                cpf.add(cpf2);
                System.out.print("Digite seu endereço: ");
                address2 = teclado.nextLine();
                address.add(address2);
            }
        }while(cpf2 != 0);

        System.out.print("Informe um CPF qualquer: ");
        cpfProc = teclado.nextDouble();
        teclado.nextLine();

        int pos = -1;

        String alt, incluir; 

        for(int i = 0; i < cpf.size(); i++){
            if(cpf.get(i).equals(cpfProc)){
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            System.out.print("CPF encontrado! Deseja alterar o endereço ou excluir o CPF/endereço: ");
            alt = teclado.nextLine();
            if(alt.equalsIgnoreCase("alterar")){
                System.out.print("Digite qual será o endereço novo: ");
                address2 = teclado.nextLine();
                address.set(pos, address2);
              }else if(alt.equalsIgnoreCase("excluir")){
                cpf.remove(pos);
                address.remove(pos);
                }
            }else{
                System.out.print("CPF não encontrado! Deseja incluir(S/N): ");
                incluir = teclado.nextLine();
                if(incluir.equalsIgnoreCase("S")){
                    cpf.add(cpfProc);
                    System.out.print("Digite o endereço que deseja incluir: ");
                    address2 = teclado.nextLine();
                    address.add(address2);
                }
            }

        for(int i = 0; i < cpf.size(); i++){
            System.out.printf("%.0f - %s\n", cpf.get(i), address.get(i));
        }

        teclado.close();
    }
    
}
