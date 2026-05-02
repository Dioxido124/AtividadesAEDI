package Etapa2;

public class C09EX07 {
    public static void main(String[] args){
        double seriej = 0;

        for(double i = 1; i<=6; i++){
            seriej += ((i-1)*2 + i*3)/(i*6+1);
        }
        System.out.println(seriej);
    }
}
