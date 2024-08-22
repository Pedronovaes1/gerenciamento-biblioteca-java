package gerenciamentoBiblioteca.model;

public class Livro {

    //atributos
    static int contadorId = 0;
    private int id;
    private String titulo;
    private String autor;
    private String editora;

    private boolean emprestado;

    public Livro(String titulo, String autor, String editora) {
        this.id = ++contadorId;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.emprestado= false;
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

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public static int getContadorId() {return contadorId;}

    @Override
    public String toString() {
        return "Livro{" +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
