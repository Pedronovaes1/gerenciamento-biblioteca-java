package gerenciamentoBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeLivros {
    private List<Livro> livros;

    public GerenciamentoDeLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(int id,String titulo, String autor, String editora) {
        Livro livro = new Livro(id,titulo, autor, editora);
        this.livros.add(livro);
    }

    public void removerLivro(int id) {
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
}
