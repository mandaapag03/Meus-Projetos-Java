package ProjetosJava.AulaDeOperadoresLogicos.RadarDeCarroCaminhao;

public class radar {
    
    public void verificarVelocidade(String veiculo,double velocidadePermitida,double velocidadeVeiculo) {

        double velVerificadaCaminhao = (velocidadePermitida + (velocidadePermitida * 0.05 ));
        double velVerificadaCarro = (velocidadePermitida + (velocidadePermitida * 0.10 ));
        
        if (veiculo.equalsIgnoreCase("caminhão") && (velocidadeVeiculo < velVerificadaCaminhao)) {
            System.out.println("Velocidade dentro do permitido");
            
        }else if (veiculo.equalsIgnoreCase("carro") && (velocidadeVeiculo < velVerificadaCarro)){
            System.out.println("Velocidade dentro do permitido");

        }else{
            System.out.println("Veículo multado!");
        }
    }

}