package addMaisHabilidades;

import java.util.Scanner;

public class CalculadoraWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora");

        double numero = 0;
        double armazenamento = 0;
        String operador = "";

        while (numero == numero) {
            System.out.println("Digite um número: ");
            numero = teclado.nextDouble();
            System.out.println(numero);
        }
        for (; numero == numero; ) {
            System.out.println("Informe o operador: ");
            operador = teclado.nextLine();
        }
        double resultado = 0;
        if (operador.equals("+")) {
            resultado = operador.equals("+") ? numero + numero : 0;
        } else if (operador.equals("-")) {
            resultado = operador.equals("-") ? numero + numero : resultado;
        }else if (operador.equals("*")) {
            resultado = operador.equals("*") ? numero + numero : resultado;
        }else if (operador.equals("/")) {
            resultado = operador.equals("/") ? numero + numero : resultado;
        }else if (operador.equals("%")) {
            resultado = operador.equals("%") ? numero + numero : resultado;
        }else if (operador.equals("=")){
            System.out.println();

        }

        teclado.close();
    }
}
