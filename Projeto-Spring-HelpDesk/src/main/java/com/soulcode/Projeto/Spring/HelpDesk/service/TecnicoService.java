package com.soulcode.Projeto.Spring.HelpDesk.service;

import com.soulcode.Projeto.Spring.HelpDesk.models.TecnicoModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Data
public class TecnicoService {
    private final UsuarioService usuarioService;
    private static List<TecnicoModel> listaDeTecnicos = new ArrayList<>();


    public void adicionarTecnico(String nome, String senha, Long idUsuario, String email) {
        TecnicoModel tecnico = new TecnicoModel(nome, senha, idUsuario, email);
        listaDeTecnicos.add(tecnico);
    }


    public static List<TecnicoModel> buscarTecnicoTodos() {
        return listaDeTecnicos;
    }

    public TecnicoModel buscarTecnico(Long idTecnico) {
        for (TecnicoModel tecnico : listaDeTecnicos) {
            if (tecnico.getIdUsuario().equals(idTecnico)) {
                return tecnico;
            }
        }
        return null;
    }

    public void atualizarTecnico(Long idTecnico, String novoNome, String novaSenha, String novoEmail) {
        TecnicoModel tecnico = buscarTecnico(idTecnico);
        if (tecnico != null) {
            tecnico.setNome(novoNome);
            tecnico.setSenha(novaSenha);
            tecnico.setEmail(novoEmail);
        }
    }

    public void deletarTecnico(Long idTecnico) {
        TecnicoModel tecnico = buscarTecnico(idTecnico);
        if (tecnico != null) {
            listaDeTecnicos.remove(tecnico);
        }
    }
}
