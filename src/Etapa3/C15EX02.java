package Etapa3;

public class C15EX02 extends veiculo{
    private double autonomia;
    private double autonomiaMax;
    private double nivelBat;

    public C15EX02(){
        super();
    }

    public C15EX02(String fabri, double ano, String model, double cilindrada, String cat,double automia, double nivel){
        super(fabri, ano, model, 0, cat);
        this.autonomiaMax = automia;
        this.nivelBat = nivel;
        this.autonomia = this.autonomiaMax *(this.nivelBat/100);
    }

    //metodo 1
    public void recarregar(){
        if(this.nivelBat < 20){
            System.out.println("Conectando o "+getModel()+" na tomada");
            this.nivelBat = 100;
            System.out.println("Bateria carregada! Autonomia restaurada para "+autonomia);
        }
    }

    //metodo 2
    public void viagem(double distancia){
        if(distancia <= this.autonomia){
            System.out.println("A viagem pode ser realizada!!");
            this.autonomia -= distancia;
            System.out.println("Autonomia que restará: "+this.autonomia+"KM");
        }else{
            System.out.println("ALERTA! Bateria insuficiente. Você tem apenas: "+this.autonomia+" de autonomia");
            System.out.println("A viagem nao pode ser realizado! Por favor recarregue o carro.");
        }
    }

    //getters
    public Double getNivel(){
        return this.nivelBat;
    }

    public Double getAutonomia(){
        return this.autonomia;
    }
    
    //setters
    public void setNivel(double nivel){
        this.nivelBat = nivel;
    }

    public void setAuto(double autonomia){
        this.autonomia = autonomia;
    }
}
