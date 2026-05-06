package Etapa2;

import javax.swing.JOptionPane;

public class C08EX11 {
    public static void main(String[]args){
        String nome, salarioStr, nomeMen = "", nomeMai = "";
        String[] sexo = {"M", "F"};
        String[] civil = {"C", "S", "O"};
        String[] olho = {"A", "C", "P", "O"};
        String[] cabelo = {"L", "P", "C", "R"};
        double salario, salmaior = 0, salmenor = 0, cont1 = 0;
        String[] escola = {"1", "2", "3", "4"};

        int indSexo, indCivil, indOlho, indCabelo,escolaridade, idade;

        for(int i = 1; i < 2; i++) {
            nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Nome", JOptionPane.QUESTION_MESSAGE);
            String idadeStr = JOptionPane.showInputDialog(null, "Digite sua idade", "Idade", JOptionPane.QUESTION_MESSAGE);
            idade = Integer.valueOf(idadeStr);
            indSexo = JOptionPane.showOptionDialog(null, "Qual o seu Sexo?", "CEQSO", 0, JOptionPane.QUESTION_MESSAGE, null, sexo, "");
            indCivil = JOptionPane.showOptionDialog(null, "Qual o seu estado civil?", "Estado Civil", 0, JOptionPane.QUESTION_MESSAGE, null, civil, "");
            indOlho = JOptionPane.showOptionDialog(null, "Qual a cor do seu olho?", "OLHO", 0, JOptionPane.QUESTION_MESSAGE, null, olho, "");
            indCabelo = JOptionPane.showOptionDialog(null, "Qual a cor do seu cabelo?", "Cabelo", 0, JOptionPane.QUESTION_MESSAGE, null, cabelo, "");
            salarioStr = JOptionPane.showInputDialog(null, "Digite seu salario", "Salario", JOptionPane.QUESTION_MESSAGE);
            salario = Double.valueOf(salarioStr);
            escolaridade = JOptionPane.showOptionDialog(null, "Qual seu nivel de escolaridade?", "escolaridade", 0, JOptionPane.QUESTION_MESSAGE, null, escola, "");



            if(sexo[indSexo].equals("F") && olho[indOlho].equals("A") && cabelo[indCabelo].equals("L") && idade>=18 && idade <= 25 && civil[indCivil].equals("S") && salario > 10000 && escola[escolaridade].equals("4")){
                cont1++;
            }

            if (i == 1 || salario>salmaior){
                salmaior = salario;
                nomeMai = nome;
            }
            if (i == 1 || salario<salmenor){
                salmenor = salario;
                nomeMen = nome;
            }
        }
        double diferenca = salmaior - salmenor;
        JOptionPane.showMessageDialog(null, "A pessoa com o maior salario é "+ nomeMai + "\nA pessoa com o salario menor é "+ nomeMen + "\nA diferença entre os salario é "+ diferenca,  "Salario maior", JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showMessageDialog(null, "Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo é "+ cont1, "QuantMulheres", JOptionPane.INFORMATION_MESSAGE);
    }
}