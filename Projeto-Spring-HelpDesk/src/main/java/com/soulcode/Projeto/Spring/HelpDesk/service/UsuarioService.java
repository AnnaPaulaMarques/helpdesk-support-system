package com.soulcode.Projeto.Spring.HelpDesk.service;

import com.soulcode.Projeto.Spring.HelpDesk.models.UsuarioModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {


    private List<UsuarioModel> listaDeUsuarios = new ArrayList<>();


    public String adicionarUsuario(String nome, String senha, Long idUsuario, String email) {
        UsuarioModel usuario = new UsuarioModel(nome, senha, idUsuario, email);
//        usuarioRepository.save(usuario); TODO arrumar repositorie
        return usuario.toString();
    }


    public String buscarUsuario(Long idUsuario) {
        UsuarioModel usuarioEncontrado = null;
        for (UsuarioModel u : listaDeUsuarios) {
            if (u.getIdUsuario().equals(idUsuario)) {
                usuarioEncontrado = u;
                break;
            }
        }
        if (usuarioEncontrado != null) {
            return usuarioEncontrado.toString();
        } else {
            return "Usuário não encontrado";
        }
    }

    public String atualizarUsuario(Long idUsuario, String novoNome, String novaSenha, String novoEmail) {
        for (UsuarioModel usuario : listaDeUsuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                usuario.setNome(novoNome);
                usuario.setSenha(novaSenha);
                usuario.setEmail(novoEmail);
                return "Usuário atualizado com sucesso";
            }
        }
        return "Usuário não encontrado";
    }

    public String deletarUsuario(Long idUsuario) {

        for(UsuarioModel usuario : listaDeUsuarios){
            if(usuario.getIdUsuario() == idUsuario){
                listaDeUsuarios.remove(idUsuario);
            }
        }
        return "usuario deletado";
    }
}
