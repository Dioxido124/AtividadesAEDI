package Etapa2;

public class C09EX01 {
    public static void main(String[] args){
        double serieb = 0, num = 39;

        for(int i = 1; i <= 38; i++){
            serieb += ((num - 1 - i)*(num - i))/ i;
        }
        System.out.println("Valor da Série = "+serieb);
    }
}
