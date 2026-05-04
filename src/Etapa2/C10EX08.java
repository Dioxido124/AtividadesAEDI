package Etapa2;

import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {
        // Inicialização de variáveis
        String nome, nomeMenorPop = "";
        int pop, eleitores, mulheres, homens;
        int totalCidades = 0, cidadesMaisMulheres = 0;
        long populacaoTotalEstado = 0, eleitoresTotalEstado = 0, homensTotalEstado = 0;
        double menorPop = Double.MAX_VALUE;

        Scanner arquivo = new Scanner(C10EX08.class.getResourceAsStream("cidades2.txt"));

        // Primeira leitura antes do loop
        nome = arquivo.nextLine();

        while (!nome.equalsIgnoreCase("Zimbabue de Minas")) {
            pop = arquivo.nextInt();
            eleitores = arquivo.nextInt();
            mulheres = arquivo.nextInt();
            homens = arquivo.nextInt();
            arquivo.nextLine(); // Limpeza de buffer

            // a) Verificação de consistência
            if ((homens + mulheres) != pop) {
                System.out.println("Dados inconsistentes em: " + nome);
            }

            // Acumulando dados para os itens b, c, d, f
            totalCidades++;
            populacaoTotalEstado += pop;
            eleitoresTotalEstado += eleitores;
            homensTotalEstado += homens;

            // e) Cidades com mais mulheres
            if (mulheres > homens) {
                cidadesMaisMulheres++;
            }

            // g) Menor população
            if (pop < menorPop) {
                menorPop = pop;
                nomeMenorPop = nome;
            }

            // Leitura do próximo nome (ou da flag final)
            nome = arquivo.nextLine();
        }

        // Cálculos finais após o loop
        double percEleitores = ((double) eleitoresTotalEstado / populacaoTotalEstado) * 100;
        double mediaHomens = (double) homensTotalEstado / totalCidades;

        // Exibição dos resultados (itens b ao g)
        System.out.println("Total de cidades: " + totalCidades);
        System.out.println("População total: " + populacaoTotalEstado);
        System.out.printf("Percentual de eleitores: %.2f%%\n", percEleitores);
        System.out.println("Cidades com mais mulheres: " + cidadesMaisMulheres);
        System.out.printf("Média de homens por cidade: %.2f\n", mediaHomens);
        System.out.println("Cidade menos populosa: " + nomeMenorPop);

        arquivo.close();
    }
}