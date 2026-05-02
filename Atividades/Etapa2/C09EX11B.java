package Etapa2;

public class C09EX11B {
    public static void main(String[] args){
        double serieB, calc = 0;

        for(double i = 1; i <= 100; i++){
            calc += (i*3-2)/Math.sqrt(i*3+4);
        }
        serieB = 5/3.0 * calc;
        System.out.println("B = "+serieB);
    }
}
