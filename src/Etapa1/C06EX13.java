package Etapa1;
import java.util.Scanner;

public class C06EX13 {
    public static void main(String[]args){
        //Felipe Bertoldo Alvarenga
        Scanner teclado = new Scanner(System.in);

        int hInicial, mInicial, hFinal, mFinal;
        int totalMinutosInicio, totalMinutosFinal, diferenca, horasDuracao, minutosDuracao;


        System.out.print("Hora inicial: ");
        hInicial = teclado.nextInt();
        System.out.print("Minuto inicial: ");
        mInicial = teclado.nextInt();

        System.out.print("Hora final: ");
        hFinal = teclado.nextInt();
        System.out.print("Minuto final: ");
        mFinal = teclado.nextInt();


        totalMinutosInicio = (hInicial * 60) + mInicial;
        totalMinutosFinal = (hFinal * 60) + mFinal;


        diferenca = totalMinutosFinal - totalMinutosInicio;


        horasDuracao = diferenca / 60;
        minutosDuracao = diferenca % 60;


        System.out.println("Duraçao = " + horasDuracao + " horas e " + minutosDuracao + " minutos.");

        teclado.close();
            }
        }
