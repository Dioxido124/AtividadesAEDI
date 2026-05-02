package Etapa2;

public class C08EX26 {
    public static void main(String[] args){
        for(int k = 1; k <= 10; k++) {
            for (int j = 1; j <= 10; j++) {
                for (int i = 1; i <= j; i++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
            }

            for (int j = 10; j >= 0; j--) {
                for (int i = 1; i <= j; i++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
            }
        }
    }
}