package Etapa2;

public class C09EX10A {
    public static void main(String[] args){
        double serieA = 0;

        for(int i = 1; i <= 100; i++){
            serieA += i/Math.sqrt((i*2));
        }
        System.out.println("A = "+serieA);
    }
}
