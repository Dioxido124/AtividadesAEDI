package Etapa2;

public class C09EX10B {
    public static void main(String[] args){
        double serieB, calc = 0;

        for(double i = 1; i <= 100; i++){
            calc += (i*2.0)/(i*3.0);
        }
        serieB = 1 + Math.sqrt(calc);
        System.out.println("B = "+ serieB);
    }
}
