package Etapa3;

import java.util.Scanner;

public class C12EX16 {
    public static void main(String[] args) {
        int tempPop;
        String tempEst, tempCity;
        int pop[] = new int[20];
        String estado[] = new String[20];
        String cidade[] = new String[20];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < pop.length; i++){
            System.out.print("Digite a populaçao: ");
            pop[i] = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Digite o estado: ");
            estado[i] = teclado.nextLine();
            System.out.print("Digite a cidade: ");
            cidade[i] = teclado.nextLine();
        }

        for(int j = 0; j < pop.length; j++){
            for(int i = 0; i < pop.length - 1; i++){
                if(pop[i] < pop[i+1]){
                    tempPop = pop[i];
                    pop[i] = pop[i+1];
                    pop[i+1] = tempPop;
                    tempEst = estado[i];
                    estado[i] = estado[i+1];
                    estado[i+1] = tempEst;
                    tempCity = cidade[i];
                    cidade[i] = cidade[i+1];
                    cidade[i+1] = tempCity;
                }
            }
        }

        for(int i = 0; i < pop.length; i++){
            System.out.printf("Populaçao: %d - Estado: %s - Cidade: %s\n", pop[i], estado[i], cidade[i]);
        }

        teclado.close();
    }
    
}
