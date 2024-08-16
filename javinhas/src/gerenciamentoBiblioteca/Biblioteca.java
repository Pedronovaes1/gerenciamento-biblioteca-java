package gerenciamentoBiblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    //atributos
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    //Métodos para adicionar, remover, buscar por livros e mostrar livros dentro da biblioteca.
    public void adicionarLivro(int id,String titulo, String autor, String editora){
            Livro livro = new Livro(id,titulo, autor, editora);
            this.livros.add(livro);
    }

    public void removerLivro(int id){
        List<Livro> livrosParaRemover = new ArrayList<>();
        if(!this.livros.isEmpty()){
            for(Livro livro: this.livros){
                if(livro.getId() == id){
                    livrosParaRemover.add(livro);
                }
            }
            this.livros.removeAll(livrosParaRemover);
        }else{
            System.out.println("A lista está vazia");
        }
    }
    //Mostrar todos os livros da biblioteca
    public void mostrarLivros() {
        if(!livros.isEmpty()) {
            for(int i = 0; i < this.livros.size(); i++){
                System.out.println("Livro: "+ this.livros.get(i).getTitulo() +
                        "; Autor: " + this.livros.get(i).getAutor()+ "; ID: " +
                        this.livros.get(i).getId() + "; Editora: " +
                        this.livros.get(i).getEditora());
            }
        }else{
            System.out.println("A lista está vazia!!");
        }
    }

    public void buscarLivrosPorID(int id){
        if(!this.livros.isEmpty()){
            for(Livro livro : this.livros){
                if(livro.getId() == id){
                    System.out.println("Livro: " + livro.getTitulo() +
                            "; Autor: " + livro.getAutor()+
                            "; ID: " + livro.getId() +
                            "; Editora: " + livro.getEditora());
                    break;
                }else{
                    System.out.println("Livro não encontrado!!");
                    break;
                }
            }
        }
    }

    // Métodos para cadastrar usuários
    public void cadastrarUsuario(String nome, String email, String senha){
        Usuario usuariosCadastrado = new Usuario(nome,email,senha);
        this.usuarios.add(usuariosCadastrado);
    }

    public void mostrarUsuarios(){
        if(!this.usuarios.isEmpty()){
            for(int i = 0; i< this.usuarios.size(); i++){
                System.out.println("Usuário: "+ this.usuarios.get(i).getNome() + "; E-mail: " + this.usuarios.get(i).getEmail());
            }
        }
    }

    public void removerUsuario(String nome, String senha){
        List<Usuario> usuariosParaRemover = new ArrayList<>();
        if(!this.usuarios.isEmpty()){
            for(Usuario usuario : this.usuarios){
                if(usuario.getNome().equalsIgnoreCase(nome) && usuario.getSenha().equalsIgnoreCase(senha)){
                    usuariosParaRemover.add(usuario);
                }else{
                    System.out.println("O usuário não consta no sistema para ser removido");
                    break;
                }
                usuarios.removeAll(usuariosParaRemover);
            }
        }else{
            System.out.println("Não tem usuário cadastrado no sistema");
        }
    }

    public void buscarUsuariosPorNome(String nome){
        if(!this.usuarios.isEmpty()){
            for(Usuario usuario : this.usuarios){
                if(usuario.getNome().equalsIgnoreCase(nome)){
                    System.out.println("Usuario: "+ usuario.getNome() + "; E-mail: " + usuario.getEmail());
                }
            }
        }else{
            System.out.println("Está vazio o sistema de usuários");
        }
    }
    // Métodos para registrar e gerenciar empréstimos

    public void emprestarLivros(String nome, int id){
        List<Livro> livrosParaEmpresar = new ArrayList<>();
        List<Usuario> usuariosEmprestados = new ArrayList<>();

        for(Livro livro : this.livros){
            if(livro.getId() == id){
                livrosParaEmpresar.add(livro);
            }
        }
        for(Usuario usuario : this.usuarios){
            if(usuario.getNome().equalsIgnoreCase(nome)){
                usuariosEmprestados.add(usuario);
            }
        }
        LocalDate dataEmprestimo = LocalDate.now();
        Emprestimo emprestimo = new Emprestimo(livrosParaEmpresar, usuariosEmprestados, dataEmprestimo,14);
        this.emprestimos.add(emprestimo);
    }

    public void mostrarEmprestimos(){
        for (int i = 0; i < this.emprestimos.size(); i++){
            System.out.println("Usuário: " + usuarios.get(i).getNome() +
                    "; E-mail: " + usuarios.get(i).getEmail() +
                    "; Livro Empresado: " + livros.get(i).getTitulo()+
                    "; Devolver: " + emprestimos.get(i).getDataDevolucaoPrevista() +
                    "; ID: " + livros.get(i).getId());
        }
    }

}
