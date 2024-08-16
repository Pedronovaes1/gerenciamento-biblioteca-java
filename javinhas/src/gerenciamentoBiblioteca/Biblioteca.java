package gerenciamentoBiblioteca;

import gerenciamentoBiblioteca.sistemadegerenciar.GerenciamentoDeEmprestimos;
import gerenciamentoBiblioteca.sistemadegerenciar.GerenciamentoDeLivros;
import gerenciamentoBiblioteca.sistemadegerenciar.GerenciamentoDeUsuarios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    public void adicionarLivro(int id,String titulo, String autor, String editora){
            gerenciamentoDeLivros.adicionarLivro(id, titulo, autor, editora);
    }

    public void removerLivro(int id){
        gerenciamentoDeLivros.removerLivro(id);
    }
    //Mostrar todos os livros da biblioteca
    public void mostrarLivros() {
        gerenciamentoDeLivros.mostrarLivros();
    }

    public void buscarLivrosPorID(int id){
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

}
