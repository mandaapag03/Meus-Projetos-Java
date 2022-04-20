package jogoLabirinto;

import java.util.Scanner;

public class anosEmDias {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade exata(X anos, X meses e X dias):");
        System.out.println("Quandos anos você tem?: ");
        int anos = entrada.nextInt();
        System.out.println("Meses: ");
        int meses = entrada.nextInt();
        System.out.println("Dias: ");
        int dias = entrada.nextInt();

        int anosEmMeses = anos * 12;
        int juntaMeses = anosEmMeses += meses;
        int mesesEmDias = juntaMeses * 30;
        int totalEmDias = mesesEmDias += dias;
        
        System.out.printf("Você tem %d dias de vida!", totalEmDias);

        entrada.close();
        
    }
}