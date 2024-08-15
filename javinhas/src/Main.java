import gerenciamentoBiblioteca.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(1010,"Harry Potter","J. K. Rowling","Bloomsbury ");
        biblioteca.adicionarLivro(1011,"Biblia","Sem autor definido","king James");
        biblioteca.mostrarLivros();
        biblioteca.removerLivro(1010);
        biblioteca.mostrarLivros();
        biblioteca.buscarLivrosPorID(1010);

        System.out.println();

        biblioteca.cadastrarUsuario("Pedro","skkssk@gmail.com", "1234");
        biblioteca.mostarUsuarios();
        biblioteca.cadastrarUsuario("Lucas", "skkssk@gmail.com","24324");
        biblioteca.mostarUsuarios();
    }
}