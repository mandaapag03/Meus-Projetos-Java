package addMaisHabilidades.Calculadoras;

import java.util.Locale;
import java.util.Scanner;

public class calculadoraDiferente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double num = 0;
        String op = "";
        double total = 0;
        System.out.println("Calcualdora: ");

        if (op.equals("+")){
            total += num;
        }

        entrada.close();
    }
}
