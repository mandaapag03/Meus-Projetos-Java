package addMaisHabilidades;

import java.util.Scanner;

public class notasDosAunosWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double notas = 0;
        int quantidadeDeNotas = 0;
        double somaDasNotas = 0;

        while (notas >= 0 && notas <= 10){
            System.out.print("Infome a nota (ou -1 para sair): ");
            notas = teclado.nextDouble();

            if(notas >= 0 && notas <= 10){
                somaDasNotas += notas;
                quantidadeDeNotas ++;
            } else if (notas < 0 && notas > 10) {
                System.out.println("Nota inválida!!");
            }else if (notas == -1) {
                //Calcular médias
                double media = somaDasNotas/ quantidadeDeNotas;
                System.out.printf("Média = %.1f\n", media);
                System.out.println("Fim!");
            }
        }
        teclado.close();
    }
}
