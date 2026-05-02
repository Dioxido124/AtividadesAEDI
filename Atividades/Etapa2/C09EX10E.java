package Etapa2;

public class C09EX10E {
    public static void main(String[] args){
        double serieE = 0;

        for(double i = 1; i <= 100; i++){
            serieE += i/(3*(i*2));
        }
        System.out.println("E = "+serieE);
    }
}
