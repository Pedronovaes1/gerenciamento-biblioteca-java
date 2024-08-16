package gerenciamentoBiblioteca.model;

import java.time.LocalDate;
import java.util.List;

public class Emprestimo {

    private List<Livro> livro;
    private List<Usuario> usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private boolean devolvido;

    // Construtor
    public Emprestimo(List<Livro> livro, List<Usuario> usuario, LocalDate dataEmprestimo, int diasDeEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(diasDeEmprestimo);
        this.devolvido = false;
    }

    public List<Livro> getLivro() {
        return livro;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    // Método de para emprestar livro

    public void registrarDevolucao(){
        this.devolvido = true;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", usuario=" + usuario +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucaoPrevista=" + dataDevolucaoPrevista +
                ", devolvido=" + devolvido +
                '}';
    }
}
