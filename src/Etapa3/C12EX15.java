package Etapa3;

public class C12EX15 {
    public static void main(String[] args){
        String temp;
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for(int j = 0; j < mes.length; j++){
            for(int i = 0; i < mes.length - 1; i++){
                if(mes[i].compareToIgnoreCase(mes[i+1]) > 0){
                    temp = mes[i];
                    mes[i] = mes[i+1];
                    mes[i+1] = temp;
                }
            }
        }
        System.out.print("Mese em ordem alfabetica: ");
        for(int i = 0; i < mes.length; i++){
            System.out.print(mes[i]+" ,");
        }
    }
    
}
