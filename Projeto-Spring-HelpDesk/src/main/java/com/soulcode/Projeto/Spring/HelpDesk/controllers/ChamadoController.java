package com.soulcode.Projeto.Spring.HelpDesk.controllers;

import com.soulcode.Projeto.Spring.HelpDesk.models.ChamadoModel;
import com.soulcode.Projeto.Spring.HelpDesk.service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//todo atualizar com o repositories
@RestController
@RequestMapping("/chamados")
public class ChamadoController {
    @Autowired
    private final ChamadoService chamadoService;

    public ChamadoController(ChamadoService chamadoService) {
        this.chamadoService = chamadoService;
    }

    @PostMapping()
    public String adicionarChamado(@ModelAttribute ChamadoModel chamado, Model model) {
        chamadoService.adicionarChamado(chamado);
        return "Chamado adicionado com sucesso!!!" + chamado.getId();
    }

    @GetMapping("/{id}")
    public String buscarChamado(Model model, @PathVariable Long id) {
        ChamadoModel chamado = chamadoService.buscarChamado(id);
        if(chamado == null){
            return "Chamado nao encontrado";
        }
        return chamado.toString();
    }
    @GetMapping("/todos")
    public String buscarChamadoTodos(Model model) {
        List<ChamadoModel> listaChamado = chamadoService.buscarChamadoTodos();
        if(listaChamado.size() == 0){
            return "Chamado nao encontrado";
        }
        return listaChamado.toString();
    }

    @PostMapping("/atualizar")
    public String atualizarChamado(@ModelAttribute ChamadoModel chamado) {
        chamadoService.atualizarChamado(chamado);
        return "Chamado atualizado com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String deletarChamado(@PathVariable Long id) {
        chamadoService.deletarChamado(id);
        return "chamado deletado" + id;
    }
}

