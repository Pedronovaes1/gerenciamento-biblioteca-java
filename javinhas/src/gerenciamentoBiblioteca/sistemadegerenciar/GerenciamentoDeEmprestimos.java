package gerenciamentoBiblioteca.sistemadegerenciar;

import gerenciamentoBiblioteca.model.Emprestimo;
import gerenciamentoBiblioteca.model.Livro;
import gerenciamentoBiblioteca.model.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeEmprestimos {
    private List<Emprestimo> emprestimos;

    public GerenciamentoDeEmprestimos() {
        this.emprestimos = new ArrayList<>();
    }

    public void emprestarLivros(Livro livro, Usuario usuario, LocalDate dataEmprestimo, int diasDeEmprestimo) {
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, diasDeEmprestimo);
        this.emprestimos.add(emprestimo);
    }

    public void mostrarEmprestimos(){
        if(!this.emprestimos.isEmpty()) {
            System.out.println("----Emprestimos----");
            for(Emprestimo emprestimo: this.emprestimos){
                System.out.println("Nome do usuário: " + emprestimo.getUsuario().getNome() +
                        "; Livro: " + emprestimo.getLivro().getTitulo() +
                        "; ID: " + emprestimo.getLivro().getId());
            }
            System.out.println("----Finalizando Emprestimos----");
        }else{
            throw new IllegalArgumentException("Lista vazia");
        }
    }

    public void devolverEmprestimo(Usuario usuario){
        List<Emprestimo> emprestimosParaRemover = new ArrayList<>();
        if(this.emprestimos.isEmpty()) {
            throw new IllegalArgumentException("Lista vazia");
        }else{
            for(Emprestimo emprestimo: this.emprestimos){
                if(emprestimo.getUsuario().equals(usuario)){
                    emprestimosParaRemover.add(emprestimo);
                }
            }
        }
        emprestimos.removeAll(emprestimosParaRemover);
    }

}
