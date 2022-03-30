package ProjetosJava.Calculadoras;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("CALCULADORA");
        System.out.println("Informe o 1° número: ");
        double n1 = teclado.nextDouble();
        System.out.println("Informe o operador: ");
        String op = teclado.next();
        op = op.replace('x', '*');
        System.out.println("Informe o 2° número: ");
        double n2 = teclado.nextDouble();

        double resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2 : resultado;
        resultado = "*".equals(op) ? n1 * n2 : resultado;
        resultado = "/".equals(op) ? n1 / n2 : resultado;
        resultado = "%".equals(op) ? n1 % n2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);
        teclado.close();
    }
}
