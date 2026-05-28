package Etapa3;

import java.util.Scanner;

public class C13EX05 {
    public static void main(String[] args) {
        double angulo, rad;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do angulo: ");
        angulo = teclado.nextDouble();
        rad = angulo * Math.PI/180;

        double sin = Math.sin(rad), cos = Math.cos(rad), tan = Math.tan(rad);
        double arcSin = 1/sin, arcCos = 1/cos, arcTan = 1/tan;

        System.out.printf("\n Seno = %f Cosseno = %f Tangente = %f", sin, cos, tan);
        System.out.printf("\n Arco do Seno = %f Arco do Cosseno = %f Arco da Tangente = %f", arcSin, arcCos, arcTan);


        teclado.close();
    }
}
