package Etapa2;

public class C08EX23 {
    public static void main(String[] args){
        double soma = 0, media, cont = 0;
        for(int i = 1000; i<=9999; i++){
            int n1 = i/1000;
            int n2 = i/100 %10;
            int n3 = i/10 %10;
            int n4 = i%10;

            if(n1 == n4 && n2 == n3){
                System.out.println(i);
                soma += i;
                cont++;
            }
        }

        media = soma/cont;
        System.out.println("Media = "+media);
    }
}
