
package Etapa3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX26 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        List <String> employees = new ArrayList<String>();
        List <Double> sal = new ArrayList<Double>();

        double indice;

        String fun;
        double sal2;

        do{
            System.out.print("Digite o nome do funcionario: ");
            fun = teclado.nextLine();
            if(!fun.equalsIgnoreCase("X")){
                employees.add(fun);
                System.out.print("Digite o salario: ");
                sal2 = teclado.nextDouble();
                sal.add(sal2);
                teclado.nextLine();
            }
        }while(!fun.equalsIgnoreCase("X"));

        System.out.print("Digite o indice de reajuste em porcentagem: ");
        indice = teclado.nextDouble();

        for(int i = 0; i<employees.size(); i++){
            if(sal.get(i)<1000){
                sal.set(i, sal.get(i)+sal.get(i)*indice/100);
            }
        }

        for(int i = 0; i<employees.size(); i++){
            System.out.print(employees.get(i)+" - ");
            System.out.println(sal.get(i));
        }

        teclado.close();
    }
}
