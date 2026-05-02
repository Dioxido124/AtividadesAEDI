package Etapa2;

public class C08EX19 {
    public static void main(String[] args){
        int soma = 0, mult = 0;
        for(int i = 1; i<=100; i++){
            mult = i*i;
            soma += mult;
            System.out.println(mult);
        }
        System.out.println("A soma dos 100 primeiros é "+soma);
    }
}
