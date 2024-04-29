package com.soulcode.Projeto.Spring.HelpDesk.service;


import com.soulcode.Projeto.Spring.HelpDesk.models.ChamadoModel;
import com.soulcode.Projeto.Spring.HelpDesk.repositories.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChamadoService {

    private List<ChamadoModel> listaDeChamados = new ArrayList<>();
    @Autowired
    private ChamadoRepository chamadoRepository;

    public ChamadoModel adicionarChamado(ChamadoModel chamado) {
        return chamadoRepository.save(chamado);
    }

    public ChamadoModel buscarChamadoId(Long id) {
        return chamadoRepository.getById(id);
    }

    public List<ChamadoModel> buscarChamadoTodos() {
        return chamadoRepository.findAll();
    }

    public ChamadoModel atualizarChamado(ChamadoModel chamado) {
        return chamadoRepository.save(chamado);
    }


    public String deletarChamado(Long id) {
        chamadoRepository.deleteById(id);
        return "Chamado Deletado" + id;

    }





}