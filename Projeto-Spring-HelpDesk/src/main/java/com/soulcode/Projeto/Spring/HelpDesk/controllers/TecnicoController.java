package com.soulcode.Projeto.Spring.HelpDesk.controllers;

import com.soulcode.Projeto.Spring.HelpDesk.models.TecnicoModel;
import com.soulcode.Projeto.Spring.HelpDesk.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tecnico")
public class TecnicoController {

    @Autowired
    private final TecnicoService tecnicoService;

    public TecnicoController(TecnicoService tecnicoService) {
        this.tecnicoService = tecnicoService;
    }

    @GetMapping("/form")
    public String mostrarFormulario(Model model) {
        model.addAttribute("tecnico", new TecnicoModel());
        return "tecnicoForm";
    }

    @PostMapping()
    public String adicionaTecnico(@ModelAttribute TecnicoModel tecnico, Model model) {
        tecnicoService.adicionarTecnico(tecnico.getNome(), tecnico.getSenha(), tecnico.getIdUsuario(), tecnico.getEmail());
        return "Tecnico adicionado com sucesso!!!" + tecnico.getNome();
    }

    @GetMapping("/{id}")
    public String buscarTecnico(Model model, @PathVariable Long id) {
        TecnicoModel tecnico = tecnicoService.buscarTecnico(id);
        model.addAttribute("tecnico", tecnico);
        if (tecnico == null) {
            return "Tecnico não encontrado";
        }
        return tecnico.toString();
    }

    @GetMapping("/todos")
    public String buscarTecnicoTodos(Model model) {
        List<TecnicoModel> listaTecnico = tecnicoService.buscarTecnicoTodos();
        if (listaTecnico.size() == 0) {
            return "Tecnico não encontrado";
        }
        return listaTecnico.toString();
    }


    @PostMapping("/atualizar")
    public String atualizarTecnico(@ModelAttribute TecnicoModel tecnico, Model model) {
        tecnicoService.atualizarTecnico(tecnico.getIdUsuario(), tecnico.getNome(), tecnico.getSenha(), tecnico.getEmail());
        return "Tecnico atualizado com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String deletarTecnico(@PathVariable Long id) {
        tecnicoService.deletarTecnico(id);
        return "Tecnico deletado";
    }
}