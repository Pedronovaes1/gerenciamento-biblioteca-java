package gerenciamentoBiblioteca.sistemadegerenciar;

import gerenciamentoBiblioteca.model.Usuario;

import java.util.HashMap;
import java.util.Map;

public class GerenciamentoDeUsuarios {
    private Map<String,Usuario> usuarios;

    public GerenciamentoDeUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public void cadastrarUsuario(String nome, String email, String senha){
        Usuario usuariosCadastrado = new Usuario(nome,email,senha);
        this.usuarios.put(nome.toLowerCase(),usuariosCadastrado);
    }

    public void mostrarUsuarios(){
        if(this.usuarios.isEmpty()){
            throw new IllegalArgumentException("Lista vazia");
        }else{
            usuarios.values().forEach(user -> System.out.println("Nome: " + user.getNome() +
                    "; Email: " + user.getEmail() +
                    "; Senha: " + user.getSenha()));
        }
    }

    public void removerUsuario(String nome, String senha){
        Usuario usuario = this.usuarios.remove(nome);
        if(usuario == null){
            throw new IllegalArgumentException("O Usuário " + usuario.getNome() + " Não está na lista!!");
        }
    }

    public void buscarUsuariosPorNome(String nome){
        if(this.usuarios.containsKey(nome)){
            System.out.println("Nome: " + usuarios.get(nome).getNome() +
                    "; Email: " + usuarios.get(nome).getEmail());
        }
    }

    public Usuario buscarUsuarioPorNomeEmprestimo(String nome){
        if(!this.usuarios.containsKey(nome) == true){
            for(Usuario usuario : this.usuarios.values()){
                if(usuario.getNome().equals(nome)){
                    return usuario;
                }
            }
        }
        return null;
    }
}
