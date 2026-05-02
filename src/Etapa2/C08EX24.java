package Etapa2;

public class C08EX24 {
    public static void main(String[] args){
        double serie, somatorio = 0;

        for(int aux = 1; aux<=100; aux+=2){
            somatorio += Math.pow(2, aux);
        }
        serie = (1/3.0)*somatorio;

        System.out.println("Valor da série = "+ serie);
    }
}
