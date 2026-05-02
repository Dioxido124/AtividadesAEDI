package Etapa2;

public class C08EX16 {
    public static void main(String[] args){
        int soma = 0, cont = 0;
        for(int i = 1000; i <= 2000; i++){
            if(i%2 == 0){
                soma+=i;
                cont++;
            }
        }
        int media = soma/cont;

        System.out.println("A média dos numeros impares é: "+media);
    }
}
