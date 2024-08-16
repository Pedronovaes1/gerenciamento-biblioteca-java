package gerenciamentoBiblioteca.sistemadegerenciar;

import gerenciamentoBiblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeUsuarios {
    private List<Usuario> usuarios;

    public GerenciamentoDeUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(String nome, String email, String senha){
        Usuario usuariosCadastrado = new Usuario(nome,email,senha);
        this.usuarios.add(usuariosCadastrado);
    }

    public void mostrarUsuarios(){
        if(!this.usuarios.isEmpty()){
            for(int i = 0; i< this.usuarios.size(); i++){
                System.out.println("Usuário: "+ this.usuarios.get(i).getNome() + "; E-mail: " + this.usuarios.get(i).getEmail());
            }
        }
    }

    public void removerUsuario(String nome, String senha){
        List<Usuario> usuariosParaRemover = new ArrayList<>();
        if(!this.usuarios.isEmpty()){
            for(Usuario usuario : this.usuarios){
                if(usuario.getNome().equalsIgnoreCase(nome) && usuario.getSenha().equalsIgnoreCase(senha)){
                    usuariosParaRemover.add(usuario);
                }else{
                    System.out.println("O usuário não consta no sistema para ser removido");
                    break;
                }
                usuarios.removeAll(usuariosParaRemover);
            }
        }else{
            System.out.println("Não tem usuário cadastrado no sistema");
        }
    }

    public void buscarUsuariosPorNome(String nome){
        if(!this.usuarios.isEmpty()){
            for(Usuario usuario : this.usuarios){
                if(usuario.getNome().equalsIgnoreCase(nome)){
                    System.out.println("Usuario: "+ usuario.getNome() + "; E-mail: " + usuario.getEmail());
                }
            }
        }else{
            System.out.println("Está vazio o sistema de usuários");
        }
    }
}
