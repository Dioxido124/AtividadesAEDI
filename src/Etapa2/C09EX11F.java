package Etapa2;

public class C09EX11F {
    public static void main(String[] args){
        double calc = 0, serief;

        for(int i = 1; i<=100; i++){
            calc += (i*2-1) * Math.pow(2, i+1)/Math.pow(i*5-3, 2);
        }
        serief = 5 * Math.sqrt(calc);
        System.out.println(serief);
    }
}
