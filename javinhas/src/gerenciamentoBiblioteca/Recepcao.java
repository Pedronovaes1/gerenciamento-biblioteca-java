package gerenciamentoBiblioteca;

import java.util.Scanner;

public class Recepcao {
    private Biblioteca gerenciamentoDeBiblioteca;

    public Recepcao() {
        this.gerenciamentoDeBiblioteca = new Biblioteca();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            mostrarMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            switch (opcao) {
                case 1:
                    adicionarLivro(scanner);
                    break;
                case 2:
                    removerLivro(scanner);
                    break;
                case 3:
                    mostrarLivros();
                    break;
                case 4:
                    cadastrarUsuario(scanner);
                    break;
                case 5:
                    removerUsuario(scanner);
                    break;
                case 6:
                    mostrarUsuarios();
                    break;
                case 7:
                    registrarEmprestimo(scanner);
                    break;
                case 8:
                    devolverLivro(scanner);
                    break;
                case 9:
                    mostrarEmprestimos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menu de Gerenciamento da Biblioteca ---");
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Remover Livro");
        System.out.println("3. Mostrar Livros");
        System.out.println("4. Cadastrar Usuário");
        System.out.println("5. Remover Usuário");
        System.out.println("6. Mostrar Usuários");
        System.out.println("7. Registrar Empréstimo");
        System.out.println("8. Devolver Livro");
        System.out.println("9. Mostrar Empréstimos");
        System.out.println("0. Sair");
    }

    private void adicionarLivro(Scanner scanner) {
        scanner.nextLine();  // Consome a nova linha
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        gerenciamentoDeBiblioteca.adicionarLivro(titulo, autor, editora);
    }

    private void removerLivro(Scanner scanner) {
        System.out.print("ID do Livro a remover: ");
        int id = scanner.nextInt();
        gerenciamentoDeBiblioteca.removerLivro(id);
    }

    private void mostrarLivros() {
        gerenciamentoDeBiblioteca.mostrarLivros();
    }

    private void cadastrarUsuario(Scanner scanner) {
        System.out.print("Nome do Usuário: ");
        String nome = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        gerenciamentoDeBiblioteca.cadastrarUsuario(nome, email, senha);
    }

    private void removerUsuario(Scanner scanner) {
        System.out.print("Nome do Usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        gerenciamentoDeBiblioteca.removerUsuario(nome, senha);
    }

    private void mostrarUsuarios() {
        gerenciamentoDeBiblioteca.mostrarUsuarios();
    }

    private void registrarEmprestimo(Scanner scanner) {
        System.out.print("Nome do Usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("ID do Livro: ");
        int idLivro = scanner.nextInt();
        System.out.print("Dias de Empréstimo: ");
        int dias = scanner.nextInt();
        gerenciamentoDeBiblioteca.emprestrarLivros(nomeUsuario,idLivro, dias);
    }

    private void devolverLivro(Scanner scanner) {
        System.out.print("Nome do Usuário que deseja devolver o livro: ");
        String nomeUsuario = scanner.nextLine();
        gerenciamentoDeBiblioteca.devolverEmprestimo(nomeUsuario);
    }

    private void mostrarEmprestimos() {
        gerenciamentoDeBiblioteca.mostrarEmprestimos();
    }
}
