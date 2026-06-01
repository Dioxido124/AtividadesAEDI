package Etapa3;

public class veiculo {
    private String fabricante;
    private double anoDeFabri;
    private String modelo;
    private double cilindrada;
    private String categoria;

    //Construtor sem parametros
    public veiculo(){}

    //construtor
    public veiculo(String fabri, double ano, String model, double cilindrada, String cat){
        this.fabricante = fabri;
        this.anoDeFabri = ano;
        this.modelo = model;
        this.cilindrada = cilindrada;
        this.categoria = cat;
    }

    //METODO 1
    public void ligar(){
        System.out.print("Ligando o "+this.modelo+" ... ");
        System.out.print("Veiculo ligado e pronto para rodar! VRUUUUMMMMM");
    }

    //METODO 2
    public void fichaTecnica(){
        System.out.println("---------------------------FICHA TECNICA---------------------------------");
        System.out.println("Modelo: "+this.modelo+ "Categoria: "+this.categoria);
        System.out.println("Fabricante: "+this.fabricante);
        System.out.printf("Ano de fabricação: %.0f\n", this.anoDeFabri);
        System.out.println("Cilindrada: "+this.cilindrada+" cc");
        System.out.println("----------------------------------------------------------------------------");
    }

    //getters
    public String getFabri(){
        return this.fabricante;
    }

    public double getAno(){
        return this.anoDeFabri;
    }

    public String getModel(){
        return this.modelo;
    }

    public double getCilin(){
        return this.cilindrada;
    }

    public String getNome(){
        return this.categoria;
    }

    //setters
    public void setFabri(String fabri){
        this.fabricante = fabri;
    }

    public void setAno(double ano){
        this.anoDeFabri = ano;
    }

    public void setModel(String model){
        this.modelo = model;
    }

    public void setCilin(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public void setNome(String cat){
        this.categoria = cat;
    }
    
}
