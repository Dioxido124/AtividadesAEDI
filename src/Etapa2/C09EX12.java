package Etapa2;

public class C09EX12 {
    public static void main(String[] args){
        double pi, calc = 1;

        for(double i = 1; i<=10000; i++){
            calc += -1/(i*4-1)+1/(i*4+1);
        }
        pi = 4 * (calc);
        System.out.println(pi);
    }
}
