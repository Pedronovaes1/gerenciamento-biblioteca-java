package gerenciamentoBiblioteca.sistemadegerenciar;

import gerenciamentoBiblioteca.model.Livro;

import java.util.HashMap;
import java.util.Map;

public class GerenciamentoDeLivros {
    private Map<Integer, Livro> livros;

    public GerenciamentoDeLivros() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String titulo, String autor, String editora) {
        Livro livro = new Livro(titulo, autor, editora);
        this.livros.put(livro.getId(),livro);
    }

    public void removerLivro(int id) {
        livros.remove(id);
    }

    public void mostrarLivros() {
        if(!livros.isEmpty()) {
            System.out.println(livros);
        }else{
            System.out.println("A lista está vazia!!");
        }
    }

    public void buscarLivrosPorID(int id) throws Exception {
        if(this.livros.containsKey(id) == true){
            System.out.println( "Livro: " + livros.get(id).getTitulo() +
                    "; Autor: " + livros.get(id).getAutor());
        }else{
            throw new Exception("O livro não foi encontrado");
        }
    }

    /* public Livro buscarLivrosPorIdEmprestimo(int id){
       Livro livroParaEmprestimo = null;
        if(!this.livros.isEmpty()){
            for(Livro livro : this.livros){
                if(livro.getId() == id){
                    livroParaEmprestimo = livro;
                    break;
                }
            }
        }
        return livroParaEmprestimo;
    }*/
}
