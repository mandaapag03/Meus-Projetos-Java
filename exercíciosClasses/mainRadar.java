package addMaisHabilidades.OperadoresLogicos.RadarDeCarroCaminhao;

public class mainRadar {
    public static void main (String[]args) {
        
        radar radar = new radar();

        radar.verificarVelocidade("CARRO", 200, 80);
        radar.verificarVelocidade("CARRO", 70, 80);
        radar.verificarVelocidade("Caminhão",60 , 80);
        radar.verificarVelocidade("Caminhão", 84.9, 80);
        System.out.println("\n" + "Status do Veículo: ");
        radar.verificarVelocidade("CArro", 80, 200);
    }
    
}