package Etapa2;

public class C09EX06 {
    public static void main(String[] args){
        double seriem, calc = 0;

        for(int i = 1; i <= 20; i++){
            calc += (i/Math.sqrt((i*2)));
        }
        seriem = 10 + calc;
        System.out.println("Valor da serie = "+seriem);
    }
}
