package com.soulcode.Projeto.Spring.HelpDesk.models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioModel extends PessoaModel {

    public UsuarioModel(String nome, String senha, Long idUsuario, String email) {
        super(nome, senha, idUsuario, email);
    }

}