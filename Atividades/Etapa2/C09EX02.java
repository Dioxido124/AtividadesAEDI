package Etapa2;

public class C09EX02 {
    public static void main(String[]args){
        double seried = 0;

        for(int i = 1; i <= 100; i++){
            seried += (i)/(Math.pow(i, 2) + (i -1));
        }
        System.out.println(seried);
    }
}
