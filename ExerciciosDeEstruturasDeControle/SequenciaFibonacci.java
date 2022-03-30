package ProjetosJava.ExerciciosDeEstruturasDeControle;

import java.util.Scanner;

public class SequenciaFibonacci {
        /*Leia um número positivo do usuário, então,
calcule e imprima a sequencia Fibonacci até o
primeiro número superior ao número lido.
Exemplo: se o usuário informou o número 30,
a sequencia a ser impressa será 0 1 1 2 3 5 8
13 21 34 */
    public static void main(String[] args) { // Fn = F(n-1) + F(n-2)
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        int total = 0;

        for (int i = 0; i <= num; i++){
            int Fibonacci = (i - total) + (i - (total-1));
            int fibo = (Fibonacci - total) + (Fibonacci - (total-1));
            System.out.println(fibo);
            total = i;
        }
        entrada.close();
    }
}
