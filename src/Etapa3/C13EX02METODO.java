package Etapa3;

public class C13EX02METODO {
    public static double Fx (int x){
        if(x < 4){
            return (5*x + 3)/Math.sqrt((16 - x*x));
        }else if (x > 4) {
            return (5*x + 3)/Math.sqrt((x*x - 16));
        }else
            return 0;
    }
}
