package Etapa2;

import java.util.Scanner;

public class C08EX05 {
    public static void main(String[] args){
        int voto, cont1=0, cont2=0, cont3=0;
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i<100; i++){
            System.out.print("Digite o numero do seu candidato: ");
            voto = teclado.nextInt();

            switch (voto){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                default:
                    System.out.println("Numero de candidato invalido");
                    break;
            }


        }
        if(cont1>cont2 && cont1>cont3){
            System.out.println("O candidato fulano venceu com "+cont1+" votos");
        }else
        if(cont2>cont3){
            System.out.println("O candidato ciclano venceu com "+cont2+" votos");
        }else{
            System.out.println("O candidato beltrano venceu com "+cont3+" votos");
        }

        teclado.close();
    }
}
