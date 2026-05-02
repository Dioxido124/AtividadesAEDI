package Etapa1;

public class C03EX00 {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
/*📚 Resumo da Matéria — Java (C03 a C07)
Capítulo 3 — Introdução, Variáveis e Tipos
Você trabalhou com:

Tipos primitivos: int, long, double, String
Scanner para leitura de teclado: nextLong(), nextDouble(), nextLine()
Saída: System.out.println() e System.out.print()
Math: Math.pow(), que calcula potências — usado pra calcular hipotenusa com Pitágoras
Fatorial com loop for


Capítulo 4 — Strings, Formatação e Entrada de Dados

Leitura de múltiplos dados com Scanner (atenção ao nextLine() após nextLong()/nextDouble())
        System.out.printf() para formatar saída: %s (String), %1.2f (double com 2 casas decimais)
JOptionPane para caixas de diálogo gráficas: showInputDialog, showMessageDialog
Leitura de arquivo com Scanner apontando para um resource (dados.txt)


Capítulo 5 — Expressões Matemáticas
Muitas fórmulas usando a biblioteca Math:
MétodoO que fazMath.pow(x, n)x elevado a nMath.sqrt(x)raiz quadradaMath.min(a, b)menor entre dois valoresMath.ceil(x)arredondamento para cima
Exercícios envolveram: esfera, temperatura, Bhaskara, distância entre pontos, extração de dígitos com % e /, conversão de segundos em horas/minutos.
Dica importante — extração de dígitos:
javan1 = numero / 10000;       // 1º dígito
n2 = numero / 1000 % 10;   // 2º dígito
n3 = numero / 100 % 10;    // 3º dígito

Capítulo 6 — Estruturas Condicionais (if/else)
Este é o capítulo mais longo e provavelmente o mais cobrado!

        if / else if / else — condicionais encadeadas
Operadores lógicos: && (E), || (OU), ! (NÃO)
equalsIgnoreCase() para comparar Strings (nunca use == pra String!)
        Math.ceil() para arredondar pra cima
switch com String no C06EX15 (opções de cidade)

Exemplos de padrões que apareceram:
java// Comparação de String — CORRETO
if (sexo.equalsIgnoreCase("F")) { ... }

// Múltiplas condições
        if (setEq1 == 3 && setEq2 == 0 || setEq1 == 3 && setEq2 == 1) { ... }

Capítulo 7 — switch/case

Estrutura switch com case múltiplos no mesmo bloco:

javacase 0: case 1: case 2: // todos caem no mesmo bloco
premio = "Nenhum";
        break;

default para casos não mapeados
switch com String (C07EX04 — times de futebol por estado)
Cuidado: sem break, o código continua executando o próximo case (fall-through)


        ⚠️ Pontos de atenção para a prova

nextLine() após nextDouble()/nextLong() — o Scanner deixa um \n na fila; use um teclado.nextLine() extra antes de ler uma String.
Divisão inteira vs. double: 1/3 = 0 (inteiro), mas 1/3.0 = 0.333 (double).
String com == está errado — sempre use .equals() ou .equalsIgnoreCase().
        switch precisa de break — sem ele, o código "cai" para o próximo case.
        Math.pow(x, 0.5) é equivalente a Math.sqrt(x).*/