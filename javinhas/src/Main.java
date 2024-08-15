import gerenciamentoBiblioteca.Biblioteca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(1010,"Harry Potter","J. K. Rowling","Bloomsbury ");
        biblioteca.adicionarLivro(1011,"Biblia","Sem autor definido","king James");
        biblioteca.mostrarLivros();
        biblioteca.removerLivro(1010);
        biblioteca.mostrarLivros();

        biblioteca.buscarLivrosPorID(1010);
    }
}