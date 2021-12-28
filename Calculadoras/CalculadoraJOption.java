package addMaisHabilidades.Calculadoras;

import java.util.Locale;

import javax.swing.JOptionPane;

public class CalculadoraJOption {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String num1 = JOptionPane.showInputDialog("Informe o 1° número: ");
        String operacao = JOptionPane.showInputDialog("Informe a operação (=,-,x,/,%): ");
        operacao = operacao.replace('x', '*');
        String num2 = JOptionPane.showInputDialog("Informe o 2° número: ");
        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);

        Double resultado = "+".equals(operacao) ? n1 + n2 : 0;
        resultado = "-".equals(operacao) ? n1 - n2 : resultado;
        resultado = "*".equals(operacao) ? n1 * n2 : resultado;
        resultado = "/".equals(operacao) ? n1 / n2 : resultado;
        resultado = "%".equals(operacao) ? n1 % n2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", n1, operacao, n2, resultado );
    }

}