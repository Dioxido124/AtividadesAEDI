package Etapa2;

import java.util.Scanner;

public class C08EX12 {
    public static void main(String[] args){
        int cod = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        double fatu;
        Scanner teclado = new Scanner(System.in);


        for (int i = 1; i <= 11; i++) {
            System.out.print("Digite o codigo do produto: ");
            cod = teclado.nextInt();

            switch (cod){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }
        fatu = cont1*1565 + cont2*1890 + cont3*2150 + cont4*2963 + cont5*3750;
        System.out.println("R$ "+fatu);
    }
}
