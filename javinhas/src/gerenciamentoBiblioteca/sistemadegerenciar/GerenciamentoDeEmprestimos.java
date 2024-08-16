package gerenciamentoBiblioteca.sistemadegerenciar;

import gerenciamentoBiblioteca.model.Emprestimo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeEmprestimos {
    private List<Emprestimo> emprestimos;

    public GerenciamentoDeEmprestimos() {
        this.emprestimos = new ArrayList<>();
    }

    public void emprestarLivros(String nome, int id){
        /*List<Livro> livrosParaEmpresar = new ArrayList<>();
        List<Usuario> usuariosEmprestados = new ArrayList<>();

        for(Livro livro : this.livros){
            if(livro.getId() == id){
                livrosParaEmpresar.add(livro);
            }
        }
        for(Usuario usuario : this.usuarios){
            if(usuario.getNome().equalsIgnoreCase(nome)){
                usuariosEmprestados.add(usuario);
            }
        }
        LocalDate dataEmprestimo = LocalDate.now();
        Emprestimo emprestimo = new Emprestimo(livrosParaEmpresar, usuariosEmprestados, dataEmprestimo,14);
        this.emprestimos.add(emprestimo);*/
    }

    /*public void mostrarEmprestimos(){
        for (int i = 0; i < this.emprestimos.size(); i++){
            System.out.println("Usuário: " + usuarios.get(i).getNome() +
                    "; E-mail: " + usuarios.get(i).getEmail() +
                    "; Livro Empresado: " + livros.get(i).getTitulo()+
                    "; Devolver: " + emprestimos.get(i).getDataDevolucaoPrevista() +
                    "; ID: " + livros.get(i).getId());
        }
    }*/
}
