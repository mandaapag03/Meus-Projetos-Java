package ProjetosJava.exercíciosClasses;

import java.util.Scanner;

public class LivroTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Livros l1 = new Livros("Garoto Devora Universo", "Trent Dalton", "Harper Collings", 414);
        Livros l2 = new Livros("O Que Aconteceu Com Annie", "C.J.Tudor", "Intrínseca", 284);
        Livros l3 = new Livros("Angústia", "Graciliano Ramos", "Record", 366);
        Livros l4 = new Livros("Breves Respostas Para Grandes Questões", "Stephen Hawking", "Intrínseca", 254);
        Livros l5 = new Livros("Um Livro Para Ser Entendido", "Pedro HMC", "Outro", 239);

        System.out.println("Lendo: " + l1.nome);
        System.out.println("Gostaria de ler esse livro?(Yes or No)");
        String usuario = entrada.nextLine();
        if (usuario.equalsIgnoreCase("Yes")) {
            l1.folharPagina();
            System.out.println("Fim");
        } else {
            System.out.println("Lendo: " + l2.nome);
            System.out.println("Gostaria de ler esse livro?(Yes or No)");
            usuario = entrada.nextLine();
            if (usuario.equalsIgnoreCase("Yes")) {
                l2.folharPagina();
                System.out.println("Fim");
            } else {
                System.out.println("Lendo: " + l3.nome);
                System.out.println("Gostaria de ler esse livro?(Yes or No)");
                usuario = entrada.nextLine();
                if (usuario.equalsIgnoreCase("Yes")) {
                    l3.folharPagina();
                    System.out.println("Fim");
                } else {
                    System.out.println("Lendo: " + l4.nome);
                    System.out.println("Gostaria de ler esse livro?(Yes or No)");
                    usuario = entrada.nextLine();
                    if (usuario.equalsIgnoreCase("Yes")) {
                        l4.folharPagina();
                        System.out.println("Fim");
                    } else {
                        System.out.println("Lendo: " + l5.nome);
                        System.out.println("Gostaria de ler esse livro?(Yes or No)");
                        usuario = entrada.nextLine();
                        if (usuario.equalsIgnoreCase("Yes")) {
                            l5.folharPagina();
                            System.out.println("Fim");
                        } else {
                            System.out.println("OK,Tchau");
                        }
                    }
                }

            }

        }

        entrada.close();
    }
}