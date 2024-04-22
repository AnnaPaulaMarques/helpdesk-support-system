package com.soulcode.Projeto.Spring.HelpDesk.controllers;

import com.soulcode.Projeto.Spring.HelpDesk.models.UsuarioModel;
import com.soulcode.Projeto.Spring.HelpDesk.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


//todo erro nos metodos :(

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new UsuarioModel());
        return "usuarioForm";
    }

    @PostMapping()
    public String adicionarUsuario(@ModelAttribute UsuarioModel usuario,Model model) {
        usuarioService.adicionarUsuario(usuario.getNome(), usuario.getSenha(), usuario.getIdUsuario(), usuario.getEmail());
        return "Usuário adicionado com sucesso!!!" + usuario.getNome();
    }

    @GetMapping("/buscar/{id}")
    public String buscarUsuario(Model model, @PathVariable Long id) {
        String resultado = usuarioService.buscarUsuario(id);
        model.addAttribute("resultado", resultado);
        if(resultado == null){
            return "Usuário não encontrado";
        }
        return resultado.toString();
    }

    @PostMapping("/atualizar")
    public String atualizarUsuario(@ModelAttribute UsuarioModel usuario) {
        usuarioService.atualizarUsuario(usuario.getIdUsuario(), usuario.getNome(), usuario.getSenha(), usuario.getEmail());
        return "Usuario atualizado com sucesso!!!";
    }

    @DeleteMapping("/{id}")
    public String deletarUsuario(@PathVariable Long id) {
        usuarioService.deletarUsuario(id);
        return "Usuario deletado";
    }
}
