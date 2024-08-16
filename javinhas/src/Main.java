import gerenciamentoBiblioteca.Biblioteca;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("----- Biblioteca -----");

        //Testes de adicionar livros
        biblioteca.adicionarLivro(1010,"Harry Potter","J. K. Rowling","Bloomsbury ");
        biblioteca.adicionarLivro(1011,"Biblia","Sem autor definido","king James");
        biblioteca.adicionarLivro(1012,"1994","OWEL"," ");
        biblioteca.mostrarLivros();
        biblioteca.mostrarLivros();

        System.out.println();

        // Testes de cadastrar usuaário
        biblioteca.cadastrarUsuario("Pedro","skkssk@gmail.com", "1234");
        biblioteca.mostrarUsuarios();
        biblioteca.cadastrarUsuario("Lucas", "skkssk@gmail.com","24324");
        biblioteca.cadastrarUsuario("Sabrina","skkssk@gmail.com", "3349");
        biblioteca.mostrarUsuarios();
        biblioteca.removerUsuario("pedro", "1214");
        biblioteca.mostrarUsuarios();
        biblioteca.buscarUsuariosPorNome("lucas");

        biblioteca.emprestarLivros("pedro", 1011);
        biblioteca.emprestarLivros("lucas", 1012);
        biblioteca.emprestarLivros("sabrina", 1010);
        biblioteca.mostrarEmprestimos();

    }
}