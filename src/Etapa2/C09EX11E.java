package Etapa2;

public class C09EX11E {
    public static void main(String[] args){
        double calc = 0, serieE;

        for(int i = 1; i <= 100; i++){
            calc += (Math.pow(i, 2)*Math.sqrt(i*2+3))/ Math.pow(i+1, i);
        }
        serieE = 2/3.0 * calc;
        System.out.println(serieE);
    }
}
