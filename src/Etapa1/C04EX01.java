package Etapa1;
import java.util.Scanner;

public class C04EX01 {
    public static void main (String[] args){
        //Felipe Bertoldo Alvarenga
        String firstName, middleName, lastName;
        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        firstName = teclado.nextLine();
        System.out.print("Digite seu nome do meio: ");
        middleName = teclado.nextLine();
        System.out.print("Digite seu sobrenome: ");
        lastName = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        System.out.println(lastName+", "+firstName+" "+middleName);
        System.out.println("Idade: "+idade+" anos");

        teclado.close();
    }
}
