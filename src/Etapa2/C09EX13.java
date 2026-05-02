package Etapa2;

public class C09EX13 {
    public static void main(String[] args){
        double calc = 0, fatorial = 1;

        for(int i = 1; i<=10; i++){
            fatorial *= i;
            if(i%2 == 0){
                calc -= fatorial/(Math.pow(2, i)-1);
            }else{
                calc += fatorial/(Math.pow(2, i)-1);
            }
        }
        System.out.println(calc);
    }
}
