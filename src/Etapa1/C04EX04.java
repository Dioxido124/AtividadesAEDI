package Etapa1;
import javax.swing.JOptionPane;

public class C04EX04 {
    public static void main (String[] args){
        //Felipe Bertoldo Alvarenga
        String firstName = JOptionPane.showInputDialog(null, "Qual seu primeiro nome?", "Exercicio 4", JOptionPane.QUESTION_MESSAGE);
        String secondName = JOptionPane.showInputDialog(null, "Qual seu segundo nome?", "Exercicio 4", JOptionPane.QUESTION_MESSAGE);
        String lastName = JOptionPane.showInputDialog(null, "Qual seu sobrenome?", "Exercicio 4", JOptionPane.QUESTION_MESSAGE);
        String idade = JOptionPane.showInputDialog(null, "Qual sua idade?", "Exercicio 4", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null,lastName+", "+firstName+" "+secondName+"\nIdade: "+idade, "Exercicio 4",JOptionPane.INFORMATION_MESSAGE);
    }
}
