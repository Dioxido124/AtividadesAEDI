package Etapa2;

public class C09EX08 {
    public static void main(String[] args){
        double serieo, calc = 0;

        for(double i = 1; i<=20; i++){
            calc +=((i*2+1)*Math.sqrt(i*4+1))/Math.pow(5, i);
        }
        serieo = calc *calc;
        System.out.println(serieo);
    }
}
