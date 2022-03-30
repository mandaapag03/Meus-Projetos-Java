package ProjetosJava.ExerciciosDeEstruturasDeControle;

import java.util.Scanner;

public class anoBissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int ano;
		System.out.println("**Bem vindo à calculadora de anos bissextos**");
		System.out.println("Informe um ano no passado ou futuro para saber se ele é bissexto: ");
		ano = entrada.nextInt();
		
		if (ano % 400 == 0 || ano % 4 == 0 && !(ano % 100 == 0)) {
			System.out.println("Ano bissexto!!");
		}else {
			System.out.println("Ano n�o bissexto");
		}
		entrada.close();
	}
	
}