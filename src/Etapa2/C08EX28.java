package Etapa2;

public class C08EX28 {
    public static void main(String[] args){
        double media, soma = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            int tri;
            tri = i*(i+1)*(i+2);
            if(tri<1000){
                System.out.print(tri+", ");
                soma += tri;
                count++;
            }
        }
        media = soma/count;
        System.out.println("\nMedia é: "+media);
    }
}

