package ProjetosJava.mediasAlunos;

import javax.swing.*;
import java.util.Locale;

public class notasDosAlunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Cálculo de média anual do aluno");
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String bim1 = JOptionPane.showInputDialog("Informe sua nota de 1°bimestre: ");
        System.out.print("1°bimestre: " + bim1);
        bim1 = bim1.replace(',', '.');
        String bim2 = JOptionPane.showInputDialog("Informe sua nota de 2°bimestre: ");
        System.out.print("\n2°bimestre: " + bim2);
        bim2 = bim2.replace(',', '.');
        String bim3 = JOptionPane.showInputDialog("Informe sua nota de 3°bimestre: ");
        System.out.print("\n3°bimestre: " + bim3);
        bim3 = bim3.replace(',', '.');
        String bim4 = JOptionPane.showInputDialog("Informe sua nota de 4°bimestre: ");
        System.out.print("\n4°bimestre: " + bim4);
        bim4 = bim4.replace(',', '.');
        Double b1 = Double.parseDouble(bim1);
        Double b2 = Double.parseDouble(bim2);
        Double b3 = Double.parseDouble(bim3);
        Double b4 = Double.parseDouble(bim4);

        double media = (b1 + b2 + b3 + b4) / 4;
        String resultado = media >= 6 ? "Parabéns! você foi aprovade!" : "Sinto muito,você foi reprovade";

        System.out.printf("\n" +
                "%s,sua média anual é %.1f" +
                "\n%s", nome, media, resultado);


    }
}
