package Etapa2;

public class C09EX11D {
    public static void main(String[] args){
        double seried = 0;

        for(int i = 1; i<=100; i++){
            seried += Math.pow(i, 3)/Math.pow(10, i - 1);
        }
        System.out.println(seried);
    }
}
