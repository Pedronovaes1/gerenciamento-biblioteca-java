package gerenciamentoBiblioteca;

import gerenciamentoBiblioteca.model.Livro;
import gerenciamentoBiblioteca.model.Usuario;
import gerenciamentoBiblioteca.sistemadegerenciar.GerenciamentoDeEmprestimos;
import gerenciamentoBiblioteca.sistemadegerenciar.GerenciamentoDeLivros;
import gerenciamentoBiblioteca.sistemadegerenciar.GerenciamentoDeUsuarios;

import java.time.LocalDate;


public class Biblioteca {
    //atributos
    private GerenciamentoDeEmprestimos gerenciamentoDeEmprestimos;
    private GerenciamentoDeLivros gerenciamentoDeLivros;
    private GerenciamentoDeUsuarios gerenciamentoDeUsuarios;

    public Biblioteca() {
        this.gerenciamentoDeEmprestimos = new GerenciamentoDeEmprestimos();
        this.gerenciamentoDeLivros = new GerenciamentoDeLivros();
        this.gerenciamentoDeUsuarios = new GerenciamentoDeUsuarios();
    }

    //Métodos para adicionar, remover, buscar por livros e mostrar livros dentro da biblioteca.
    public void adicionarLivro(String titulo, String autor, String editora){
            gerenciamentoDeLivros.adicionarLivro(titulo, autor, editora);
            System.out.println("Cadastrado com sucesso!");
    }

    public void removerLivro(int id){
        gerenciamentoDeLivros.removerLivro(id);
    }
    //Mostrar todos os livros da biblioteca
    public void mostrarLivros() {
        gerenciamentoDeLivros.mostrarLivros();
    }

    public void buscarLivrosPorID(int id) throws Exception {
        gerenciamentoDeLivros.buscarLivrosPorID(id);
    }

    // Métodos para cadastrar usuários
    public void cadastrarUsuario(String nome, String email, String senha){
        gerenciamentoDeUsuarios.cadastrarUsuario(nome, email, senha);
    }

    public void mostrarUsuarios(){
        gerenciamentoDeUsuarios.mostrarUsuarios();
    }

    public void removerUsuario(String nome, String senha){
        gerenciamentoDeUsuarios.removerUsuario(nome,senha);
    }

    public void buscarUsuariosPorNome(String nome){
        gerenciamentoDeUsuarios.buscarUsuariosPorNome(nome);
    }
    // Métodos para registrar e gerenciar empréstimos
    /*
    public void emprestrarLivros(String nome, int id, int dias){
        Livro livro = gerenciamentoDeLivros.buscarLivrosPorIdEmprestimo(id);
        Usuario usuario = gerenciamentoDeUsuarios.buscarUsuarioPorNomeEmprestimo(nome);
        LocalDate diaEmprestimo = LocalDate.now();
        if(gerenciamentoDeEmprestimos.checarUsuario(usuario) == false){
            gerenciamentoDeEmprestimos.emprestarLivros(livro,usuario, diaEmprestimo, dias);
            LocalDate diaDevolucao = diaEmprestimo.plusDays(dias);
            System.out.println("Empréstimo concluido!! Data de entrega: " + diaDevolucao);
        }else{
            System.out.println("O Usuário está pedente");
        }
    }*/

    public void mostrarEmprestimos() {
        gerenciamentoDeEmprestimos.mostrarEmprestimos();
    }

    public void devolverLivro(String nome){
        Usuario usuario = gerenciamentoDeUsuarios.buscarUsuarioPorNomeEmprestimo(nome);
        gerenciamentoDeEmprestimos.devolverEmprestimo(usuario);
    }
}
