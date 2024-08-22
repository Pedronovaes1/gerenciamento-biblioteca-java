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
        Livro livro = livros.remove(id);
        if (livro == null) {
            throw  new IllegalArgumentException("Livro com o ID " + id + " não foi encontrado.");
        }
    }

    public void mostrarLivros() {
        if(this.livros.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            livros.values().forEach(livro ->
                    System.out.println("Livro: " + livro.getTitulo() +
                            "; Autor: " + livro.getAutor() +
                            "; Editora: " + livro.getEditora()+
                            "; ID: " + livro.getId()));
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

    public Livro buscarLivrosPorIdEmprestimo(int id){
        if(this.livros.containsKey(id) == true){
            for(Livro livro : this.livros.values()){
                if(livro.getId() == id){
                    return livro;
                }
            }
        }
        return null;
    }
}
