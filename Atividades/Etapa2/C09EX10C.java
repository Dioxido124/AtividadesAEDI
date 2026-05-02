package Etapa2;

public class C09EX10C {
    public static void main(String[] args){
        double serieC, calc = 0;

        for(double i = 1; i <= 100; i++){
            calc += (i*2 - 1)/(i*2);
        }
        serieC = 1/3.0 * Math.pow(calc, 2);
        System.out.println("C = "+serieC);
    }
}
