package Etapa1;

import javax.swing.JOptionPane;

public class C06EX15 {
    public static void main(String[] args){
        //Felipe Bertoldo Alvarenga
        double extra, imp = 0, total =  0;
        int cod, quantDias;
        String resultadoStr;
        String [] opcoes = {"Belo Horizonte", "São Paulo", "Rio de janeiro", "Outra cidade"};

        String codStr = JOptionPane.showInputDialog(null, "Digite o codigo do pacote", "codigo", JOptionPane.QUESTION_MESSAGE);
        cod = Integer.valueOf(codStr);
        String quantDiasStr = JOptionPane.showInputDialog(null, "Digite quantidade de dias que usou o PPP: ", "Pay-per-view", JOptionPane.QUESTION_MESSAGE);
        quantDias = Integer.valueOf(quantDiasStr);
        String extraStr = JOptionPane.showInputDialog(null, "Digite o valor do serviços extras: ", "Serviços extras", JOptionPane.QUESTION_MESSAGE);
        extra = Double.valueOf(extraStr);
        String cidade = (String) JOptionPane.showInputDialog(null, "Escolha a cidade que vc mora", "Cidade", JOptionPane.QUESTION_MESSAGE, null, opcoes, "Belo Horizonte");

        switch (cod){
            case 1:
                if(quantDias*1.20<=65){
                    total = 65 + quantDias*1.20 + extra;
                }else {
                    total = 65 + 65 + extra;
                }
                break;
            case 2:
                total = 104 + quantDias*2.1 + extra;
                break;
            case 3:
                total = 137 + extra;
                break;
        }

        if(cidade.equals("Belo Horizonte")){
            imp = 0;
        }else
            if(cidade.equals("Sao paulo")){
                imp = total * 1/100;
            }else
                if (cidade.equals("Rio de janeiro")){
                    imp = total * 1.5/100;
                }else
                if (cidade.equals("Outra cidade")){
                    imp = total * 2/100;
                }
                double resultado = total + imp;
                resultadoStr = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, "Sua conta é igual "+resultadoStr, "Conta", JOptionPane.INFORMATION_MESSAGE);
    }
}