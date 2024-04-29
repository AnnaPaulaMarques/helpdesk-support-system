package com.soulcode.Projeto.Spring.HelpDesk.controllers;

import com.soulcode.Projeto.Spring.HelpDesk.models.UsuarioModel;
import com.soulcode.Projeto.Spring.HelpDesk.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//todo ainda falta tratar alguns erros

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping()
    public UsuarioModel adicionarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioService.adicionarUsuario(usuario);
    }

    @GetMapping("/todos")
    public List<UsuarioModel> buscarUsuarioTodos() {
        return usuarioService.buscarUsuarioTodos();
    }

    @GetMapping("/buscar/{id}")
    public String buscarUsuarioId(@PathVariable Long id) {
        UsuarioModel usuario = usuarioService.buscarUsuarioId(id);
        if (usuario == null) {
            return "Tecnico não encontrado";
        }
        return usuario.toString();
    }


    @PostMapping("/atualizar")
    public UsuarioModel atualizarUsuario(@RequestBody UsuarioModel usuarioModel) {
        return usuarioService.atualizarUsuario(usuarioModel);
    }

    @DeleteMapping("/{id}")
    public String deletarUsuario(@PathVariable Long id) {
        return usuarioService.deleteId(id);
    }

}