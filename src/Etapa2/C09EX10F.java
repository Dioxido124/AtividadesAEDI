package Etapa2;

public class C09EX10F {
    public static void main(String[] args){
        double serieF = 0;

        for(double i = 1; i <=100; i++){
            serieF += Math.pow(i,2)/Math.pow((2*i), 2);
        }
        System.out.println("F = "+serieF);
    }
}
