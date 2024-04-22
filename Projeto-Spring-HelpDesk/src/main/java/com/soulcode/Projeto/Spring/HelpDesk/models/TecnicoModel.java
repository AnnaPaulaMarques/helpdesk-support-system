package com.soulcode.Projeto.Spring.HelpDesk.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TecnicoModel extends PessoaModel {

    public TecnicoModel(String nome, String senha, long idUsuario, String email) {
        super(nome, senha, idUsuario, email);
    }
}