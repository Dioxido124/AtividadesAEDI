package Etapa2;

public class C09EX10D {
    public static void main(String[] args){
        double serieD = 0;

        for (int i = 1; i <= 100; i++){
            serieD += (i + i - 1)/Math.pow(i, 2);
        }
        System.out.println("D = "+serieD);
    }
}
