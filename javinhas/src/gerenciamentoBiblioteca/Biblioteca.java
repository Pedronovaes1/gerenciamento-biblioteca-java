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

    public void mostrarLivros() {
        if(!livros.isEmpty()) {
            System.out.println(livros);
        }else{
            System.out.println("A lista está vazia!!");
        }
    }

}
