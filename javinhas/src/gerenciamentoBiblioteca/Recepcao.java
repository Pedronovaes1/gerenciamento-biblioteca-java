package gerenciamentoBiblioteca;

import java.util.Scanner;

public class Recepcao {
    public static void main(String[] args) {
        // Classes chamadas.
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        // Lógica de programação: Gerenciamento de Biblioteca

        System.out.println("-----Bem-vindos ao Sistema da Biblioteca Nacional----");

        System.out.println("O que deseja fazer: \n" +
                " Aperte 1: Cadastrar um novo Livro \n" +
                " Aperte 2: Cadastrar um novo usuário \n" +
                " Aperte 3: Fazer um empréstimo de livros \n" +
                " Aperte 4: Remover um livro \n" +
                " Aperte 5: Remover um usuário \n" +
                " Aperte 6: Devolver um livro \n" +
                " Aperte 7: Analisar Sistema de Livros, usuários e empréstimos");
        int opcao = sc.nextInt();

        if(opcao == 1){
            System.out.println("Nome do livro: ");
            String nomeLivro = sc.next();

            System.out.println("Nome do autor: ");
            String autor = sc.next();

            System.out.println("Nome da editora: ");
            String editora = sc.next();

            biblioteca.adicionarLivro(nomeLivro, autor, editora);
        }



    }
}
