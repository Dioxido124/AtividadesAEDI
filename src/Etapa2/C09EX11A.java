package Etapa2;

public class C09EX11A {
    public static void main(String[] args){
        double serieA, calc = 0;

        for(double i = 1; i <= 100; i++){
            calc += (i + (i * 7 - 6))/Math.pow(4, i - 1);
        }
        serieA = Math.pow(calc, 1/3.0);
        System.out.println("A = "+serieA);
    }
}
