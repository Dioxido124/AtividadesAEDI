package Etapa3;

public class C13EX03METODO {
    public static int decomposition(int num, int pos){
        return num/(int)Math.pow(10, pos - 1)%10;
    }
}
