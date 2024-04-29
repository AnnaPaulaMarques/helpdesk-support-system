package com.soulcode.Projeto.Spring.HelpDesk.service;

import com.soulcode.Projeto.Spring.HelpDesk.models.UsuarioModel;
import com.soulcode.Projeto.Spring.HelpDesk.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private static List<UsuarioModel> listaDeUsuarios = new ArrayList<>();
    @Autowired
    private UsuarioRepository usuarioRepository;


    public UsuarioModel adicionarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<UsuarioModel> buscarUsuarioTodos() {
        return usuarioRepository.findAll();
    }

    public UsuarioModel buscarUsuarioId(Long id) {
        return usuarioRepository.getById(id);
    }

    public UsuarioModel atualizarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }


    public String deleteId(Long idUsuario) {
        usuarioRepository.deleteById(idUsuario);
        return "Usuário Deletado";
    }


}
