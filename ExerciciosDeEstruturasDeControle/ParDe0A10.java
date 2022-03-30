package ProjetosJava.ExerciciosDeEstruturasDeControle;

import java.util.Scanner;

public class ParDe0A10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um n�mero qualquer: ");
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <=10){
			System.out.printf("O n�mero %d est� entre 0 e 10 ", numero);
		}else {
			System.out.printf("O n�mero %d n�o est� entre 0 e 10 ", numero);
		}
		
		if (numero % 2 == 0) {
			System.out.println("e � par!");
		}else {
			System.out.println("e � �mpar!");
		}
		entrada.close();
	}

}
