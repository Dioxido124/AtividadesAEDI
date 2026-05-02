import java.util.Scanner;

public class C08EX14 {
    public static void main(String[] args){
        int n;
        String simb;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero (1 a 20): ");
        n = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Digite um simbolo: ");
        simb = teclado.nextLine();


        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(simb);
            }
            System.out.println();
        }

        teclado.close();
    }
}