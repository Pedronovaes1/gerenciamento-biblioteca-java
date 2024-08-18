import gerenciamentoBiblioteca.Biblioteca;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("----- Biblioteca -----");

        //Testes de adicionar livros
        biblioteca.adicionarLivro("Harry Potter","J. K. Rowling","Bloomsbury");
        biblioteca.adicionarLivro("Biblia","Sem autor definido","king James");
        biblioteca.adicionarLivro("1994","OweL","Avante");
        biblioteca.mostrarLivros();
        biblioteca.removerLivro(2);
        biblioteca.mostrarLivros();
        biblioteca.adicionarLivro("Java", "Tim", "Ola mundo");
        biblioteca.mostrarLivros();
        biblioteca.buscarLivrosPorID(3);

        // Testes de cadastrar usuaário
        biblioteca.cadastrarUsuario("Pedro","skkssk@gmail.com", "1234");
        biblioteca.mostrarUsuarios();
        biblioteca.cadastrarUsuario("Lucas", "skkssk@gmail.com","24324");
        biblioteca.cadastrarUsuario("Sabrina","skkssk@gmail.com", "3349");
        biblioteca.mostrarUsuarios();
        biblioteca.mostrarUsuarios();
        biblioteca.buscarUsuariosPorNome("lucas");


        biblioteca.emprestrarLivros("Pedro", 1, 14);
        biblioteca.mostrarEmprestimos();
        biblioteca.emprestrarLivros("Sabrina", 3, 14);
        biblioteca.emprestrarLivros("Lucas", 3, 14);
        biblioteca.mostrarEmprestimos();

    }
}