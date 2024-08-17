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

    public boolean checarUsuario(Usuario usuario) {
        if(!this.emprestimos.isEmpty()){
            for(Emprestimo emprestimo: this.emprestimos){
                if(emprestimo.getUsuario().equals(usuario)){
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrarEmprestimos(){
        if(!this.emprestimos.isEmpty()){
            for(int i = 0; i<this.emprestimos.size(); i++){
                System.out.println("-----Emprestimos Cadastrados-----: \nUsuário: " + this.emprestimos.get(i).getUsuario().getNome() +
                        "; Livro "+  this.emprestimos.get(i).getLivro().getTitulo() +
                        "; Data de devolução: " + this.emprestimos.get(i).getDataDevolucaoPrevista() +
                        "; ID do livro: " + this.emprestimos.get(i).getLivro().getId());
            }
        }else{
            System.out.println("Não tem emprestimos feitos");
        }
    }

    public void devolverEmprestimo(Usuario usuario){
        List<Emprestimo> emprestimosParaRemover = new ArrayList<>();
        if(!this.emprestimos.isEmpty()){
            for(Emprestimo emprestimo: this.emprestimos){
                if(emprestimo.getUsuario() == usuario){
                    emprestimosParaRemover.add(emprestimo);
                    break;
                }
            }
            this.emprestimos.removeAll(emprestimosParaRemover);
        }else{
            System.out.println("Lista de emprestimos está vazia!!");
        }
    }

}
