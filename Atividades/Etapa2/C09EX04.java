package Etapa2;

public class C09EX04 {
    public static void main(String[] args){
        double serieG = 0, calc = 0, num = 1;

        for(int i = 1; i <= 10; i ++ ){
            calc += (num * (num+1)) / ((num+2) *( num+3));
            num += 4;
        }
        serieG += Math.sqrt(calc);
        System.out.println(serieG);
    }
}
