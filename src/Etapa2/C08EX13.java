package Etapa2;
import java.util.Scanner;

public class C08EX13 {
    public static void main(String[] args){
        String nome = "", nomeMenor = "";
        double pop, elei, quantH, quantM, percent, pop1 = 0, mVSh = 0, popMenor = 0;

        Scanner arquivo = new Scanner(C08EX13.class.getResourceAsStream("cidades"));

        for(int i = 1; i <= 5; i++){
            nome = arquivo.next();
            pop = arquivo.nextDouble();
            elei = arquivo.nextDouble();
            quantH= arquivo.nextDouble();
            quantM = arquivo.nextDouble();
            arquivo.nextLine();

            if(pop != quantH + quantM){
                System.out.println("Quantidade de homens e mulheres em " +nome+ " difere da população");
            }
            percent = (elei * 100)/pop;
            System.out.println("Percentual de eleitores = "+percent);

            if(pop > 1000000){
                pop1++;
            }

            if(quantM > quantH){
                mVSh++;
            }

            if (i == 1 || pop < popMenor){
                popMenor = pop;
                nomeMenor = nome;
            }
        }

        System.out.println("Ttoal de cidades com mais de 1 milhão: "+pop1);
        System.out.println("Cidades com mais mulheres que homens: "+mVSh);
        System.out.println("Cidade com menor população: "+nomeMenor);

        arquivo.close();

    }
}