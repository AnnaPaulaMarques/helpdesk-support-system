package com.soulcode.Projeto.Spring.HelpDesk.service;


import com.soulcode.Projeto.Spring.HelpDesk.models.ChamadoModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChamadoService {

    private List<ChamadoModel> listaDeChamados = new ArrayList<>();

    public void adicionarChamado(ChamadoModel chamado) {
        listaDeChamados.add(chamado);
    }

    public ChamadoModel buscarChamado(Long idChamado) {
        for (ChamadoModel chamado : listaDeChamados) {
            if (chamado.getId().equals(idChamado)) {
                return chamado;
            }
        }
        return null;
    }

    public List<ChamadoModel> buscarChamadoTodos() {
        return listaDeChamados;
    }

    public void atualizarChamado(ChamadoModel chamadoAtualizado) {
        ChamadoModel chamado = buscarChamado(chamadoAtualizado.getId());
        if (chamado != null) {
            chamado.setDescricao(chamadoAtualizado.getDescricao());
            chamado.setPrioridade(chamadoAtualizado.getPrioridade());
            chamado.setStatus(chamadoAtualizado.getStatus());
        }
    }


    public void deletarChamado(Long idChamado) {
        ChamadoModel chamado = buscarChamado(idChamado);
        if (chamado != null) {
            listaDeChamados.remove(chamado);
        }
    }


}