package gerenciamentoBiblioteca;

public class Livro {

    //atributos
    private int id;
    private String titulo;
    private String autor;
    private String editora;

    public Livro(int id,String titulo, String autor, String editora) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
