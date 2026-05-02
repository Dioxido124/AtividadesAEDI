package Etapa2;

import java.util.Scanner;

public class C08EX05A {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int voto, cont1 = 0, cont2 = 0, cont3 = 0, nulos = 0;

        System.out.println("--- PRIMEIRO TURNO ---");
        for(int i = 0; i < 100; i++){
            System.out.print("Digite o numero do seu candidato (1, 2 ou 3): ");
            voto = teclado.nextInt();

            if (voto == 1) {
                cont1++;
            } else if (voto == 2) {
                cont2++;
            } else if (voto == 3) {
                cont3++;
            } else {
                System.out.println("Voto nulo registrado.");
                nulos++;
            }
        }

        // 1. Verificando se a eleição foi anulada
        int validos = cont1 + cont2 + cont3;
        if (nulos > validos) {
            System.out.println("\nELEICAO ANULADA! Mais votos nulos do que validos.");
            teclado.close();
            return; // O comando return encerra o programa aqui mesmo
        }

        // 2. Verificando quem vai para o segundo turno (variáveis para guardar o status)
        boolean cand1NoSegundoTurno = false;
        boolean cand2NoSegundoTurno = false;
        boolean cand3NoSegundoTurno = false;
        boolean vaiTerSegundoTurno = false;

        System.out.println("\n--- RESULTADO DO 1o TURNO ---");

        // Alguém ganhou direto?
        if (cont1 > cont2 && cont1 > cont3) {
            System.out.println("Fulano venceu no 1o turno com " + cont1 + " votos!");

        } else if (cont2 > cont1 && cont2 > cont3) {
            System.out.println("Ciclano venceu no 1o turno com " + cont2 + " votos!");

        } else if (cont3 > cont1 && cont3 > cont2) {
            System.out.println("Beltrano venceu no 1o turno com " + cont3 + " votos!");

        } else {
            // Se ninguém foi maior que todos, deu empate.
            vaiTerSegundoTurno = true;
            System.out.println("Houve empate! Vamos para o 2o turno.");

            // Quem empatou?
            if (cont1 == cont2 && cont1 == cont3) {
                cand1NoSegundoTurno = true;
                cand2NoSegundoTurno = true;
                cand3NoSegundoTurno = true;
            } else if (cont1 == cont2 && cont1 > cont3) {
                cand1NoSegundoTurno = true;
                cand2NoSegundoTurno = true;
            } else if (cont1 == cont3 && cont1 > cont2) {
                cand1NoSegundoTurno = true;
                cand3NoSegundoTurno = true;
            } else if (cont2 == cont3 && cont2 > cont1) {
                cand2NoSegundoTurno = true;
                cand3NoSegundoTurno = true;
            }
        }

        // 3. Executando o segundo turno apenas se necessário
        if (vaiTerSegundoTurno) {
            System.out.println("\n--- INICIANDO SEGUNDO TURNO ---");

            // Zerando as urnas para votar de novo
            cont1 = 0; cont2 = 0; cont3 = 0; nulos = 0;

            for(int i = 0; i < 100; i++){
                System.out.print("Digite o numero do seu candidato no 2o turno: ");
                voto = teclado.nextInt();

                // Só soma voto se a pessoa votou num candidato válido E que está no 2º turno
                if (voto == 1 && cand1NoSegundoTurno) {
                    cont1++;
                } else if (voto == 2 && cand2NoSegundoTurno) {
                    cont2++;
                } else if (voto == 3 && cand3NoSegundoTurno) {
                    cont3++;
                } else {
                    System.out.println("Voto nulo registrado.");
                    nulos++;
                }
            }

            // Verificando anulação do 2º turno
            validos = cont1 + cont2 + cont3;
            if (nulos > validos) {
                System.out.println("\nELEICAO ANULADA NO 2o TURNO! Mais votos nulos do que validos.");
                teclado.close();
                return;
            }

            // Quem ganhou o 2º turno?
            System.out.println("\n--- RESULTADO FINAL ---");
            if (cont1 > cont2 && cont1 > cont3) {
                System.out.println("Fulano venceu o 2o turno com " + cont1 + " votos!");
            } else if (cont2 > cont1 && cont2 > cont3) {
                System.out.println("Ciclano venceu o 2o turno com " + cont2 + " votos!");
            } else if (cont3 > cont1 && cont3 > cont2) {
                System.out.println("Beltrano venceu o 2o turno com " + cont3 + " votos!");
            } else {
                System.out.println("A eleicao terminou empatada de novo no 2o turno!");
            }
        }

        teclado.close();
    }
}