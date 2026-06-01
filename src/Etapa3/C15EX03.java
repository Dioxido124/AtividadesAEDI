package Etapa3;

public class C15EX03 {
    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA DE TESTE DE VEÍCULOS ELÉTRICOS ===");

        C15EX02 carro1 = new C15EX02("BYD", 2024, "Dolphin", 0, "Hatch", 300.0, 100.0);
        C15EX02 carro2 = new C15EX02("Tesla", 2023, "Model 3", 0, "Sedan", 500.0, 40.0);
        C15EX02 carro3 = new C15EX02("Renault", 2022, "Kwid E-Tech", 0, "Compacto", 250.0, 15.0);

        carro1.fichaTecnica(); // Puxa todos os dados da classe mãe!
        System.out.println("Nível de Bateria: " + carro1.getNivel() + "%");
        System.out.println("Autonomia Atual: " + carro1.getAutonomia() + " km\n");
        
        carro1.viagem(150.0); 

        carro2.fichaTecnica(); 
        System.out.println("Nível de Bateria: " + carro2.getNivel() + "%");
        System.out.println("Autonomia Atual: " + carro2.getAutonomia() + " km\n");
        
        carro2.viagem(300.0);

        carro3.fichaTecnica(); 
        System.out.println("Nível de Bateria: " + carro3.getNivel() + "%");
        System.out.println("Autonomia Atual: " + carro3.getAutonomia() + " km\n");
        
        carro3.recarregar(); 
    }
}