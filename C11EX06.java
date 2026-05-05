package Etapa2;

import java.util.Scanner;

public class C11EX06 {
    public static void main(String[] args){
        int canal, numpessoas, cont4 = 0, cont7 = 0, cont12 = 0, contMaior = 0, totalPessoas = 0;
        double media, perc4, perc7, perc12;
        Scanner teclado = new Scanner(System.in);

        for(int i = 1; i <= 78; i++){
            System.out.print("Digite o canal assistido: ");
            canal = teclado.nextInt();
            System.out.println("Digite o numero de pessoas: ");
            numpessoas = teclado.nextInt();

            totalPessoas += numpessoas;

            switch (canal){
                case 4:
                    cont4 += numpessoas;
                    break;
                case 7:
                    cont7+= numpessoas;
                    break;
                case 12:
                    cont12+= numpessoas;
                    break;
            }
        }

        if(cont4>cont7 && cont4>cont12){
            contMaior = 4;
        }else if (cont7>cont12){
            contMaior = 7;
        }else{
            contMaior = 12;
        }

        perc4 =(double) cont4 / totalPessoas * 100;
        perc7 =(double) cont7 / totalPessoas * 100;
        perc12 =(double) cont12 / totalPessoas * 100;
        media = totalPessoas/78.0;
        System.out.println("A audiencia total do canal 4 = "+cont4);
        System.out.println("A audiencia total do canal 7 = "+cont7);
        System.out.println("A audiencia total do canal 12 = "+cont12);
        System.out.println("A porcentagem de audiencia para o canal 4 = "+perc4+"%");
        System.out.println("A porcentagem de audiencia para o canal 7 = "+perc4+"%");
        System.out.println("A porcentagem de audiencia para o canal 4 = "+perc12+"%");
        System.out.println("O numero do canal mais assistido = "+contMaior);
        System.out.println("A media de pessoas que estavam assistindo = "+media);

        teclado.close();
    }
}
