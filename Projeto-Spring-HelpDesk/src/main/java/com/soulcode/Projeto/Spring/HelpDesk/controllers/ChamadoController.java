package com.soulcode.Projeto.Spring.HelpDesk.controllers;

import com.soulcode.Projeto.Spring.HelpDesk.models.ChamadoModel;
import com.soulcode.Projeto.Spring.HelpDesk.service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//todo ainda falta tratar alguns erros
@RestController
@RequestMapping("/chamados")
public class ChamadoController {
    @Autowired
    private ChamadoService chamadoService;

    @PostMapping()
    public ChamadoModel adicionarChamado(@RequestBody ChamadoModel chamado) {
        return chamadoService.adicionarChamado(chamado);
    }

    @GetMapping("/{id}")
    public  String buscarChamadoId(@PathVariable Long id){
        ChamadoModel chamado = chamadoService.buscarChamadoId(id);
        if (chamado == null){
            return "Chamado não encontrado";
        }
        return chamado.toString();
    }

    @GetMapping("/todos")
    public List<ChamadoModel> buscarChamadoTodos(){
        return chamadoService.buscarChamadoTodos();
    }

    @PostMapping("/atualizar")
    public ChamadoModel atualizarChamado(@RequestBody ChamadoModel chamadoModel) {
        return chamadoService.atualizarChamado(chamadoModel);
    }

    @DeleteMapping("/{id}")
    public String deletarChamado(@PathVariable Long id) {

        return chamadoService.deletarChamado(id);
    }



}



