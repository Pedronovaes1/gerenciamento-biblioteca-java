package gerenciamentoBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    //atributos
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
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

    public void mostarUsuarios(){
        if(!this.usuarios.isEmpty()){
            for(int i = 0; i< this.usuarios.size(); i++){
                System.out.println("Usuário: "+ this.usuarios.get(i).getNome() + "; E-mail: " + this.usuarios.get(i).getEmail());
            }
        }
    }

    public void removerUsuario(String nome){
        

    }
    // Métodos para registrar e gerenciar empréstimos

}
