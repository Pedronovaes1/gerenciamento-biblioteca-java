package gerenciamentoBiblioteca;

import java.util.Scanner;

public class Recepcao {
    public static void main(String[] args) {
        // Classes chamadas.
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        // Lógica de programação: Gerenciamento de Biblioteca

        System.out.println("-----Bem-vindos ao Sistema da Biblioteca Nacional----");

        boolean sistema = true;
        while (sistema == true){
            try{
                System.out.println("O que deseja fazer: \n" +
                        " Aperte 1: Cadastrar um novo Livro \n" +
                        " Aperte 2: Cadastrar um novo usuário \n" +
                        " Aperte 3: Fazer um empréstimo de livros \n" +
                        " Aperte 4: Remover um livro \n" +
                        " Aperte 5: Remover um usuário \n" +
                        " Aperte 6: Devolver um livro \n" +
                        " Aperte 7: Analisar Sistema de Livros, usuários e empréstimos");
                int opcao = sc.nextInt();

                if (opcao == 1){
                    System.out.println("Me passe as seguintes informações: ");
                    System.out.println("ID do livro: ");
                    int id = sc.nextInt();

                    System.out.println("Titulo do livro: ");
                    String titulo = sc.next();

                    System.out.println("Autor: ");
                    String autor = sc.next();

                    System.out.println("Editora: ");
                    String editora = sc.next();

                    biblioteca.adicionarLivro(id, titulo, autor, editora);
                }
            }catch (Exception e){
                System.out.println("Opção errada!!");

            }

        }
    }
}
