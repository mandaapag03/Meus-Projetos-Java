package addMaisHabilidades.classes;

public class Livros {
    String nome;
    String autor;
    String editora;
    int numDePaginas;

    Livros (String nome,String autor,String editora,int numDePaginas){
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.numDePaginas = numDePaginas;
    }

    void folharPagina (){
        for (int i = 1; i <= numDePaginas; i++){
            System.out.println("Pg. " + i);
        }
    }
}