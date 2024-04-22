package com.soulcode.Projeto.Spring.HelpDesk.models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PessoaModel {
    private String nome;
    private String senha;
    private Long idUsuario;
    private String email;

    public PessoaModel() {}
}
