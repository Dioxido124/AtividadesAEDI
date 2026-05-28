package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX28{
    public static void main(String[] args) {
        List <Double> listRa = new ArrayList<Double>();
        double ra;
        List <String> listNome = new ArrayList<String>();
        String nome;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.print("Digite o RA: ");
            ra = teclado.nextDouble();
            teclado.nextLine();
            if(ra != -1){
                listRa.add(ra);
                System.out.print("Digite o nome: ");
                nome = teclado.nextLine();
                listNome.add(nome);
            }
        }while(ra != -1);

        String tempNome;
        double tempRA;
        for(int i = 0; i < listNome.size() - 1; i++){
            for(int j = 0; j<listNome.size()-1; j++){
                if (listNome.get(j).compareToIgnoreCase(listNome.get(j+1)) > 0 ) {
                    tempNome = listNome.get(j);
                    listNome.set(j, listNome.get(j+1));
                    listNome.set(j+1, tempNome);
                    tempRA = listRa.get(j);
                    listRa.set(j, listRa.get(j+1));
                    listRa.set(j+1, tempRA);
                }
            }
        }

        System.out.print("Digite o nome de um aluno que deseja encontrar: ");
        nome = teclado.nextLine();

        int pos = -1;

        for(int i = 0; i < listNome.size(); i++){
            if(listNome.get(i).equalsIgnoreCase(nome)){
                pos = i;
                break;
            }
        }

        if(pos != -1){
            System.out.println("Aluno encontrado!!");
            System.out.printf("RA: %.0f - Posiçao: %d\n", listRa.get(pos), pos+1);
        }else{
            System.out.println("Aluno não encontrado!");
        }
        teclado.close();
    }
}