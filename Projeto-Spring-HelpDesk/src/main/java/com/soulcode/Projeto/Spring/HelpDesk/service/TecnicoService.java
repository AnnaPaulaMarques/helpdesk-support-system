package com.soulcode.Projeto.Spring.HelpDesk.service;

import com.soulcode.Projeto.Spring.HelpDesk.models.TecnicoModel;
import com.soulcode.Projeto.Spring.HelpDesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TecnicoService {


    private static List<TecnicoModel> listaDeTecnicos = new ArrayList<>();
    @Autowired
    private TecnicoRepository tecnicoRepository;


    public TecnicoModel adicionaTecnico(TecnicoModel tecnico) {
        return tecnicoRepository.save(tecnico);
    }


    public List<TecnicoModel> buscarTecnicoTodos() {
        return tecnicoRepository.findAll();
    }

    public TecnicoModel buscarTecnico(Long idTecnico) {
        return tecnicoRepository.getById(idTecnico);
    }

    public TecnicoModel atualizarTecnico(TecnicoModel tecnico) {
        return tecnicoRepository.save(tecnico);
    }


    public String deletarTecnico(Long idTecnico) {
        tecnicoRepository.deleteById(idTecnico);
        return "Tecnico Deletado" + idTecnico;

    }
}
