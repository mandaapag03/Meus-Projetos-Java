package ProjetosJava.ExerciciosDeEstruturasDeControle;

import java.util.Scanner;

public class notas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double nota1;
		double nota2;
		
		System.out.println("Infome a 1� nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Informa a 2� nota: ");
		nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		System.out.println("M�dia: " + media);
		entrada.close();
		
		if (media >= 7) {
			System.out.println("Parab�ns!Aprovado!");
		}else if (media <7 && media >= 4) {
			System.out.println("Recupara��o");
		}else 
			System.out.println("Reprovado");
	}
}
