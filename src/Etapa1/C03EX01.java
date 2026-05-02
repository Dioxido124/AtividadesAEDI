package Etapa1;

import java.util.Scanner;

public class C03EX01 {
    //Felipe Bertoldo Alvarenga
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        long numero = scanner.nextLong();
        long fatorial = 1l;
        for(long contador = 2; contador <= numero; contador++){
            fatorial = fatorial * contador;
        }
        System.out.println(fatorial);
        scanner.close();
    }
}
/*☕ Java — Resumo Completo

📦 CAPÍTULO 3 — Fundamentos
Tipos de dados primitivos:
javaint x = 10;          // inteiro (32 bits, até ~2 bilhões)
long y = 10L;        // inteiro grande (64 bits)
double d = 3.14;     // decimal (64 bits)
float f = 3.14f;     // decimal menor precisão (32 bits)
boolean b = true;    // verdadeiro/falso
char c = 'A';        // caractere único
String s = "texto";  // cadeia de caracteres (não é primitivo!)
Leitura com Scanner:
javaScanner teclado = new Scanner(System.in);
int n      = teclado.nextInt();
long l     = teclado.nextLong();
double d   = teclado.nextDouble();
String s   = teclado.nextLine();   // lê linha inteira
String p   = teclado.next();       // lê uma palavra
teclado.close();
⚠️ Armadilha clássica do Scanner:
Depois de nextInt(), nextLong() ou nextDouble(), o \n (Enter) fica na fila. Se o próximo dado for uma String com nextLine(), ela vai capturar esse Enter em branco. Solução: chamar teclado.nextLine() extra antes.
javaint idade = teclado.nextInt();
teclado.nextLine();         // ← limpa o \n
String nome = teclado.nextLine(); // agora funciona
Saída:
javaSystem.out.println("texto");         // imprime e pula linha
System.out.print("texto");           // imprime sem pular
System.out.printf("%.2f", valor);    // formatado
Fatorial (loop for):
javalong fatorial = 1;
for (long i = 2; i <= numero; i++) {
    fatorial = fatorial * i;
}

📝 CAPÍTULO 4 — Strings, Formatação e JOptionPane
printf — formatação de saída:
MáscaraTipoExemplo%dinteiroprintf("%d", 42) → 42%fdoubleprintf("%f", 3.14) → 3.140000%.2fdouble 2 casasprintf("%.2f", 3.14) → 3.14%sStringprintf("%s", "João") → João%n ou \nnova linhaquebra linha
Concatenação de String:
javaSystem.out.println("Nome: " + nome + ", Idade: " + idade);
JOptionPane — interface gráfica:
java// Entrada de dados
String valor = JOptionPane.showInputDialog(null, "Mensagem", "Título", JOptionPane.QUESTION_MESSAGE);

// Exibir resultado
JOptionPane.showMessageDialog(null, "Resultado: " + valor, "Título", JOptionPane.INFORMATION_MESSAGE);

// Converter String para número
int n = Integer.valueOf(valor);
double d = Double.valueOf(valor);
Leitura de arquivo:
javaScanner arquivo = new Scanner(C04EX05.class.getResourceAsStream("dados.txt"));
String linha = arquivo.nextLine();
arquivo.close();

🔢 CAPÍTULO 5 — Expressões Matemáticas
Biblioteca Math — métodos principais:
MétodoO que fazExemploMath.pow(x, n)x elevado a nMath.pow(2,3) → 8.0Math.sqrt(x)raiz quadradaMath.sqrt(9) → 3.0Math.abs(x)valor absolutoMath.abs(-5) → 5Math.ceil(x)arredonda pra cimaMath.ceil(2.1) → 3.0Math.floor(x)arredonda pra baixoMath.floor(2.9) → 2.0Math.round(x)arredonda normalMath.round(2.5) → 3Math.min(a,b)menor valorMath.min(3,7) → 3Math.max(a,b)maior valorMath.max(3,7) → 7
Divisão inteira vs. ponto flutuante — MUITO COBRADO:
javaint a = 1, b = 3;
System.out.println(a / b);       // → 0  (divisão inteira!)
System.out.println(a / 3.0);     // → 0.333 (força double)
System.out.println((double)a/b); // → 0.333 (cast)
Extração de dígitos com % e /:
javalong numero = 12345;
long d1 = numero / 10000;       // 1
long d2 = numero / 1000 % 10;   // 2
long d3 = numero / 100  % 10;   // 3
long d4 = numero / 10   % 10;   // 4
long d5 = numero % 10;          // 5
Conversão de segundos:
javalong h   = segundos / 3600;
long min = segundos / 60 % 60;
long seg = segundos % 60;
Conversão de temperatura:
javadouble k = c + 273;             // Celsius → Kelvin
double f = (c * 9.0/5) + 32;   // Celsius → Fahrenheit

🔀 CAPÍTULO 6 — Estruturas Condicionais if/else
Esta é a parte mais importante! Tem vários padrões que se repetem.
Estrutura básica:
javaif (condição) {
    // executa se verdadeiro
} else if (outra condição) {
    // executa se a segunda for verdadeira
} else {
    // executa se nenhuma das anteriores for
}
Operadores relacionais:
OperadorSignificado==igual a!=diferente de>maior que<menor que>=maior ou igual<=menor ou igual
Operadores lógicos:
OperadorSignificadoVerdadeiro quando...&&E (AND)ambas as condições são verdadeiras||OU (OR)pelo menos uma é verdadeira!NÃO (NOT)inverte o valor
Comparando Strings — NUNCA use ==:
java// ❌ ERRADO — compara referência de memória, não o conteúdo
if (sexo == "F") { ... }

// ✅ CORRETO — compara o conteúdo
if (sexo.equals("F")) { ... }

// ✅ CORRETO — ignora maiúsculas/minúsculas
if (sexo.equalsIgnoreCase("f")) { ... }

Padrões que apareceram nos seus exercícios:
Faixas de valor (IMC, salário, multa):
java// C06EX04 — IMC
if (imc < 18) {
    System.out.println("Desnutrida");
} else if (imc < 20) {
    System.out.println("Abaixo do peso");
} else if (imc <= 25) {
    System.out.println("Peso ideal");
} else if (imc < 27) {
    System.out.println("Acima do peso");
} else {
    System.out.println("Obesa");
}
Duas condições simultâneas (divisibilidade):
java// C06EX05
if (num % 5 == 0 && num % 7 == 0) {
    System.out.println("Divisível por 5 e 7");
}
Bhaskara com if para delta:
java// C06EX06
double delta = Math.pow(b, 2) - 4 * a * c;

if (delta > 0) {
    x1 = (-b + Math.sqrt(delta)) / (2 * a);
    x2 = (-b - Math.sqrt(delta)) / (2 * a);
    System.out.println("2 raízes: " + x1 + " e " + x2);
} else if (delta == 0) {
    x1 = -b / (2 * a);
    System.out.println("1 raiz: " + x1);
} else {
    System.out.println("Sem raízes reais");
}
Placar de vôlei com ||:
java// C06EX11
if (setEq1 == 3 && setEq2 == 0 || setEq1 == 3 && setEq2 == 1) {
    pontos1 = 3; pontos2 = 0;
} else if (setEq2 == 3 && setEq1 == 0 || setEq2 == 3 && setEq1 == 1) {
    pontos1 = 0; pontos2 = 3;
} else if (setEq1 == 3 && setEq2 == 2) {
    pontos1 = 2; pontos2 = 1;
} else if (setEq2 == 3 && setEq1 == 2) {
    pontos1 = 1; pontos2 = 2;
}
Nota final com peso por faltas e idade (C06EX16):
java// Peso baseado em faltas
int peso1;
if (faltas <= 5) peso1 = 3;
else if (faltas <= 10) peso1 = 2;
else peso1 = 1;

// Peso baseado em idade
int peso2;
if (idade <= 17) peso2 = 1;
else if (idade <= 50) peso2 = 2;
else peso2 = 3;

// Descarta a menor nota e tira média das outras duas
double menorNota = Math.min(p1, Math.min(p2, p3));
double mediaMaioresProvas = (p1 + p2 + p3 - menorNota) / 2.0;

double notaFinal = (mediaMaioresProvas * peso1) + (notaTrabalho * peso2);
Processo seletivo com booleanos (C06EX17):
javaboolean apto = true;

if (!tecnico && !superior) apto = false;       // precisa de ao menos um curso
if (tecnico && !superior && menos3Anos) apto = false; // técnico sem superior precisa de 3+ anos
if (liderar && aceitaSalario) apto = false;    // quem quer liderar não aceita salário baixo
if (!autodidata) apto = false;                  // obrigatório ser autodidata
Math.ceil() para arredondar quantidades (C06EX12):
javadouble quantCaixas = (quantProdBol - bolDef) / 10;
double totalCaixas = Math.ceil(quantCaixas) * custoCaixa; // sempre arredonda pra cima

🔄 CAPÍTULO 7 — Estrutura switch/case
O switch é uma alternativa ao if/else quando você compara uma variável com valores exatos.
Estrutura básica:
javaswitch (variavel) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    default:
        // executado se nenhum case bater
        break;
}
⚠️ Sem break ocorre fall-through — o código continua no próximo case:
javaint x = 1;
switch (x) {
    case 1:
        System.out.println("um");   // imprime
        // sem break!
    case 2:
        System.out.println("dois"); // também imprime!
    case 3:
        System.out.println("três"); // também imprime!
        break;
}
// saída: um, dois, três
Múltiplos cases para o mesmo bloco (seus exercícios usaram muito isso):
java// C07EX01 — loteria
switch (acertos) {
    case 0: case 1: case 2: case 3: case 4: case 5:
        premio = "Nenhum";
        break;
    case 6: case 7: case 8: case 9: case 10:
        premio = "Outro cartão";
        break;
    case 11:
        premio = "R$ 100,00";
        break;
    case 12:
        premio = "R$ 1.000,00";
        break;
    case 13:
        premio = "R$ 50.000,00";
        break;
    default:
        premio = "Inválido";
}
switch com char:
java// C07EX02 — conceito por nota
switch (notaFinal) {
    case 10: case 9: conceito = 'A'; break;
    case 8:          conceito = 'B'; break;
    case 7:          conceito = 'C'; break;
    case 6: case 5:  conceito = 'D'; break;
    default:         conceito = 'E'; break;
}
switch com default para lógica extra (C07EX03 — multa por dias):
javaswitch (dias) {
    case 0: case 1: case 2: case 3: case 4: case 5:
        multa = 0; break;
    case 6: case 7: case 8:
        multa = valorImposto * 0.02; break;
    case 9: case 10:
        multa = (valorImposto * 0.10) + (valorImposto * 0.005 * dias); break;
    default:
        if (dias > 10) {
            multa = (valorImposto * 1.50) + (1.00 * dias); // default pode ter if dentro!
        }
        break;
}
switch com String (sintaxe moderna — C07EX04):
javaswitch (equipe.toLowerCase()) {
    case "atlético", "cruzeiro", "america", "villa nova":
        System.out.println("Minas Gerais"); break;
    case "flamengo", "vasco", "botafogo", "fluminense":
        System.out.println("Rio de Janeiro"); break;
    default:
        System.out.println("Não encontrado"); break;
}

A sintaxe case "a", "b": (com vírgula) é do Java 14+. Em versões antigas, você precisaria de um case separado pra cada valor.


🆚 if/else vs switch — quando usar cada um
SituaçãoUseComparar faixas (>, <, >=)if/elseCondições complexas com && e ||if/elseComparar uma variável com valores exatosswitchMuitos casos para o mesmo resultadoswitch

🎯 Checklist para a prova

 Sabe declarar e usar variáveis dos tipos certos (int, long, double, String)
 Sabe usar Scanner e lembrar do nextLine() extra após números
 Sabe formatar com printf (%d, %.2f, %s)
 Sabe usar Math.pow(), Math.sqrt(), Math.ceil(), Math.min()
 Sabe extrair dígitos com / e %
 Sabe montar if/else encadeado com faixas de valor
 Lembra de usar .equals() e não == pra String
 Sabe montar switch com múltiplos cases no mesmo bloco
 Lembra do break no switch
 Sabe misturar switch com if dentro do default

Boa sorte na prova! Se quiser treinar algum exercício ou tirar dúvida em algum ponto específico, é só falar. 💪*/