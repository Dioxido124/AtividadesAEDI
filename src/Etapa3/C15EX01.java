package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C15EX01 {
    public static void main(String[] args) {
        String fabri;
        double ano;
        String model;
        double cilindrada;
        String cat;
        Scanner teclado = new Scanner(System.in);
        List<veiculo> listVeiculos = new ArrayList<veiculo>();

        do{
            System.out.print("Digite a fabricante do carro(digite x para encerrar): ");
            fabri = teclado.nextLine();
            if(!fabri.equalsIgnoreCase("x")){
                System.out.print("Digite o modelo do veiculo: ");
                model = teclado.nextLine();
                System.out.print("Digite a categoria do veiculo: ");
                cat = teclado.nextLine();
                System.out.print("Digite o ano de fabricaçao: ");
                ano = teclado.nextDouble();
                System.out.print("Digite a cilindrada do veiculo: ");
                cilindrada = teclado.nextDouble();
                teclado.nextLine();
                
                listVeiculos.add(new veiculo(fabri, ano, model, cilindrada, cat));
            }
        }while(!fabri.equalsIgnoreCase("x"));

        for(int i = 0; i < listVeiculos.size(); i++){
            listVeiculos.get(i).fichaTecnica();
            listVeiculos.get(i).ligar();
            System.out.println("\n");
        }

        teclado.close();
    }
    
}
