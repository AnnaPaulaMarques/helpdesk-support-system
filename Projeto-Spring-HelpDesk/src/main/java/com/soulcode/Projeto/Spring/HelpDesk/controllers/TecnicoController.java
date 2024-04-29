package com.soulcode.Projeto.Spring.HelpDesk.controllers;

import com.soulcode.Projeto.Spring.HelpDesk.models.TecnicoModel;
import com.soulcode.Projeto.Spring.HelpDesk.service.TecnicoService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//todo ainda falta tratar alguns erros
@Data
@RestController
@RequestMapping("/tecnico")
public class TecnicoController {

    @Autowired
    private TecnicoService tecnicoService;

    @PostMapping()
    public TecnicoModel adicionaTecnico(@RequestBody TecnicoModel tecnico) {
        return tecnicoService.adicionaTecnico(tecnico);
    }


    @GetMapping("/{id}")
    public String buscarTecnico(@PathVariable Long id) {
        TecnicoModel tecnico = tecnicoService.buscarTecnico(id);
        if (tecnico == null) {
            return "Tecnico não encontrado";
        }
        return tecnico.toString();
    }

    @GetMapping("/todos")
    public List<TecnicoModel> buscarTecnicoTodos() {
        return tecnicoService.buscarTecnicoTodos();
    }


    @PostMapping("/atualizar")
    public TecnicoModel atualizarTecnico(@RequestBody TecnicoModel tecnicoModel) {
        return tecnicoService.atualizarTecnico(tecnicoModel);
    }

    @DeleteMapping("/{id}")
    public String deletarTecnico(@PathVariable Long id) {

        return tecnicoService.deletarTecnico(id);
    }
}